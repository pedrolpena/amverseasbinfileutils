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
    private double sampleFrequency = 10.0;
    private int numberOfMeasurements = 0;
    private XBTProfile xBTProfile;

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
    public DepthCalculator(XBTProfile xBTProfile, int recorderType, int probeType) {
        this.xBTProfile=xBTProfile;
        numberOfMeasurements = xBTProfile.getTemperaturePoints().length;
        setRecorderFrequency(recorderType);
        setProbeCoefficients(probeType);
    }//end constructor
    
    
    
        public DepthCalculator(XBTProfile xBTProfile) {
        this.xBTProfile=xBTProfile;
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
    
    public double[][] getDepthsAndTemperaturePoints(){
        double time;
         double[][] depthsAndTemps = new double[numberOfMeasurements][2];
         double [] temps = xBTProfile.getTemperaturePoints();
         
        for (int i = 0; i < numberOfMeasurements; i++) {
            time = ((double) i + 1) / sampleFrequency;
            depthsAndTemps[i][0] = (A * time) + (.001 * B * time * time);
            depthsAndTemps[i][1] = temps[i];
        }//end for         
         
         return depthsAndTemps;
    
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
