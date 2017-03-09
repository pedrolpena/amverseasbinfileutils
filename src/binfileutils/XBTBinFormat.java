/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binfileutils;

/**
 *
 * @author pena
 */
public class XBTBinFormat {

    XBTBinFormat() {
    }

    public int startWmoId() {
        return 0;
    }

    public int endWmoId() {
        return 71;
    }

    public int startOldMessageType() {
        return 72;
    }

    public int endOldMessageType() {
        return 77;
    }

    public int startNewMessageType() {
        return 78;
    }

    public int endNewMessageType() {
        return 87;
    }

    public int startLatitude() {
        return 88;
    }

    public int endLatitude() {
        return 112;
    }

    public int startLongitude() {
        return 113;
    }

    public int endLongitude() {
        return 138;
    }

    public int startSoopLine(int newMessageType) {
        int[] start = {-1, -1, 139, 139};
        return start[newMessageType];
    }

    public int endSoopLine(int newMessageType) {
        int[] end = {-1, -1, 186, 186};
        return end[newMessageType];
    }

    public int startTransectNumber(int newMessageType) {
        int[] start = {-1, -1, 187, 187};
        return start[newMessageType];
    }

    public int endTransectNumber(int newMessageType) {
        int[] end = {-1, -1, 193, 193};
        return end[newMessageType];
    }

    public int startSequenceNumber(int newMessageType) {
        int[] start = {-1, -1, 194, 194};
        return start[newMessageType];
    }

    public int endSequenceNumber(int newMessageType) {
        int[] end = {-1, -1, 209, 209};
        return end[newMessageType];
    }

    public int startYear(int newMessageType) {
        int[] start = {-1, 139, 210, 210};
        return start[newMessageType];
    }

    public int endYear(int newMessageType) {
        int[] end = {-1, 150, 221, 221};
        return end[newMessageType];
    }

    public int startMonth(int newMessageType) {
        int[] start = {-1, 151, 222, 222};
        return start[newMessageType];
    }

    public int endMonth(int newMessageType) {
        int[] end = {-1, 154, 225, 225};
        return end[newMessageType];
    }

    public int startDay(int newMessageType) {
        int[] start = {-1, 155, 226, 226};
        return start[newMessageType];
    }

    public int endDay(int newMessageType) {
        int[] end = {-1, 160, 231, 231};
        return end[newMessageType];
    }

    public int startHour(int newMessageType) {
        int[] start = {-1, 161, 232, 232};
        return start[newMessageType];
    }

    public int endHour(int newMessageType) {
        int[] end = {-1, 165, 236, 236};
        return end[newMessageType];
    }

    public int startMinute(int newMessageType) {
        int[] start = {-1, 166, 237, 237};
        return start[newMessageType];
    }

    public int endMinute(int newMessageType) {
        int[] end = {-1, 171, 242, 242};
        return end[newMessageType];
    }

    public int startShipName(int newMessageType) {
        int[] start = {-1, 172, 243, 243};
        return start[newMessageType];
    }

    public int endShipName(int newMessageType) {
        int[] end = {-1, 411, 482, 482};
        return end[newMessageType];
    }

    public int startLloyds(int newMessageType) {
        int[] start = {-1, 412, 483, 483};
        return start[newMessageType];
    }

    public int endLloyds(int newMessageType) {
        int[] end = {-1, 435, 506, 506};
        return end[newMessageType];
    }

    public int startUniqueTag(int newMessageType) {
        int[] start = {-1, 436, 507, 507};
        return start[newMessageType];
    }

    public int endUniqueTag(int newMessageType) {
        int[] end = {-1, 467, 538, 538};
        return end[newMessageType];
    }

    public int startSeasVersion(int newMessageType) {
        int[] start = {-1, 468, 539, 539};
        return start[newMessageType];
    }

    public int endSeasVersion(int newMessageType) {
        int[] end = {-1, 477, 548, 548};
        return end[newMessageType];
    }

    public int startProbeSerialNumber(int newMessageType) {
        int[] start = {-1, 478, 549, 549};
        return start[newMessageType];
    }

    public int endProbeSerialNumber(int newMessageType) {
        int[] end = {-1, 497, 572, 572};
        return end[newMessageType];
    }

    public int startThisDataIs(int newMessageType) {
        int[] start = {-1, 498, 573, 573};
        return start[newMessageType];
    }

    public int endThisDataIs(int newMessageType) {
        int[] end = {-1, 500, 575, 575};
        return end[newMessageType];
    }

    public int startDataQuality(int newMessageType) {
        int[] start = {-1, 501, 576, 576};
        return start[newMessageType];
    }

    public int endDataQuality(int newMessageType) {
        int[] end = {-1, 503, 578, 578};
        return end[newMessageType];
    }

    public int startLauncherHeight(int newMessageType) {
        int[] start = {-1, -1, 579, 579};
        return start[newMessageType];
    }

    public int endLauncherHeight(int newMessageType) {
        int[] end = {-1, -1, 591, 591};
        return end[newMessageType];
    }

    public int startShipDirection(int newMessageType) {
        int[] start = {-1, -1, 592, 592};
        return start[newMessageType];
    }

    public int endShipDirection(int newMessageType) {
        int[] end = {-1, -1, 600, 600};
        return end[newMessageType];
    }

    public int startShipSpeed(int newMessageType) {
        int[] start = {-1, -1, 601, 601};
        return start[newMessageType];
    }

    public int endShipSpeed(int newMessageType) {
        int[] end = {-1, -1, 613, 613};
        return end[newMessageType];
    }

    public int startInstrumentType(int newMessageType) {
        int[] start = {-1, 504, 614, 614};
        return start[newMessageType];
    }

    public int endInstrumentType(int newMessageType) {
        int[] end = {-1, 513, 623, 623};
        return end[newMessageType];
    }

    public int startRecorderType(int newMessageType) {
        int[] start = {-1, 514, 624, 624};
        return start[newMessageType];
    }

    public int endRecorderType(int newMessageType) {
        int[] end = {-1, 520, 630, 630};
        return end[newMessageType];
    }

    public int startWindInstrumentType(int newMessageType) {
        int[] start = {-1, 521, 631, 631};
        return start[newMessageType];
    }

    public int endWindInstrumentType(int newMessageType) {
        int[] end = {-1, 524, 634, 634};
        return end[newMessageType];
    }

    public int startWindDiretion(int newMessageType) {
        int[] start = {-1, 525, 635, 635};
        return start[newMessageType];
    }

    public int endWindDiretion(int newMessageType) {
        int[] end = {-1, 533, 643, 643};
        return end[newMessageType];
    }

    public int startWindSpeed(int newMessageType) {
        int[] start = {-1, 534, 644, 644};
        return start[newMessageType];
    }

    public int endWindSpeed(int newMessageType) {
        int[] end = {-1, 545, 655, 655};
        return end[newMessageType];
    }

    public int startDryBulbTemp(int newMessageType) {
        int[] start = {-1, 546, 656, 656};
        return start[newMessageType];
    }

    public int endDryBulbTemp(int newMessageType) {
        int[] end = {-1, 557, 667, 667};
        return end[newMessageType];
    }

    public int startCurrentMeasurementMethod(int newMessageType) {
        int[] start = {-1, 558, 668, 668};
        return start[newMessageType];
    }

    public int endCurrentMeasurementMethod(int newMessageType) {
        int[] end = {-1, 560, 670, 670};
        return end[newMessageType];
    }

    public int startCurrentDirection(int newMessageType) {
        int[] start = {-1, 561, 671, 671};
        return start[newMessageType];
    }

    public int endCurrentDirection(int newMessageType) {
        int[] end = {-1, 569, 679, 679};
        return end[newMessageType];
    }

    public int startCurrentSpeed(int newMessageType) {
        int[] start = {-1, 570, 680, 680};
        return start[newMessageType];
    }

    public int endCurrentSpeed(int newMessageType) {
        int[] end = {-1, 582, 692, 692};
        return end[newMessageType];
    }

    public int startTotalWaterDepth(int newMessageType) {
        int[] start = {-1, 583, 693, 693};
        return start[newMessageType];
    }

    public int endTotalWaterDepth(int newMessageType) {
        int[] end = {-1, 596, 706, 706};
        return end[newMessageType];
    }

    public int startAgencyOwner(int newMessageType) {
        int[] start = {-1, -1, -1, 707};
        return start[newMessageType];
    }

    public int endAgencyOwner(int newMessageType) {
        int[] end = {-1, -1, -1, 726};
        return end[newMessageType];
    }

    public int startXBTLauncherType(int newMessageType) {
        int[] start = {-1, -1, -1, 727};
        return start[newMessageType];
    }

    public int endXBTLauncherType(int newMessageType) {
        int[] end = {-1, -1, -1, 734};
        return end[newMessageType];
    }

    public int startXBTRecorderSerialNumber(int newMessageType) {
        int[] start = {-1, -1, -1, 735};
        return start[newMessageType];
    }

    public int endXBTRecorderSerialNumber(int newMessageType) {
        int[] end = {-1, -1, -1, 798};
        return end[newMessageType];
    }

    public int startXBTRecorderManufacturedYear(int newMessageType) {
        int[] start = {-1, -1, -1, 799};
        return start[newMessageType];
    }

    public int endXBTRecorderManufacturedYear(int newMessageType) {
        int[] end = {-1, -1, -1, 810};
        return end[newMessageType];
    }

    public int startXBTRecorderManufacturedMonth(int newMessageType) {
        int[] start = {-1, -1, -1, 811};
        return start[newMessageType];
    }

    public int endXBTRecorderManufacturedMonth(int newMessageType) {
        int[] end = {-1, -1, -1, 814};
        return end[newMessageType];
    }

    public int startXBTRecorderManufacturedDay(int newMessageType) {
        int[] start = {-1, -1, -1, 815};
        return start[newMessageType];
    }

    public int endXBTRecorderManufacturedDay(int newMessageType) {
        int[] end = {-1, -1, -1, 820};
        return end[newMessageType];
    }

    public int startXBTProbeManufacturedYear(int newMessageType) {
        int[] start = {-1, -1, -1, 821};
        return start[newMessageType];
    }

    public int endXBTProbeManufacturedYear(int newMessageType) {
        int[] end = {-1, -1, -1, 832};
        return end[newMessageType];
    }

    public int startXBTProbeManufacturedMonth(int newMessageType) {
        int[] start = {-1, -1, -1, 833};
        return start[newMessageType];
    }

    public int endXBTProbeManufacturedMonth(int newMessageType) {
        int[] end = {-1, -1, -1, 836};
        return end[newMessageType];
    }

    public int startXBTProbeManufacturedDay(int newMessageType) {
        int[] start = {-1, -1, -1, 837};
        return start[newMessageType];
    }

    public int endXBTProbeManufacturedDay(int newMessageType) {
        int[] end = {-1, -1, -1, 842};
        return end[newMessageType];
    }

    public int startNumberOfRiderBlocks(int newMessageType) {
        int[] start = {-1, -1, -1, 843};
        return start[newMessageType];
    }

    public int endNumberOfRiderBlocks(int newMessageType) {
        int[] end = {-1, -1, -1, 848};
        return end[newMessageType];
    }

    public int startNumberOfRiderInstBlocks(int newMessageType) {
        int[] start = {-1, -1, -1, 849};
        return start[newMessageType];
    }

    public int endNumberOfRiderInstBlocks(int newMessageType) {
        int[] end = {-1, -1, -1, 854};
        return end[newMessageType];
    }

    public int startNumberOfRiderEmailBlocks(int newMessageType) {
        int[] start = {-1, -1, -1, 855};
        return start[newMessageType];
    }

    public int endNumberOfRiderEmailBlocks(int newMessageType) {
        int[] end = {-1, -1, -1, 860};
        return end[newMessageType];
    }

    public int startNumberOfRiderPhoneBlocks(int newMessageType) {
        int[] start = {-1, -1, -1, 861};
        return start[newMessageType];
    }

    public int endNumberOfRiderPhoneBlocks(int newMessageType) {
        int[] end = {-1, -1, -1, 866};
        return end[newMessageType];
    }

    public int startNumberOfRepFields(int newMessageType) {
        int[] start = {-1, 597, 707, 867};
        return start[newMessageType];
    }

    public int endNumberOfRepFields(int newMessageType) {
        int[] end = {-1, 604, 714, 874};
        return end[newMessageType];
    }

    public int startTimesReplicated(int newMessageType) {
        int[] start = {-1, 605, 715, 875};
        return start[newMessageType];
    }

    public int endTimesReplicated(int newMessageType) {
        int[] end = {-1, 620, 730, 890};
        return end[newMessageType];
    }

    public int startSeaTemperature(int newMessageType) {
        int[] start = {-1, 621, 731, 891};
        return start[newMessageType];
    }

    public int endSeaTemperature(int newMessageType) {
        int[] end = {-1, 632, 742, 902};
        return end[newMessageType];
    }

    public int startSeaDepth(int newMessageType) {
        int[] start = {-1, 633, -1, -1};
        return start[newMessageType];
    }

    public int endSeaDepth(int newMessageType) {
        int[] end = {-1, 646, -1, -1};
        return end[newMessageType];
    }

    public int startTemperaturePoints(int newMessageType,
            int timesReplicatedCurrentIndex) {
        int[] start = {-1, 621, 731, 891};
        return start[newMessageType] + (timesReplicatedCurrentIndex * 12);
    }

    public int endTemperaturePoints(int newMessageType,
            int timesReplicatedCurrentIndex) {
        int[] end = {-1, 621, 731, 891};
        return (end[newMessageType] + (timesReplicatedCurrentIndex * 12)) + 11;
    }

    public int startRiderName(int newMessageType, int timesReplicated) {
        int[] start = {-1, -1, -1, 891};
        if (start[newMessageType] == -1) {
            return -1;
        }
        return start[newMessageType] + (12 * timesReplicated);
    }

    public int endRiderName(int newMessageType, int timesReplicated,
            int currentRiderBlocks) {
        int[] end = {-1, -1, -1, 891};
        if (end[newMessageType] == -1) {
            return -1;
        }
        return (end[newMessageType] + (12 * timesReplicated))
                + (currentRiderBlocks * 40);
    }

    public int startRiderEmail(int newMessageType, int timesReplicated,
            int numberOfRiderBlocks) {
        int[] start = {-1, -1, -1, 891};
        if (start[newMessageType] == -1) {
            return -1;
        }
        return (start[newMessageType] + (12 * timesReplicated))
                + (numberOfRiderBlocks * 40);
    }

    public int endRiderEmail(int newMessageType, int timesReplicated,
            int numberOfRiderBlocks, int currentRiderEmailBlocks) {
        int[] end = {-1, -1, -1, 891};
        if (end[newMessageType] == -1) {
            return -1;
        }
        return (end[newMessageType] + (12 * timesReplicated))
                + (numberOfRiderBlocks * 40)
                + (currentRiderEmailBlocks * 40);
    }

    public int startInstituion(int newMessageType, int timesReplicated,
            int numberOfRiderBlocks, int numberOfRiderEmailBlocks) {
        int[] start = {-1, -1, -1, 891};
        if (start[newMessageType] == -1) {
            return -1;
        }
        return (start[newMessageType] + (12 * timesReplicated))
                + (numberOfRiderBlocks * 40)
                + (numberOfRiderEmailBlocks * 40);
    }

    public int endInstituion(int newMessageType, int timesReplicated,
            int numberOfRiderBlocks, int numberOfRiderEmailBlocks,
            int currentRiderInstituionBlocks) {
        int[] end = {-1, -1, -1, 891};
        if (end[newMessageType] == -1) {
            return -1;
        }
        return (end[newMessageType] + (12 * timesReplicated))
                + (numberOfRiderBlocks * 40)
                + (numberOfRiderEmailBlocks * 40)
                + (currentRiderInstituionBlocks * 40);
    }

    public int startRiderPhone(int newMessageType, int timesReplicated,
            int numberOfRiderBlocks, int numberOfRiderEmailBlocks,
            int numberOfRiderInstituionBlocks) {
        int[] start = {-1, -1, -1, 891};
        if (start[newMessageType] == -1) {
            return -1;
        }
        return (start[newMessageType] + (12 * timesReplicated))
                + (numberOfRiderBlocks * 40)
                + (numberOfRiderEmailBlocks * 40)
                + (numberOfRiderInstituionBlocks * 40);
    }

    public int endRiderPhone(int newMessageType, int timesReplicated,
            int numberOfRiderBlocks, int numberOfRiderEmailBlocks,
            int numberOfRiderInstituionBlocks, int currentRiderPhoneBlocks) {
        int[] end = {-1, -1, -1, 891};
        if (end[newMessageType] == -1) {
            return -1;
        }
        return (end[newMessageType] + (12 * timesReplicated))
                + (numberOfRiderBlocks * 40)
                + (numberOfRiderEmailBlocks * 40)
                + (numberOfRiderInstituionBlocks * 40)
                + (currentRiderPhoneBlocks * 40);
    }
}
