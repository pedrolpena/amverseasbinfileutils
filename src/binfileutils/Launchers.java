/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binfileutils;

/**
 * This class holds holds the constants that describe the launchers used
 *
 * @author pena
 */
public final class Launchers {

    public static final int UNKNOWN = 0;
    public static final String UNKNOWN_DESCRIPTION = "Unknown";
    public static final int LM_2A_DECK_MOUNTED = 1;
    public static final String LM_2A_DECK_MOUNTED_DESCRIPTION = "LM-2A Deck-mounted";
    public static final int LM_3A_HAND_HELD = 2;
    public static final String LM_3A_HAND_HELD_DESCRIPTION = "LM-3A Hand-Held";
    public static final int LM_4A_THRU_HULL = 3;
    public static final String LM_4A_THRU_HULL_DESCRIPTION = "LM-4A Thru-Hull";
    public static final int AL_12_TSK_AUTOLAUNCHER = 10;
    public static final String AL_12_TSK_AUTOLAUNCHER_DESCRIPTION = "AL-12 TSK Autolauncher (up to 12 Probes)";
    public static final int SIO_XBT_AUTOLAUNCHER = 20;
    public static final String SIO_XBT_AUTOLAUNCHER_DESCRIPTION = "SIO XBT Autolauncher (up to 6 probes)";
    public static final int AOML_XBT_V6_AUTOLAUNCHER = 30;
    public static final String AOML_XBT_V6_AUTOLAUNCHER_DESCRIPTION = "AOML XBT V6 Autolauncher (up to 6 Deep Blue probes)";
    public static final int AOML_XBT_V8_0_AUTOLAUNCHER = 31;
    public static final String AOML_XBT_V8_0_AUTOLAUNCHER_DESCRIPTION = "AOML XBT V8.0 Autolauncher (up to 8 Deep Blue probes)";
    public static final int AOML_XBT_V8_1_AUTOLAUNCHER = 32;
    public static final String AOML_XBT_V8_1_AUTOLAUNCHER_DESCRIPTION = "AOML XBT V8.1 Autolauncher (up to 8 Deep Blue and Fast Deep probes)";
    public static final int CSIRO_DEVIL_AUTOLAUNCHER = 90;
    public static final String CSIRO_DEVIL_AUTOLAUNCHER_DESCRIPTION = "CSIRO Devil Autolauncher";
    public static final int TURO_CSIRO_QUOLL_AUTOLAUNCHER = 91;
    public static final String TURO_CSIRO_QUOLL_AUTOLAUNCHER_DESCRIPTION = "TURO/CSIRO Quoll Autolauncher";
    public static final int MFSTEP_AUTOLAUNCHER = 100;
    public static final String MFSTEP_AUTOLAUNCHER_DESCRIPTION = "MFSTEP Autolauncher (Mediterranean)";
    public static final int MISSING = 255;
    public static final String MISSING_DESCRIPTION = "Missing";

    
    private static int[]  launcherList= {
        UNKNOWN,
        LM_2A_DECK_MOUNTED,
        LM_3A_HAND_HELD,
        LM_4A_THRU_HULL,
        AL_12_TSK_AUTOLAUNCHER,
        SIO_XBT_AUTOLAUNCHER,
        AOML_XBT_V6_AUTOLAUNCHER,
        AOML_XBT_V8_0_AUTOLAUNCHER,
        AOML_XBT_V8_1_AUTOLAUNCHER,
        CSIRO_DEVIL_AUTOLAUNCHER,
        TURO_CSIRO_QUOLL_AUTOLAUNCHER,
        MFSTEP_AUTOLAUNCHER,
        MISSING
    };
    
    
    /**
     * This method returns an integer array of the different launchers.
     *
     * @return This method returns an integer array of the different launcher
     * types
     */
    public static int[] getAgencylist() {

        return launcherList;

    }//end getLauncherList

    /**
     * This method return the launcher descriptions
     * @param launcher the value assigne to the type of launcher
     * @return the descriptio of the launcher
     */
    
    public static final String getLauncherDescription(int launcher) {
        String description = "Missing value";
        switch (launcher) {

            case UNKNOWN:
                description = UNKNOWN_DESCRIPTION;
                break;
            case LM_2A_DECK_MOUNTED:
                description = LM_2A_DECK_MOUNTED_DESCRIPTION;
                break;
            case LM_3A_HAND_HELD:
                description = LM_3A_HAND_HELD_DESCRIPTION;
                break;
            case LM_4A_THRU_HULL:
                description = LM_4A_THRU_HULL_DESCRIPTION;
                break;
            case AL_12_TSK_AUTOLAUNCHER:
                description = AL_12_TSK_AUTOLAUNCHER_DESCRIPTION;
                break;
            case SIO_XBT_AUTOLAUNCHER:
                description = SIO_XBT_AUTOLAUNCHER_DESCRIPTION;
                break;
            case AOML_XBT_V6_AUTOLAUNCHER:
                description = AOML_XBT_V6_AUTOLAUNCHER_DESCRIPTION;
                break;
            case AOML_XBT_V8_0_AUTOLAUNCHER:
                description = AOML_XBT_V8_0_AUTOLAUNCHER_DESCRIPTION;
                break;
            case AOML_XBT_V8_1_AUTOLAUNCHER:
                description = AOML_XBT_V8_1_AUTOLAUNCHER_DESCRIPTION;
                break;
            case CSIRO_DEVIL_AUTOLAUNCHER:
                description = CSIRO_DEVIL_AUTOLAUNCHER_DESCRIPTION;
                break;
            case TURO_CSIRO_QUOLL_AUTOLAUNCHER:
                description = TURO_CSIRO_QUOLL_AUTOLAUNCHER_DESCRIPTION;
                break;
            case MFSTEP_AUTOLAUNCHER:
                description = MFSTEP_AUTOLAUNCHER_DESCRIPTION;
                break;
            case MISSING:
                description = MISSING_DESCRIPTION;
                break;
        }
        return description;
    }

}
