/*
* This is an example of how to use the library to read an XBT binary.
* and copy its contents one by one into another XBT binary using
* the BinDecoder and the BinEncoder.
*/

import binfileutils.BinDecoder;
import binfileutils.BinEncoder;
import binfileutils.XBTProfile;

/**
 *
 * @author pena
 */
public class DecodeEncodeXBTProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        String inFile = args[0];
        String outFile = args[1];   
       
        BinDecoder decodedXBTProfile = new BinDecoder(inFile);
       
        
        XBTProfile xBTProfileIn = decodedXBTProfile.getXBTProfile();
        XBTProfile xBTProfileOut = new XBTProfile();
       
        int mt = xBTProfileIn.getNewMessageType();
        xBTProfileOut.setNewMessageType(xBTProfileIn.getNewMessageType());
        xBTProfileOut.setAgencyOwner(xBTProfileIn.getAgencyOwner());
        xBTProfileOut.setDataQuality(xBTProfileIn.getDataQuality());
        xBTProfileOut.setDay(xBTProfileIn.getDay());
        xBTProfileOut.setDryBulbTemperature(xBTProfileIn.getDryBulbTemperature());
        xBTProfileOut.setHour(xBTProfileIn.getHour());
        xBTProfileOut.setInstrumentType(xBTProfileIn.getInstrumentType());
        xBTProfileOut.setLatitude(xBTProfileIn.getLatitude());
        xBTProfileOut.setLaunchHeight(xBTProfileIn.getLaunchHeight());
        xBTProfileOut.setLloyds(xBTProfileIn.getLloyds());
        xBTProfileOut.setLongitude(xBTProfileIn.getLongitude());
        xBTProfileOut.setMinute(xBTProfileIn.getMinute());
        xBTProfileOut.setMonth(xBTProfileIn.getMonth());
        xBTProfileOut.setNumberOfRepeatedFields(xBTProfileIn.getNumberOfRepeatedFields());
        xBTProfileOut.setNumberOfRiderBlocks(xBTProfileIn.getNumberOfRiderBlocks());
        xBTProfileOut.setNumberOfRiderEmailBlocks(xBTProfileIn.getNumberOfRiderEmailBlocks());
        xBTProfileOut.setNumberOfRiderInstitutionBlocks(xBTProfileIn.getNumberOfRiderInstitutionBlocks());
        xBTProfileOut.setNumberOfRiderPhoneBlocks(xBTProfileIn.getNumberOfRiderPhoneBlocks());
        xBTProfileOut.setOldMessageType(xBTProfileIn.getOldMessageType());
        xBTProfileOut.setProbeSerialNumber(xBTProfileIn.getProbeSerialNumber());
        xBTProfileOut.setRecorderType(xBTProfileIn.getRecorderType());        
        xBTProfileOut.setRiderNames(xBTProfileIn.getRiderNames());
        xBTProfileOut.setRiderEmails(xBTProfileIn.getRiderEmails());
        xBTProfileOut.setRiderInstitutions(xBTProfileIn.getRiderInstitutions());
        xBTProfileOut.setRiderPhones(xBTProfileIn.getRiderPhones());
        xBTProfileOut.setSeaDepth(xBTProfileIn.getSeaDepth());
        xBTProfileOut.setSeaSurfaceCurrentDirection(xBTProfileIn.getSeaSurfaceCurrentDirection());
        xBTProfileOut.setSeaSurfaceCurrentMeasurementMethod(xBTProfileIn.getSeaSurfaceCurrentMeasurementMethod());
        xBTProfileOut.setSeaSurfaceCurrentSpeed(xBTProfileIn.getSeaSurfaceCurrentSpeed());
        xBTProfileOut.setSeaSurfaceTemperature(xBTProfileIn.getSeaSurfaceTemperature());        
        xBTProfileOut.setSeasVersion(xBTProfileIn.getSeasVersion());
        xBTProfileOut.setSequenceNum(xBTProfileIn.getSequenceNumber());
        xBTProfileOut.setShipDirection(xBTProfileIn.getShipDirection());
        xBTProfileOut.setShipName(xBTProfileIn.getShipName());
        xBTProfileOut.setShipSpeed(xBTProfileIn.getShipSpeed());
        xBTProfileOut.setSoopLine(xBTProfileIn.getSoopLine());
        xBTProfileOut.setTemperaturePoints(xBTProfileIn.getTemperaturePoints());
        xBTProfileOut.setThisDataIs(xBTProfileIn.getThisDataIs());
        xBTProfileOut.setTimesReplicated(xBTProfileIn.getTimesReplicated());
        xBTProfileOut.setTotalWaterDepth(xBTProfileIn.getTotalWaterDepth());
        xBTProfileOut.setTransectNum(xBTProfileIn.getTransectNumber());
        xBTProfileOut.setWindDirection(xBTProfileIn.getWindDirection());
        xBTProfileOut.setWindInstrumentType(xBTProfileIn.getWindInstrumentType());
        xBTProfileOut.setWindSpeed(xBTProfileIn.getWindSpeed());
        xBTProfileOut.setCallsign(xBTProfileIn.getCallsign());
        xBTProfileOut.setXBTLauncherType(xBTProfileIn.getXBTLauncherType());
        xBTProfileOut.setXBTProbeManufacturedDay(xBTProfileIn.getXBTProbeManufacturedDay());
        xBTProfileOut.setXBTProbeManufacturedMonth(xBTProfileIn.getXBTProbeManufacturedMonth());
        xBTProfileOut.setXBTProbeManufacturedYear(xBTProfileIn.getXBTProbeManufacturedYear());
        xBTProfileOut.setXBTRecorderManufacturedDay(xBTProfileIn.getXBTRecorderManufacturedDay());
        xBTProfileOut.setXBTRecorderManufacturedMonth(xBTProfileIn.getXBTRecorderManufacturedMonth());
        xBTProfileOut.setXBTRecorderManufacturedYear(xBTProfileIn.getXBTRecorderManufacturedYear());
        xBTProfileOut.setXBTRecorderSerialNumber(xBTProfileIn.getXBTRecorderSerialNumber());
        xBTProfileOut.setYear(xBTProfileIn.getYear());
                
        BinEncoder encodedXBTProfile = new BinEncoder(xBTProfileOut); 
        encodedXBTProfile.writeOutBinFile(outFile);
        
    }
    
}
