package binfileutils;

/**
 *This class is used to hold the values for an XBT profile. 
 * The class is intended to be the common data sharing  method within
 * The library.
 * The BinDecoder will open and decode a file and return an XBTProfile
 * containing all of the data. The profile can then be modified and sent
 * to the BinEncoder.
 * @author others and Pero Pena
 */
public class XBTProfile {

    private String wmoId = "";
    private int oldMessageType = -999;
    private int newMessageType = -999;
    private double latitude = -999;
    private double longitude = -999;
    private String soopLine = "";
    private int transectNum = -999;
    private int sequenceNum = -999;
    private int year = -999;
    private int month = -999;
    private int day = -999;
    private int hour = -999;
    private int minute = -999;
    private String shipName = "";
    private int lloyds = -999;
    private int uniqueTag = -999;
    private int seasVersion = -999;
    private int probeSerialNumber = -999;
    private int thisDataIs = -999;
    private int dataQuality = -999;
    private double launchHeight = -999;
    private double shipDirection = -999;
    private double shipSpeed = -999;
    private int instrumentType = -999;
    private int recorderType = -999;
    private int windInstrumentType = -999;
    private double windDirection = -999;
    private double windSpeed = -999;
    private double dryBulbTemperature = -999;
    private int seaSurfaceCurrentMeasuringMethod = -999;
    private int seaSurfaceCurrentDirection = -999;
    private double seaSurfaceCurrentSpeed = -999;
    private int totalWaterDepth = -999;
    private int agencyOwner = -999;
    private int xbtLauncherType = -999;
    private String xbtRecorderSerialNumber = "";
    private int xbtRecorderManufactureYear = -999;
    private int xbtRecorderManufactureMonth = -999;
    private int xbtRecorderManufactureDay = -999;
    private int xbtProbeManufactureYear = -999;
    private int xbtProbeManufactureMonth = -999;
    private int xbtProbeManufactureDay = -999;
    private int numberOfRiderBlocks = -999;
    private int numberOfRiderInstitutionBlocks = -999;
    private int numberOfRiderEmailBlocks = -999;
    private int numberOfRiderPhoneBlocks = -999;
    private int numberOfRepeatedFields = -999;
    private int timesReplicated = -999;
    private double seaSurfaceTemperature = -999;
    private double seaSurfaceResistance = -999;
    private double seaSurfaceMeasurementPoint;
    private double seaDepth = -999;
    private double[] temperaturePoints;
    private double[] resistancePoints;
    private double[] measurementPoints;
    private String riderName = "";
    private String riderEmail = "";
    private String riderInstitution = "";
    private String riderPhone = "";

    public XBTProfile() {
        temperaturePoints = new double[0];
        resistancePoints = new double[0];
        measurementPoints = new double[0];
    }

    /**
     * <strong>(FXY1011)</strong>-This method returns the ship's WMO ID
     *
     * @return    <strong>(FXY1011)</strong>-This method returns a the ship's WMO
     * ID
     */
    public String getWMOId() {
        return wmoId;
    }

    /**
     * <strong>(FXY1011)</strong>-This method returns the ship's WMO ID
     *
     * @return    <strong>(FXY1011)</strong>-This method returns a the ship's WMO
     * ID
     */
    public String getCallsign() {
        return getWMOId();
    }//end method

    /**
     * <strong>(FXY48211)</strong>-This method returns the old message type.
     *
     * @return  <strong>(FXY48211)</strong>-This method returns the old message
     * type.
     */
    public int getOldMessageType() {
        return oldMessageType;
    }

    /**
     * <strong>(FXY48216)</strong>-This method returns the new message types
     * used in Amverseas
     *
     * @return  <strong>(FXY48216)</strong>-This method returns the new message
     * types used in Amverseas The types can be a value from 1-3.
     */
    public int getNewMessageType() {
        return newMessageType;
    }

    /**
     * <strong>(FXY5001)</strong>-This method returns the latitude where the
     * measurement was made.
     *
     * @return  <strong>(FXY5001)</strong>-This method returns the latitude where
     * the measurement was made. The value is returned in decimal degrees.
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * <strong>(FXY6001)</strong>-This method returns the longitude where the
     * measurement was made
     *
     * @return  <strong>(FXY6001)</strong>-This method returns the longitude
     * where the measurement was made. The value is returned in decimal degrees.
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * <strong>(FXY1080)</strong>-This method returns the name given to the
     * transect.
     *
     * @return  <strong>(FXY1080)</strong>-This method returns the name given to
     * the transect. e.g. AX10 This field became available beginning with
     * message type 2
     */
    public String getSoopLine() {
        return soopLine;
    }

    /**
     * <strong>(FXY5036)</strong>-This method returns the transect number for
     * the line.
     *
     * @return <strong>(FXY5036)</strong>-This method returns the transect
     * number for the line. This is the number assigned to a transect repeated
     * in the same calendar year. e.g. The second transect would have a value of
     * 2.
     */
    public int getTransectNumber() {
        return transectNum;
    }

    /**
     * <strong>(FXY48304)</strong>-
     *
     * @return <strong>(FXY48304)</strong>-This method returns
     */
    public int getSequenceNumber() {
        return sequenceNum;
    }

    /**
     * <strong>(FXY4001)</strong>-This method returns the year in which the
     * measurement was made.
     *
     * @return <strong>(FXY4001)</strong>-This method returns the year in which
     * the measurement was made. A value of -999 is returned when there is no
     * value.
     */
    public int getYear() {
        return year;
    }

    /**
     * <strong>(FXY4002)</strong>-This method returns the month in which the
     * measurement was made.
     *
     * @return <strong>(FXY4002)</strong>-This method returns the month in which
     * the measurement was made.
     */
    public int getMonth() {
        return month;
    }

    /**
     * <strong>(FXY4003)</strong>-This method returns the day in which the
     * measurement was made.
     *
     * @return <strong>(FXY4003)</strong>-This method returns the day in which
     * the measurement was made.
     */
    public int getDay() {
        return day;
    }

    /**
     * <strong>(FXY4004)</strong>-This method returns the GMT hour when the
     * measurement was made.
     *
     * @return <strong>(FXY4004)</strong>-This method returns the GMT hour when
     * the measurement was made.
     */
    public int getHour() {
        return hour;
    }

    /**
     * <strong>(FXY4005)</strong>-This method returns the GMT minute when the
     * measurement was made
     *
     * @return <strong>(FXY4005)</strong>-This method returns the GMT minute
     * when the measurement was made.
     */
    public int getMinute() {
        return minute;
    }

    /**
     * <strong>(FXY1200)</strong>-This method returns the name of the ship. If
     * there is no
     *
     * @return <strong>(FXY1200)</strong>-This method returns the name of the
     * ship.
     */
    public String getShipName() {
        return shipName;
    }

    /**
     * <strong>(FXY1201)</strong>-This method returns the ships International
     * Maritime Organization (IMO) number.
     *
     * @return <strong>(FXY1201)</strong>-This method returns the ships
     * International Maritime Organization (IMO) number.
     */
    public int getLloyds() {
        return lloyds;
    }

    /**
     * <strong>(FXY48302)</strong>-This method returns the CRC value for the bin
     * file.
     *
     * @return <strong>(FXY48302)</strong>-This method returns the CRC32 value
     * for the bin file. This value is computed by WRITE LOGIC HERE Once
     * computed, the value returned by this method must match. If there is not a
     * match, then the bin file is possibly corrupt.
     */
    public int getUniqueTag() {
        return uniqueTag;
    }

    /**
     * <strong>(FXY48201)</strong>-This method returns the version of Amverseas
     * used to make the measurement.
     *
     * @return <strong>(FXY48201)</strong>-This method returns the version of
     * Amverseas used to make the measurement. This value must later be massaged
     * to get the actual version. e.g. 920 must be dived by 100 to get Amverseas
     * version 9.20.
     */
    public int getSeasVersion() {
        return seasVersion;
    }

    /**
     * <strong>(FXY48300)</strong>-This method returns the serial number of the
     * XBT used to make the measurement.
     *
     * @return <strong>(FXY48300)</strong>-This method returns the serial number
     * of the XBT used to make the measurement.
     */
    public int getProbeSerialNumber() {
        return probeSerialNumber;
    }

    /**
     * <strong>(FXY48303)</strong>-This method returns the resolution of the
     * profile.
     *
     * @return <strong>(FXY48303)</strong>-This method returns the resolution of
     * the profile. A value of 1 is full resolution a value of 2 is 1 meter
     * resolution and a value of 3 is two meter resolution.
     */
    public int getThisDataIs() {
        return thisDataIs;
    }

    /**
     * <strong>(FXY33003)</strong>-This method returns the quality of the data
     * as entered by the user.
     *
     * @return <strong>(FXY33003)</strong>-This method returns the quality of
     * the data as entered by the user. If the user suspects the data is of a
     * quality other than good, the user can add it to the profile after the
     * measurement has been made.
     */
    public int getDataQuality() {
        return dataQuality;
    }

    /**
     * <strong>(FXY48305)</strong>-This method returns the approximate height of
     * the autolauncher from the surface of the water.
     *
     * @return <strong>(FXY48305)</strong>-This method returns the approximate
     * height of the autolauncher from the surface of the water.
     */
    public double getLaunchHeight() {
        return launchHeight;
    }

    /**
     * <strong>(FXY1012)</strong>-This method returns the direction in degrees
     * that the ship was heading when the measurement was made.
     *
     * @return <strong>(FXY1012)</strong>-This method returns the direction in
     * degrees that the ship was heading when the measurement was made.
     */
    public double getShipDirection() {
        return shipDirection;
    }

    /**
     * <strong>(FXY1013)</strong>-This method returns the speed of the ship in
     * m/s when the measurement was made.
     *
     * @return <strong>(FXY1013)</strong>-This method returns the speed of the
     * ship in m/s when the measurement was made.
     */
    public double getShipSpeed() {
        return shipSpeed;
    }

    /**
     * <strong>(FXY22067)</strong>-This method returns a table value that
     * represents the type of probe used to make the measurement.
     *
     * @return <strong>(FXY22067)</strong>-This method returns a table value
     * that represents the type of probe used to make the measurement.<br>
     * e.g. a value of 52 refers to a Deep Blue XBT.
     */
    public int getInstrumentType() {
        return instrumentType;
    }

    /**
     * <strong>(FXY22068)</strong>-This method returns a table value that
     * represents the device that determines the thermistor value in the XBT.
     *
     * @return <strong>(FXY22068)</strong>-This method returns a table value
     * that represents the device that determines the thermistor value in the
     * XBT.<br>
     * e.g. a value of 6 refers to any of the different Sippican MK21 models.
     *
     */
    public int getRecorderType() {
        return recorderType;
    }

    /**
     * <strong>(FXY2002)</strong>-This method returns a table value that
     * represents the type of anemometer used.
     *
     * @return <strong>(FXY2002)</strong>-This method returns a table value that
     * represents the type of anemometer used.
     */
    public int getWindInstrumentType() {
        return windInstrumentType;
    }

    /**
     * <strong>(FXY11001)</strong>-This method returns the wind direction in
     * degrees at the time of the measurement.
     *
     * @return <strong>(FXY11001)</strong>-This method returns the wind
     * direction in degrees at the time of the measurement.
     */
    public double getWindDirection() {
        return windDirection;
    }

    /**
     * <strong>(FXY11002)</strong>-This method returns the wind speed in degrees
     * at the time of the measurement.
     *
     * @return <strong>(FXY11002)</strong>-This method returns the wind speed in
     * m/s at the time of the measurement.
     */
    public double getWindSpeed() {
        return windSpeed;
    }

    /**
     * <strong>(FXY12004)</strong>-This method returns the dry bulb temperature
     * at the time of the measurement.
     *
     * @return <strong>(FXY12004)</strong>-This method returns the dry bulb
     * temperature at the time of the measurement.
     */
    public double getDryBulbTemperature() {
        return dryBulbTemperature;
    }

    /**
     * <strong>(FXY2030)</strong>-This method returns the sea current
     * measurement method.
     *
     * @return <strong>(FXY2030)</strong>-This method returns the sea current
     * measurement method.
     */
    public int getSeaSurfaceCurrentMeasurementMethod() {
        return seaSurfaceCurrentMeasuringMethod;
    }

    /**
     * <strong>(FXY22004)</strong>-This method returns the sea surface current
     * direction .
     *
     * @return <strong>(FXY22004)</strong>-This method returns the sea surface
     * current direction .
     */
    public int getSeaSurfaceCurrentDirection() {
        return seaSurfaceCurrentDirection;
    }

    /**
     * <strong>(FXY22031)</strong>-This method returns the sea surface current
     * speed
     *
     * @return <strong>(FXY22031)</strong>-This method returns the sea surface
     * current speed.
     */
    public double getSeaSurfaceCurrentSpeed() {
        return seaSurfaceCurrentSpeed;
    }

    /**
     * <strong>(FXY22063)</strong>-This method returns the total water depth at
     * the location where the measurement was made.
     *
     * @return <strong>(FXY22063)</strong>-This method returns the total water
     * depth at the location where the measurement was made.
     */
    public int getTotalWaterDepth() {
        return totalWaterDepth;
    }

    /**
     * <strong>(FXY1036)</strong>-This method returns the agency in charge of
     * operating the observation platform.
     *
     * @return <strong>(FXY1036)</strong>-This method returns the agency in
     * charge of operating the observation platform.
     */
    public int getAgencyOwner() {
        return agencyOwner;
    }

    /**
     * <strong>(FXY22178)</strong>-This method returns a table value that
     * represents the type of launcher used.
     *
     * @return <strong>(FXY22178)</strong>-This method returns a table value
     * that represents the type of launcher used.
     */
    public int getXBTLauncherType() {
        return xbtLauncherType;
    }

    /**
     * <strong>(FXY2171)</strong>-This method returns the serial number of the
     * recorder used.
     *
     * @return <strong>(FXY2171)</strong>-This method returns the serial number
     * of the recorder used.
     */
    public String getXBTRecorderSerialNumber() {
        return xbtRecorderSerialNumber;
    }

    /**
     * <strong>(FXY4001)</strong>-This method returns the year in which the
     * recorder was manufactured.
     *
     * @return <strong>(FXY4001)</strong>-This method returns the year in which
     * the recorder was manufactured.
     */
    public int getXBTRecorderManufacturedYear() {
        return xbtRecorderManufactureYear;
    }

    /**
     * <strong>(FXY4002)</strong>-This method returns the month in which the
     * recorder was manufactured.
     *
     * @return <strong>(FXY4002)</strong>-This method returns the month in which
     * the recorder was manufactured.
     */
    public int getXBTRecorderManufacturedMonth() {
        return xbtRecorderManufactureMonth;
    }

    /**
     * <strong>(FXY4003)</strong>-This method returns the day in which the
     * recorder was manufactured.
     *
     * @return <strong>(FXY4003)</strong>-This method returns the day in which
     * the recorder was manufactured.
     */
    public int getXBTRecorderManufacturedDay() {
        return xbtRecorderManufactureDay;
    }

    /**
     * <strong>(FXY4001)</strong>-This method returns the year the XBT was
     * manufactured.
     *
     * @return <strong>(FXY4001)</strong>-This method returns the year the XBT
     * was manufactured.
     */
    public int getXBTProbeManufacturedYear() {
        return xbtProbeManufactureYear;
    }

    /**
     * <strong>(FXY4002)</strong>-This method returns the month in which the XBT
     * was manufactured.
     *
     * @return <strong>(FXY4002)</strong>-This method returns the month in which
     * the XBT was manufactured.
     */
    public int getXBTProbeManufacturedMonth() {
        return xbtProbeManufactureMonth;
    }

    /**
     * <strong>(FXY4003)</strong>-This method returns the day in which the XBT
     * was manufactured.
     *
     * @return <strong>(FXY4003)</strong>-This method returns the day in which
     * the XBT was manufactured.
     */
    public int getXBTProbeManufacturedDay() {
        return xbtProbeManufactureDay;
    }

    /**
     * <strong>(FXY31001B)</strong>-This method returns the number of 40 bit
     * blocks or 5 characters, used to store the rider name.
     *
     * @return <strong>(FXY31001B)</strong>-This method returns the number of 40
     * bit blocks or 5 characters, used to store the rider name.
     */
    public int getNumberOfRiderBlocks() {
        return numberOfRiderBlocks;
    }

    /**
     * <strong>(FXY31001B)</strong>-This method returns the number of 40 bit
     * blocks or 5 characters, used to store the riders institution's name.
     *
     * @return <strong>(FXY31001B)</strong>-This method returns the number of 40
     * bit blocks or 5 characters, used to store the riders institution's name.
     */
    public int getNumberOfRiderInstitutionBlocks() {
        return numberOfRiderInstitutionBlocks;
    }

    /**
     * <strong>(FXY31001B)</strong>-This method returns the number of 40 bit
     * blocks or 5 characters, used to store the rider's email address.
     *
     * @return <strong>(FXY31001B)</strong>-This method returns the number of 40
     * bit blocks or 5 characters, used to store the rider's email address.
     */
    public int getNumberOfRiderEmailBlocks() {
        return numberOfRiderEmailBlocks;
    }

    /**
     * <strong>(FXY31001B)</strong>-This method returns the number of 40 bit
     * blocks or 5 characters, used to store the rider's phone number.
     *
     * @return <strong>(FXY31001B)</strong>-This method returns the number of 40
     * bit blocks or 5 characters, used to store the rider's phone number.
     */
    public int getNumberOfRiderPhoneBlocks() {
        return numberOfRiderPhoneBlocks;
    }

    /**
     * <strong>(FXY100000)</strong>-Delayed Replicator
     *
     * @return <strong>(FXY100000)</strong>-Delayed Replicator! Different from
     * BUFR. The number contained within is the number of following consecutive
     * fields to replicate. This field must be followed by FXY31200 to identify
     * how many groups of replicated fields follow. Always delayed replication.
     */
    public int getNumberOfRepeatedFields() {
        return numberOfRepeatedFields;
    }

    /**
     * <strong>(FXY31200)</strong>-This method returns the number of temperature
     * measurement points recorded.
     *
     * @return <strong>(FXY31200)</strong>-This method returns the number of
     * temperature measurement points recorded.
     */
    public int getTimesReplicated() {
        return timesReplicated;
    }

    /**
     * <strong>(FXY22042S)</strong>-This method returns the SST or the first
     * temperature measurement made.
     *
     * @return <strong>(FXY22042S)</strong>-This method returns the SST or the
     * first temperature measurement made.
     */
    public double getSeaSurfaceTemperature() {
        double sst = seaSurfaceTemperature;
        if (this.newMessageType == MessageType.MESSAGE_TYPE_4) {
            XBTResistanceToTemperatureConverter XBTR2T = new XBTResistanceToTemperatureConverter();
            sst = XBTR2T.convertResistaceToTemperature(seaSurfaceResistance);

        }//end if
        return sst;
    }
    
    /**
     * <strong>(FXY22042S)</strong>-This method returns the SSR or the first
     * Resistance measurement made.
     *
     * @return <strong>(FXY22042S)</strong>-This method returns the SSR or the
     * first Resistance measurement made.
     */
    public double getSeaSurfaceResistance() {
        return seaSurfaceResistance;
    }    
    
    
        /**
     * <strong>(FXY22042S)</strong>-This method returns the SSM or the first
     * measurement made.
     *
     * @return <strong>(FXY22042S)</strong>-This method returns the SSM or the
     * first measurement made.
     */
    public double getSeaSurfaceMeasurement() {
        double ssm = this.seaSurfaceMeasurementPoint;
        if (this.newMessageType == MessageType.MESSAGE_TYPE_4) {
            XBTResistanceToTemperatureConverter XBTR2T = new XBTResistanceToTemperatureConverter();
            ssm = XBTR2T.convertResistaceToTemperature(seaSurfaceMeasurementPoint);

        }//end if
        return ssm;
    }

    /**
     * <strong>(FXY7062S)</strong>-This method returns the depth below the
     * sea/water surface
     *
     * @return <strong>(FXY7062S)</strong>-This method returns the depth below
     * the sea/water surface.
     *
     */
    public double getSeaDepth() {
        return seaDepth;
    }

    /**
     * <strong>(FXY22042S)</strong>-This method returns an array containing the
     * temperature measurements made.
     *
     * @return <strong>(FXY22042S)</strong>-This method returns an array
     * containing the temperature measurements made.
     */
    public double[] getTemperaturePoints() {
        double[] tp = temperaturePoints;
        if (this.newMessageType == MessageType.MESSAGE_TYPE_4) {
            XBTResistanceToTemperatureConverter XBTR2T = new XBTResistanceToTemperatureConverter();
            tp = XBTR2T.convertResistaceToTemperature(resistancePoints);

        }//end if
        return tp;
    }

    /**
     * <strong>(FXY22042S)</strong>-This method returns an array containing the
     * resistance measurements made.
     *
     * @return <strong>(FXY22042S)</strong>-This method returns an array
     * containing the resistance measurements made.
     */
    public double[] getResistancePoints() {
        return resistancePoints;
    } 
    
    /**
     * <strong>(FXY22042S)</strong>-This method returns an array containing the
     * measurements made.
     *
     * @return <strong>(FXY22042S)</strong>-This method returns an array
     * containing the measurements made.
     */
    public double[] getMeasurementPoints() {

        return measurementPoints;
    }

    /**
     * <strong>(FXY205030A)</strong>-This method returns the rider's name.
     *
     * @return <strong>(FXY205030A)</strong>-This method returns the rider's
     * name.
     *
     */
    public String getRiderNames() {
        return riderName;
    }

    /**
     * <strong>(FXY205030A)</strong>-This method returns the rider's email.
     *
     * @return <strong>(FXY205030A)</strong>-This method returns the rider's
     * email.
     *
     */
    public String getRiderEmails() {
        return riderEmail;
    }

    /**
     * <strong>(FXY205030A)</strong>-This method returns the rider's
     * institution.
     *
     * @return <strong>(FXY205030A)</strong>-This method returns the rider's
     * institution.
     */
    public String getRiderInstitutions() {
        return riderInstitution;
    }

    /**
     * <strong>(FXY205030A)</strong>-This method returns the rider's phone
     * number.
     *
     * @return <strong>(FXY205030A)</strong>-This method returns the rider's
     * phone number.
     */
    public String getRiderPhones() {

        return riderPhone;
    }

    /**
     * <strong>(FXY1011)</strong>-This method sets the ship's WMO ID
     *
     * @param wmoId WMO ID
     */
    public void setCallsign(String wmoId) {
        setWMOID(wmoId);
    }

    /**
     * <strong>(FXY1011)</strong>-This method sets the ship's WMO ID
     *
     * @param wmoId WMO ID
     */
    public void setWMOID(String wmoId) {
        this.wmoId = wmoId;
    }

    /**
     * <strong>(FXY48211)</strong>-This method sets the old message type.
     *
     * @param oldMessageType the old message type number
     */
    public void setOldMessageType(int oldMessageType) {
        this.oldMessageType = oldMessageType;
    }

    /**
     *
     * <strong>(FXY48216)</strong>-This method sets the new message types used
     * in Amverseas The types can be a value from 1-3.
     *
     * @param newMessageType the new message type number
     */
    public void setNewMessageType(int newMessageType) {
        this.newMessageType = newMessageType;
    }

    /**
     * <strong>(FXY5001)</strong>-This method sets the latitude where the
     * measurement was made.
     *
     * @param latitude the latitude where the measurement was made.
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * <strong>(FXY6001)</strong>-This method sets the longitude where the
     * measurement was made.
     *
     * @param longitude the longitude where the measurement was made.
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /**
     * <strong>(FXY1080)</strong>-This method sets the name given to the
     * transect. e.g. AX10 This field became available beginning with message
     * type 2
     *
     * @param soopLine THe name given to the transect
     */
    public void setSoopLine(String soopLine) {
        this.soopLine = soopLine;
    }

    /**
     * <strong>(FXY5036)</strong>-This method sets the transect number for the
     * line. This is the number assigned to a transect repeated in the same
     * calendar year. e.g. The second transect would have a value of 2.
     *
     * @param transectNum transect number
     */
    public void setTransectNum(int transectNum) {
        this.transectNum = transectNum;
    }

    /**
     *
     * <strong>(FXY48304)</strong>-This method sets the sequence number.
     * Sequence number N means that it was the Nth deployment for that day. This
     * number is reset to 1 at the start of the day.
     *
     * @param sequenceNum sequence number
     */
    public void setSequenceNum(int sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    /**
     * <strong>(FXY4001)</strong>-This method sets the year in which the
     * measurement was made.
     *
     * @param year the year in which the measurement was made
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * <strong>(FXY4002)</strong>-This method sets the month in which the
     * measurement was made.
     *
     * @param month the month the measurement was made.
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * <strong>(FXY4003)</strong>-This method sets the day in which the
     * measurement was made.
     *
     * @param day the day the measurement was made.
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * <strong>(FXY4004)</strong>-This method sets the GMT hour when the
     * measurement was made.
     *
     * @param hour the hour when the measurement was made
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * <strong>(FXY4005)</strong>-This method sets the GMT minute when the
     * measurement was made.
     *
     * @param minute the minute the measurement was made
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * <strong>(FXY1200)</strong>-This method sets the name of the ship.
     *
     * @param shipName the name of the ship
     */
    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    /**
     * <strong>(FXY1201)</strong>-This method sets the ships International
     * Maritime Organization (IMO) number.
     *
     * @param lloyds the IMO number
     */
    public void setLloyds(int lloyds) {
        this.lloyds = lloyds;
    }

    /**
     * <strong>(FXY48302)</strong>-This method sets the CRC32 value for the bin
     * file. This value is computed by the BinEncoder and set using this
     * method. Any value set here will be overwritten bt the BinFileENcoder.
     *
     * @param uniqueTag the CRC32 checksum  or SEAS ID
     */
    public void setUniqueTag(int uniqueTag) {
        this.uniqueTag = uniqueTag;
    }

    /**
     *
     * <strong>(FXY48201)</strong>-This method sets the version of Amverseas
     * used to make the measurement. This value must later be massaged to get
     * the actual version. e.g. 920 must be dived by 100 to get Amverseas
     * version 9.20.
     *
     * @param seasVersion The version of Amverseas used to create the profile
     */
    public void setSeasVersion(int seasVersion) {
        this.seasVersion = seasVersion;
    }

    /**
     * <strong>(FXY48300)</strong>-This method sets the serial number of the XBT
     * used to make the measurement.
     *
     * @param probeSerialNumber The probes serial number
     */
    public void setProbeSerialNumber(int probeSerialNumber) {
        this.probeSerialNumber = probeSerialNumber;
    }

    /**
     * <strong>(FXY48303)</strong>-This method sets the resolution of the
     * profile. A value of 1 is full resolution a value of 2 is 1 meter
     * resolution and a value of 3 is two meter resolution.
     *
     * @param thisDataIs The resolution of the profile
     */
    public void setThisDataIs(int thisDataIs) {
        this.thisDataIs = thisDataIs;
    }

    /**
     *
     * <strong>(FXY33003)</strong>-This method sets the quality of the data as
     * entered by the user. If the user suspects the data is of a quality other
     * than good, the user can add it to the profile after the measurement has
     * been made.
     *
     * @param dataQuality The quality confidence number assigned to the profile.
     */
    public void setDataQuality(int dataQuality) {
        this.dataQuality = dataQuality;
    }

    /**
     * <strong>(FXY48305)</strong>-This method sets the approximate launch height 
     * from the surface of the water.
     *
     * @param launchHeight The launch height
     */
    public void setLaunchHeight(double launchHeight) {
        this.launchHeight = launchHeight;
    }

    /**
     * <strong>(FXY1012)</strong>-This method sets the direction in degrees that
     * the ship was heading when the measurement was made.
     *
     * @param shipDirection the ships heading
     */
    public void setShipDirection(double shipDirection) {
        this.shipDirection = shipDirection;
    }

    /**
     * <strong>(FXY1013)</strong>-This method sets the speed of the ship in m/s
     * when the measurement was made.
     *
     * @param shipSpeed the ships speed in m/s
     */
    public void setShipSpeed(double shipSpeed) {
        this.shipSpeed = shipSpeed;
    }

    /**
     * <strong>(FXY22067)</strong>-This method sets a table value that
     * represents the type of probe used to make the measurement.<br>
     * e.g. a value of 52 refers to a Deep Blue XBT.
     *
     * @param instrumentType number assigned to the type of probe used.
     */
    public void setInstrumentType(int instrumentType) {
        this.instrumentType = instrumentType;
    }

    /**
     * <strong>(FXY22068)</strong>-This method sets a table value that
     * represents the device that determines the thermistor value in the
     * XBT.<br>
     * e.g. a value of 6 refers to any of the different Sippican MK21 models.
     *
     * @param recorderType the number given to the type of recorder used.
     */
    public void setRecorderType(int recorderType) {
        this.recorderType = recorderType;
    }

    /**
     * <strong>(FXY2002)</strong>-This method sets a table value that represents
     * the type of anemometer used.
     *
     * @param windInstrumentType the type of anemometer used.
     */
    public void setWindInstrumentType(int windInstrumentType) {
        this.windInstrumentType = windInstrumentType;
    }

    /**
     * <strong>(FXY11001)</strong>-This method sets the wind direction in
     * degrees at the time of the measurement.
     *
     * @param windDirection the wind direction in degrees
     */
    public void setWindDirection(double windDirection) {
        this.windDirection = windDirection;
    }

    /**
     * <strong>(FXY11002)</strong>-This method sets the wind speed in m/s at
     * the time of the measurement.
     *
     * @param windSpeed the wind speed
     */
    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     * <strong>(FXY12004)</strong>-This method sets the dry bulb temperature at
     * the time of the measurement.
     *
     * @param dryBulbTemperature the dry bulb temperature
     */
    public void setDryBulbTemperature(double dryBulbTemperature) {
        this.dryBulbTemperature = dryBulbTemperature;
    }

    /**
     * <strong>(FXY2030)</strong>-This method sets the sea current measurement
     * method.
     *
     * @param seaSurfaceCurrentMeasuringMethod the methos used to measure sea
     * surface current
     */
    public void setSeaSurfaceCurrentMeasurementMethod(
            int seaSurfaceCurrentMeasuringMethod) {
        this.seaSurfaceCurrentMeasuringMethod = seaSurfaceCurrentMeasuringMethod;
    }

    /**
     * <strong>(FXY22004)</strong>-This method sets the sea surface current
     * direction .
     *
     * @param seaSurfaceCurrentDirection the direction of  the seas surface
     */
    public void setSeaSurfaceCurrentDirection(
            int seaSurfaceCurrentDirection) {
        this.seaSurfaceCurrentDirection = seaSurfaceCurrentDirection;
    }

    /**
     * <strong>(FXY22031)</strong>-This method sets the sea surface current
     * speed
     *
     * @param seaSurfaceCurrentSpeed sea surface current speed
     */
    public void setSeaSurfaceCurrentSpeed(double seaSurfaceCurrentSpeed) {
        this.seaSurfaceCurrentSpeed = seaSurfaceCurrentSpeed;
    }

    /**
     * <strong>(FXY22063)</strong>-This method sets the total water depth at the
     * location where the measurement was made.
     *
     * @param totalWaterDepth the depth where the measurement was made.
     */
    public void setTotalWaterDepth(int totalWaterDepth) {
        this.totalWaterDepth = totalWaterDepth;
    }

    /**
     * <strong>(FXY1036)</strong>-This method sets the agency in charge of
     * operating the observation platform.
     *
     * @param agencyOwner the agency in charge of operating the observation platform.
     */
    public void setAgencyOwner(int agencyOwner) {
        this.agencyOwner = agencyOwner;
    }

    /**
     * <strong>(FXY22178)</strong>-This method sets a table value that
     * represents the type of launcher used.
     *
     * @param xbtLauncherType the type of launcher used.
     */
    public void setXBTLauncherType(int xbtLauncherType) {
        this.xbtLauncherType = xbtLauncherType;
    }

    /**
     * <strong>(FXY2171)</strong>-This method sets the serial number of the
     * recorder used.
     *
     * @param xbtRecorderSerialNumber he serial number of the recorder used.
     */
    public void setXBTRecorderSerialNumber(String xbtRecorderSerialNumber) {
        this.xbtRecorderSerialNumber = xbtRecorderSerialNumber;
    }

    /**
     * <strong>(FXY4001)</strong>-This method sets the year in which the
     * recorder was manufactured.
     *
     * @param xbtRecorderManufactureYear the year in which the recorder was 
     * manufactured.
     */
    public void setXBTRecorderManufacturedYear(
            int xbtRecorderManufactureYear) {
        this.xbtRecorderManufactureYear = xbtRecorderManufactureYear;
    }

    /**
     * <strong>(FXY4002)</strong>-This method sets the month in which the
     * recorder was manufactured.
     *
     * @param xbtRecorderManufactureMonth he month in which the
     * recorder was manufactured.
     */
    public void setXBTRecorderManufacturedMonth(
            int xbtRecorderManufactureMonth) {
        this.xbtRecorderManufactureMonth = xbtRecorderManufactureMonth;
    }

    /**
     * <strong>(FXY4003)</strong>-This method sets the day in which the recorder
     * was manufactured.
     *
     * @param xbtRecorderManufactureDay the day in which the recorder
     * was manufactured.
     */
    public void setXBTRecorderManufacturedDay(
            int xbtRecorderManufactureDay) {
        this.xbtRecorderManufactureDay = xbtRecorderManufactureDay;
    }

    /**
     * <strong>(FXY4001)</strong>-This method sets the year the XBT was
     * manufactured.
     *
     * @param xbtProbeManufactureYear the year the XBT was
     * manufactured.
     */
    public void setXBTProbeManufacturedYear(
            int xbtProbeManufactureYear) {
        this.xbtProbeManufactureYear = xbtProbeManufactureYear;
    }

    /**
     * <strong>(FXY4002)</strong>-This method sets the month in which the XBT
     * was manufactured.
     *
     * @param xbtProbeManufactureMonth the month in which the XBT
     * was manufactured.
     */
    public void setXBTProbeManufacturedMonth(
            int xbtProbeManufactureMonth) {
        this.xbtProbeManufactureMonth = xbtProbeManufactureMonth;
    }

    /**
     * <strong>(FXY4003)</strong>-This method sets the day in which the XBT was
     * manufactured.
     *
     * @param xbtProbeManufactureDay the day in which the XBT was
     * manufactured.
     */
    public void setXBTProbeManufacturedDay(
            int xbtProbeManufactureDay) {
        this.xbtProbeManufactureDay = xbtProbeManufactureDay;
    }

    /**
     * <strong>(FXY31001B)</strong>-This method sets the number of 40 bit blocks
     * or 5 characters, used to store the rider name. This Value is computed by
     * the BinEncoder and set via this method. any values entered here will
     * get overwritten.
     *
     * @param numberOfRiderBlocks the number of 40 bit blocks or 5 characters, 
     * used to store the rider name. 
     **/
    public void setNumberOfRiderBlocks(
            int numberOfRiderBlocks) {
        this.numberOfRiderBlocks = numberOfRiderBlocks;
    }

    /**
     * <strong>(FXY31001B)</strong>-This method sets the number of 40 bit blocks
     * or 5 characters, used to store the riders institution's name. This Value
     * is computed by the BinEncoder and set via this method. any values
     * entered here will get overwritten.
     *
     * @param numberOfRiderInstitutionBlocks the number of 40 bit blocks
     * or 5 characters, used to store the riders institution's name.
     */
    public void setNumberOfRiderInstitutionBlocks(
            int numberOfRiderInstitutionBlocks) {
        this.numberOfRiderInstitutionBlocks = numberOfRiderInstitutionBlocks;
    }

    /**
     * <strong>(FXY31001B)</strong>-This method sets the number of 40 bit blocks
     * or 5 characters, used to store the rider's email address. This Value is
     * computed by the BinEncoder and set via this method. any values
     * entered here will get overwritten.
     *
     * @param numberOfRiderEmailBlocks the number of 40 bit blocks
     * or 5 characters, used to store the rider's email address.
     */
    public void setNumberOfRiderEmailBlocks(int numberOfRiderEmailBlocks) {
        this.numberOfRiderEmailBlocks = numberOfRiderEmailBlocks;
    }

    /**
     * <strong>(FXY31001B)</strong>-This method sets the number of 40 bit blocks
     * or 5 characters, used to store the rider's phone number. This Value is
     * computed by the BinEncoder and set via this method. any values
     * entered here will get overwritten.
     *
     * @param numberOfRiderPhoneBlocks the number of 40 bit blocks
     * or 5 characters, used to store the rider's phone number.
     */
    public void setNumberOfRiderPhoneBlocks(int numberOfRiderPhoneBlocks) {
        this.numberOfRiderPhoneBlocks = numberOfRiderPhoneBlocks;
    }

    /**
     * <strong>(FXY100000)</strong>-Delayed Replicator! Different from BUFR. The
     * number contained within is the number of following consecutive fields to
     * replicate. This field must be followed by FXY31200 to identify how many
     * groups of replicated fields follow. Always delayed replication. This
     * Value is computed by the BinEncoder and set via this method. any
     * values entered here will get overwritten.
     *
     * @param numberOfRepeatedFields The number contained within is the number 
     * of following consecutive fields to replicate
     */
    public void setNumberOfRepeatedFields(int numberOfRepeatedFields) {
        this.numberOfRepeatedFields = numberOfRepeatedFields;
    }

    /**
     * <strong>(FXY31200)</strong>-This method sets the number of temperature
     * measurement points recorded. This Value is computed by the BinEncoder
     * and set via this method. any values entered here will get overwritten.
     *
     * @param timesReplicated the number of temperature
     * measurement points recorded.
     */
    public void setTimesReplicated(int timesReplicated) {
        this.timesReplicated = timesReplicated;
    }

    /**
     * <strong>(FXY22042S)</strong>-This method sets the SST or the first
     * temperature measurement made.
     *
     * @param seaSurfaceTemperature the SST or the first
     * temperature measurement made.
     */
    public void setSeaSurfaceTemperature(double seaSurfaceTemperature) {
        this.seaSurfaceTemperature = seaSurfaceTemperature;
        this.seaSurfaceMeasurementPoint = seaSurfaceTemperature;
    }
    
        /**
     * <strong>(FXY22042S)</strong>-This method sets the SSR or the first
     * Resistance measurement made.
     *
     * @param seaSurfaceResistance the SST or the first
     * temperature measurement made.
     */
    public void setSeaSurfaceResistance(double seaSurfaceResistance) {
        this.seaSurfaceResistance = seaSurfaceResistance;
        this.seaSurfaceMeasurementPoint = seaSurfaceResistance;
    }
    
        /**
     * <strong>(FXY22042S)</strong>-This method sets the SSM or the first
     * Resistance measurement made.
     *
     * @param seaSurfacemeasurement the SST or the first
     * temperature measurement made.
     */
    public void setSeaSurfaceMeasurementPoint(double seaSurfacemeasurement) {
 
        this.seaSurfaceMeasurementPoint = seaSurfaceResistance;
    }    


    /**
     * <strong>(FXY7062S)</strong>-This method sets the depth below the
     * sea/water surface
     *
     *
     * @param seaDepth the depth below the sea/water surface
     */
    public void setSeaDepth(double seaDepth) {
        this.seaDepth = seaDepth;
    }

    /**
     * <strong>(FXY22042S)</strong>-This method sets an array containing the
     * temperature measurements made.
     *
     * @param temperaturePoints An array containing the temperature 
     * measurements made.
     */
    public void setTemperaturePoints(double[] temperaturePoints) {
        this.temperaturePoints = temperaturePoints;
        if(temperaturePoints!=null && temperaturePoints.length > 0){
       this.seaSurfaceTemperature = temperaturePoints[0];
        }//end if
        
        this.measurementPoints = temperaturePoints;
        if (measurementPoints != null && measurementPoints.length > 0) {
            this.seaSurfaceMeasurementPoint = measurementPoints[0];
        }//end if          

    }
  
    /**
     * <strong>(FXY22042S)</strong>-This method sets an array containing the
     * resistance measurements made.
     *
     * @param resistancePoints An array containing the temperature 
     * measurements
     * made.
     */
    public void setResistancePoints(double[] resistancePoints) {
        this.resistancePoints = resistancePoints;
        if (resistancePoints != null && resistancePoints.length > 0) {
            this.seaSurfaceResistance = resistancePoints[0];
        }//end if

        this.measurementPoints = resistancePoints;
        if (measurementPoints != null && measurementPoints.length > 0) {
            this.seaSurfaceMeasurementPoint = measurementPoints[0];
        }//end if                
                
                

    }  
    
    /**
     * <strong>(FXY22042S)</strong>-This method sets an array containing the
     * measurements made.
     *
     * @param measurementPoints An array containing the 
     * measurements made.
     */
    public void setMeasurementPoints(double[] measurementPoints) {
        this.measurementPoints = measurementPoints;
                if(measurementPoints!=null && measurementPoints.length > 0){
       this.seaSurfaceMeasurementPoint = measurementPoints[0];
        }//end if

    }    

    /**
     * <strong>(FXY205030A)</strong>-This method sets the rider's name.
     *
     *
     * @param riderName the rider's name.
     */
    public void setRiderNames(String riderName) {
        this.riderName = riderName;

    }

    /**
     * <strong>(FXY205030A)</strong>-This method sets the rider's email.
     *
     *
     * @param riderEmail the rider's email.
     */
    public void setRiderEmails(String riderEmail) {
        this.riderEmail = riderEmail;

    }

    /**
     * <strong>(FXY205030A)</strong>-This method sets the rider's institution.
     *
     * @param riderInstitution the rider's institution.
     */
    public void setRiderInstitutions(String riderInstitution) {
        this.riderInstitution = riderInstitution;
    }

    /**
     * <strong>(FXY205030A)</strong>-This method sets the rider's phone number.
     *
     * @param riderPhone the rider's phone number.
     */
    public void setRiderPhones(String riderPhone) {
        this.riderPhone = riderPhone;

    }
 /**
     * <strong>(FXY)</strong>-This method returns a String that includes all of
     * the info in the bin file.
     *
     * @return <strong>(FXY)</strong>-This method returns a String that includes
     * all of the info in the bin file.
     */
    @Override
    public String toString() {
        double[] tempPoints = getTemperaturePoints();
        String str = ""
                + "Callsign=" + getCallsign() + "\n"
                + "Old message type=" + getOldMessageType() + "\n"
                + "New message type=" + getNewMessageType() + "\n"
                + "Lat=" + getLatitude() + "\n"
                + "Lon=" + getLongitude() + "\n"
                + "Soopline=" + getSoopLine() + "\n"
                + "Transect#=" + getTransectNumber() + "\n"
                + "Sequence#=" + getSequenceNumber() + "\n"
                + "date=" + getMonth() + "/" + getDay() + "/" + getYear() + "\n"
                + "time=" + getHour() + ":" + getMinute() + "\n"
                + "ShipName=" + getShipName() + "\n"
                + "Lloyds=" + getLloyds() + "\n"
                + "Unique tag=" + Integer.toHexString(getUniqueTag()).toUpperCase() + "\n"
                + "SeasVersion=" + getSeasVersion() + "\n"
                + "XBT Serial#=" + getProbeSerialNumber() + "\n"
                + "ThisDatais=" + getThisDataIs() + "\n"
                + "DataQuality=" + getDataQuality() + "\n"
                + "LauncherHeight=" + getLaunchHeight() + "\n"
                + "Ship direction=" + getShipDirection() + "\n"
                + "Ship Speed=" + getShipSpeed() + "\n"
                + "Instrument type=" + getInstrumentType() + "\n"
                + "Recorder type=" + getRecorderType() + "\n"
                + "Wind Instrument type=" + getWindInstrumentType() + "\n"
                + "Wind Direction=" + getWindDirection() + "\n"
                + "Wind Speed=" + getWindSpeed() + "\n"
                + "Dry bulb temp=" + getDryBulbTemperature() + "\n"
                + "Measure method=" + getSeaSurfaceCurrentMeasurementMethod() + "\n"
                + "Current Dir=" + getSeaSurfaceCurrentDirection() + "\n"
                + "Current Speed=" + getSeaSurfaceCurrentSpeed() + "\n"
                + "Total water depth=" + getTotalWaterDepth() + "\n"
                + "Agency Owner=" + getAgencyOwner() + "\n"
                + "XBT launcher type=" + getXBTLauncherType() + "\n"
                + "XBT Recorder Serial#=" + getXBTRecorderSerialNumber() + "\n"
                + "XBT Recorder Manufacture date=" + getXBTRecorderManufacturedMonth() + "/" + getXBTRecorderManufacturedDay() + "/" + getXBTRecorderManufacturedYear() + "\n"
                + "XBT Probe Manufacture date=" + getXBTProbeManufacturedMonth() + "/" + getXBTProbeManufacturedDay() + "/" + getXBTProbeManufacturedYear() + "\n"
                + "# of rider blocks=" + getNumberOfRiderBlocks() + "\n"
                + "# of rider email blocks=" + getNumberOfRiderEmailBlocks() + "\n"
                + "# of rider phone blocks=" + getNumberOfRiderPhoneBlocks() + "\n"
                + "# of rider inst blocks=" + getNumberOfRiderInstitutionBlocks() + "\n"
                + "# of rep fields=" + getNumberOfRepeatedFields() + "\n"
                + "Times replicated=" + getTimesReplicated() + "\n"
                + "Sea Temperature=" + getSeaSurfaceTemperature() + "\n"
                + "SeaDepth=" + getSeaDepth() + "\n"
                + "Rider=" + getRiderNames() + "\n"
                + "Email=" + getRiderEmails() + "\n"
                + "Phone=" + getRiderPhones() + "\n"
                + "Institution=" + getRiderInstitutions() + "\n"
                + "index,temperature\n";
        for (int i = 0; i < tempPoints.length; i++) {
            str += i + "," + tempPoints[i] + "\n";
        }//end for

        return str;
    }    

}
