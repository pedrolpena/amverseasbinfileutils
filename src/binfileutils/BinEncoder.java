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

    private XBTBinFormat xformat = new XBTBinFormat();
    private BitSet bits = new BitSet();
    private int newMessageType = 0;
    XBTProfile xp;

    public BinEncoder() {
    }

    public BinEncoder(XBTProfile xp) {
        this.xp = xp;
        bitsInString(xp.getWmoId().getBytes(), xformat.startWmoId());
        bitsInInteger(xp.getOldMessageType(), xformat.startOldMessageType(),
                xformat.endOldMessageType());
        bitsInInteger(xp.getNewMessageType(), xformat.startNewMessageType(),
                xformat.endNewMessageType());
        newMessageType = xp.getNewMessageType();

        double latitude = xp.getLatitude() * 100000.0 + 9000000;
        bitsInInteger(Double.valueOf(latitude).intValue(),
                xformat.startLatitude(), xformat.endLatitude());
        double longitude = xp.getLongitude() * 100000.0 + 18000000;
        bitsInInteger(Double.valueOf(longitude).intValue(),
                xformat.startLongitude(), xformat.endLongitude());

        bitsInString(xp.getSoopLine().getBytes(),
                xformat.startSoopLine(newMessageType));
        bitsInInteger(xp.getTransectNum(),
                xformat.startTransectNumber(newMessageType),
                xformat.endTransectNumber(newMessageType));
        bitsInInteger(xp.getSequenceNum(),
                xformat.startSequenceNumber(newMessageType),
                xformat.endSequenceNumber(newMessageType));
        bitsInInteger(xp.getYear(), xformat.startYear(newMessageType),
                xformat.endYear(newMessageType));
        bitsInInteger(xp.getMonth(), xformat.startMonth(newMessageType),
                xformat.endMonth(newMessageType));
        bitsInInteger(xp.getDay(), xformat.startDay(newMessageType),
                xformat.endDay(newMessageType));
        bitsInInteger(xp.getHour(), xformat.startHour(newMessageType),
                xformat.endHour(newMessageType));
        bitsInInteger(xp.getMinute(), xformat.startMinute(newMessageType),
                xformat.endMinute(newMessageType));
        bitsInString(xp.getShipName().getBytes(),
                xformat.startShipName(newMessageType));
        bitsInInteger(xp.getLloyds(), xformat.startLloyds(newMessageType),
                xformat.endLloyds(newMessageType));
        bitsInInteger(xp.getUniqueTag(), xformat.startUniqueTag(newMessageType),
                xformat.endUniqueTag(newMessageType));
        bitsInInteger(xp.getSeasVersion(),
                xformat.startSeasVersion(newMessageType),
                xformat.endSeasVersion(newMessageType));
        bitsInInteger(xp.getProbeSerialNumber(),
                xformat.startProbeSerialNumber(newMessageType),
                xformat.endProbeSerialNumber(newMessageType));
        bitsInInteger(xp.getThisDataIs(),
                xformat.startThisDataIs(newMessageType),
                xformat.endThisDataIs(newMessageType));
        bitsInInteger(xp.getDataQuality(),
                xformat.startDataQuality(newMessageType),
                xformat.endDataQuality(newMessageType));

        double launchHeight = xp.getLaunchHeight() * 100.0;
        bitsInInteger(Double.valueOf(launchHeight).intValue(),
                xformat.startLauncherHeight(newMessageType),
                xformat.endLauncherHeight(newMessageType));
        double shipDirection = xp.getShipDirection();
        bitsInInteger(Double.valueOf(shipDirection).intValue(),
                xformat.startShipDirection(newMessageType),
                xformat.endShipDirection(newMessageType));
        double shipSpeed = xp.getShipSpeed() * 100.0;
        bitsInInteger(Double.valueOf(shipSpeed).intValue(),
                xformat.startShipSpeed(newMessageType),
                xformat.endShipSpeed(newMessageType));

        bitsInInteger(xp.getInstrumentType(),
                xformat.startInstrumentType(newMessageType),
                xformat.endInstrumentType(newMessageType));
        bitsInInteger(xp.getRecorderType(),
                xformat.startRecorderType(newMessageType),
                xformat.endRecorderType(newMessageType));
        bitsInInteger(xp.getWindInstrumentType(),
                xformat.startWindInstrumentType(newMessageType),
                xformat.endWindInstrumentType(newMessageType));

        double windDirection = xp.getWindDirection();
        bitsInInteger(Double.valueOf(windDirection).intValue(),
                xformat.startWindDiretion(newMessageType),
                xformat.endWindDiretion(newMessageType));
        double windSpeed = xp.getWindSpeed() * 10.0;
        bitsInInteger(Double.valueOf(windSpeed).intValue(),
                xformat.startWindSpeed(newMessageType),
                xformat.endWindSpeed(newMessageType));
        double dryBulbTemperature = xp.getDryBulbTemperature() * 10.0;
        bitsInInteger(Double.valueOf(dryBulbTemperature).intValue(),
                xformat.startDryBulbTemp(newMessageType),
                xformat.endDryBulbTemp(newMessageType));

        bitsInInteger(xp.getSeaSurfaceCurrentMeasuringMethod(),
                xformat.startCurrentMeasurementMethod(newMessageType),
                xformat.endCurrentMeasurementMethod(newMessageType));
        bitsInInteger(xp.getSeaSurfaceCurrentDirection(),
                xformat.startCurrentDirection(newMessageType),
                xformat.endCurrentDirection(newMessageType));

        double seaSurfaceCurrentSpeed = xp.getSeaSurfaceCurrentSpeed() * 100.00;
        bitsInInteger(Double.valueOf(seaSurfaceCurrentSpeed).intValue(),
                xformat.startCurrentSpeed(newMessageType),
                xformat.endCurrentSpeed(newMessageType));

        bitsInInteger(xp.getTotalWaterDepth(),
                xformat.startTotalWaterDepth(newMessageType),
                xformat.endTotalWaterDepth(newMessageType));
        bitsInInteger(xp.getAgencyOwner(),
                xformat.startAgencyOwner(newMessageType),
                xformat.endAgencyOwner(newMessageType));
        bitsInInteger(xp.getXbtLauncherType(),
                xformat.startXBTLauncherType(newMessageType),
                xformat.endXBTLauncherType(newMessageType));
        bitsInString(xp.getXbtRecorderSerialNumber().getBytes(),
                xformat.startXBTRecorderSerialNumber(newMessageType));
        bitsInInteger(xp.getXbtRecorderManufactureYear(),
                xformat.startXBTRecorderManufacturedYear(newMessageType),
                xformat.endXBTRecorderManufacturedYear(newMessageType));
        bitsInInteger(xp.getXbtRecorderManufactureMonth(),
                xformat.startXBTRecorderManufacturedMonth(newMessageType),
                xformat.endXBTRecorderManufacturedMonth(newMessageType));
        bitsInInteger(xp.getXbtRecorderManufactureDay(),
                xformat.startXBTRecorderManufacturedDay(newMessageType),
                xformat.endXBTRecorderManufacturedDay(newMessageType));
        bitsInInteger(xp.getXbtProbeManufactureYear(),
                xformat.startXBTProbeManufacturedYear(newMessageType),
                xformat.endXBTProbeManufacturedYear(newMessageType));
        bitsInInteger(xp.getXbtProbeManufactureMonth(),
                xformat.startXBTProbeManufacturedMonth(newMessageType),
                xformat.endXBTProbeManufacturedMonth(newMessageType));
        bitsInInteger(xp.getXbtProbeManufactureDay(),
                xformat.startXBTProbeManufacturedDay(newMessageType),
                xformat.endXBTProbeManufacturedDay(newMessageType));
        bitsInInteger(xp.getNumberOfRiderBlocks(),
                xformat.startNumberOfRiderBlocks(newMessageType),
                xformat.endNumberOfRiderBlocks(newMessageType));
        bitsInInteger(xp.getNumberOfRiderInstitutionBlocks(),
                xformat.startNumberOfRiderInstBlocks(newMessageType),
                xformat.endNumberOfRiderInstBlocks(newMessageType));
        bitsInInteger(xp.getNumberOfRiderEmailBlocks(),
                xformat.startNumberOfRiderEmailBlocks(newMessageType),
                xformat.endNumberOfRiderEmailBlocks(newMessageType));
        bitsInInteger(xp.getNumberOfRiderPhoneBlocks(),
                xformat.startNumberOfRiderPhoneBlocks(newMessageType),
                xformat.endNumberOfRiderPhoneBlocks(newMessageType));
        bitsInInteger(xp.getNumberOfRepeatedFields(),
                xformat.startNumberOfRepFields(newMessageType),
                xformat.endNumberOfRepFields(newMessageType));
        bitsInInteger(xp.getTimesReplicated(),
                xformat.startTimesReplicated(newMessageType),
                xformat.endTimesReplicated(newMessageType));

        double seaSurfaceTemperature = xp.getSeaSurfaceTemperature()
                * 100.00 + 400.00;
        bitsInInteger(Double.valueOf(seaSurfaceTemperature).intValue(),
                xformat.startSeaTemperature(newMessageType),
                xformat.endSeaTemperature(newMessageType));

        if (newMessageType == 1) {
            double seaDepth = xp.getSeaDepth();
            bitsInInteger(Double.valueOf(seaDepth).intValue(),
                    xformat.startSeaDepth(newMessageType),
                    xformat.endSeaDepth(newMessageType));
        }

        for (int i = 0; i < xp.getTemperaturePoints().length; i++) {
            // we had to round here because the doubles were being
            // truncated to the wrong value
            double tp = Math.round(xp.getTemperaturePoints()[i] * 100.00) + 400.00;
            bitsInInteger(Double.valueOf(tp).intValue(),
                    xformat.startTemperaturePoints(newMessageType, i),
                    xformat.endTemperaturePoints(newMessageType, i));
        }

        for (int i = 0; i < xp.getRiderNames().length; i++) {
            bitsInString(xp.getRiderNames()[i].getBytes(),
                    xformat.endRiderName(newMessageType,
                            xp.getTimesReplicated(), i));
        }

        for (int i = 0; i < xp.getRiderEmails().length; i++) {
            bitsInString(xp.getRiderEmails()[i].getBytes(),
                    xformat.endRiderEmail(newMessageType,
                            xp.getTimesReplicated(),
                            xp.getNumberOfRiderBlocks(), i));
        }

        for (int i = 0; i < xp.getRiderInstitutions().length; i++) {
            bitsInString(xp.getRiderInstitutions()[i].getBytes(),
                    xformat.endInstituion(newMessageType,
                            xp.getTimesReplicated(),
                            xp.getNumberOfRiderBlocks(),
                            xp.getNumberOfRiderEmailBlocks(), i));
        }

        for (int i = 0; i < xp.getRiderPhones().length; i++) {
            bitsInString(xp.getRiderPhones()[i].getBytes(),
                    xformat.endRiderPhone(newMessageType,
                            xp.getTimesReplicated(),
                            xp.getNumberOfRiderBlocks(),
                            xp.getNumberOfRiderEmailBlocks(),
                            xp.getNumberOfRiderPhoneBlocks(), i));
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

    private void bitsInInteger(int binMetaData, int startPos, int endPos) {
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

    private void bitsInLong(long binMetaData, int startPos, int endPos) {
        int bitLength = endPos - startPos + 1;
        BitSet tempBS = new BitSet();
        long bitZero = 0x00;

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

    private void bitsInString(byte[] metaData, int startPos) {
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
        
        bitsInInteger(0xFFFFFFFF, xformat.startUniqueTag(newMessageType),
                xformat.endUniqueTag(newMessageType));
        //System.out.println(Integer.toHexString(xp.getUniqueTag()).toUpperCase());
        generator.reset();
        
        changeEndian(bits);
        generator.update(bits.toByteArray());
        changeEndian(bits);
        bitsInInteger((int)(generator.getValue()), xformat.startUniqueTag(newMessageType),
                xformat.endUniqueTag(newMessageType));
    }
}
