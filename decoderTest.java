/*
*This is an example of how to use the library to get temperature measurements and depths
*/
import binfileutils.BinDecoder;       // decodes the profile
import binfileutils.DepthCalculator;  //calculates measurement depths

public class decoderTest {

    public decoderTest() {

    }//end constructor

    public static void main(String args[]) {
        double[] temps;               //array of doubles that holds temperature measurements
        int numberOfMeasurements;
        double [] depths;             //array of doubles that holds the depths
        BinDecoder bd = new BinDecoder(args[0]); //pass profile as inline argument
        temps = bd.getTemperaturePoints();
        numberOfMeasurements = temps.length;
        DepthCalculator dc = new DepthCalculator(bd.getRecorderType(),bd.getInstrumentType(),numberOfMeasurements);
        depths = dc.getMeasurementDepths();

        for (int i = 0 ; i < depths.length; i++){
            System.out.format("depth=%.3fm temp=%.2fC\n",depths[i],temps[i]);
        }//end for
    }//end main

}//end class
