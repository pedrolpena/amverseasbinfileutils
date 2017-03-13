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
import java.util.ArrayList;
import java.util.List;

public class XBTProfile {

    private String wmoId = "";
    private int oldMessageType = 0;
    private int newMessageType = 0;
    private double latitude = 0;
    private double longitude = 0;
    private String soopLine = "";
    private int transectNum = 0;
    private int sequenceNum = 0;
    private int year = 0;
    private int month = 0;
    private int day = 0;
    private int hour = 0;
    private int minute = 0;
    private String shipName = "";
    private int lloyds = 0;
    private int uniqueTag = 0; // is a positive 32 bit integer;
    private int seasVersion = 0;
    private int probeSerialNumber = 0;
    private int thisDataIs = 0;
    private int dataQuality = 3;
    private double launchHeight = 0;
    private double shipDirection = 0;
    private double shipSpeed = 0;
    private int instrumentType = 99;
    private int recorderType = 99;
    private int windInstrumentType = 0;
    private double windDirection = 0;
    private double windSpeed = 0;
    private double dryBulbTemperature = 0;
    private int seaSurfaceCurrentMeasuringMethod = 0;
    private int seaSurfaceCurrentDirection = 0;
    private double seaSurfaceCurrentSpeed = 0;
    private int totalWaterDepth = 0;
    private int agencyOwner = 0;
    private int xbtLauncherType = 0;
    private String xbtRecorderSerialNumber = "";
    private int xbtRecorderManufactureYear = 0;
    private int xbtRecorderManufactureMonth = 0;
    private int xbtRecorderManufactureDay = 0;
    private int xbtProbeManufactureYear = 0;
    private int xbtProbeManufactureMonth = 0;
    private int xbtProbeManufactureDay = 0;
    private int numberOfRiderBlocks = 0;
    private int numberOfRiderInstitutionBlocks = 0;
    private int numberOfRiderEmailBlocks = 0;
    private int numberOfRiderPhoneBlocks = 0;
    private int numberOfRepeatedFields = 0;
    private int timesReplicated = 0;
    private double seaSurfaceTemperature = 0;
    private double seaDepth = 0;
    private double[] temperaturePoints;
    private String[] riderNames = {};
    private String[] riderEmails = {};
    private String[] riderInstitutions = {};
    private String[] riderPhones = {};

    public XBTProfile() {
    }

    public String getWMOId() {
        return wmoId;
    }
    
    public String getCallsign(){
    return getWMOId();
    }//end method

    public int getOldMessageType() {
        return oldMessageType;
    }

    public int getNewMessageType() {
        return newMessageType;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getSoopLine() {
        return soopLine;
    }

    public int getTransectNumber() {
        return transectNum;
    }

    public int getSequenceNumber() {
        return sequenceNum;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getShipName() {
        return shipName;
    }

    public int getLloyds() {
        return lloyds;
    }

    public int getUniqueTag() {
        return uniqueTag;
    }

    public int getSeasVersion() {
        return seasVersion;
    }

    public int getProbeSerialNumber() {
        return probeSerialNumber;
    }

    public int getThisDataIs() {
        return thisDataIs;
    }

    public int getDataQuality() {
        return dataQuality;
    }

    public double getLaunchHeight() {
        return launchHeight;
    }

    public double getShipDirection() {
        return shipDirection;
    }

    public double getShipSpeed() {
        return shipSpeed;
    }

    public int getInstrumentType() {
        return instrumentType;
    }

    public int getRecorderType() {
        return recorderType;
    }

    public int getWindInstrumentType() {
        return windInstrumentType;
    }

    public double getWindDirection() {
        return windDirection;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getDryBulbTemperature() {
        return dryBulbTemperature;
    }

    public int getSeaSurfaceCurrentMeasurementMethod() {
        return seaSurfaceCurrentMeasuringMethod;
    }

    public int getSeaSurfaceCurrentDirection() {
        return seaSurfaceCurrentDirection;
    }

    public double getSeaSurfaceCurrentSpeed() {
        return seaSurfaceCurrentSpeed;
    }

    public int getTotalWaterDepth() {
        return totalWaterDepth;
    }

    public int getAgencyOwner() {
        return agencyOwner;
    }

    public int getXBTLauncherType() {
        return xbtLauncherType;
    }

    public String getXBTRecorderSerialNumber() {
        return xbtRecorderSerialNumber;
    }

    public int getXBTRecorderManufacturedYear() {
        return xbtRecorderManufactureYear;
    }

    public int getXBTRecorderManufacturedMonth() {
        return xbtRecorderManufactureMonth;
    }

    public int getXBTRecorderManufacturedDay() {
        return xbtRecorderManufactureDay;
    }

    public int getXBTProbeManufacturedYear() {
        return xbtProbeManufactureYear;
    }

    public int getXBTProbeManufacturedMonth() {
        return xbtProbeManufactureMonth;
    }

    public int getXBTProbeManufacturedDay() {
        return xbtProbeManufactureDay;
    }

    public int getNumberOfRiderBlocks() {
        return numberOfRiderBlocks;
    }

    public int getNumberOfRiderInstitutionBlocks() {
        return numberOfRiderInstitutionBlocks;
    }

    public int getNumberOfRiderEmailBlocks() {
        return numberOfRiderEmailBlocks;
    }

    public int getNumberOfRiderPhoneBlocks() {
        return numberOfRiderPhoneBlocks;
    }

    public int getNumberOfRepeatedFields() {
        return numberOfRepeatedFields;
    }

    public int getTimesReplicated() {
        return timesReplicated;
    }

    public double getSeaSurfaceTemperature() {
        return seaSurfaceTemperature;
    }

    public double getSeaDepth() {
        return seaDepth;
    }

    public double[] getTemperaturePoints() {
        return temperaturePoints;
    }

    public String[] getRiderNames() {
        return riderNames;
    }
    
    public String getRiderName() {
        String name="";
        for (int i =0; i < riderNames.length; i++){
        name+=riderNames[i];
        }//end for
                
        return name;
    }    

    public String[] getRiderEmails() {
        return riderEmails;
    }

    public String[] getRiderInstitutions() {
        return riderInstitutions;
    }

    public String[] getRiderPhones() {
        return riderPhones;
    }

    public void setCallsign(String wmoId) {
        this.wmoId = wmoId;
    }    
    
    public void setWMOId(String wmoId) {
        this.wmoId = wmoId;
    }

    public void setOldMessageType(int oldMessageType) {
        this.oldMessageType = oldMessageType;
    }

    public void setNewMessageType(int newMessageType) {
        this.newMessageType = newMessageType;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setSoopLine(String soopLine) {
        this.soopLine = soopLine;
    }

    public void setTransectNum(int transectNum) {
        this.transectNum = transectNum;
    }

    public void setSequenceNum(int sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public void setLloyds(int lloyds) {
        this.lloyds = lloyds;
    }

    public void setUniqueTag(int uniqueTag) {
        this.uniqueTag = uniqueTag;
    }

    public void setSeasVersion(int seasVersion) {
        this.seasVersion = seasVersion;
    }

    public void setProbeSerialNumber(int probeSerialNumber) {
        this.probeSerialNumber = probeSerialNumber;
    }

    public void setThisDataIs(int thisDataIs) {
        this.thisDataIs = thisDataIs;
    }

    public void setDataQuality(int dataQuality) {
        this.dataQuality = dataQuality;
    }

    public void setLaunchHeight(double launchHeight) {
        this.launchHeight = launchHeight;
    }

    public void setShipDirection(double shipDirection) {
        this.shipDirection = shipDirection;
    }

    public void setShipSpeed(double shipSpeed) {
        this.shipSpeed = shipSpeed;
    }

    public void setInstrumentType(int instrumentType) {
        this.instrumentType = instrumentType;
    }

    public void setRecorderType(int recorderType) {
        this.recorderType = recorderType;
    }

    public void setWindInstrumentType(int windInstrumentType) {
        this.windInstrumentType = windInstrumentType;
    }

    public void setWindDirection(double windDirection) {
        this.windDirection = windDirection;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setDryBulbTemperature(double dryBulbTemperature) {
        this.dryBulbTemperature = dryBulbTemperature;
    }

    public void setSeaSurfaceCurrentMeasurementMethod(
            int seaSurfaceCurrentMeasuringMethod) {
        this.seaSurfaceCurrentMeasuringMethod
                = seaSurfaceCurrentMeasuringMethod;
    }

    public void setSeaSurfaceCurrentDirection(
            int seaSurfaceCurrentDirection) {
        this.seaSurfaceCurrentDirection = seaSurfaceCurrentDirection;
    }

    public void setSeaSurfaceCurrentSpeed(double seaSurfaceCurrentSpeed) {
        this.seaSurfaceCurrentSpeed = seaSurfaceCurrentSpeed;
    }

    public void setTotalWaterDepth(int totalWaterDepth) {
        this.totalWaterDepth = totalWaterDepth;
    }

    public void setAgencyOwner(int agencyOwner) {
        this.agencyOwner = agencyOwner;
    }

    public void setXBTLauncherType(int xbtLauncherType) {
        this.xbtLauncherType = xbtLauncherType;
    }

    public void setXBTRecorderSerialNumber(String xbtRecorderSerialNumber) {
        this.xbtRecorderSerialNumber = xbtRecorderSerialNumber;
    }

    public void setXBTRecorderManufacturedYear(
            int xbtRecorderManufactureYear) {
        this.xbtRecorderManufactureYear = xbtRecorderManufactureYear;
    }

    public void setXBTRecorderManufacturedMonth(
            int xbtRecorderManufactureMonth) {
        this.xbtRecorderManufactureMonth = xbtRecorderManufactureMonth;
    }

    public void setXBTRecorderManufacturedDay(
            int xbtRecorderManufactureDay) {
        this.xbtRecorderManufactureDay = xbtRecorderManufactureDay;
    }

    public void setXBTProbeManufacturedYear(
            int xbtProbeManufactureYear) {
        this.xbtProbeManufactureYear = xbtProbeManufactureYear;
    }

    public void setXBTProbeManufacturedMonth(
            int xbtProbeManufactureMonth) {
        this.xbtProbeManufactureMonth = xbtProbeManufactureMonth;
    }

    public void setXBTProbeManufacturedDay(
            int xbtProbeManufactureDay) {
        this.xbtProbeManufactureDay = xbtProbeManufactureDay;
    }

    public void setNumberOfRiderBlocks(
            int numberOfRiderBlocks) {
        this.numberOfRiderBlocks = numberOfRiderBlocks;
    }

    public void setNumberOfRiderInstitutionBlocks(
            int numberOfRiderInstitutionBlocks) {
        this.numberOfRiderInstitutionBlocks = numberOfRiderInstitutionBlocks;
    }

    public void setNumberOfRiderEmailBlocks(int numberOfRiderEmailBlocks) {
        this.numberOfRiderEmailBlocks = numberOfRiderEmailBlocks;
    }

    public void setNumberOfRiderPhoneBlocks(int numberOfRiderPhoneBlocks) {
        this.numberOfRiderPhoneBlocks = numberOfRiderPhoneBlocks;
    }

    public void setNumberOfRepeatedFields(int numberOfRepeatedFields) {
        this.numberOfRepeatedFields = numberOfRepeatedFields;
    }

    public void setTimesReplicated(int timesReplicated) {
        this.timesReplicated = timesReplicated;
    }

    public void setSeaSurfaceTemperature(double seaSurfaceTemperature) {
        this.seaSurfaceTemperature = seaSurfaceTemperature;
    }

    public void setSeaDepth(double seaDepth) {
        this.seaDepth = seaDepth;
    }

    public void setTemperaturePoints(double[] temperaturePoints) {
        this.temperaturePoints = temperaturePoints;
        this.setTimesReplicated(temperaturePoints.length);
    }

    public void setRiderNames(String[] riderNames) {
        this.riderNames = riderNames;
        setNumberOfRiderBlocks(this.riderNames.length);
    }

    public void setRiderNames(String riderName) {
        riderNames = splitRiderBlockStrings(riderName);
        setNumberOfRiderBlocks(this.riderNames.length);
    }

    public void setRiderEmails(String[] riderEmails) {
        this.riderEmails = riderEmails;
        setNumberOfRiderEmailBlocks(this.riderEmails.length);
    }

    public void setRiderEmails(String riderEmail) {
        riderEmails = splitRiderBlockStrings(riderEmail);
        setNumberOfRiderEmailBlocks(this.riderEmails.length);
    }

    public void setRiderInstitutions(String[] riderInstitutions) {
        this.riderInstitutions = riderInstitutions;
        setNumberOfRiderInstitutionBlocks(this.riderInstitutions.length);
    }

    public void setRiderInstitutions(String riderInstitution) {
        riderInstitutions = splitRiderBlockStrings(riderInstitution);
        setNumberOfRiderInstitutionBlocks(this.riderInstitutions.length);
    }

    public void setRiderPhones(String[] riderPhones) {
        this.riderPhones = riderPhones;
        setNumberOfRiderPhoneBlocks(this.riderPhones.length);
    }

    public void setRiderPhones(String riderPhone) {
        riderPhones = splitRiderBlockStrings(riderPhone);
        setNumberOfRiderPhoneBlocks(this.riderPhones.length);
    }

    private String[] splitRiderBlockStrings(String riderDataString) {
        if ( riderDataString==null ){
             return new String[0];
        }//end if
        String[] tempArray = new String[(riderDataString.length() + 5 - 1) / 5];
        int j = -1;
        for (int i = 0; i < riderDataString.length(); i++) {
            if (i % 5 == 0) {
                j++;
            }
            if (tempArray[j] == null) {
                tempArray[j] = "";
            }
            tempArray[j] = tempArray[j] + riderDataString.charAt(i);
        }
        return tempArray;
    }
}
