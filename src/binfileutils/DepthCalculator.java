package binfileutils;
import static binfileutils.XBTProbe.*;
import static binfileutils.XBTRecorder.*;
import java.util.Arrays;
import org.apache.commons.math3.analysis.interpolation.LinearInterpolator;
import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;

/**
 * This class uses the XBT fall rate equation to generate measurement depths for
 * an XBT profile.
 *
 * @author Pedro Pena
 * @version 1.0
 *
 */


public class DepthCalculator {

    private double A = 0.0;
    private double B = 0.0;
    private double sampleFrequency = 10.0;
    private int numberOfMeasurements = 0;
    private XBTProfile xBTProfile;
    private int MAXINFPTS = 30;
    // Temperatures at or above this value are treated as bad data at the
    // bottom of the profile. Amverseas uses the same limit.
    private static final double MAX_VALID_TEMPERATURE = 34.5;
    // Temperatures below this value are treated as bad data at the bottom of
    // the profile.
    private static final double MIN_VALID_TEMPERATURE = -2.5;
    // Largest temperature step allowed between the last two points of the
    // profile. Larger steps are removed from the bottom of the profile, they
    // are usually caused by the wire breaking or the probe hitting the bottom.
    private static final double TAIL_MAX_STEP = 0.2;
    // Number of points on each side of a point used by the median filter.
    private static final int MEDIAN_HALF_WINDOW = 5;
    // Largest temperature difference allowed between the profile and the line
    // drawn through the inflection points. Amverseas starts with the same
    // value.
    private static final double INFLECTION_TOLERANCE = 0.15;

    /**
     * The constructor accepts the recorder type, the probe type and the number
     * of measurements made in order to calculate the measurement depths.
     *
     * @param recorderType <strong>(FXY22068)</strong>-a table value that
     * represents the device that determines the thermistor value in the
     * XBT.<br>
     * e.g. a value of 6 refers to any of the different Sippican MK21 models.
     * @param probeType <strong>(FXY22067)</strong>-a table value that
     * represents the type of probe used to make the measurement.<br>
     * e.g. a value of 52 refers to a Deep Blue XBT.
     * @param xBTProfile XBTProfile object
     *
     */
    public DepthCalculator(XBTProfile xBTProfile, int recorderType, int probeType) {
        this.xBTProfile = xBTProfile;
        numberOfMeasurements = xBTProfile.getTemperaturePoints().length;
        setRecorderFrequency(recorderType);
        setProbeCoefficients(probeType);
    }//end constructor

    public DepthCalculator(XBTProfile xBTProfile) {
        this.xBTProfile = xBTProfile;
        numberOfMeasurements = xBTProfile.getTemperaturePoints().length;
        setRecorderFrequency(xBTProfile.getRecorderType());
        setProbeCoefficients(xBTProfile.getInstrumentType());
    }//end constructor

    /**
     * This method returns an array of doubles containing the depths where each
     * measurement was made.
     *
     * @return returns an array of doubles containing the depths where each
     * measurement was made.
     */
    public double[] getMeasurementDepths() {
        double[] depths = new double[numberOfMeasurements];
        double time;
        for (int i = 0; i < numberOfMeasurements; i++) {
            time = ((double) i + 1) / sampleFrequency;
            depths[i] = (A * time) + (.001 * B * time * time);

        }//end for
        return depths;
    }//end methos

    /**
     * This method returns a double that is the depth where the measurement was
     * made.
     *
     * @param sequenceNumber A number from 0 to n that is the position of the
     * measurement in the list of points.
     * @return This method returns a double that is the depth where the
     * measurement was made.
     */
    public double getMeasurementDepth(int sequenceNumber) {
        double depth;
        double time;

        time = ((double) sequenceNumber + 1) / sampleFrequency;
        depth = (A * time) + (.001 * B * time * time);

        return depth;
    }//end methos    

    /**
     * This method returns a two dimensional array of doubles containing the
     * depths ad temperatures as measured by the recorder.
     *
     * @return returns a two dimensional array of doubles containing the depths
     * ad temperatures as measured by the recorder.
     */
    public double[][] getDepthsAndTemperaturePoints() {
        double time;
        double[][] depthsAndTemps = new double[numberOfMeasurements][2];
        double[] temps = xBTProfile.getTemperaturePoints();

        for (int i = 0; i < numberOfMeasurements; i++) {
            time = ((double) i + 1) / sampleFrequency;
            depthsAndTemps[i][0] = (A * time) + (.001 * B * time * time);
            depthsAndTemps[i][1] = temps[i];
        }//end for         

        return depthsAndTemps;

    }

    /**
     * This method returns a two dimensional array of doubles containing the
     * depths ad temperatures with a resolution of two meters. A linear
     * interpolation is performed to get the depths at 2 meter increments.
     *
     * @return returns a two dimensional array of doubles containing the depths
     * ad temperatures with a resolution of two meters. A linear interpolation
     * is performed to get the depths at 2 meter increments.
     */
    public double[][] getDepthsAndTemperaturePointsTwoMeterResolution() {
        double[][] depthsAndTemps = this.getDepthsAndTemperaturePoints();
        double[] temps = new double[numberOfMeasurements];
        double[] depths = new double[numberOfMeasurements];
        int finalDepth = (int) depthsAndTemps[numberOfMeasurements - 1][0];
        if (finalDepth % 2 == 1) {
            finalDepth--;
        }

        int numberOfMeasurementsTwoMeterResolution = finalDepth / 2;
        double[][] depthsAndTempsTwoMeterResolution = new double[numberOfMeasurementsTwoMeterResolution][2];

        for (int i = 0; i < numberOfMeasurements; i++) {

            depths[i] = depthsAndTemps[i][0];
            temps[i] = depthsAndTemps[i][1];
        }//end for

        LinearInterpolator interp = new LinearInterpolator();
        PolynomialSplineFunction f = interp.interpolate(depths, temps);
        for (int i = 0; i < numberOfMeasurementsTwoMeterResolution; i++) {
            depthsAndTempsTwoMeterResolution[i][0] = (double) 2 * (i + 1);
            depthsAndTempsTwoMeterResolution[i][1] = f.value((double) 2 * (i + 1));
        }//end for

        return depthsAndTempsTwoMeterResolution;

    }

    /**
     * This method returns a two dimensional array of doubles containing the
     * depths ad temperatures with a resolution of two meters. A linear
     * interpolation is performed to get the depths at 1 meter increments.
     *
     * @return returns a two dimensional array of doubles containing the depths
     * ad temperatures with a resolution of two meters. A linear interpolation
     * is performed to get the depths at 1 meter increments.
     */
    public double[][] getDepthsAndTemperaturePointsOneMeterResolution() {
        double[][] depthsAndTemps = this.getDepthsAndTemperaturePoints();
        double[] temps = new double[numberOfMeasurements];
        double[] depths = new double[numberOfMeasurements];
        int finalDepth = (int) depthsAndTemps[numberOfMeasurements - 1][0];

        int numberOfMeasurementsOneMeterResolution = finalDepth;
        double[][] depthsAndTempsOneMeterResolution = new double[numberOfMeasurementsOneMeterResolution][2];

        for (int i = 0; i < numberOfMeasurements; i++) {

            depths[i] = depthsAndTemps[i][0];
            temps[i] = depthsAndTemps[i][1];
        }//end for

        LinearInterpolator interp = new LinearInterpolator();
        PolynomialSplineFunction f = interp.interpolate(depths, temps);
        for (int i = 0; i < numberOfMeasurementsOneMeterResolution; i++) {
            depthsAndTempsOneMeterResolution[i][0] = (double) 1 * (i + 1);
            depthsAndTempsOneMeterResolution[i][1] = f.value((double) 1 * (i + 1));
        }//end for

        return depthsAndTempsOneMeterResolution;

    }

    public double[][] getDepthsAndTemperaturePointsInflectionPoints() {

        //return new double [0][0];
        return getInflectionPoints(getDepthsAndTemperaturePoints());
    }

    /**
     * This method selects the inflection points of a profile. Linear
     * interpolation between the inflection points reproduces the profile
     * within INFLECTION_TOLERANCE degrees, using at most MAXINFPTS points.
     *
     * Bad data at the bottom of the profile is removed first and the profile
     * is smoothed with a median filter. The first and last points are always
     * selected, then the point farthest from the line through the selected
     * points is added until every point is within the tolerance or MAXINFPTS
     * points have been selected. When two points are equally far the
     * shallower one is selected.
     *
     * The C++ version of this library implements the same algorithm and must
     * return the same points.
     *
     * @param depthsAndTemps the depths and temperatures of the profile
     * @return the depths and smoothed temperatures of the inflection points
     */
    double[][] getInflectionPoints(double[][] depthsAndTemps) {

        // remove bad data from the bottom of the profile
        int size = depthsAndTemps.length;
        while (size > 0 && (depthsAndTemps[size - 1][1] >= MAX_VALID_TEMPERATURE
                || depthsAndTemps[size - 1][1] < MIN_VALID_TEMPERATURE)) {
            size--;
        }

        double[] depths = new double[size];
        double[] rawTemps = new double[size];
        for (int i = 0; i < size; i++) {
            depths[i] = depthsAndTemps[i][0];
            rawTemps[i] = depthsAndTemps[i][1];
        }

        // median filter, the window gets smaller near the ends of the profile
        double[] temps = new double[size];
        for (int i = 0; i < size; i++) {
            int halfWindow = Math.min(MEDIAN_HALF_WINDOW, Math.min(i, size - 1 - i));
            temps[i] = median(rawTemps, i - halfWindow, i + halfWindow);
        }

        // remove large steps from the bottom of the profile
        while (size > 1 && Math.abs(temps[size - 1] - temps[size - 2]) > TAIL_MAX_STEP) {
            size--;
        }

        if (size < 2) {
            return new double[0][2];
        }

        // selected[i] is true when point i is an inflection point
        boolean[] selected = new boolean[size];
        selected[0] = true;
        selected[size - 1] = true;
        int selectedCount = 2;

        while (selectedCount < MAXINFPTS) {

            double maxDeviation = 0;
            int maxPoint = -1;
            int first = 0;

            // check the points between each pair of neighboring selected points
            while (first < size - 1) {
                int last = first + 1;
                while (!selected[last]) {
                    last++;
                }
                for (int i = first + 1; i < last; i++) {
                    double d = deviation(depths, temps, first, last, i);
                    if (d > maxDeviation) {
                        maxDeviation = d;
                        maxPoint = i;
                    }
                }
                first = last;
            }

            if (maxPoint == -1 || maxDeviation <= INFLECTION_TOLERANCE) {
                break;
            }

            selected[maxPoint] = true;
            selectedCount++;
        }

        double[][] infPoints = new double[selectedCount][2];
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (selected[i]) {
                infPoints[k][0] = depths[i];
                infPoints[k][1] = temps[i];
                k++;
            }
        }

        return infPoints;
    }

    /**
     * Returns the median of the points from start to end inclusive. The
     * number of points is always odd.
     */
    private static double median(double[] values, int start, int end) {
        double[] window = Arrays.copyOfRange(values, start, end + 1);
        Arrays.sort(window);
        return window[window.length / 2];
    }

    /**
     * Returns the temperature difference between a point and the line drawn
     * between two other points.
     */
    private static double deviation(double[] depths, double[] temps, int first, int last, int point) {
        double fraction = (depths[point] - depths[first]) / (depths[last] - depths[first]);
        double lineTemp = temps[first] + (temps[last] - temps[first]) * fraction;
        return Math.abs(temps[point] - lineTemp);
    }

    /**
     * This method sets the recorders measurement frequency in Hertz.
     *
     * @return None
     */
    private void setRecorderFrequency(int recorderType) {

        sampleFrequency = getRecorderFrequency(recorderType);

    }//end method

    /**
     * This method sets the coefficients used by the XBT fall rate equation to
     * determine the measurement depths.
     *
     * @return None
     */
    private void setProbeCoefficients(int probeType) {
        A = getCoefficientA(probeType);
        B = getCoefficientB(probeType);

    }//end method

}
