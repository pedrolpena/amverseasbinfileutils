package binfileutils;

import static binfileutils.DataQuality.getDataQualityDescription;
import static binfileutils.DataResolution.getDataResolutionDescription;
import static binfileutils.XBTProbe.getProbeDescription;
import static binfileutils.XBTRecorder.getRecorderDescription;

/**
 * This class contains routines to convert a SEAS XBT temperature xBTprofile into
 various formats
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
     * @param xBTprofile
     */
    public FormatConverter(XBTProfile xBTprofile) {
        this.xBTprofile = xBTprofile;

    }//end constructor

    /**
     * This method returns a String containing the xBTprofile information using the
 SEAS ASCII format.
     *
     * @return This method returns a String containing the xBTprofile information
 using the SEAS ASCII format.
     */
    public String getASCII() {
        String tmp = "";
        double[][] depthsAndTemps;               //array of doubles that holds depths & temperature measurements
        DepthCalculator dc = new DepthCalculator(xBTprofile);
        depthsAndTemps=dc.getDepthsAndTemperaturePoints();
       
        tmp += "Call Sign                      | " + xBTprofile.getCallsign() + "\n";
        tmp += "Latitude                       | " + decimalDegreesLatToDMS(xBTprofile.getLatitude()) + "\n";
        tmp += "Longitude                      | " + decimalDegreesLonToDMS(xBTprofile.getLongitude()) + "\n";
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
        tmp += "Data Type                      | " + xBTprofile.getThisDataIs() + " ("+ getDataResolutionDescription(xBTprofile.getThisDataIs())+")\n";
        tmp += "Data Quality                   | " + xBTprofile.getDataQuality() + " ("+ getDataQualityDescription(xBTprofile.getDataQuality())+")\n";
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
        tmp += "Dry Bulb Temperature (celsius) | " + xBTprofile.getDryBulbTemperature() + "\n";
        tmp += "Current Measurement Method     | " + xBTprofile.getSeaSurfaceCurrentMeasurementMethod() + "\n";
        tmp += "Current Direction              | " + xBTprofile.getSeaSurfaceCurrentDirection() + "\n";
        tmp += "Current Speed (knots)          | " + xBTprofile.getSeaSurfaceCurrentSpeed() + "\n";
        tmp += "Total Water Depth (meters)     | " + xBTprofile.getTotalWaterDepth() + "\n";
        tmp += "===================================================================\n";
        tmp += "Full Resolution Values\n";
        tmp += "   Depth       Temperature        \n";

        for (double[] depthsAndTemp : depthsAndTemps) {
            tmp += String.format(" %7.2f       %5.2f\n", depthsAndTemp[0], depthsAndTemp[1]);
        } //end for        

        return tmp;
    }//end mehtod

    private String decimalDegreesLatToDMS(double lat) {
        double tmp = Math.abs(lat);
        int x = (int) tmp;
        double y = 60 * (tmp - (double) x);
        String dir = "N";
        if (lat < 0) {
            dir = "S";
        }//end if
        return String.format("%02d %05.2f " + dir, x, y);
    }

    private String decimalDegreesLonToDMS(double lon) {
        double tmp = Math.abs(lon);
        int x = (int) tmp;
        double y = 60 * (tmp - (double) x);
        String dir = "E";
        if (lon < 0) {
            dir = "W";
        }//end if
        return String.format("%03d %05.2f " + dir, x, y);
    }

}
