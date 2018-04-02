package binfileutils;

import static binfileutils.Agency.getAgencyDescription;
import static binfileutils.DataQuality.getDataQualityDescription;
import static binfileutils.DataResolution.getDataResolutionDescription;
import static binfileutils.Launchers.getLauncherDescription;
import static binfileutils.XBTProbe.getCoefficientA;
import static binfileutils.XBTProbe.getCoefficientB;
import static binfileutils.XBTProbe.getMaxDepth;
import static binfileutils.XBTProbe.getProbeDescription;
import static binfileutils.XBTRecorder.getRecorderDescription;

/**
 * This class contains routines to convert a SEAS XBT temperature xBTprofile
 * into various formats
 *
 * @author Pedro Pena
 * @version 1.0
 *
 */
public class FormatConverter {

    XBTProfile xBTprofile;
    String prettyLat;
    String prettyLon;

    /**
     * The constructor accepts an argument of type XBTProfile
     *
     * @param xBTprofile XBTProfile object
     */
    public FormatConverter(XBTProfile xBTprofile) {
        this.xBTprofile = xBTprofile;

    }//end constructor

    /**
     * This method returns a String containing the xBTprofile information using
     * the SEAS ASCII format.
     *
     * @return This method returns a String containing the xBTprofile
     * information using the SEAS ASCII format.
     */
    public String getASCII() {
        String tmp = "";
        double[][] depthsAndTemps;               //array of doubles that holds depths & temperature measurements
        DepthCalculator dc = new DepthCalculator(xBTprofile);
        depthsAndTemps = dc.getDepthsAndTemperaturePoints();

        tmp += "Call Sign                      | " + xBTprofile.getCallsign() + "\n";
        tmp += "Latitude                       | " + decimalDegreesLatToDMSAOML(xBTprofile.getLatitude()) + "\n";
        tmp += "Longitude                      | " + decimalDegreesLonToDMSAOML(xBTprofile.getLongitude()) + "\n";
        tmp += "Transect Name                  | " + xBTprofile.getSoopLine() + "\n";
        tmp += "Transect Number                | " + xBTprofile.getTransectNumber() + "\n";
        tmp += "Sequence Number                | " + xBTprofile.getSequenceNumber() + "\n";
        tmp += "Year                           | " + String.format("%02d", xBTprofile.getYear()) + "\n";
        tmp += "Month                          | " + String.format("%02d", xBTprofile.getMonth()) + "\n";
        tmp += "Day                            | " + String.format("%02d", xBTprofile.getDay()) + "\n";
        tmp += "Hour                           | " + String.format("%02d", xBTprofile.getHour()) + "\n";
        tmp += "Minute                         | " + String.format("%02d", xBTprofile.getMinute()) + "\n";
        tmp += "Ship Name                      | " + xBTprofile.getShipName() + "\n";
        tmp += "IMO Number                     | " + xBTprofile.getLloyds() + "\n";
        tmp += "SEAS ID                        | " + Integer.toHexString(xBTprofile.getUniqueTag()).toUpperCase() + "\n";
        tmp += "SEAS Version                   | " + xBTprofile.getSeasVersion() + "\n";
        tmp += "Probe Serial Number            | " + xBTprofile.getProbeSerialNumber() + "\n";
        tmp += "Probe Manufacture Date         | " + String.format("%02d/%02d/%04d\n",
                xBTprofile.getXBTProbeManufacturedMonth(),
                xBTprofile.getXBTProbeManufacturedDay(),
                xBTprofile.getXBTProbeManufacturedYear());
        tmp += "Data Type                      | " + xBTprofile.getThisDataIs() + " (" + getDataResolutionDescription(xBTprofile.getThisDataIs()) + ")\n";
        tmp += "Data Quality                   | " + xBTprofile.getDataQuality() + " (" + getDataQualityDescription(xBTprofile.getDataQuality()) + ")\n";
        tmp += "Deployment Height (meters)     | " + String.format("%4.2f", xBTprofile.getLaunchHeight()) + "\n";
        tmp += "Ship Direction                 | " + String.format("%03d", (int) xBTprofile.getShipDirection()) + "\n";
        tmp += "Ship Speed (knots)             | " + String.format("%05.2f", xBTprofile.getShipSpeed() * 1.94384) + "\n";
        tmp += "Instrument Type                | " + getProbeDescription(xBTprofile.getInstrumentType())
                + " (Code " + xBTprofile.getInstrumentType() + ")\n";
        tmp += "Recorder Type                  | " + getRecorderDescription(xBTprofile.getRecorderType())
                + " (Code " + xBTprofile.getRecorderType() + ")\n";
        tmp += "Wind Instrument Type           | " + xBTprofile.getWindInstrumentType() + "\n";
        tmp += "Wind Direction                 | " + xBTprofile.getWindDirection() + "\n";
        tmp += "Wind Speed (knots)             | " + xBTprofile.getWindSpeed() + "\n";
        tmp += "Dry Bulb Temperature (celsius) | " + String.format("%05.2f", xBTprofile.getDryBulbTemperature() - 273.15) + "\n";
        tmp += "Current Measurement Method     | " + xBTprofile.getSeaSurfaceCurrentMeasurementMethod() + "\n";
        tmp += "Current Direction              | " + xBTprofile.getSeaSurfaceCurrentDirection() + "\n";
        tmp += "Current Speed (knots)          | " + xBTprofile.getSeaSurfaceCurrentSpeed() + "\n";
        tmp += "Total Water Depth (meters)     | " + xBTprofile.getTotalWaterDepth() + "\n";
        tmp += "XBT Launcher Type              | " + getLauncherDescription(xBTprofile.getXBTLauncherType()) + "\n";
        tmp += "XBT Recorder Serial Number     | " + xBTprofile.getXBTRecorderSerialNumber() + "\n";
        tmp += "XBT Recorder Manufacture Date  | " + String.format("%02d/%02d/%04d\n",
                xBTprofile.getXBTRecorderManufacturedMonth(),
                xBTprofile.getXBTRecorderManufacturedDay(),
                xBTprofile.getXBTRecorderManufacturedYear());
        tmp += "Agency in charge of Operation  | " + getAgencyDescription(xBTprofile.getAgencyOwner()) + "\n";
        tmp += "Ship Rider                     | " + xBTprofile.getRiderNames() + "\n";
        tmp += "Ship Rider Institution         | " + xBTprofile.getRiderInstitutions() + "\n";
        tmp += "Ship Rider Email               | " + xBTprofile.getRiderEmails() + "\n";
        tmp += "Ship Rider Telephone Number    | " + xBTprofile.getRiderPhones() + "\n";
        tmp += "===================================================================\n";
        tmp += "Full Resolution Values\n";
        tmp += "   Depth       Temperature        \n";

        for (double[] depthsAndTemp : depthsAndTemps) {
            tmp += String.format(" %7.2f       %5.2f\n", depthsAndTemp[0], depthsAndTemp[1]);
        } //end for        

        return tmp;
    }//end mehtod

    public String getASCIIEDF(String fileName,double salinity) {
        double[][] depthsAndTemps;               //array of doubles that holds depths & temperature measurements
        DepthCalculator dc = new DepthCalculator(xBTprofile);
        depthsAndTemps = dc.getDepthsAndTemperaturePoints();
        String tmp = "";
        tmp += "// Amverseas EXPORT DATA FILE  (EDF)\n";
        tmp += "// File Information\n";
        tmp += "Raw Data Filename:  " + fileName + "\n";
        tmp += "// System Information\n";
        tmp += "Units            :  Metric\n";
        tmp += "// Probe Information\n";
        tmp += "Probe Type       :  " + getProbeDescription(xBTprofile.getInstrumentType()) + "\n";
        tmp += "Terminal Depth   :  " + getMaxDepth(xBTprofile.getInstrumentType()) + " m\n";
        tmp += "Depth Equation   :  Standard\n";
        tmp += "Depth Coeff. 1   :  0.0\n";
        tmp += "Depth Coeff. 2   :  " + String.format("%f", getCoefficientA(xBTprofile.getInstrumentType())) + "\n";
        tmp += "Depth Coeff. 3   :  " + String.format("%f", getCoefficientB(xBTprofile.getInstrumentType()) * .001) + "\n";
        tmp += "Depth Coeff. 4   :  0.0\n";
        tmp += "// Launch Information\n";
        tmp += "Num Info Fields  :  6\n";
        tmp += "Date of Launch   :  " + String.format("%02d/%02d/%04d\n",
                xBTprofile.getMonth(),
                xBTprofile.getDay(),
                xBTprofile.getYear());
        tmp += "Time of Launch   :  " + String.format("%02d:%02d:%02d\n",
                xBTprofile.getHour(),
                xBTprofile.getMinute(), 0);
        tmp += "Sequence Number  :  " + xBTprofile.getSequenceNumber() + "\n";;
        tmp += "Latitude         :  " + decimalDegreesLatToDMSEDF(xBTprofile.getLatitude()) + "\n";;
        tmp += "Longitude        :  " + decimalDegreesLonToDMSEDF(xBTprofile.getLongitude()) + "\n";;
        tmp += "Serial Number    :  " + xBTprofile.getXBTRecorderSerialNumber() + "\n";
        tmp += "// Memo\n";
        tmp += xBTprofile.getShipName() + "\n";;
        tmp += "// Hardware\n";
        tmp += "Recorder Device  : " + getRecorderDescription(xBTprofile.getRecorderType()) + "\n";
        tmp += "// Information - XBT\n";
        tmp += "Salinity          :  " + String.format("%5.2f", salinity) + " ppt\n";
        tmp += "// Post-Processing\n";
        tmp += "Operations       :  None\n";
        tmp += "// Data Fields\n";
        tmp += "Num Data Fields   :  5\n";
        tmp += "Field1            :  Time (sec)\n";
        tmp += "Field2            :  Resistance (ohms)\n";
        tmp += "Field3            :  Depth (m)\n";
        tmp += "Field4            :  Temperature (C)\n";
        tmp += "Field5            :  Sound Velocity (m/s)\n";
        tmp += "// Data\n";
        PressureCalculator pc = new PressureCalculator();
        SoundSpeedInSeaWater ss = new SoundSpeedInSeaWater();
        double pressure;
        double sv ;
        double temp;
        double depth;
        double [] resistances = xBTprofile.getResistancePoints();
        double resistance;
        for (int i = 0; i < depthsAndTemps.length ; i++) {
            depth = dc.getMeasurementDepth(i-1);
            temp = depthsAndTemps[i][1];
            pressure = pc.getPressure(depth, xBTprofile.getLatitude());
            resistance = -9999.99;
            if (resistances != null && resistances.length > i )
            resistance =resistances[i] ;
            sv = ss.getSoundSpeedChenMillero(pressure, salinity, temp);
            tmp += String.format("%5.1f %8.3f    %7.2f   %5.2f   %7.2f",(double)i/10.00,resistance, depth, temp , sv).trim()+"\n";
        } //end for 
        return tmp;
    }//ENDGETasciiedf

    private String decimalDegreesLatToDMSAOML(double lat) {
        double tmp = Math.abs(lat);
        int x = (int) tmp;
        double y = 60 * (tmp - (double) x);
        String dir = "N";
        if (lat < 0) {
            dir = "S";
        }//end if
        return String.format("%02d %05.2f " + dir, x, y);
    }

    private String decimalDegreesLonToDMSAOML(double lon) {
        double tmp = Math.abs(lon);
        int x = (int) tmp;
        double y = 60 * (tmp - (double) x);
        String dir = "E";
        if (lon < 0) {
            dir = "W";
        }//end if
        return String.format("%03d %05.2f " + dir, x, y);
    }

    private String decimalDegreesLatToDMSEDF(double lat) {
        double tmp = Math.abs(lat);
        int x = (int) tmp;
        double y = 60 * (tmp - (double) x);
        String dir = "N";
        if (lat < 0) {
            dir = "S";
        }//end if
        return String.format("%02d %07.4f " + dir, x, y);
    }

    private String decimalDegreesLonToDMSEDF(double lon) {
        double tmp = Math.abs(lon);
        int x = (int) tmp;
        double y = 60 * (tmp - (double) x);
        String dir = "E";
        if (lon < 0) {
            dir = "W";
        }//end if
        return String.format("%03d %07.4f " + dir, x, y);
    }

}
