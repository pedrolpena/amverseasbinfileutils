/*
* This is an example of how to use the library to get profile info in the SEAS 
* ASCII format.
*/

import binfileutils.BinDecoder;       // decodes the profile
import binfileutils.FormatConverter;  // holds converters
import binfileutils.XBTProfile;

public class DecoderTestASCII {

    public DecoderTestASCII() {

    }//end constructor

    public static void main(String args[]) {
//DecoderTestASCII d = new DecoderTestASCII();

        
        BinDecoder decodedXBTProfile = new BinDecoder(args[0]); //pass profile as inline argument
        XBTProfile xBTProfile = decodedXBTProfile.getXBTProfile();
        FormatConverter decodedXBTProfile_to_ASCIII = new FormatConverter(xBTProfile);
        System.out.println(decodedXBTProfile_to_ASCIII.getASCII());

    }//end main

}//end class
