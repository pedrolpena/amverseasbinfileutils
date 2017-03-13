/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binfileutils;
import binfileutils.XBTProfileDataRanges;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.BitSet;
import java.util.zip.CRC32;

/**
 *
 * @author Others and Pedro Pena
 */
public class BinEncoder {

    private XBTBinFormat xformat = new XBTBinFormat();
    private BitSet bits;
    private int newMessageType = 0;
    XBTProfile xp;

    public BinEncoder() {
    }

    public BinEncoder(XBTProfile xp) {
        this.xp = xp;
        bits = new BitSet();
        int start=-1,
                end=-1;
        
        newMessageType = xp.getNewMessageType();
        start = XBTProfileDataRanges.getWMOID(newMessageType)[0];
        //stringToBits(xp.getWMOId().getBytes(), start);
        
        stringToBits(xp.getWMOId().getBytes(), xformat.startWmoId());
        integerToBits(xp.getOldMessageType(),XBTProfileDataRanges.getOldMessageType(newMessageType));
        integerToBits(xp.getNewMessageType(), XBTProfileDataRanges.getNewMessageType(newMessageType));
        

        double latitude = xp.getLatitude() * 100000.0 + 9000000;
        integerToBits(Double.valueOf(latitude).intValue(), XBTProfileDataRanges.getLattitude(newMessageType));
        double longitude = xp.getLongitude() * 100000.0 + 18000000;
        integerToBits(Double.valueOf(longitude).intValue(), XBTProfileDataRanges.getLongitude(newMessageType));

        stringToBits(xp.getSoopLine().getBytes(), xformat.startSoopLine(newMessageType));
        integerToBits(xp.getTransectNumber(),XBTProfileDataRanges.getTransectNumber(newMessageType));
        integerToBits(xp.getSequenceNumber(), XBTProfileDataRanges.getSequenceNumber(newMessageType));
        integerToBits(xp.getYear(),XBTProfileDataRanges.getYear(newMessageType));
        integerToBits(xp.getMonth(), XBTProfileDataRanges.getMonth(newMessageType));
        integerToBits(xp.getDay(), XBTProfileDataRanges.getDay(newMessageType));
        integerToBits(xp.getHour(), XBTProfileDataRanges.getHour(newMessageType));
        integerToBits(xp.getMinute(),XBTProfileDataRanges.getMinute(newMessageType));
        stringToBits(xp.getShipName().getBytes(), xformat.startShipName(newMessageType));
        integerToBits(xp.getLloyds(), XBTProfileDataRanges.getLloyds(newMessageType));
        //integerToBits(xp.getUniqueTag(),XBTProfileDataRanges.getUniqueTag(newMessageType));
        integerToBits(xp.getSeasVersion(), XBTProfileDataRanges.getSeasVersion(newMessageType));
        integerToBits(xp.getProbeSerialNumber(), XBTProfileDataRanges.getProbeSerialNumber(newMessageType));
        integerToBits(xp.getThisDataIs(), XBTProfileDataRanges.getThisDataIs(newMessageType));
        integerToBits(xp.getDataQuality(), XBTProfileDataRanges.getDataQuality(newMessageType));

        double launchHeight = xp.getLaunchHeight() * 100.0;

        integerToBits(Double.valueOf(launchHeight).intValue(), XBTProfileDataRanges.getLaunchHeight(newMessageType));
        double shipDirection = xp.getShipDirection();
        integerToBits(Double.valueOf(shipDirection).intValue(),XBTProfileDataRanges.getShipDirection(newMessageType));
        double shipSpeed = xp.getShipSpeed() * 100.0;
        integerToBits(Double.valueOf(shipSpeed).intValue(),XBTProfileDataRanges.getShipSpeed(newMessageType));

        integerToBits(xp.getInstrumentType(), XBTProfileDataRanges.getInstrumentType(newMessageType));
        integerToBits(xp.getRecorderType(), XBTProfileDataRanges.getRecorderType(newMessageType));
        integerToBits(xp.getWindInstrumentType(), XBTProfileDataRanges.getWindInstrumentType(newMessageType));

        double windDirection = xp.getWindDirection();
        integerToBits(Double.valueOf(windDirection).intValue(), XBTProfileDataRanges.getWindDirection(newMessageType));
        double windSpeed = xp.getWindSpeed() * 10.0;
        integerToBits(Double.valueOf(windSpeed).intValue(),XBTProfileDataRanges.getWindSpeed(newMessageType));
        double dryBulbTemperature = xp.getDryBulbTemperature() * 10.0;
        integerToBits(Double.valueOf(dryBulbTemperature).intValue(), XBTProfileDataRanges.getDryBulbTemperature(newMessageType));

        integerToBits(xp.getSeaSurfaceCurrentMeasurementMethod(), XBTProfileDataRanges.getSeaSurfaceCurrentMeasurementMethod(newMessageType));
        integerToBits(xp.getSeaSurfaceCurrentDirection(), XBTProfileDataRanges.getSeaSurfaceCurrentDirection(newMessageType));

        double seaSurfaceCurrentSpeed = xp.getSeaSurfaceCurrentSpeed() * 100.00;
        integerToBits(Double.valueOf(seaSurfaceCurrentSpeed).intValue(), XBTProfileDataRanges.getSeaSurfaceCurrentSpeed(newMessageType));

        integerToBits(xp.getTotalWaterDepth(),XBTProfileDataRanges.getTotalWaterDepth(newMessageType));
        integerToBits(xp.getAgencyOwner(), XBTProfileDataRanges.getAgencyOwner(newMessageType));
        integerToBits(xp.getXBTLauncherType(), XBTProfileDataRanges.getXBTLauncherType(newMessageType));
        stringToBits(xp.getXBTRecorderSerialNumber().getBytes(), xformat.startXBTRecorderSerialNumber(newMessageType));
        integerToBits(xp.getXBTRecorderManufacturedYear(),XBTProfileDataRanges.getXBTRecorderManufacturedYear(newMessageType));
        integerToBits(xp.getXBTRecorderManufacturedMonth(),XBTProfileDataRanges.getXBTRecorderManufacturedMonth(newMessageType));
        integerToBits(xp.getXBTRecorderManufacturedDay(), XBTProfileDataRanges.getXBTRecorderManufacturedDay(newMessageType));
        integerToBits(xp.getXBTProbeManufacturedYear(),XBTProfileDataRanges.getXBTProbeManufacturedYear(newMessageType));
        integerToBits(xp.getXBTProbeManufacturedMonth(),XBTProfileDataRanges.getXBTProbeManufacturedMonth(newMessageType));
        integerToBits(xp.getXBTProbeManufacturedDay(),XBTProfileDataRanges.getXBTProbeManufacturedDay(newMessageType));
        integerToBits(xp.getNumberOfRiderBlocks(),XBTProfileDataRanges.getNumberOfRiderBlocks(newMessageType));
        integerToBits(xp.getNumberOfRiderInstitutionBlocks(),XBTProfileDataRanges.getNumberOfRiderInstitutionBlocks(newMessageType));
        integerToBits(xp.getNumberOfRiderEmailBlocks(), XBTProfileDataRanges.getNumberOfRiderEmailBlocks(newMessageType));
        integerToBits(xp.getNumberOfRiderPhoneBlocks(),XBTProfileDataRanges.getNumberOfRiderBlocks(newMessageType));
        integerToBits(xp.getNumberOfRepeatedFields(),XBTProfileDataRanges.getNumberOfRepeatedFields(newMessageType));
        integerToBits(xp.getTimesReplicated(), XBTProfileDataRanges.getTimesReplicated(newMessageType));

        double seaSurfaceTemperature = Math.round(xp.getSeaSurfaceTemperature()
                * 100.00 + 400.00);
        integerToBits(Double.valueOf(seaSurfaceTemperature).intValue(),XBTProfileDataRanges.getSeaTemperature(newMessageType));

        if (newMessageType == 1) {
            double seaDepth = xp.getSeaDepth();
            integerToBits(Double.valueOf(seaDepth).intValue(),XBTProfileDataRanges.getSeaDepth(newMessageType));
        }
         
        int [] temperaturePointsRange={-1,-1};
        start=XBTProfileDataRanges.getTemperaturePoints(newMessageType)[0];
        
        for (int i = 0; i < xp.getTemperaturePoints().length; i++) {
            // we had to round here because the doubles were being
            // truncated to the wrong value
            
            double tp = Math.round(xp.getTemperaturePoints()[i] * 100.00) + 400.00;
            temperaturePointsRange[0]=start+i*12;
            temperaturePointsRange[1]=start+i*12+11;
            integerToBits(Double.valueOf(tp).intValue(), temperaturePointsRange);
            

        }

        for (int i = 0; i < xp.getRiderNames().length; i++) {
            stringToBits(xp.getRiderNames()[i].getBytes(), xformat.endRiderName(newMessageType, xp.getTimesReplicated(), i));
        }

        for (int i = 0; i < xp.getRiderEmails().length; i++) {
            stringToBits(xp.getRiderEmails()[i].getBytes(), xformat.endRiderEmail(newMessageType, xp.getTimesReplicated(), xp.getNumberOfRiderBlocks(), i));
        }

        for (int i = 0; i < xp.getRiderInstitutions().length; i++) {
            stringToBits(xp.getRiderInstitutions()[i].getBytes(),
                    xformat.endInstituion(newMessageType, xp.getTimesReplicated(), xp.getNumberOfRiderBlocks(), xp.getNumberOfRiderEmailBlocks(), i));
        }

        for (int i = 0; i < xp.getRiderPhones().length; i++) {
            stringToBits(xp.getRiderPhones()[i].getBytes(),
                    xformat.endRiderPhone(newMessageType, xp.getTimesReplicated(), xp.getNumberOfRiderBlocks(), xp.getNumberOfRiderEmailBlocks(), xp.getNumberOfRiderPhoneBlocks(), i));
        }

    }

    public void writeOutBinFile(String outputFile) {

        File inputFile = new File(outputFile);
        FileOutputStream fos = null;
        setMessageCRC();

        bits = changeEndian(bits);

        try {
            fos = new FileOutputStream(inputFile);
            // Writes bytes from the specified byte array to this file output stream 
            fos.write(bits.toByteArray());
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e + "\n");
        } catch (IOException ioe) {
            System.out.println("Exception while writing file " + ioe + "\n");
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe + "\n");
            }
        }
    }

    private BitSet changeEndian(BitSet b) {
        boolean temp;
        for (int i = 0; i < b.length() - 1; i = i + 8) {
            for (int j = 0; j < 4; j++) {
                temp = b.get(i + j);
                b.set(i + j, b.get(i - j + 7));
                b.set(i - j + 7, temp);
            }//end for
        }//end for
        return b;
    }

    private void integerToBits(int binMetaData, int[] range) {
        int endPos=-1;
        int startPos = -1;
        startPos = range[0];
        endPos = range[1];
        int bitLength = endPos - startPos + 1;
        BitSet tempBS = new BitSet();
        int bitZero = 0x00;

        for (int i = 0; i < bitLength; i++) {
            bitZero = binMetaData & 0x01;
            binMetaData = binMetaData >> 1;
            if (bitZero == 1) {
                tempBS.set((bitLength - 1) - i, true);
            } else {
                tempBS.set((bitLength - 1) - i, false);
            }
        }
        setBitWithinBits(tempBS, startPos);
    }
    
        

    private void stringToBits(byte[] metaData, int startPos) {
        BitSet bs = BitSet.valueOf(metaData);
        bs = changeEndian(bs);
        setBitWithinBits(bs, startPos);
    }

    private void setBitWithinBits(BitSet b, int startPos) {
        for (int i = 0; i < b.length(); i++) {
            if (b.get(i)) {
                bits.set(i + startPos, true);
            } else {
                bits.set(i + startPos, false);
            }
        }
    }

    private void setMessageCRC() {
        CRC32 generator = new CRC32();

        integerToBits(0xFFFFFFFF, XBTProfileDataRanges.getUniqueTag(newMessageType));
        //System.out.println(Integer.toHexString(xp.getUniqueTag()).toUpperCase());
        generator.reset();
        changeEndian(bits);
        generator.update(bits.toByteArray());
        changeEndian(bits);
        integerToBits((int) (generator.getValue()), XBTProfileDataRanges.getUniqueTag(newMessageType));
    }
}
