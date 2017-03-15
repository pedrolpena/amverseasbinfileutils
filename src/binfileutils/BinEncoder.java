/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binfileutils;

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

    private BitSet bits;
    private int newMessageType = 0;



    public BinEncoder(XBTProfile xBTProfile) {

        bits = new BitSet();
        newMessageType = xBTProfile.getNewMessageType();
        encodeProfile(xBTProfile);

    }

    private void encodeProfile(XBTProfile xBTProfile) {

        int numberOfRiderBlocks = 0;
        int numberOfRiderEmailBlocks = 0;
        int numberOfRiderInstitutionBlocks = 0;
        int numberOfRiderPhoneBlocks = 0;
        int timesReplicated = 0;
        int start = -1;
        int start0 = -1;
        byte[] varStrings;
        int[] range = {-1, -1};

        stringToBits(xBTProfile.getWMOId().getBytes(), XBTProfileDataRanges.getWMOID(newMessageType));
        integerToBits(xBTProfile.getOldMessageType(), XBTProfileDataRanges.getOldMessageType(newMessageType));
        integerToBits(xBTProfile.getNewMessageType(), XBTProfileDataRanges.getNewMessageType(newMessageType));
        double latitude = Math.round(xBTProfile.getLatitude() * 100000.0 + 9000000);
        integerToBits(Double.valueOf(latitude).intValue(), XBTProfileDataRanges.getLattitude(newMessageType));
        double longitude = Math.round(xBTProfile.getLongitude() * 100000.0 + 18000000);
        integerToBits(Double.valueOf(longitude).intValue(), XBTProfileDataRanges.getLongitude(newMessageType));
        stringToBits(xBTProfile.getSoopLine().getBytes(), XBTProfileDataRanges.getSoopLine(newMessageType));
        integerToBits(xBTProfile.getTransectNumber(), XBTProfileDataRanges.getTransectNumber(newMessageType));
        integerToBits(xBTProfile.getSequenceNumber(), XBTProfileDataRanges.getSequenceNumber(newMessageType));
        integerToBits(xBTProfile.getYear(), XBTProfileDataRanges.getYear(newMessageType));
        integerToBits(xBTProfile.getMonth(), XBTProfileDataRanges.getMonth(newMessageType));
        integerToBits(xBTProfile.getDay(), XBTProfileDataRanges.getDay(newMessageType));
        integerToBits(xBTProfile.getHour(), XBTProfileDataRanges.getHour(newMessageType));
        integerToBits(xBTProfile.getMinute(), XBTProfileDataRanges.getMinute(newMessageType));
        stringToBits(xBTProfile.getShipName().getBytes(), XBTProfileDataRanges.getShipName(newMessageType));
        integerToBits(xBTProfile.getLloyds(), XBTProfileDataRanges.getLloyds(newMessageType));
        //integerToBits(xBTProfile.getUniqueTag(),XBTProfileDataRanges.getUniqueTag(newMessageType));
        integerToBits(xBTProfile.getSeasVersion(), XBTProfileDataRanges.getSeasVersion(newMessageType));
        integerToBits(xBTProfile.getProbeSerialNumber(), XBTProfileDataRanges.getProbeSerialNumber(newMessageType));
        integerToBits(xBTProfile.getThisDataIs(), XBTProfileDataRanges.getThisDataIs(newMessageType));
        integerToBits(xBTProfile.getDataQuality(), XBTProfileDataRanges.getDataQuality(newMessageType));
        double launchHeight = Math.round(xBTProfile.getLaunchHeight() * 100.0);
        integerToBits(Double.valueOf(launchHeight).intValue(), XBTProfileDataRanges.getLaunchHeight(newMessageType));
        double shipDirection = Math.round(xBTProfile.getShipDirection());
        integerToBits(Double.valueOf(shipDirection).intValue(), XBTProfileDataRanges.getShipDirection(newMessageType));
        double shipSpeed = Math.round(xBTProfile.getShipSpeed() * 100.0);
        integerToBits(Double.valueOf(shipSpeed).intValue(), XBTProfileDataRanges.getShipSpeed(newMessageType));
        integerToBits(xBTProfile.getInstrumentType(), XBTProfileDataRanges.getInstrumentType(newMessageType));
        integerToBits(xBTProfile.getRecorderType(), XBTProfileDataRanges.getRecorderType(newMessageType));
        integerToBits(xBTProfile.getWindInstrumentType(), XBTProfileDataRanges.getWindInstrumentType(newMessageType));
        double windDirection = xBTProfile.getWindDirection();
        integerToBits(Double.valueOf(windDirection).intValue(), XBTProfileDataRanges.getWindDirection(newMessageType));
        double windSpeed = Math.round(xBTProfile.getWindSpeed() * 10.0);
        integerToBits(Double.valueOf(windSpeed).intValue(), XBTProfileDataRanges.getWindSpeed(newMessageType));
        double dryBulbTemperature = Math.round(xBTProfile.getDryBulbTemperature() * 10.0);
        integerToBits(Double.valueOf(dryBulbTemperature).intValue(), XBTProfileDataRanges.getDryBulbTemperature(newMessageType));
        integerToBits(xBTProfile.getSeaSurfaceCurrentMeasurementMethod(), XBTProfileDataRanges.getSeaSurfaceCurrentMeasurementMethod(newMessageType));
        integerToBits(xBTProfile.getSeaSurfaceCurrentDirection(), XBTProfileDataRanges.getSeaSurfaceCurrentDirection(newMessageType));
        double seaSurfaceCurrentSpeed = Math.round(xBTProfile.getSeaSurfaceCurrentSpeed() * 100.00);
        integerToBits(Double.valueOf(seaSurfaceCurrentSpeed).intValue(), XBTProfileDataRanges.getSeaSurfaceCurrentSpeed(newMessageType));
        integerToBits(xBTProfile.getTotalWaterDepth(), XBTProfileDataRanges.getTotalWaterDepth(newMessageType));
        integerToBits(xBTProfile.getAgencyOwner(), XBTProfileDataRanges.getAgencyOwner(newMessageType));
        integerToBits(xBTProfile.getXBTLauncherType(), XBTProfileDataRanges.getXBTLauncherType(newMessageType));
        stringToBits(xBTProfile.getXBTRecorderSerialNumber().getBytes(), XBTProfileDataRanges.getXBTRecorderSerialNumber(newMessageType));
        integerToBits(xBTProfile.getXBTRecorderManufacturedYear(), XBTProfileDataRanges.getXBTRecorderManufacturedYear(newMessageType));
        integerToBits(xBTProfile.getXBTRecorderManufacturedMonth(), XBTProfileDataRanges.getXBTRecorderManufacturedMonth(newMessageType));
        integerToBits(xBTProfile.getXBTRecorderManufacturedDay(), XBTProfileDataRanges.getXBTRecorderManufacturedDay(newMessageType));
        integerToBits(xBTProfile.getXBTProbeManufacturedYear(), XBTProfileDataRanges.getXBTProbeManufacturedYear(newMessageType));
        integerToBits(xBTProfile.getXBTProbeManufacturedMonth(), XBTProfileDataRanges.getXBTProbeManufacturedMonth(newMessageType));
        integerToBits(xBTProfile.getXBTProbeManufacturedDay(), XBTProfileDataRanges.getXBTProbeManufacturedDay(newMessageType));
        integerToBits(xBTProfile.getNumberOfRiderInstitutionBlocks(), XBTProfileDataRanges.getNumberOfRiderInstitutionBlocks(newMessageType));
        integerToBits(xBTProfile.getNumberOfRiderEmailBlocks(), XBTProfileDataRanges.getNumberOfRiderEmailBlocks(newMessageType));
        integerToBits(xBTProfile.getNumberOfRiderPhoneBlocks(), XBTProfileDataRanges.getNumberOfRiderPhoneBlocks(newMessageType));

        //*************calculate Number of repeated fields.***************
        xBTProfile.setNumberOfRepeatedFields(1);

        if (xBTProfile.getThisDataIs() == 3) {
            xBTProfile.setNumberOfRepeatedFields(2);
        }// end if

        integerToBits(xBTProfile.getNumberOfRepeatedFields(), XBTProfileDataRanges.getNumberOfRepeatedFields(newMessageType));
        
        //*************Compute timesReplicated****************************
        timesReplicated = xBTProfile.getTemperaturePoints().length;
        xBTProfile.setTimesReplicated(timesReplicated);
        integerToBits(timesReplicated, XBTProfileDataRanges.getTimesReplicated(newMessageType));

        //**************Encode Rider Name*********************************
        start0 = XBTProfileDataRanges.getRiderNames(newMessageType)[0] + 12 * timesReplicated;

        if (xBTProfile.getRiderName() != null) {

            numberOfRiderBlocks = (int) Math.ceil(((double) xBTProfile.getRiderName().length()) / 5);

            integerToBits(numberOfRiderBlocks, XBTProfileDataRanges.getNumberOfRiderBlocks(newMessageType));

            varStrings = xBTProfile.getRiderName().getBytes();
            range[0] = start0;
            stringToBits(varStrings, range);

        } else {
            numberOfRiderBlocks = 0;

        }

        xBTProfile.setNumberOfRiderBlocks(numberOfRiderBlocks);


        //***********************Encode Rider Email***********************
        if (xBTProfile.getRiderEmail() != null) {
            numberOfRiderEmailBlocks = (int) Math.ceil(((double) xBTProfile.getRiderEmail().length()) / 5);

            integerToBits(numberOfRiderEmailBlocks, XBTProfileDataRanges.getNumberOfRiderEmailBlocks(newMessageType));
            start0 = start0 + numberOfRiderBlocks * 40;
            varStrings = xBTProfile.getRiderEmail().getBytes();
            range[0] = start0;
            stringToBits(varStrings, range);
        } else {
            numberOfRiderEmailBlocks = 0;
            start0 = start0 + numberOfRiderBlocks * 40;
        }
        xBTProfile.setNumberOfRiderEmailBlocks(numberOfRiderEmailBlocks);


        //***********************Encode Rider Instituion********************
        if (xBTProfile.getRiderInstitution() != null) {
            numberOfRiderInstitutionBlocks = (int) Math.ceil(((double) xBTProfile.getRiderInstitution().length()) / 5);

            integerToBits(numberOfRiderInstitutionBlocks, XBTProfileDataRanges.getNumberOfRiderInstitutionBlocks(newMessageType));
            start0 = start0 + numberOfRiderEmailBlocks * 40;
            varStrings = xBTProfile.getRiderInstitution().getBytes();
            range[0] = start0;
            stringToBits(varStrings, range);
        } else {
            numberOfRiderInstitutionBlocks = 0;
            start0 = start0 + numberOfRiderEmailBlocks * 40;
        }
        xBTProfile.setNumberOfRiderInstitutionBlocks(numberOfRiderInstitutionBlocks);

        
        //**************************Encode Rider Phone Number****************
        if (xBTProfile.getRiderPhone() != null) {
            numberOfRiderPhoneBlocks = (int) Math.ceil(((double) xBTProfile.getRiderPhone().length()) / 5);

            integerToBits(numberOfRiderPhoneBlocks, XBTProfileDataRanges.getNumberOfRiderPhoneBlocks(newMessageType));
            start0 = start0 + numberOfRiderInstitutionBlocks * 40;
            range[0] = start0;

            varStrings = xBTProfile.getRiderPhone().getBytes();
            stringToBits(varStrings, range);
        } else {
            numberOfRiderPhoneBlocks = 0;
            start0 = start0 + numberOfRiderInstitutionBlocks * 40;
        }
        xBTProfile.setNumberOfRiderPhoneBlocks(numberOfRiderPhoneBlocks);

        
        
        //********************Encode Temperature points************************
        double seaSurfaceTemperature = Math.round(xBTProfile.getSeaSurfaceTemperature()
                * 100.00 + 400.00);
        integerToBits(Double.valueOf(seaSurfaceTemperature).intValue(), XBTProfileDataRanges.getSeaTemperature(newMessageType));

        if (newMessageType == 1) {
            double seaDepth = xBTProfile.getSeaDepth();
            integerToBits(Double.valueOf(seaDepth).intValue(), XBTProfileDataRanges.getSeaDepth(newMessageType));
        }

        int[] temperaturePointsRange = {-1, -1};
        start = XBTProfileDataRanges.getTemperaturePoints(newMessageType)[0];

        for (int i = 0; i < xBTProfile.getTemperaturePoints().length; i++) {
            // we had to round here because the doubles were being
            // truncated to the wrong value

            double tp = Math.round(xBTProfile.getTemperaturePoints()[i] * 100.00) + 400.00;
            temperaturePointsRange[0] = start + i * 12;
            temperaturePointsRange[1] = start + i * 12 + 11;
            integerToBits(Double.valueOf(tp).intValue(), temperaturePointsRange);

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
    /**
     * This method flips the "endianes" of a BitSet
     * object and returns a BitSet object with flipped "endianess".
     *
     * @return <strong>(FXY)</strong>-This method flips the "endianes" of a
     * BitSet object and returns a BitSet object with flipped "endianess".
     */
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
        int endPos = -1;
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

    private void stringToBits(byte[] metaData, int[] range) {
        int startPos = range[0];
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
        generator.reset();
        changeEndian(bits);
        generator.update(bits.toByteArray());
        changeEndian(bits);
        integerToBits((int) (generator.getValue()), XBTProfileDataRanges.getUniqueTag(newMessageType));
    }
}
