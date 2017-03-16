/*
* This is an example of how to use the library to get profile info in the SEAS 
* ASCII format.
*/

import binfileutils.BinDecoder;       // decodes the profile
import binfileutils.XBTProfile;

public class DecoderTest {

    public DecoderTest() {

    }//end constructor

    public static void main(String args[]) {   
        BinDecoder decodedXBTProfile = new BinDecoder(args[0]); //pass profile as inline argument
        XBTProfile xBTProfile = decodedXBTProfile.getXBTProfile();
        System.out.print(xBTProfile);

    }//end main

}//end class
