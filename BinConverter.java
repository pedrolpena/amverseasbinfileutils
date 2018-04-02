/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package binconverter;

import binfileutils.BinDecoder;
import binfileutils.FormatConverter;
import binfileutils.XBTProfile;

/**
 *
 * @author pena
 */
public class BinConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BinDecoder decodedXBTProfile = new BinDecoder(args[0]); //pass profile as inline argument
        String fileName="";
        int type = 0;
        double salinity = 35.0;
        if (args == null) {
            System.out.println("you must provide an amverseas bin file");
            return;
        } 
        
        if (args != null && args.length < 1) {
            System.out.println("you must provide an amverseas bin file");
            return;
        }         
        
        if (args.length > 0) {
            fileName = args[0];
        } 
        
        if (args.length > 1) {
            type = Integer.parseInt(args[1]);

        } 
        
        if (args.length > 2) {
            salinity = Double.parseDouble(args[2]);
        } 


        XBTProfile xBTProfile = decodedXBTProfile.getXBTProfile();
        FormatConverter fc = new FormatConverter(xBTProfile);
        if (type == 0)
        System.out.print(fc.getASCII());
                if (type == 1)
        System.out.print(fc.getASCIIEDF(fileName,salinity));
        // TODO code application logic here
    }

}
