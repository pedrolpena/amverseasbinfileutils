package binfileutils;

;
import static binfileutils.XBTProbe.*;
import static binfileutils.XBTRecorder.*;

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
    private double sampleFrequency = 1.0;
    private int numberOfMeasurements = 0;

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
     * @param numberOfMeasurements The number of measurements made.
     *
     */
    public DepthCalculator(int recorderType, int probeType, int numberOfMeasurements) {
        this.numberOfMeasurements = numberOfMeasurements;
        setRecorderFrequency(recorderType);
        setProbeCoefficients(probeType);
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
            time = ((double) i) / sampleFrequency;
            depths[i] = (A * time) + (.001 * B * time * time);

        }//end for
        return depths;
    }//end methos

    /**
     * This method sets the recorders measurement frequency in Hertz.
     *
     * @return None
     */
    private void setRecorderFrequency(int probeType) {

        switch (probeType) {

            case MK21:
                sampleFrequency = MK21_SAMPLE_FREQUENCY;
                break;

        }//end switch

    }//end method

    /**
     * This method sets the coefficients used y the XBT fall rate equation to
     * determine the measurement depths.
     *
     * @return None
     */
    private void setProbeCoefficients(int recorderType) {

        switch (recorderType) {
            case SIPPICAN_T4_OLD:
                A = SIPPICAN_T4_OLD_COEFFICIENT_A;
                B = SIPPICAN_T4_OLD_COEFFICIENT_B;
                break;
            case SIPPICAN_T4:
                A = SIPPICAN_T4_COEFFICIENT_A;
                B = SIPPICAN_T4_COEFFICIENT_B;
                break;
            case SIPPICAN_T5:
                A = SIPPICAN_T5_COEFFICIENT_A;
                B = SIPPICAN_T5_COEFFICIENT_B;
                break;
            case SIPPICAN_FAST_DEEP:
                A = SIPPICAN_FAST_DEEP_COEFFICIENT_A;
                B = SIPPICAN_FAST_DEEP_COEFFICIENT_B;
                break;
            case SIPPICAN_T6_OLD:
                A = SIPPICAN_T6_OLD_COEFFICIENT_A;
                B = SIPPICAN_T6_OLD_COEFFICIENT_B;
                break;
            case SIPPICAN_T6:
                A = SIPPICAN_T6_COEFFICIENT_A;
                B = SIPPICAN_T6_COEFFICIENT_B;
                break;
            case SIPPICAN_T7_OLD:
                A = SIPPICAN_T7_OLD_COEFFICIENT_A;
                B = SIPPICAN_T7_OLD_COEFFICIENT_B;
                break;
            case SIPPICAN_T7:
                A = SIPPICAN_T7_COEFFICIENT_A;
                B = SIPPICAN_T7_COEFFICIENT_B;
                break;
            case SIPPICAN_DEEP_BLUE_OLD:
                A = SIPPICAN_DEEP_BLUE_OLD_COEFFICIENT_A;
                B = SIPPICAN_DEEP_BLUE_OLD_COEFFICIENT_B;
                break;
            case SIPPICAN_DEEP_BLUE:
                A = SIPPICAN_DEEP_BLUE_COEFFICIENT_A;
                B = SIPPICAN_DEEP_BLUE_COEFFICIENT_B;
                break;
            case SIPPICAN_T10:
                A = SIPPICAN_T10_COEFFICIENT_A;
                B = SIPPICAN_T10_COEFFICIENT_B;
                break;
            case SIPPICAN_T11:
                A = SIPPICAN_T11_COEFFICIENT_A;
                B = SIPPICAN_T11_COEFFICIENT_B;
                break;
            case SIPPICAN_AXBT:
                A = SIPPICAN_AXBT_COEFFICIENT_A;
                B = SIPPICAN_AXBT_COEFFICIENT_B;
                break;
            case TSK_T4_OLD:
                A = TSK_T4_OLD_COEFFICIENT_A;
                B = TSK_T4_OLD_COEFFICIENT_B;
                break;
            case TSK_T4:
                A = TSK_T4_COEFFICIENT_A;
                B = TSK_T4_COEFFICIENT_B;
                break;
            case TSK_T6_OLD:
                A = TSK_T6_OLD_COEFFICIENT_A;
                B = TSK_T6_OLD_COEFFICIENT_B;
                break;
            case TSK_T6:
                A = TSK_T6_COEFFICIENT_A;
                B = TSK_T6_COEFFICIENT_B;
                break;
            case TSK_T7_OLD:
                A = TSK_T7_OLD_COEFFICIENT_A;
                B = TSK_T7_OLD_COEFFICIENT_B;
                break;
            case TSK_T7:
                A = TSK_T7_COEFFICIENT_A;
                B = TSK_T7_COEFFICIENT_B;
                break;
            case TSK_T5:
                A = TSK_T5_COEFFICIENT_A;
                B = TSK_T5_COEFFICIENT_B;
                break;
            case TSK_T10:
                A = TSK_T10_COEFFICIENT_A;
                B = TSK_T10_COEFFICIENT_B;
                break;
            case TSK_DEEP_BLUE_OLD:
                A = TSK_DEEP_BLUE_OLD_COEFFICIENT_A;
                B = TSK_DEEP_BLUE_OLD_COEFFICIENT_B;
                break;
            case TSK_DEEP_BLUE:
                A = TSK_DEEP_BLUE_COEFFICIENT_A;
                B = TSK_DEEP_BLUE_COEFFICIENT_B;
                break;
            case SPARTON_XBT1:
                A = SPARTON_XBT1_COEFFICIENT_A;
                B = SPARTON_XBT1_COEFFICIENT_B;
                break;
            case SPARTON_XBT3:
                A = SPARTON_XBT3_COEFFICIENT_A;
                B = SPARTON_XBT3_COEFFICIENT_B;
                break;
            case SPARTON_XBT4:
                A = SPARTON_XBT4_COEFFICIENT_A;
                B = SPARTON_XBT4_COEFFICIENT_B;
                break;
            case SPARTON_XBT5:
                A = SPARTON_XBT5_COEFFICIENT_A;
                B = SPARTON_XBT5_COEFFICIENT_B;
                break;
            case SPARTON_XBT5DB:
                A = SPARTON_XBT5DB_COEFFICIENT_A;
                B = SPARTON_XBT5DB_COEFFICIENT_B;
                break;
            case SPARTON_XBT7_OLD:
                A = SPARTON_XBT7_OLD_COEFFICIENT_A;
                B = SPARTON_XBT7_OLD_COEFFICIENT_B;
                break;
            case SPARTON_XBT7:
                A = SPARTON_XBT7_COEFFICIENT_A;
                B = SPARTON_XBT7_COEFFICIENT_B;
                break;
            case SPARTON_XBT7DB:
                A = SPARTON_XBT7DB_COEFFICIENT_A;
                B = SPARTON_XBT7DB_COEFFICIENT_B;
                break;
            case SPARTON_XBT10:
                A = SPARTON_XBT10_COEFFICIENT_A;
                B = SPARTON_XBT10_COEFFICIENT_B;
                break;
            case SPARTON_XBT20:
                A = SPARTON_XBT20_COEFFICIENT_A;
                B = SPARTON_XBT20_COEFFICIENT_B;
                break;
            case SPARTON_XBT20DB:
                A = SPARTON_XBT20DB_COEFFICIENT_A;
                B = SPARTON_XBT20DB_COEFFICIENT_B;
                break;
            case SPARTON_536AXBT:
                A = SPARTON_536AXBT_COEFFICIENT_A;
                B = SPARTON_536AXBT_COEFFICIENT_B;
                break;

        }//end switch

    }//end method

}
