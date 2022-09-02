/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binfileutils;

/**
 *
 * @author pedro
 */
public final class SurfaceCurrentInstrument {
    
    public static final int RESERVED = 0;
    public static final String RESERVED_DESCRIPTION
            = "Reserved";    

    public static final int ADCP = 1;
    public static final String ADCP_DESCRIPTION
            = "ADCP Acoustic Doppler Current Profiler";

    public static final int GEK = 2;
    public static final String GEK_DESCRIPTION
            = "GEK Geomagnetic ElectroKinetograph";

    public static final int DRIFT_FIX_3_6 = 3;
    public static final String DRIFT_FIX_3_6_DESCRIPTION
            = "Ship's set and drift determined by fixes 3-6 hours apart";

    public static final int DRIFT_FIX_6_12 = 4;
    public static final String DRIFT_FIX_6_12_DESCRIPTION
            = "Ship's set and drift determined by fixes > 6 hours but < 12 hours apart";

    public static final int DRIFT_OF_BUOY = 5;
    public static final String DRIFT_OF_BUOY_DESCRIPTION = "Drift of buoy";
    
    public static final int MISSING_VALUE = 7;
    public static final String MISSING_VALUE_DESCRIPTION = "Missing Value";    

    
    private static final int[] surfaceCurrentInstrumentList = {
        RESERVED,
        ADCP,
        GEK,
        DRIFT_FIX_3_6,
        DRIFT_FIX_6_12,
        DRIFT_OF_BUOY,
        RESERVED,
        MISSING_VALUE

    };

    
    
    /**
     * This method returns an integer array of the different surface current instruments.
     *
     * @return This method returns an integer array of the different surface current instruments
     * types
     */
    public static int[] getSurfaceCurrentInstrumentList() {

        return surfaceCurrentInstrumentList;

    }//end getSurfaceCurrentInstrumentList    
    
    public static String getInstrumentDescription(int code) {

        String description = "Missing";
        switch (code) {

            case RESERVED:
                description = RESERVED_DESCRIPTION;
                break;
                
            case ADCP:
                description = ADCP_DESCRIPTION;
                break;

            case GEK:
                description = GEK_DESCRIPTION;
                break;

            case DRIFT_FIX_3_6:
                description = DRIFT_FIX_3_6_DESCRIPTION;
                break;

            case DRIFT_FIX_6_12:
                description = DRIFT_FIX_6_12_DESCRIPTION;
                break;

            case DRIFT_OF_BUOY:
                description = DRIFT_OF_BUOY_DESCRIPTION;
                break;

            case MISSING_VALUE:
                description = MISSING_VALUE_DESCRIPTION;
                break;

        }

        return description;
    }
}
