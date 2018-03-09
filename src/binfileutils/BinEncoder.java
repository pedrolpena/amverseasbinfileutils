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
 * This class is used to encode meta data into a SEAS XBT binary profile
 *
 * @author Others and Pedro Pena
 */
public class BinEncoder {

    private BitSet bits;
    private int newMessageType = 0;

    /**
     * The constructor takes an XBTProfile object that will be converted to a
     * SEAS binary XBT profile
     *
     * @param xBTProfile an XBTProfile object
     */
    public BinEncoder(XBTProfile xBTProfile) {

        bits = new BitSet();
        newMessageType = xBTProfile.getNewMessageType();
        encodeProfile(xBTProfile);

    }

    /**
     * takes an XBTProfile object and creates a SEAS binary XBT profile
     *
     * @param xBTProfile an XBTProfile object
     */
    private void encodeProfile(XBTProfile xBTProfile) {

        int numberOfRiderBlocks;
        int numberOfRiderEmailBlocks;
        int numberOfRiderInstitutionBlocks;
        int numberOfRiderPhoneBlocks;
        int timesReplicated;
        int start;
        int start0;
        int[] range = {-1, -1};

        stringToBits(bits, xBTProfile.getWMOId(), XBTProfileDataRanges.getWMOID(newMessageType));
        integerToBits(bits, xBTProfile.getOldMessageType(), XBTProfileDataRanges.getOldMessageType(newMessageType));
        integerToBits(bits, xBTProfile.getNewMessageType(), XBTProfileDataRanges.getNewMessageType(newMessageType));
        double latitude = Math.round(xBTProfile.getLatitude() * 100000.0 + 9000000);
        integerToBits(bits, Double.valueOf(latitude).intValue(), XBTProfileDataRanges.getLattitude(newMessageType));
        double longitude = Math.round(xBTProfile.getLongitude() * 100000.0 + 18000000);
        integerToBits(bits, Double.valueOf(longitude).intValue(), XBTProfileDataRanges.getLongitude(newMessageType));
        stringToBits(bits, xBTProfile.getSoopLine(), XBTProfileDataRanges.getSoopLine(newMessageType));
        integerToBits(bits, xBTProfile.getTransectNumber(), XBTProfileDataRanges.getTransectNumber(newMessageType));
        integerToBits(bits, xBTProfile.getSequenceNumber(), XBTProfileDataRanges.getSequenceNumber(newMessageType));
        integerToBits(bits, xBTProfile.getYear(), XBTProfileDataRanges.getYear(newMessageType));
        integerToBits(bits, xBTProfile.getMonth(), XBTProfileDataRanges.getMonth(newMessageType));
        integerToBits(bits, xBTProfile.getDay(), XBTProfileDataRanges.getDay(newMessageType));
        integerToBits(bits, xBTProfile.getHour(), XBTProfileDataRanges.getHour(newMessageType));
        integerToBits(bits, xBTProfile.getMinute(), XBTProfileDataRanges.getMinute(newMessageType));
        stringToBits(bits, xBTProfile.getShipName(), XBTProfileDataRanges.getShipName(newMessageType));
        integerToBits(bits, xBTProfile.getLloyds(), XBTProfileDataRanges.getLloyds(newMessageType));
        //integerToBitsTest(bits,xBTProfile.getUniqueTag(),XBTProfileDataRanges.getUniqueTag(newMessageType));
        integerToBits(bits, xBTProfile.getSeasVersion(), XBTProfileDataRanges.getSeasVersion(newMessageType));
        integerToBits(bits, xBTProfile.getProbeSerialNumber(), XBTProfileDataRanges.getProbeSerialNumber(newMessageType));
        integerToBits(bits, xBTProfile.getThisDataIs(), XBTProfileDataRanges.getThisDataIs(newMessageType));
        integerToBits(bits, xBTProfile.getDataQuality(), XBTProfileDataRanges.getDataQuality(newMessageType));
        double launchHeight = Math.round(xBTProfile.getLaunchHeight() * 100.0);
        integerToBits(bits, Double.valueOf(launchHeight).intValue(), XBTProfileDataRanges.getLaunchHeight(newMessageType));
        double shipDirection = Math.round(xBTProfile.getShipDirection());
        integerToBits(bits, Double.valueOf(shipDirection).intValue(), XBTProfileDataRanges.getShipDirection(newMessageType));
        double shipSpeed = Math.round(xBTProfile.getShipSpeed() * 100.0);
        integerToBits(bits, Double.valueOf(shipSpeed).intValue(), XBTProfileDataRanges.getShipSpeed(newMessageType));
        integerToBits(bits, xBTProfile.getInstrumentType(), XBTProfileDataRanges.getInstrumentType(newMessageType));
        integerToBits(bits, xBTProfile.getRecorderType(), XBTProfileDataRanges.getRecorderType(newMessageType));
        integerToBits(bits, xBTProfile.getWindInstrumentType(), XBTProfileDataRanges.getWindInstrumentType(newMessageType));
        double windDirection = xBTProfile.getWindDirection();
        integerToBits(bits, Double.valueOf(windDirection).intValue(), XBTProfileDataRanges.getWindDirection(newMessageType));
        double windSpeed = Math.round(xBTProfile.getWindSpeed() * 10.0);
        integerToBits(bits, Double.valueOf(windSpeed).intValue(), XBTProfileDataRanges.getWindSpeed(newMessageType));
        double dryBulbTemperature = Math.round(xBTProfile.getDryBulbTemperature() * 10.0);
        integerToBits(bits, Double.valueOf(dryBulbTemperature).intValue(), XBTProfileDataRanges.getDryBulbTemperature(newMessageType));
        integerToBits(bits, xBTProfile.getSeaSurfaceCurrentMeasurementMethod(), XBTProfileDataRanges.getSeaSurfaceCurrentMeasurementMethod(newMessageType));
        integerToBits(bits, xBTProfile.getSeaSurfaceCurrentDirection(), XBTProfileDataRanges.getSeaSurfaceCurrentDirection(newMessageType));
        double seaSurfaceCurrentSpeed = Math.round(xBTProfile.getSeaSurfaceCurrentSpeed() * 100.00);
        integerToBits(bits, Double.valueOf(seaSurfaceCurrentSpeed).intValue(), XBTProfileDataRanges.getSeaSurfaceCurrentSpeed(newMessageType));
        integerToBits(bits, xBTProfile.getTotalWaterDepth(), XBTProfileDataRanges.getTotalWaterDepth(newMessageType));
        integerToBits(bits, xBTProfile.getAgencyOwner(), XBTProfileDataRanges.getAgencyOwner(newMessageType));
        integerToBits(bits, xBTProfile.getXBTLauncherType(), XBTProfileDataRanges.getXBTLauncherType(newMessageType));
        stringToBits(bits, xBTProfile.getXBTRecorderSerialNumber(), XBTProfileDataRanges.getXBTRecorderSerialNumber(newMessageType));
        integerToBits(bits, xBTProfile.getXBTRecorderManufacturedYear(), XBTProfileDataRanges.getXBTRecorderManufacturedYear(newMessageType));
        integerToBits(bits, xBTProfile.getXBTRecorderManufacturedMonth(), XBTProfileDataRanges.getXBTRecorderManufacturedMonth(newMessageType));
        integerToBits(bits, xBTProfile.getXBTRecorderManufacturedDay(), XBTProfileDataRanges.getXBTRecorderManufacturedDay(newMessageType));
        integerToBits(bits, xBTProfile.getXBTProbeManufacturedYear(), XBTProfileDataRanges.getXBTProbeManufacturedYear(newMessageType));
        integerToBits(bits, xBTProfile.getXBTProbeManufacturedMonth(), XBTProfileDataRanges.getXBTProbeManufacturedMonth(newMessageType));
        integerToBits(bits, xBTProfile.getXBTProbeManufacturedDay(), XBTProfileDataRanges.getXBTProbeManufacturedDay(newMessageType));
        integerToBits(bits, xBTProfile.getNumberOfRiderInstitutionBlocks(), XBTProfileDataRanges.getNumberOfRiderInstitutionBlocks(newMessageType));
        integerToBits(bits, xBTProfile.getNumberOfRiderEmailBlocks(), XBTProfileDataRanges.getNumberOfRiderEmailBlocks(newMessageType));
        integerToBits(bits, xBTProfile.getNumberOfRiderPhoneBlocks(), XBTProfileDataRanges.getNumberOfRiderPhoneBlocks(newMessageType));

        //********************Encode Temperature/Resistance points************************
        int last = 0;
        if (newMessageType != MessageType.MESSAGE_TYPE_4) {
            double seaSurfaceTemperature = Math.round(xBTProfile.getSeaSurfaceTemperature()
                    * 100.00 + 400.00);
            integerToBits(bits, Double.valueOf(seaSurfaceTemperature).intValue(), XBTProfileDataRanges.getSeaTemperature(newMessageType));
        } else {

            double seaSurfaceResistance = Math.round(xBTProfile.getSeaSurfaceResistance() - 3200);
            integerToBits(bits, Double.valueOf(seaSurfaceResistance).intValue(), XBTProfileDataRanges.getSeaResistance(newMessageType));

        }//end else

        if (newMessageType == MessageType.MESSAGE_TYPE_1) {
            double seaDepth = xBTProfile.getSeaDepth();
            integerToBits(bits, Double.valueOf(seaDepth).intValue(), XBTProfileDataRanges.getSeaDepth(newMessageType));
        }
        if (newMessageType != MessageType.MESSAGE_TYPE_4) {
            int[] temperaturePointsRange = {-1, -1};
            start = XBTProfileDataRanges.getTemperaturePoints(newMessageType)[0];

            for (int i = 0; i < xBTProfile.getTemperaturePoints().length; i++) {
                // we had to round here because the doubles were being
                // truncated to the wrong value

                double tp = Math.round(xBTProfile.getTemperaturePoints()[i] * 100.00) + 400.00;
                temperaturePointsRange[0] = start + i * 12;
                temperaturePointsRange[1] = start + i * 12 + 11;
                integerToBits(bits, Double.valueOf(tp).intValue(), temperaturePointsRange);
                last = i;

            }
        } else {

            int[] resistancePointsRange = {-1, -1};
            start = XBTProfileDataRanges.getResistancePoints(newMessageType)[0];

            for (int i = 0; i < xBTProfile.getResistancePoints().length; i++) {
                // we had to round here because the doubles were being
                // truncated to the wrong value

                double rp = Math.round(xBTProfile.getResistancePoints()[i] - 3200);
                resistancePointsRange[0] = start + i * 14;
                resistancePointsRange[1] = start + i * 14 + 13;
                integerToBits(bits, Double.valueOf(rp).intValue(), resistancePointsRange);
                last = i;

            }

        }//end else

        //*************calculate Number of repeated fields.***************
        xBTProfile.setNumberOfRepeatedFields(1);

        if (xBTProfile.getThisDataIs() == 3) {
            xBTProfile.setNumberOfRepeatedFields(2);
        }// end if

        integerToBits(bits, xBTProfile.getNumberOfRepeatedFields(), XBTProfileDataRanges.getNumberOfRepeatedFields(newMessageType));

        //*************Compute timesReplicated****************************
        if (newMessageType != MessageType.MESSAGE_TYPE_4) {
            timesReplicated = xBTProfile.getTemperaturePoints().length;
            xBTProfile.setTimesReplicated(timesReplicated);
            integerToBits(bits, timesReplicated, XBTProfileDataRanges.getTimesReplicated(newMessageType));
        } else {

            timesReplicated = xBTProfile.getResistancePoints().length;
            xBTProfile.setTimesReplicated(timesReplicated);
            integerToBits(bits, timesReplicated, XBTProfileDataRanges.getTimesReplicated(newMessageType));

        }//end else
        //**************Encode Rider Name*********************************
        if (newMessageType != MessageType.MESSAGE_TYPE_4) {
            start0 = XBTProfileDataRanges.getRiderNames(newMessageType)[0] + 12 * timesReplicated;
        } else {
            start0 = XBTProfileDataRanges.getRiderNames(newMessageType)[0] + 14 * timesReplicated;
        }//end else

        if (xBTProfile.getRiderNames() != null &&xBTProfile.getRiderNames().length() > 0 ) {

            numberOfRiderBlocks = (int) Math.ceil(((double) xBTProfile.getRiderNames().length()) / 5);

            if (numberOfRiderBlocks > 0) {
                integerToBits(bits, numberOfRiderBlocks, XBTProfileDataRanges.getNumberOfRiderBlocks(newMessageType));

                range[0] = start0;
                encodeCommentBlocks(bits, xBTProfile.getRiderNames(), range, numberOfRiderBlocks);
            }

        } else {
            numberOfRiderBlocks = 0;

        }

        xBTProfile.setNumberOfRiderBlocks(numberOfRiderBlocks);

        //***********************Encode Rider Email***********************
        if (xBTProfile.getRiderEmails() != null && xBTProfile.getRiderEmails().length() > 0) {
            numberOfRiderEmailBlocks = (int) Math.ceil(((double) xBTProfile.getRiderEmails().length()) / 5);

            if (numberOfRiderEmailBlocks > 0) {
                integerToBits(bits, numberOfRiderEmailBlocks, XBTProfileDataRanges.getNumberOfRiderEmailBlocks(newMessageType));
                start0 = start0 + numberOfRiderBlocks * 40;
                range[0] = start0;
                encodeCommentBlocks(bits, xBTProfile.getRiderEmails(), range, numberOfRiderEmailBlocks);
            }
        } else {
            numberOfRiderEmailBlocks = 0;
            start0 = start0 + numberOfRiderBlocks * 40;
        }
        xBTProfile.setNumberOfRiderEmailBlocks(numberOfRiderEmailBlocks);

        //***********************Encode Rider Instituion********************
        if (xBTProfile.getRiderInstitutions() != null && xBTProfile.getRiderInstitutions().length() > 0) {
            numberOfRiderInstitutionBlocks = (int) Math.ceil(((double) xBTProfile.getRiderInstitutions().length()) / 5);
            if (numberOfRiderInstitutionBlocks > 0) {
                integerToBits(bits, numberOfRiderInstitutionBlocks, XBTProfileDataRanges.getNumberOfRiderInstitutionBlocks(newMessageType));
                start0 = start0 + numberOfRiderEmailBlocks * 40;
                range[0] = start0;
                encodeCommentBlocks(bits, xBTProfile.getRiderInstitutions(), range, numberOfRiderInstitutionBlocks);
            }
        } else {
            numberOfRiderInstitutionBlocks = 0;
            start0 = start0 + numberOfRiderEmailBlocks * 40;
        }
        if (numberOfRiderInstitutionBlocks > 0) {
        }
        xBTProfile.setNumberOfRiderInstitutionBlocks(numberOfRiderInstitutionBlocks);

        //**************************Encode Rider Phone Number****************
        if (xBTProfile.getRiderPhones() != null && xBTProfile.getRiderPhones().length() > 0) {
            numberOfRiderPhoneBlocks = (int) Math.ceil(((double) xBTProfile.getRiderPhones().length()) / 5);
            if (numberOfRiderPhoneBlocks > 0) {
                integerToBits(bits, numberOfRiderPhoneBlocks, XBTProfileDataRanges.getNumberOfRiderPhoneBlocks(newMessageType));
                start0 = start0 + numberOfRiderInstitutionBlocks * 40;
                range[0] = start0;

                encodeCommentBlocks(bits, xBTProfile.getRiderPhones(), range, numberOfRiderPhoneBlocks);
            }
        } else {
            numberOfRiderPhoneBlocks = 0;

        }
        xBTProfile.setNumberOfRiderPhoneBlocks(numberOfRiderPhoneBlocks);

    }

    /**
     * This method accepts a String representing the filename that will be used
     * to create the binary file.
     *
     * @param outputFile the filename that will be used to create the binary
     * file.
     */
    public void writeOutBinFile(String outputFile) {

        File inputFile = new File(outputFile);
        FileOutputStream fos = null;
        setMessageCRC(bits);

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
     * This method flips the "endianes" of a BitSet object and returns a BitSet
     * object with flipped "endianess".
     *
     * @return <strong>(FXY)</strong>-This method flips the "endianes" of a
     * BitSet object and returns a BitSet object with flipped "endianess".
     */
    private BitSet changeEndian(BitSet b) {
        boolean temp;
        int width = b.length() - 1;
        if (b.length() != b.size() - 1) {
            width = b.size();
        }
        for (int i = 0; i < width; i = i + 8) {
            for (int j = 0; j < 4; j++) {
                temp = b.get(i + j);
                b.set(i + j, b.get(i - j + 7));
                b.set(i - j + 7, temp);
            }//end for
        }//end for
        return b;
    }

    /**
     * This method extracts the bits from the integer passed and stores it in a
     * BitSet object.
     *
     * @param b BitSet Object
     * @param intValue int to store
     * @param range an int[] that holds the start position and end position
     * where to insert the extracted bits.
     */
    private void integerToBits(BitSet b, int intValue, int[] range) {
        if (range[0] == -1) {
            return;
        }
        int endPos;
        int startPos;
        startPos = range[0];
        endPos = range[1];
        int bitLength = endPos - startPos + 1;
        BitSet tempBS = new BitSet();
        int bitZero;

        for (int i = 0; i < bitLength; i++) {
            bitZero = intValue & 0x01;
            intValue = intValue >> 1;
            if (bitZero == 1) {
                tempBS.set((bitLength - 1) - i, true);
            } else {
                tempBS.set((bitLength - 1) - i, false);
            }
        }
        setBitWithinBits(b, tempBS, startPos);
    }

    /**
     * This method extracts the bits from the string passed and stores it in a
     * BitSet object.
     *
     * @param b BitSet Object
     * @param stringValue String to store
     * @param range an int[] that holds the start position and end position
     * where to insert the extracted bits.
     */
    private void stringToBits(BitSet b, String stringValue, int[] range) {
        if (range[0] == -1) {
            return;
        }

        byte[] metaData = stringValue.getBytes();
        int startPos = range[0];
        BitSet bs = BitSet.valueOf(metaData);
        bs = changeEndian(bs);
        setBitWithinBits(b, bs, startPos);
    }

    /**
     * This method extracts the bits from the string passed and stores it in a
     * BitSet object.
     *
     * @param b BitSet Object
     * @param s String to store
     * @param range an int[] that holds the start position and end position
     * where to insert the extracted bits.
     * @param blocks The number of 40 bit blocks (5 characters) needed to encode
     * the string.
     */
    private void encodeCommentBlocks(BitSet b, String s, int[] range, int blocks) {
        BitSet tmpBitSet = new BitSet();
        tmpBitSet.set(0, 7, false);
        tmpBitSet.set(8, true);
        int sBytes = 2 * (8 * s.length()) % 40;
        int sBytes5 = s.length() % 5;
        if (sBytes == 0 && sBytes5 == 0) {
            setBitWithinBits(b, tmpBitSet, range[0] + 40 * blocks + sBytes - 8);
        }
        stringToBits(b, s, range);
    }

    /**
     * This method inserts the bytes from a BitSet object to another BitSet
     * object.
     *
     * @param b BitSet the bits will be stored.
     * @param subBits BitSet that holds the bits to be stored.
     * @param startPos The start position to begin storing the bits.
     */
    private void setBitWithinBits(BitSet b, BitSet subBits, int startPos) {
        for (int i = 0; i < subBits.length(); i++) {
            if (subBits.get(i)) {
                b.set(i + startPos, true);
            } else {
                b.set(i + startPos, false);
            }
        }
    }

    /**
     * This method calculates the CRC32 value or SEAS ID for the profile and
     * stores it in the profile.
     *
     * @param b the BitSet object that holds the profile.
     */
    private void setMessageCRC(BitSet b) {
        CRC32 generator = new CRC32();
        BitSet tmpBitSet;
        tmpBitSet = b.get(0, bits.size() + 1);
        integerToBits(tmpBitSet, 0xFFFFFFFF, XBTProfileDataRanges.getUniqueTag(newMessageType));
        generator.reset();
        changeEndian(tmpBitSet);
        generator.update(tmpBitSet.toByteArray());
        integerToBits(b, (int) (generator.getValue()), XBTProfileDataRanges.getUniqueTag(newMessageType));
    }

    /**
     * This method replaces the CRC32 value or SEAS ID for the profile and
     * stores it in the profile. This is to maintain what has been used as a
     * unique identifier for a profile in the past. This is not calculated and
     * should only be used for historical reasons. Note that by doing this, any
     * integrity check done on the profile will fail. Do this as the last step
     * before writing out the file.
     *
     * @param UniqueTag the integer representing a uniqure tag.
     */
    public void OverwriteAndSetMessageCRC(int UniqueTag) {

        BitSet tmpBitSet;
        tmpBitSet = bits.get(0, bits.size() + 1);
        changeEndian(tmpBitSet);
        integerToBits(bits, UniqueTag, XBTProfileDataRanges.getUniqueTag(newMessageType));
    }
}
