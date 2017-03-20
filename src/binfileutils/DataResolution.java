/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binfileutils;

/**
 * This class contains constants that describe the resolution of the XBT data
 *
 * @author Pedro Pena
 * @version 1.0
 *
 */
public final class DataResolution {

    public static final int FULL_RESOLUTION = 1;
    public static final String FULL_RESOLUTION_DESCRIPTION = "Full Resolution";
    public static final int METER_RESOLUTION = 2;
    public static final String METER_RESOLUTION_DESCRIPTION = "2 Meter Resolution";
    public static final int INFLECTION_POINTS = 3;
    public static final String INFLECTION_POINTS_DESCRIPTION = "Inflection Points";
    
    
    
    
    /**
     * <strong>(FXY48303)</strong>-This method returns a String representation
     * of the description for the data resolution recorded in the profile.
     * This method accepts an int as a parameter. The parameter is the value
     * of datatype field in the XBT profile.
     *
     * @return <strong>(FXY48303)</strong>-This method returns a String representation
     * of the description for the data resolution recorded in the profile.
     * This method accepts an int as a parameter. The parameter is the value
     * of datatype field in the XBT profile.
     * @param dataType the resolution of the profile
     */
    
    public static final String getDataResolutionDescription(int dataType) {
        String description = "Unknown";
        switch (dataType) {
            case FULL_RESOLUTION:
                description = FULL_RESOLUTION_DESCRIPTION;
                break;
            case METER_RESOLUTION:
                description = METER_RESOLUTION_DESCRIPTION;
                break;
            case INFLECTION_POINTS:
                description = INFLECTION_POINTS_DESCRIPTION;
                break;
        }// end switch

        return description;

    }

}
