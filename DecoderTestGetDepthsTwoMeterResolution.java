/*
* This is an example of how to use the library to get profile Depth and
* temperature points at two meter resolution. The data are linearly 
* interpolated using the apache commons math library
*/
import binfileutils.DepthCalculator;
import binfileutils.BinDecoder;       // decodes the profile
import binfileutils.XBTProfile;

public class DecoderTestGetDepthsTwoMeterResolution {

    public DecoderTestGetDepthsTwoMeterResolution() {

    }//end constructor

    public static void main(String args[]) {   

        double[][] depthsAndTemps;               //array of doubles that holds depths & temperature measurement     
        BinDecoder decodedXBTProfile = new BinDecoder(args[0]); //pass profile as inline argument
        XBTProfile xBTProfile = decodedXBTProfile.getXBTProfile();
        DepthCalculator dc = new DepthCalculator(xBTProfile);

        depthsAndTemps=dc.getDepthsAndTemperaturePointsTwoMeterResolution();

        for (double[] depthsAndTemp : depthsAndTemps) {
            System.out.println(String.format(" %7.2f       %5.2f", depthsAndTemp[0], depthsAndTemp[1]));
        } //end for  



    }//end main

}//end class
