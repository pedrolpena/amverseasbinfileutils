package binfileutils;

import static binfileutils.DataQuality.getDataQualityDescription;
import static binfileutils.DataResolution.getDataResolutionDescription;
import static binfileutils.XBTProbe.getProbeDescription;
import static binfileutils.XBTRecorder.getRecorderDescription;

/**
 * This class contains routines to convert a SEAS XBT temperature profile into
 * various formats
 *
 * @author Pedro Pena
 * @version 1.0
 *
 */
public class FormatConverter {

    BinDecoder profile;
    String prettyLat;
    String prettyLon;

    /**
     * The constructor accepts an argument of type BinDecoder
     *
     */
    public FormatConverter(BinDecoder profile) {
        this.profile = profile;

    }//end constructor

    /**
     * This method returns a String containg the profile information using the
     * SEAS ASCII format.
     *
     * @return This method returns a String containg the profile information
     * using the SEAS ASCII format.
     */
    public String getASCII() {
        String tmp = "";
        double[] temps;               //array of doubles that holds temperature measurements
        int numberOfMeasurements;
        double[] depths;             //array of doubles that holds the depths
        temps = profile.getTemperaturePoints();
        numberOfMeasurements = temps.length;
        DepthCalculator dc = new DepthCalculator(profile.getRecorderType(), profile.getInstrumentType(), numberOfMeasurements);
        depths = dc.getMeasurementDepths();
        tmp += "Call Sign                      | " + profile.getCallsign() + "\n";
        tmp += "Latitude                       | " + decimalDegreesLatToDMS(profile.getLatitude()) + "\n";
        tmp += "Longitude                      | " + decimalDegreesLonToDMS(profile.getLongitude()) + "\n";
        tmp += "Transect Name                  | " + profile.getSoopLine() + "\n";
        tmp += "Transect Number                | " + profile.getTransectNumber() + "\n";
        tmp += "Sequence Number                | " + profile.getSequenceNumber() + "\n";
        tmp += "Year                           | " + String.format("%02d", profile.getYear()) + "\n";
        tmp += "Month                          | " + String.format("%02d", profile.getMonth()) + "\n";
        tmp += "Day                            | " + String.format("%02d", profile.getDay()) + "\n";
        tmp += "Hour                           | " + String.format("%02d", profile.getHour()) + "\n";
        tmp += "Minute                         | " + String.format("%02d", profile.getMinute()) + "\n";
        tmp += "Ship Name                      | " + profile.getShipName() + "\n";
        tmp += "IMO Number                     | " + profile.getLloyds() + "\n";
        tmp += "SEAS ID                        | " + Integer.toHexString(profile.getUniqueTag()).toUpperCase() + "\n";
        tmp += "SEAS Version                   | " + profile.getSeasVersion() + "\n";
        tmp += "Probe Serial Number            | " + profile.getProbeSerialNumber() + "\n";
        tmp += "Probe Manufacture Date         | " + String.format("%02d/%02d/%04d\n",
                profile.getXBTProbeManufacturedMonth(),
                profile.getXBTProbeManufacturedDay(),
                profile.getXBTProbeManufacturedYear());
        tmp += "Data Type                      | " + profile.getThisDataIs() + " ("+ getDataResolutionDescription(profile.getThisDataIs())+")\n";
        tmp += "Data Quality                   | " + profile.getDataQuality() + " ("+ getDataQualityDescription(profile.getDataQuality())+")\n";
        tmp += "Deployment Height (meters)     | " + String.format("%4.2f", profile.getLaunchHeight()) + "\n";
        tmp += "Ship Direction                 | " + String.format("%03d", (int) profile.getShipDirection()) + "\n";
        tmp += "Ship Speed (knots)             | " + String.format("%05.2f", profile.getShipSpeed() * 1.94384) + "\n";
        tmp += "Instrument Type                | " + getProbeDescription(profile.getInstrumentType())
                + " (Code " + profile.getInstrumentType() + ")\n";
        tmp += "Recorder Type                  | " + getRecorderDescription(profile.getRecorderType())
                + " (Code " + profile.getRecorderType() + ")\n";
        tmp += "Wind Instrument Type           | " + profile.getWindInstrumentType() + "\n";
        tmp += "Wind Direction                 | " + profile.getWindDiretion() + "\n";
        tmp += "Wind Speed (knots)             | " + profile.getWindSpeed() + "\n";
        tmp += "Dry Bulb Temperature (celsius) | " + profile.getDryBulbTemperature() + "\n";
        tmp += "Current Measurement Method     | " + profile.getSeaSurfaceCurrentMeasurementMethod() + "\n";
        tmp += "Current Direction              | " + profile.getSeaSurfaceCurrentDirection() + "\n";
        tmp += "Current Speed (knots)          | " + profile.getSeaSurfaceCurrentSpeed() + "\n";
        tmp += "Total Water Depth (meters)     | " + profile.getTotalWaterDepth() + "\n";
        tmp += "===================================================================\n";
        tmp += "Full Resolution Values\n";
        tmp += "   Depth       Temperature        \n";

        for (int i = 0; i < depths.length; i++) {
            tmp += String.format(" %7.2f       %5.2f\n", depths[i], temps[i]);
        }//end for        

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
