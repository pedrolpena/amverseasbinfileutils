/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binfileutils;

/**
 * This class contains the locations of where the data are located in an
 * XBT profile. The class also contains methods to retrieve these locations.
 *
 * @author pedro
 */
public final class XBTProfileDataRanges {

    public static final int dataLocations[][][] = {
        //        start               end
        //          0                  1
        //     0  1  2  3     0   1   2   3    <------message types
        /*0*/{{0, 0, 0, 0}, {71, 71, 71, 71}}, //WMO number/call sign
        /*1*/ {{72, 72, 72, 72}, {77, 77, 77, 77}},//old message type
        /*2*/ {{78, 78, 78, 78}, {87, 87, 87, 87}},//new message type
        /*3*/ {{-1, 88, 88, 88}, {-1, 112, 112, 112}},//lattitude
        /*4*/ {{-1, 113, 113, 113}, {-1, 138, 138, 138}},//longitude
        /*5*/ {{-1, -1, 139, 139}, {-1, -1, 186, 186}},//soop line
        /*6*/ {{-1, -1, 187, 187}, {-1, -1, 193, 193}},//transect number
        /*7*/ {{-1, -1, 194, 194}, {-1, -1, 209, 209}},//sequence number
        /*8*/ {{-1, 139, 210, 210}, {-1, 150, 221, 221}},//year
        /*9*/ {{-1, 151, 222, 222}, {-1, 154, 225, 225}},//month
        /*10*/ {{-1, 155, 226, 226}, {-1, 160, 231, 231}},//day
        /*11*/ {{-1, 161, 232, 232}, {-1, 165, 236, 236}},//hour
        /*12*/ {{-1, 166, 237, 237}, {-1, 171, 242, 242}},//minute
        /*13*/ {{-1, 172, 243, 243}, {-1, 411, 482, 482}},//ship name
        /*14*/ {{-1, 412, 483, 483}, {-1, 435, 506, 506}},//lloyds
        /*15*/ {{-1, 436, 507, 507}, {-1, 467, 538, 538}},//unique tag
        /*16*/ {{-1, 468, 539, 539}, {-1, 477, 548, 548}},//seas version
        /*17*/ {{-1, 478, 549, 549}, {-1, 497, 572, 572}},//probe serial number
        /*18*/ {{-1, 498, 573, 573}, {-1, 500, 575, 575}},//data resolution "thisDataIs"
        /*19*/ {{-1, 501, 576, 576}, {-1, 503, 578, 578}},//data quality
        /*20*/ {{-1, -1, 579, 579}, {-1, -1, 591, 591}},//launcher height
        /*21*/ {{-1, -1, 592, 592}, {-1, -1, 600, 600}},//ship direction
        /*22*/ {{-1, -1, 601, 601}, {-1, -1, 613, 613}},//ship speed
        /*23*/ {{-1, 504, 614, 614}, {-1, 513, 623, 623}},//instrument type
        /*24*/ {{-1, 514, 624, 624}, {-1, 520, 630, 630}},//recorder type
        /*25*/ {{-1, 521, 631, 631}, {-1, 524, 634, 634}},//wind instrument type
        /*26*/ {{-1, 525, 635, 635}, {-1, 533, 643, 643}},//wind direction
        /*27*/ {{-1, 534, 644, 644}, {-1, 545, 655, 655}},//wind speed
        /*28*/ {{-1, 546, 656, 656}, {-1, 557, 667, 667}},//dry bulb termperature
        /*29*/ {{-1, 558, 668, 668}, {-1, 560, 670, 670}},//sea surface current measurement
        /*30*/ {{-1, 561, 671, 671}, {-1, 569, 679, 679}},//sea surface current direction
        /*31*/ {{-1, 570, 680, 680}, {-1, 582, 692, 692}},//sea surface current speed
        /*32*/ {{-1, 583, 693, 693}, {-1, 596, 706, 706}},//total water depth
        /*33*/ {{-1, -1, -1, 707}, {-1, -1, -1, 726}},//agency owner
        /*34*/ {{-1, -1, -1, 727}, {-1, -1, -1, 734}},//launcher type
        /*35*/ {{-1, -1, -1, 735}, {-1, -1, -1, 798}},//xbt Recorder serial number
        /*36*/ {{-1, -1, -1, 799}, {-1, -1, -1, 810}},//xbt recorder manufactured year
        /*37*/ {{-1, -1, -1, 811}, {-1, -1, -1, 814}},//xbt recorder mannufactured month
        /*38*/ {{-1, -1, -1, 815}, {-1, -1, -1, 820}},//xbt recorder manufactured day
        /*39*/ {{-1, -1, -1, 821}, {-1, -1, -1, 832}},//xbt manufactured year
        /*40*/ {{-1, -1, -1, 833}, {-1, -1, -1, 836}},//xbt probe manufactured month
        /*41*/ {{-1, -1, -1, 837}, {-1, -1, -1, 842}},//xbt probe manufactured day
        /*42*/ {{-1, -1, -1, 843}, {-1, -1, -1, 848}},//number of rider blocks
        /*43*/ {{-1, -1, -1, 849}, {-1, -1, -1, 854}},//number of rider institution blocks
        /*44*/ {{-1, -1, -1, 855}, {-1, -1, -1, 860}},//number of rider email blocks
        /*45*/ {{-1, -1, -1, 861}, {-1, -1, -1, 866}},//number of rider phone blocks
        /*46*/ {{-1, 597, 707, 867}, {-1, 604, 714, 874}},//number of repeated fields
        /*47*/ {{-1, 605, 715, 875}, {-1, 620, 730, 890}},//times replicated
        /*48*/ {{-1, 621, 731, 891}, {-1, 632, 742, 902}},//sea surface temperature
        /*49*/ {{-1, 633, -1, -1}, {-1, 646, -1, -1}}, //sea depth
        /*50*/ {{-1, 621, 731, 891}, {-1, -1, -1, -1}}, //temperature points
        /*51*/{{-1, -1, -1, -1}, {-1, -1, -1, -1}},// comment blocks
        /*52*/ {{-1, -1, -1, 891}, {-1, -1, -1, -1}},//rider names
        /*53*/ {{-1, -1, -1, 891}, {-1, -1, -1, -1}},//rider emails
        /*54*/ {{-1, -1, -1, 891}, {-1, -1, -1, -1}},//rider institutions
        /*55*/ {{-1, -1, -1, 891}, {-1, -1, -1, -1}},//rider phones
    };

    public static int[] getWMOID(int messageType) {
        int start = dataLocations[0][0][messageType];
        int end = dataLocations[0][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }//end method

    public static int[] getCallsign(int messageType) {
        return getWMOID(messageType);
    }//end method

    /**
     * <strong>(FXY48211)</strong>-This method returns the data range used for  the old message type.
     *
     * @return  <strong>(FXY48211)</strong>-This method returns the data range used for  the old message
     * type.Returns 0 when there is an exception.
     */
    public static int[] getOldMessageType(int messageType) {
        int start = dataLocations[1][0][messageType];
        int end = dataLocations[1][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;

    }

    /**
     * <strong>(FXY48211)</strong>-This method returns the data range used for  the old message type.
     *
     * @return  <strong>(FXY48211)</strong>-This method returns the data range used for  the old message
     * type.Returns 0 when there is an exception.
     */
    public static int[] getNewMessageType(int messageType) {
        int start = dataLocations[2][0][messageType];
        int end = dataLocations[2][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;

    }

    /**
     * <strong>(FXY5001)</strong>-This method returns the data range used for  the latitude where the
     * measurement was made.
     *
     * @return  <strong>(FXY5001)</strong>-This method returns the data range used for  the latitude where
     * the measurement was made. The value is returned in decimal degrees.
     */
    public static int[] getLattitude(int messageType) {
        int start = dataLocations[3][0][messageType];
        int end = dataLocations[3][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;

    }

    /**
     * <strong>(FXY6001)</strong>-This method returns the data range used for  the longitude where the
     * measurement was made
     *
     * @return  <strong>(FXY6001)</strong>-This method returns the data range used for  the longitude
     * where the measurement was made. The value is returned in decimal degrees.
     */
    public static int[] getLongitude(int messageType) {
        int start = dataLocations[4][0][messageType];
        int end = dataLocations[4][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY1080)</strong>-This method returns the data range used for  the name given to the
     * transect.
     *
     * @return  <strong>(FXY1080)</strong>-This method returns the data range used for  the name given to
     * the transect. e.g. AX10 This field became available beginning with
     * message type 2
     */
    public static int[] getSoopLine(int messageType) {
        int start = dataLocations[5][0][messageType];
        int end = dataLocations[5][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY5036)</strong>-This method returns the data range used for  the transect number for
     * the line.
     *
     * @return <strong>(FXY5036)</strong>-This method returns the data range used for  the transect
     * number for the line. This is the number assigned to a transect repeated
     * in the same calendar year. e.g. The second transect would have a value of
     * 2. A value of -999 is returned when there is no value.
     */
    public static int[] getTransectNumber(int messageType) {
        int start = dataLocations[6][0][messageType];
        int end = dataLocations[6][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY48304)</strong>-
     *
     * @return <strong>(FXY48304)</strong>-This method returns the data range used for 
     */
    public static int[] getSequenceNumber(int messageType) {
        int start = dataLocations[7][0][messageType];
        int end = dataLocations[7][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY4001)</strong>-This method returns the data range used for  the year in which the
     * measurement was made.
     *
     * @return <strong>(FXY4001)</strong>-This method returns the data range used for  the year in which
     * the measurement was made. A value of -999 is returned when there is no
     * value.
     */
    public static int[] getYear(int messageType) {
        int start = dataLocations[8][0][messageType];
        int end = dataLocations[8][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY4002)</strong>-This method returns the data range used for  the month in which the
     * measurement was made.
     *
     * @return <strong>(FXY4002)</strong>-This method returns the data range used for  the month in which
     * the measurement was made. A value of -999 is returned when there is no
     * value.
     */
    public static int[] getMonth(int messageType) {
        int start = dataLocations[9][0][messageType];
        int end = dataLocations[9][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY4003)</strong>-This method returns the data range used for  the day in which the
     * measurement was made.
     *
     * @return <strong>(FXY4003)</strong>-This method returns the data range used for  the day in which
     * the measurement was made. A value of -999 is returned when there is no
     * value.
     */
    public static int[] getDay(int messageType) {
        int start = dataLocations[10][0][messageType];
        int end = dataLocations[10][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY4004)</strong>-This method returns the data range used for  the GMT hour when the
     * measurement was made.
     *
     * @return <strong>(FXY4004)</strong>-This method returns the data range used for  the GMT hour when
     * the measurement was made. A value of -999 is returned when there is no
     * value.
     */
    public static int[] getHour(int messageType) {
        int start = dataLocations[11][0][messageType];
        int end = dataLocations[11][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY4005)</strong>-This method returns the data range used for  the GMT minute when the
     * measurement was made
     *
     * @return <strong>(FXY4005)</strong>-This method returns the data range used for  the GMT minute
     * when the measurement was made A value of -999 is returned when there is
     * no value.
     */
    public static int[] getMinute(int messageType) {
        int start = dataLocations[12][0][messageType];
        int end = dataLocations[12][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY1200)</strong>-This method returns the data range used for  the name of the ship. If
     * there is no
     *
     * @return <strong>(FXY1200)</strong>-This method returns the data range used for  the name of the
     * ship. If there is no name then the string "NONE" is returned.
     */
    public static int[] getShipName(int messageType) {
        int start = dataLocations[13][0][messageType];
        int end = dataLocations[13][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY1201)</strong>-This method returns the data range used for  the ships International
     * Maritime Organization (IMO) number.
     *
     * @return <strong>(FXY1201)</strong>-This method returns the data range used for  the ships
     * International Maritime Organization (IMO) number. A value of -999 is
     * returned when there is no value.
     */
    public static int[] getLloyds(int messageType) {
        int start = dataLocations[14][0][messageType];
        int end = dataLocations[14][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY48302)</strong>-This method returns the data range used for  the CRC value for the bin
     * file.
     *
     * @return <strong>(FXY48302)</strong>-This method returns the data range used for  the CRC value for
     * the bin file. This value is computed by WRITE LOGIC HERE Once computed,
     * the value returned by this method must match. If there is not a match,
     * then the bin file is possibly corrupt. A value of -999 is returned when
     * there is no value.
     */
    public static int[] getUniqueTag(int messageType) {
        int start = dataLocations[15][0][messageType];
        int end = dataLocations[15][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY48201)</strong>-This method returns the data range used for  the version of Amverseas
     * used to make the measurement.
     *
     * @return <strong>(FXY48201)</strong>-This method returns the data range used for  the version of
     * Amverseas used to make the measurement. This value must later be massaged
     * to get the actual version. e.g. 920 must be dived by 100 to get Amverseas
     * version 9.20 A value of -999 is returned when there is no value.
     */
    public static int[] getSeasVersion(int messageType) {
        int start = dataLocations[16][0][messageType];
        int end = dataLocations[16][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY48300)</strong>-This method returns the data range used for  the serial number of the
     * XBT used to make the measurement.
     *
     * @return <strong>(FXY48300)</strong>-This method returns the data range used for  the serial number
     * of the XBT used to make the measurement. A value of -999 is returned when
     * there is no value.
     */
    public static int[] getProbeSerialNumber(int messageType) {
        int start = dataLocations[17][0][messageType];
        int end = dataLocations[17][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY48303)</strong>-This method returns the data range used for  the resolution of the
     * profile.
     *
     * @return <strong>(FXY48303)</strong>-This method returns the data range used for  the resolution of
     * the profile. A value of 1 is full resolution a value of 2 is 1 meter
     * resolution and a value of 3 is two meter resolution. A value of -999 is
     * returned when there is no value.
     */
    public static int[] getThisDataIs(int messageType) {
        int start = dataLocations[18][0][messageType];
        int end = dataLocations[18][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY33003)</strong>-This method returns the data range used for  the quality of the data
     * as entered by the user.
     *
     * @return <strong>(FXY33003)</strong>-This method returns the data range used for  the quality of
     * the data as entered by the user. If the user suspects the data is of a
     * quality other than good, the user can add it to the profile after the
     * measurement has been made. A value of -999 is returned when there is no
     * value.
     */
    public static int[] getDataQuality(int messageType) {
        int start = dataLocations[19][0][messageType];
        int end = dataLocations[19][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY48305)</strong>-This method returns the data range used for  the approximate height of
     * the autolauncher from the surface of the water.
     *
     * @return <strong>(FXY48305)</strong>-This method returns the data range used for  the approximate
     * height of the autolauncher from the surface of the water. A value of
     * -9.99 is returned when there is no value.
     */
    public static int[] getLaunchHeight(int messageType) {
        int start = dataLocations[20][0][messageType];
        int end = dataLocations[20][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY1012)</strong>-This method returns the data range used for  the direction in degrees
     * that the ship was heading when the measurement was made.
     *
     * @return <strong>(FXY1012)</strong>-This method returns the data range used for  the direction in
     * degrees that the ship was heading when the measurement was made. A value
     * of -999.0 is returned when there is no value.
     */
    public static int[] getShipDirection(int messageType) {
        int start = dataLocations[21][0][messageType];
        int end = dataLocations[21][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY1013)</strong>-This method returns the data range used for  the speed of the ship in
     * km/h when the measurement was made.
     *
     * @return <strong>(FXY1013)</strong>-This method returns the data range used for  the speed of the
     * ship in m/s when the measurement was made. A value of -9.99 is returned
     * when there is no value.
     */
    public static int[] getShipSpeed(int messageType) {
        int start = dataLocations[22][0][messageType];
        int end = dataLocations[22][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY22067)</strong>-This method returns the data range used for  a table value that
     * represents the type of probe used to make the measurement.
     *
     * @return <strong>(FXY22067)</strong>-This method returns the data range used for  a table value
     * that represents the type of probe used to make the measurement.<br>
     * e.g. a value of 52 refers to a Deep Blue XBT. A value of -999 is returned
     * when there is no value.
     */
    public static int[] getInstrumentType(int messageType) {
        int start = dataLocations[23][0][messageType];
        int end = dataLocations[23][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY22068)</strong>-This method returns the data range used for  a table value that
     * represents the device that determines the thermistor value in the XBT.
     *
     * @return <strong>(FXY22068)</strong>-This method returns the data range used for  a table value
     * that represents the device that determines the thermistor value in the
     * XBT.<br>
     * e.g. a value of 6 refers to any of the different Sippican MK21 models. A
     * value of -999 is returned when there is no value.
     *
     */
    public static int[] getRecorderType(int messageType) {
        int start = dataLocations[24][0][messageType];
        int end = dataLocations[24][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY2002)</strong>-This method returns the data range used for  a table value that
     * represents the type of anemometer used.
     *
     * @return <strong>(FXY2002)</strong>-This method returns the data range used for  a table value that
     * represents the type of anemometer used. A value of -999 is returned when
     * there is no value.
     */
    public static int[] getWindInstrumentType(int messageType) {
        int start = dataLocations[25][0][messageType];
        int end = dataLocations[25][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY11001)</strong>-This method returns the data range used for  the wind direction in
     * degrees at the time of the measurement.
     *
     * @return <strong>(FXY11001)</strong>-This method returns the data range used for  the wind
     * direction in degrees at the time of the measurement. A value of -999 is
     * returned when there is no value.
     */
    public static int[] getWindDirection(int messageType) {
        int start = dataLocations[26][0][messageType];
        int end = dataLocations[26][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY11002)</strong>-This method returns the data range used for  the wind speed in degrees
     * at the time of the measurement.
     *
     * @return <strong>(FXY11002)</strong>-This method returns the data range used for  the wind speed in
     * degrees at the time of the measurement. A value of -99.9 is returned when
     * there is no value.
     */
    public static int[] getWindSpeed(int messageType) {
        int start = dataLocations[27][0][messageType];
        int end = dataLocations[27][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY12004)</strong>-This method returns the data range used for  the dry bulb temperature
     * at the time of the measurement.
     *
     * @return <strong>(FXY12004)</strong>-This method returns the data range used for  the dry bulb
     * temperature at the time of the measurement. A value of -99.9 is returned
     * when there is no value.
     */
    public static int[] getDryBulbTemperature(int messageType) {
        int start = dataLocations[28][0][messageType];
        int end = dataLocations[28][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY2030)</strong>-This method returns the data range used for  the sea current
     * measurement method.
     *
     * @return <strong>(FXY2030)</strong>-This method returns the data range used for  the sea current
     * measurement method. A value of -999 is returned when there is no value.
     */
    public static int[] getSeaSurfaceCurrentMeasurementMethod(int messageType) {
        int start = dataLocations[29][0][messageType];
        int end = dataLocations[29][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY22004)</strong>-This method returns the data range used for  the sea surface current
     * direction .
     *
     * @return <strong>(FXY22004)</strong>-This method returns the data range used for  the sea surface
     * current direction . A value of -999 is returned when there is no value.
     */
    public static int[] getSeaSurfaceCurrentDirection(int messageType) {
        int start = dataLocations[30][0][messageType];
        int end = dataLocations[30][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY22031)</strong>-This method returns the data range used for  the sea surface current
     * speed
     *
     * @return <strong>(FXY22031)</strong>-This method returns the data range used for  the sea surface
     * current speed A value of -999 is returned when there is no value.
     */
    public static int[] getSeaSurfaceCurrentSpeed(int messageType) {
        int start = dataLocations[31][0][messageType];
        int end = dataLocations[31][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY22063)</strong>-This method returns the data range used for  the total water depth at
     * the location where the measurement was made.
     *
     * @return <strong>(FXY22063)</strong>-This method returns the data range used for  the total water
     * depth at the location where the measurement was made. A value of -999 is
     * returned when there is no value.
     */
    public static int[] getTotalWaterDepth(int messageType) {
        int start = dataLocations[32][0][messageType];
        int end = dataLocations[32][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY1036)</strong>-This method returns the data range used for  the agency in charge of
     * operating the observation platform.
     *
     * @return <strong>(FXY1036)</strong>-This method returns the data range used for  the agency in
     * charge of operating the observation platform. A value of -999 is returned
     * when there is no value.
     */
    public static int[] getAgencyOwner(int messageType) {
        int start = dataLocations[33][0][messageType];
        int end = dataLocations[33][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY22178)</strong>-This method returns the data range used for  a table value that
     * represents the type of launcher used.
     *
     * @return <strong>(FXY22178)</strong>-This method returns the data range used for  a table value
     * that represents the type of launcher used. A value of -999 is returned
     * when there is no value.
     */
    public static int[] getXBTLauncherType(int messageType) {
        int start = dataLocations[34][0][messageType];
        int end = dataLocations[34][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY2171)</strong>-This method returns the data range used for  the serial number of the
     * recorder used.
     *
     * @return <strong>(FXY2171)</strong>-This method returns the data range used for  the serial number
     * of the recorder used. A value of -999 is returned when there is no value.
     */
    public static int[] getXBTRecorderSerialNumber(int messageType) {
        int start = dataLocations[35][0][messageType];
        int end = dataLocations[35][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY4001)</strong>-This method returns the data range used for  the year in which the
     * recorder was manufactured.
     *
     * @return <strong>(FXY4001)</strong>-This method returns the data range used for  the year in which
     * the recorder was manufactured. A value of -999 is returned when there is
     * no value.
     */
    public static int[] getXBTRecorderManufacturedYear(int messageType) {
        int start = dataLocations[36][0][messageType];
        int end = dataLocations[36][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY4002)</strong>-This method returns the data range used for  the month in which the
     * recorder was manufactured.
     *
     * @return <strong>(FXY4002)</strong>-This method returns the data range used for  the month in which
     * the recorder was manufactured. A value of -999 is returned when there is
     * no value.
     */
    public static int[] getXBTRecorderManufacturedMonth(int messageType) {
        int start = dataLocations[37][0][messageType];
        int end = dataLocations[37][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY4003)</strong>-This method returns the data range used for  the day in which the
     * recorder was manufactured.
     *
     * @return <strong>(FXY4003)</strong>-This method returns the data range used for  the day in which
     * the recorder was manufactured. A value of -999 is returned when there is
     * no value.
     */
    public static int[] getXBTRecorderManufacturedDay(int messageType) {
        int start = dataLocations[38][0][messageType];
        int end = dataLocations[38][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY4001)</strong>-This method returns the data range used for  the year the XBT was
     * manufactured.
     *
     * @return <strong>(FXY4001)</strong>-This method returns the data range used for  the year the XBT
     * was manufactured. A value of -999 is returned when there is no value.
     */
    public static int[] getXBTProbeManufacturedYear(int messageType) {
        int start = dataLocations[39][0][messageType];
        int end = dataLocations[39][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY4002)</strong>-This method returns the data range used for  the month in which the XBT
     * was manufactured.
     *
     * @return <strong>(FXY4002)</strong>-This method returns the data range used for  the month in which
     * the XBT was manufactured. A value of -999 is returned when there is no
     * value.
     */
    public static int[] getXBTProbeManufacturedMonth(int messageType) {
        int start = dataLocations[40][0][messageType];
        int end = dataLocations[40][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY4003)</strong>-This method returns the data range used for  the day in which the XBT
     * was manufactured.
     *
     * @return <strong>(FXY4003)</strong>-This method returns the data range used for  the day in which
     * the XBT was manufactured. A value of -999 is returned when there is no
     * value.
     */
    public static int[] getXBTProbeManufacturedDay(int messageType) {
        int start = dataLocations[41][0][messageType];
        int end = dataLocations[41][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY31001B)</strong>-This method returns the data range used for  the number of 40 bit
     * blocks or 5 characters, used to store the rider name.
     *
     * @return <strong>(FXY31001B)</strong>-This method returns the data range used for  the number of 40
     * bit blocks or 5 characters, used to store the rider name. A value of -999
     * is returned when there is no value.
     */
    public static int[] getNumberOfRiderBlocks(int messageType) {
        int start = dataLocations[42][0][messageType];
        int end = dataLocations[42][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY31001B)</strong>-This method returns the data range used for  the number of 40 bit
     * blocks or 5 characters, used to store the riders institution's name.
     *
     * @return <strong>(FXY31001B)</strong>-This method returns the data range used for  the number of 40
     * bit blocks or 5 characters, used to store the riders institution's name.
     * A value of -999 is returned when there is no value.
     */
    public static int[] getNumberOfRiderInstitutionBlocks(int messageType) {
        int start = dataLocations[43][0][messageType];
        int end = dataLocations[43][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY31001B)</strong>-This method returns the data range used for  the number of 40 bit
     * blocks or 5 characters, used to store the rider's email address.
     *
     * @return <strong>(FXY31001B)</strong>-This method returns the data range used for  the number of 40
     * bit blocks or 5 characters, used to store the rider's email address. A
     * value of -999 is returned when there is no value.
     */
    public static int[] getNumberOfRiderEmailBlocks(int messageType) {
        int start = dataLocations[44][0][messageType];
        int end = dataLocations[44][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY31001B)</strong>-This method returns the data range used for  the number of 40 bit
     * blocks or 5 characters, used to store the rider's phone number.
     *
     * @return <strong>(FXY31001B)</strong>-This method returns the data range used for  the number of 40
     * bit blocks or 5 characters, used to store the rider's phone number. A
     * value of -999 is returned when there is no value.
     */
    public static int[] getNumberOfRiderPhoneBlocks(int messageType) {
        int start = dataLocations[45][0][messageType];
        int end = dataLocations[45][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY100000)</strong>-Delayed Replicator
     *
     * @return <strong>(FXY100000)</strong>-Delayed Replicator! Different from
     * BUFR. The number contained within is the number of following consecutive
     * fields to replicate. This field must be followed by FXY31200 to identify
     * how many groups of replicated fields follow. Always delayed replication.
     * value of -999 is returned when there is no value.
     */
    public static int[] getNumberOfRepeatedFields(int messageType) {
        int start = dataLocations[46][0][messageType];
        int end = dataLocations[46][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY31200)</strong>-This method returns the data range used for  the number of temperature
     * measurement points recorded.
     *
     * @return <strong>(FXY31200)</strong>-This method returns the data range used for  the number of
     * temperature measurement points recorded. A value of -999 is returned when
     * there is no value.
     */
    public static int[] getTimesReplicated(int messageType) {
        int start = dataLocations[47][0][messageType];
        int end = dataLocations[47][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY22042S)</strong>-This method returns the data range used for  the SST or the first
     * temperature measurement made.
     *
     * @return <strong>(FXY22042S)</strong>-This method returns the data range used for  the SST or the
     * first temperature measurement made. A value of -13.99 is returned when
     * there is no value.
     */
    public static int[] getSeaTemperature(int messageType) {
        int start = dataLocations[48][0][messageType];
        int end = dataLocations[48][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY7062S)</strong>-This method returns the data range used for  the depth below the
     * sea/water surface
     *
     * @return <strong>(FXY7062S)</strong>-This method returns the data range used for  the depth below
     * the sea/water surface A value of -999 is returned when there is no value.
     */
    public static int[] getSeaDepth(int messageType) {
        int start = dataLocations[49][0][messageType];
        int end = dataLocations[49][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY22042S)</strong>-This method returns the data range used for  an array containing the
     * temperature measurements made.
     *
     * @return <strong>(FXY22042S)</strong>-This method returns the data range used for  an array
     * containing the temperature measurements made. An empty array is returned
     * when there are no values.
     */
    public static int[] getTemperaturePoints(int messageType) {
        int start = dataLocations[50][0][messageType];
        int end = dataLocations[50][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY205030A)</strong>-This method returns the data range used for  the rider's name.
     *
     * @return <strong>(FXY205030A)</strong>-This method returns the data range used for  the rider's
     * name. A value of "NONE" is returned when there is no value.
     */
    public static int[] getRiderNames(int messageType) {
        int start = dataLocations[52][0][messageType];
        int end = dataLocations[52][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY205030A)</strong>-This method returns the data range used for  the rider's email.
     *
     * @return <strong>(FXY205030A)</strong>-This method returns the data range used for  the rider's
     * email. A value of "NONE" is returned when there is no value.
     */
    public static int[] getRiderEmails(int messageType) {
        int start = dataLocations[53][0][messageType];
        int end = dataLocations[53][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY205030A)</strong>-This method returns the data range used for  the rider's
     * institution.
     *
     * @return <strong>(FXY205030A)</strong>-This method returns the data range used for  the rider's
     * institution. A value of "NONE" is returned when there is no value.
     */
    public static int[] getRiderInstituions(int messageType) {
        int start = dataLocations[54][0][messageType];
        int end = dataLocations[54][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }

    /**
     * <strong>(FXY205030A)</strong>-This method returns the data range used for  the rider's phone
     * number.
     *
     * @return <strong>(FXY205030A)</strong>-This method returns the data range used for  the rider's
     * phone number. A value of "NONE" is returned when there is no value.
     */
    public static int[] getRiderPhones(int messageType) {
        int start = dataLocations[55][0][messageType];
        int end = dataLocations[55][1][messageType];
        int[] startEnd = {start, end};
        return startEnd;
    }
}// end class
