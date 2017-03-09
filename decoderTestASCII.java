/*
* This is an example of how to use the library to get profile info in the SEAS 
* ASCII format.
*/
import binfileutils.BinDecoder;       // decodes the profile
import binfileutils.FormatConverter;  // holds converters

public class decoderTestASCII {

    public decoderTestASCII() {

    }//end constructor

    public static void main(String args[]) {

        BinDecoder decodedXBTProfile = new BinDecoder(args[0]); //pass profile as inline argument
        FormatConverter decodedXBTProfile_to_ASCIII = new FormatConverter(decodedXBTProfile);
        System.out.print(decodedXBTProfile_to_ASCIII.getASCII());

    }//end main

}//end class
