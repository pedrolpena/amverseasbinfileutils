package binfileutils;

;
import static binfileutils.XBTProbe.*;
import static binfileutils.XBTRecorder.*;
import java.util.Vector;
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

    double[][] getInflectionPoints(double[][] depthsAndTemps) {

        Vector< Vector<Double>> infPoints = new Vector<>(); // holds computed inflection points
        Vector<Double> infPoint = new Vector<>(); // holds computed inflection point
        int infPointCounter = 0; //holds number of inflection points

        double Dk0, //Depth 0
                Dk1, //Depth 1
                Dk2, //Depth 2
                Tk0, //Temp  0
                Tk1, //Temp  1
                Tk2, //Temp  2
                dD0, //Difference between 1st two adjacent depths
                dD1, //Difference between 2nd two adjacent depths
                dT0, //Difference between 1st two adjacent temperatures
                dT1, //Difference between 2nd two adjacent temperatures
                SLOPE0, // Trailing slope (velocity)
                SLOPE1, // Leading slope (velocity)
                accelerationCurrent, //Current acceleration
                accelerationPrevious = 0;  //Previous acceleration

        infPointCounter = 0;
        for (int k = 0; k < depthsAndTemps.length - 2; k++) {

            // extract temperatures and depths for analysis
            Dk0 = depthsAndTemps[k + 0][0];
            Dk1 = depthsAndTemps[k + 1][0];
            Dk2 = depthsAndTemps[k + 2][0];
            Tk0 = depthsAndTemps[k + 0][1];
            Tk1 = depthsAndTemps[k + 1][1];
            Tk2 = depthsAndTemps[k + 2][1];

            // compute deltas
            dD0 = Dk0 - Dk1;
            dD1 = Dk1 - Dk2;
            dT0 = Tk0 - Tk1;
            dT1 = Tk1 - Tk2;


            /* Make sure neither of the deltas in the denominator is zero
		 * before computing slopes and acceleration.
		 **/
            if (dT0 * dT1 != 0) {

                // compute trailing and leading slope (velocity)
                SLOPE0 = dD0 / dT0;
                SLOPE1 = dD1 / dT1;

                // compute acceleration
                accelerationCurrent = dD0 / (dT0 * dT0) - dD1 / (dT0 * dT1);

                /*
			 * Since we are dealing with discrete points, there is no guarantee
			 * that a point will match up exactly with a slope of 0. this means
			 * that this algorithm will also identify relative extrema. To skip
			 * relative extrema the product of the trailing and leading slopes
			 * is looked at. The product will only be negative when direction
			 * changes. In other words, concavity hasn't changed.
			 * */
                if ((accelerationCurrent * accelerationPrevious < 0) && (SLOPE0 * SLOPE1) > 0 && (infPoints.size() < MAXINFPTS)) {

                    infPoint.addElement(Dk1);
                    infPoint.addElement(Tk1);

                    infPoints.addElement((Vector<Double>) infPoint.clone());
                    infPoint.clear();
                    int iSize = infPoints.size();

                    if (iSize > 1) {// make sure there is more than one point

                        int t0 = (int) Math.round(infPoints.get(iSize - 1).get(0));
                        int t1 = (int) Math.round(infPoints.get(iSize - 2).get(0));

                        if (t0 == t1) {

                            infPoints.removeElementAt(infPoints.size() - 1);

                        }

                    }
                }
                accelerationPrevious = accelerationCurrent;
            }

        }

        double[][] infPointsTmp = new double[infPoints.size()][2];

        for (int i = 0; i < infPoints.size(); i++) {
            infPointsTmp[i][0] = infPoints.get(i).get(0);
            infPointsTmp[i][1] = infPoints.get(i).get(1);

        }//end for

        return infPointsTmp;
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
