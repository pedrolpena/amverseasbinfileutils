/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binfileutils;

/**
 * This class contains constants that describe the data quality of the XBT data
 *
 * @author Pedro Pena
 * @version 1.0
 *
 */
public final class DataQuality {

    public static final int DATA_NOT_SUSPECT = 0;
    public static final String DATA_NOT_SUSPECT_DESCRIPTION = "Data Not Suspect";

    public static final int DATA_SLIGHTLY_SUSPECT = 1;
    public static final String DATA_SLIGHTLY_SUSPECT_DESCRIPTION = "Data Slightly Suspect";

    public static final int DATA_HIGHLY_SUSPECT = 2;
    public static final String DATA_HIGHLY_SUSPECT_DESCRIPTION = "Data Highly Suspect";

    public static final int DATA_UNFIT_FOR_USE = 3;
    public static final String DATA_UNFIT_FOR_USE_DESCRIPTION = "Data Unfit For Use";

        /**
     * <strong>(FXY33003)</strong>-This method returns a String representation
     * of the data quality for the data resolution recorded in the profile.
     * This method accepts an int as a parameter. The parameter is the value
     * of dataquality field in the XBT profile.
     *
     * @return <strong>(FXY33003)</strong>-This method returns a String representation
     * of the data quality for the data resolution recorded in the profile.
     * This method accepts an int as a parameter. The parameter is the value
     * of dataquality field in the XBT profile.
     * @param dataType the quality assigned to the profile.
     */
    public static final String getDataQualityDescription(int dataType) {
        String description = "Unknown";
        switch (dataType) {
            case DATA_NOT_SUSPECT:
                description = DATA_NOT_SUSPECT_DESCRIPTION;
                break;
            case DATA_SLIGHTLY_SUSPECT:
                description = DATA_SLIGHTLY_SUSPECT_DESCRIPTION;
                break;
            case DATA_HIGHLY_SUSPECT:
                description = DATA_HIGHLY_SUSPECT_DESCRIPTION;
                break;
            case DATA_UNFIT_FOR_USE:
                description = DATA_UNFIT_FOR_USE_DESCRIPTION;
                break;
        }// end switch

        return description;

    }

}
