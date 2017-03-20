package binfileutils;

/**
 * This class contains constants that hold the value for the type of XBT Probe
 * , the A and B coefficients used in the XBT fall rate equation, The Maximum 
 * Depth for the probe and a Description of the probe. There are methods to 
 * get the vales for each probe type.
 *
 * @author Pedro Pena
 * @version 1.0
 *
 */
public final class XBTProbe {

    public static final int SIPPICAN_T4_OLD = 1;
    public static final double SIPPICAN_T4_OLD_COEFFICIENT_A = 6.472;
    public static final double SIPPICAN_T4_OLD_COEFFICIENT_B = -2.16;
    public static final double SIPPICAN_T4_OLD_MAX_DEPTH = 460.00;
    public static final String SIPPICAN_T4_OLD_DESCRIPTION = "Sippican T-4";

    public static final int SIPPICAN_T4 = 2;
    public static final double SIPPICAN_T4_COEFFICIENT_A = 6.691;
    public static final double SIPPICAN_T4_COEFFICIENT_B = -2.25;
    public static final double SIPPICAN_T4_MAX_DEPTH = 460.00;
    public static final String SIPPICAN_T4_DESCRIPTION = "Sippican T-4";

    public static final int SIPPICAN_T5 = 11;
    public static final double SIPPICAN_T5_COEFFICIENT_A = 6.828;
    public static final double SIPPICAN_T5_COEFFICIENT_B = -1.82;
    public static final double SIPPICAN_T5_MAX_DEPTH = 1830.00;
    public static final String SIPPICAN_T5_DESCRIPTION = "Sippican T-5";

    public static final int SIPPICAN_FAST_DEEP = 21;
    public static final double SIPPICAN_FAST_DEEP_COEFFICIENT_A = 6.346;
    public static final double SIPPICAN_FAST_DEEP_COEFFICIENT_B = -1.82;
    public static final double SIPPICAN_FAST_DEEP_MAX_DEPTH = 1000.00;
    public static final String SIPPICAN_FAST_DEEP_DESCRIPTION = "Sippican Fast Deep";

    public static final int SIPPICAN_T6_OLD = 31;
    public static final double SIPPICAN_T6_OLD_COEFFICIENT_A = 6.472;
    public static final double SIPPICAN_T6_OLD_COEFFICIENT_B = -2.16;
    public static final double SIPPICAN_T6_OLD_MAX_DEPTH = 460.00;
    public static final String SIPPICAN_T6_OLD_DESCRIPTION = "Sippican T-6";

    public static final int SIPPICAN_T6 = 32;
    public static final double SIPPICAN_T6_COEFFICIENT_A = 6.691;
    public static final double SIPPICAN_T6_COEFFICIENT_B = -2.25;
    public static final double SIPPICAN_T6_MAX_DEPTH = 460.00;
    public static final String SIPPICAN_T6_DESCRIPTION = "Sippican T-6";

    public static final int SIPPICAN_T7_OLD = 41;
    public static final double SIPPICAN_T7_OLD_COEFFICIENT_A = 6.472;
    public static final double SIPPICAN_T7_OLD_COEFFICIENT_B = -2.16;
    public static final double SIPPICAN_T7_OLD_MAX_DEPTH = 760.00;
    public static final String SIPPICAN_T7_OLD_DESCRIPTION = "Sippican T-7";

    public static final int SIPPICAN_T7 = 42;
    public static final double SIPPICAN_T7_COEFFICIENT_A = 6.691;
    public static final double SIPPICAN_T7_COEFFICIENT_B = -2.25;
    public static final double SIPPICAN_T7_MAX_DEPTH = 760.00;
    public static final String SIPPICAN_T7_DESCRIPTION = "Sippican T-7";

    public static final int SIPPICAN_DEEP_BLUE_OLD = 51;
    public static final double SIPPICAN_DEEP_BLUE_OLD_COEFFICIENT_A = 6.472;
    public static final double SIPPICAN_DEEP_BLUE_OLD_COEFFICIENT_B = -2.16;
    public static final double SIPPICAN_DEEP_BLUE_OLD_MAX_DEPTH = 760.00;
    public static final String SIPPICAN_DEEP_BLUE_OLD_DESCRIPTION = "Sippican Deep Blue";

    public static final int SIPPICAN_DEEP_BLUE = 52;
    public static final double SIPPICAN_DEEP_BLUE_COEFFICIENT_A = 6.691;
    public static final double SIPPICAN_DEEP_BLUE_COEFFICIENT_B = -2.25;
    public static final double SIPPICAN_DEEP_BLUE_MAX_DEPTH = 760.00;
    public static final String SIPPICAN_DEEP_BLUE_DESCRIPTION = "Sippican Deep Blue";

    public static final int SIPPICAN_T10 = 61;
    public static final double SIPPICAN_T10_COEFFICIENT_A = 6.301;
    public static final double SIPPICAN_T10_COEFFICIENT_B = -2.16;
    public static final double SIPPICAN_T10_MAX_DEPTH = 200.00;
    public static final String SIPPICAN_T10_DESCRIPTION = "Sippican T-10";

    public static final int SIPPICAN_T11 = 71;
    public static final double SIPPICAN_T11_COEFFICIENT_A = 1.779;
    public static final double SIPPICAN_T11_COEFFICIENT_B = -0.255;
    public static final double SIPPICAN_T11_MAX_DEPTH = 460.00;
    public static final String SIPPICAN_T11_DESCRIPTION = "Sippican T-11";

    public static final int SIPPICAN_AXBT = 81;
    public static final double SIPPICAN_AXBT_COEFFICIENT_A = 1.52;
    public static final double SIPPICAN_AXBT_COEFFICIENT_B = 0.0;
    public static final double SIPPICAN_AXBT_MAX_DEPTH = 460.00;
    public static final String SIPPICAN_AXBT_DESCRIPTION = "Sippican AXBT";

    public static final int TSK_T4_OLD = 201;
    public static final double TSK_T4_OLD_COEFFICIENT_A = 6.472;
    public static final double TSK_T4_OLD_COEFFICIENT_B = -2.16;
    public static final double TSK_T4_OLD_MAX_DEPTH = 460.00;
    public static final String TSK_T4_OLD_DESCRIPTION = "TSK T-4";

    public static final int TSK_T4 = 202;
    public static final double TSK_T4_COEFFICIENT_A = 6.691;
    public static final double TSK_T4_COEFFICIENT_B = -2.25;
    public static final double TSK_T4_MAX_DEPTH = 460.00;
    public static final String TSK_T4_DESCRIPTION = "TSK T-4";

    public static final int TSK_T6_OLD = 211;
    public static final double TSK_T6_OLD_COEFFICIENT_A = 6.472;
    public static final double TSK_T6_OLD_COEFFICIENT_B = -2.16;
    public static final double TSK_T6_OLD_MAX_DEPTH = 460.00;
    public static final String TSK_T6_OLD_DESCRIPTION = "TSK T-6";

    public static final int TSK_T6 = 212;
    public static final double TSK_T6_COEFFICIENT_A = 6.691;
    public static final double TSK_T6_COEFFICIENT_B = -2.25;
    public static final double TSK_T6_MAX_DEPTH = 460.00;
    public static final String TSK_T6_DESCRIPTION = "TSK T-6";

    public static final int TSK_T7_OLD = 221;
    public static final double TSK_T7_OLD_COEFFICIENT_A = 6.472;
    public static final double TSK_T7_OLD_COEFFICIENT_B = -2.16;
    public static final double TSK_T7_OLD_MAX_DEPTH = 760.00;
    public static final String TSK_T7_OLD_DESCRIPTION = "TSK T-7";

    public static final int TSK_T7 = 222;
    public static final double TSK_T7_COEFFICIENT_A = 6.691;
    public static final double TSK_T7_COEFFICIENT_B = -2.25;
    public static final double TSK_T7_MAX_DEPTH = 760.00;
    public static final String TSK_T7_DESCRIPTION = "TSK T-7";

    public static final int TSK_T5 = 231;
    public static final double TSK_T5_COEFFICIENT_A = 6.828;
    public static final double TSK_T5_COEFFICIENT_B = -1.82;
    public static final double TSK_T5_MAX_DEPTH = 1830.00;
    public static final String TSK_T5_DESCRIPTION = "TSK T-5";

    public static final int TSK_T10 = 241;
    public static final double TSK_T10_COEFFICIENT_A = 6.301;
    public static final double TSK_T10_COEFFICIENT_B = -2.16;
    public static final double TSK_T10_MAX_DEPTH = 200.00;
    public static final String TSK_T10_DESCRIPTION = "TSK T-10";

    public static final int TSK_DEEP_BLUE_OLD = 251;
    public static final double TSK_DEEP_BLUE_OLD_COEFFICIENT_A = 6.472;
    public static final double TSK_DEEP_BLUE_OLD_COEFFICIENT_B = -2.16;
    public static final double TSK_DEEP_BLUE_OLD_MAX_DEPTH = 760.00;
    public static final String TSK_DEEP_BLUE_OLD_DESCRIPTION = "TSK Deep Blue";

    public static final int TSK_DEEP_BLUE = 252;
    public static final double TSK_DEEP_BLUE_COEFFICIENT_A = 6.691;
    public static final double TSK_DEEP_BLUE_COEFFICIENT_B = -2.25;
    public static final double TSK_DEEP_BLUE_MAX_DEPTH = 760.00;
    public static final String TSK_DEEP_BLUE_DESCRIPTION = "TSK Deep Blue";

    public static final int TSK_AXBT = 261;
    public static final double TSK_AXBT_COEFFICIENT_A = -1;
    public static final double TSK_AXBT_COEFFICIENT_B = -1;
    public static final double TSK_AXBT_MAX_DEPTH = 4000.00;
    public static final String TSK_AXBT_DESCRIPTION = "TSK AXBT";

    public static final int SPARTON_XBT1 = 401;
    public static final double SPARTON_XBT1_COEFFICIENT_A = 6.301;
    public static final double SPARTON_XBT1_COEFFICIENT_B = -2.16;
    public static final double SPARTON_XBT1_MAX_DEPTH = 4000.00;
    public static final String SPARTON_XBT1_DESCRIPTION = "Sparton XBT-1";

    public static final int SPARTON_XBT3 = 411;
    public static final double SPARTON_XBT3_COEFFICIENT_A = 5.861;
    public static final double SPARTON_XBT3_COEFFICIENT_B = -0.0904;
    public static final double SPARTON_XBT3_MAX_DEPTH = 4000.00;
    public static final String SPARTON_XBT3_DESCRIPTION = "Sparton XBT-3";

    public static final int SPARTON_XBT4 = 421;
    public static final double SPARTON_XBT4_COEFFICIENT_A = 6.472;
    public static final double SPARTON_XBT4_COEFFICIENT_B = -2.16;
    public static final double SPARTON_XBT4_MAX_DEPTH = 4000.00;
    public static final String SPARTON_XBT4_DESCRIPTION = "";

    public static final int SPARTON_XBT5 = 431;
    public static final double SPARTON_XBT5_COEFFICIENT_A = 6.828;
    public static final double SPARTON_XBT5_COEFFICIENT_B = -1.82;
    public static final double SPARTON_XBT5_MAX_DEPTH = 4000.00;
    public static final String SPARTON_XBT5_DESCRIPTION = "Sparton XBT-5";

    public static final int SPARTON_XBT5DB = 441;
    public static final double SPARTON_XBT5DB_COEFFICIENT_A = 6.828;
    public static final double SPARTON_XBT5DB_COEFFICIENT_B = -1.82;
    public static final double SPARTON_XBT5DB_MAX_DEPTH = 4000.00;
    public static final String SPARTON_XBT5DB_DESCRIPTION = "Sparton XBT-5DB";

    public static final int SPARTON_XBT6 = 451;
    public static final double SPARTON_XBT6_COEFFICIENT_A = 6.472;
    public static final double SPARTON_XBT6_COEFFICIENT_B = -2.16;
    public static final double SPARTON_XBT6_MAX_DEPTH = 4000.00;
    public static final String SPARTON_XBT6_DESCRIPTION = "Sparton XBT-6";

    public static final int SPARTON_XBT7_OLD = 461;
    public static final double SPARTON_XBT7_OLD_COEFFICIENT_A = 6.472;
    public static final double SPARTON_XBT7_OLD_COEFFICIENT_B = -2.16;
    public static final double SPARTON_XBT7_OLD_MAX_DEPTH = 4000.00;
    public static final String SPARTON_XBT7_OLD_DESCRIPTION = "Sparton XBT-7";

    public static final int SPARTON_XBT7 = 462;
    public static final double SPARTON_XBT7_COEFFICIENT_A = 6.705;
    public static final double SPARTON_XBT7_COEFFICIENT_B = -2.28;
    public static final double SPARTON_XBT7_MAX_DEPTH = 4000.00;
    public static final String SPARTON_XBT7_DESCRIPTION = "Sparton XBT-7";

    public static final int SPARTON_XBT7DB = 471;
    public static final double SPARTON_XBT7DB_COEFFICIENT_A = 6.472;
    public static final double SPARTON_XBT7DB_COEFFICIENT_B = -2.16;
    public static final double SPARTON_XBT7DB_MAX_DEPTH = 4000.00;
    public static final String SPARTON_XBT7DB_DESCRIPTION = "Sparton XBT-7DB";

    public static final int SPARTON_XBT10 = 481;
    public static final double SPARTON_XBT10_COEFFICIENT_A = 6.301;
    public static final double SPARTON_XBT10_COEFFICIENT_B = -2.16;
    public static final double SPARTON_XBT10_MAX_DEPTH = 4000.00;
    public static final String SPARTON_XBT10_DESCRIPTION = "Sparton XBT-10";

    public static final int SPARTON_XBT20 = 491;
    public static final double SPARTON_XBT20_COEFFICIENT_A = 6.472;
    public static final double SPARTON_XBT20_COEFFICIENT_B = -2.16;
    public static final double SPARTON_XBT20_MAX_DEPTH = 4000.00;
    public static final String SPARTON_XBT20_DESCRIPTION = "Sparton XBT-20";

    public static final int SPARTON_XBT20DB = 501;
    public static final double SPARTON_XBT20DB_COEFFICIENT_A = 6.472;
    public static final double SPARTON_XBT20DB_COEFFICIENT_B = -2.16;
    public static final double SPARTON_XBT20DB_MAX_DEPTH = 4000.00;
    public static final String SPARTON_XBT20DB_DESCRIPTION = "Sparton XBT-20DB";

    public static final int SPARTON_536AXBT = 510;
    public static final double SPARTON_536AXBT_COEFFICIENT_A = 1.524;
    public static final double SPARTON_536AXBT_COEFFICIENT_B = 0.0;
    public static final double SPARTON_536AXBT_MAX_DEPTH = 4000.00;
    public static final String SPARTON_536AXBT_DESCRIPTION = "Sparton 536 AXBT-7";

    public static final int SIPPICAN_12 = 900;
    public static final double SIPPICAN_12_COEFFICIENT_A = 9.727;
    public static final double SIPPICAN_12_COEFFICIENT_B = -0.0000473;
    public static final double SIPPICAN_12_MAX_DEPTH = 2000.00;
    public static final String SIPPICAN_12_DESCRIPTION = "Sippican T-12 (LMP5-T1)";

     /**
     * This method returns the A coefficient used in the fall rate equation.
     *
     * @return This method returns the A coefficient used in the 
     * fall rate equation.
     * @param probeType the type of probe used.
     */
    public static double getCoefficientA(int probeType ) {
        double A = 0.0;
        switch (probeType ) {
            case SIPPICAN_T4_OLD:
                A = SIPPICAN_T4_OLD_COEFFICIENT_A;
                break;
            case SIPPICAN_T4:
                break;
            case SIPPICAN_T5:
                A = SIPPICAN_T5_COEFFICIENT_A;
                break;
            case SIPPICAN_FAST_DEEP:
                A = SIPPICAN_FAST_DEEP_COEFFICIENT_A;
                break;
            case SIPPICAN_T6_OLD:
                A = SIPPICAN_T6_OLD_COEFFICIENT_A;
                break;
            case SIPPICAN_T6:
                A = SIPPICAN_T6_COEFFICIENT_A;
                break;
            case SIPPICAN_T7_OLD:
                A = SIPPICAN_T7_OLD_COEFFICIENT_A;
                break;
            case SIPPICAN_T7:
                A = SIPPICAN_T7_COEFFICIENT_A;
                break;
            case SIPPICAN_DEEP_BLUE_OLD:
                A = SIPPICAN_DEEP_BLUE_OLD_COEFFICIENT_A;
                break;
            case SIPPICAN_DEEP_BLUE:
                A = SIPPICAN_DEEP_BLUE_COEFFICIENT_A;
                break;
            case SIPPICAN_T10:
                A = SIPPICAN_T10_COEFFICIENT_A;
                break;
            case SIPPICAN_T11:
                A = SIPPICAN_T11_COEFFICIENT_A;
                break;
            case SIPPICAN_AXBT:
                A = SIPPICAN_AXBT_COEFFICIENT_A;
                break;
            case TSK_T4_OLD:
                A = TSK_T4_OLD_COEFFICIENT_A;
                break;
            case TSK_T4:
                A = TSK_T4_COEFFICIENT_A;
                break;
            case TSK_T6_OLD:
                A = TSK_T6_OLD_COEFFICIENT_A;
                break;
            case TSK_T6:
                A = TSK_T6_COEFFICIENT_A;
                break;
            case TSK_T7_OLD:
                A = TSK_T7_OLD_COEFFICIENT_A;
                break;
            case TSK_T7:
                A = TSK_T7_COEFFICIENT_A;
                break;
            case TSK_T5:
                A = TSK_T5_COEFFICIENT_A;
                break;
            case TSK_T10:
                A = TSK_T10_COEFFICIENT_A;
                break;
            case TSK_DEEP_BLUE_OLD:
                A = TSK_DEEP_BLUE_OLD_COEFFICIENT_A;
                break;
            case TSK_DEEP_BLUE:
                A = TSK_DEEP_BLUE_COEFFICIENT_A;
                break;
            case TSK_AXBT:
                A = TSK_AXBT_COEFFICIENT_A;
                break;
            case SPARTON_XBT1:
                A = SPARTON_XBT1_COEFFICIENT_A;
                break;
            case SPARTON_XBT3:
                A = SPARTON_XBT3_COEFFICIENT_A;
                break;
            case SPARTON_XBT4:
                A = SPARTON_XBT4_COEFFICIENT_A;
                break;
            case SPARTON_XBT5:
                A = SPARTON_XBT5_COEFFICIENT_A;
                break;
            case SPARTON_XBT5DB:
                A = SPARTON_XBT5DB_COEFFICIENT_A;
                break;
            case SPARTON_XBT7_OLD:
                A = SPARTON_XBT7_OLD_COEFFICIENT_A;
                break;
            case SPARTON_XBT7:
                A = SPARTON_XBT7_COEFFICIENT_A;
                break;
            case SPARTON_XBT7DB:
                A = SPARTON_XBT7DB_COEFFICIENT_A;
                break;
            case SPARTON_XBT10:
                A = SPARTON_XBT10_COEFFICIENT_A;
                break;
            case SPARTON_XBT20:
                A = SPARTON_XBT20_COEFFICIENT_A;
                break;
            case SPARTON_XBT20DB:
                A = SPARTON_XBT20DB_COEFFICIENT_A;
                break;
            case SPARTON_536AXBT:
                A = SPARTON_536AXBT_COEFFICIENT_A;
                break;
            case SIPPICAN_12:
                A = SIPPICAN_12_COEFFICIENT_A;
                break;

        }//end switch

        return A;
    }
     /**
     * This method returns the B coefficient used in the fall rate equation.
     *
     * @return This method returns the B coefficient used in the 
     * fall rate equation.
     * @param probeType the type of probe used.
     */
    public static double getCoefficientB(int probeType) {
        double B = 0.0;
        switch (probeType) {
            case SIPPICAN_T4_OLD:
                B = SIPPICAN_T4_OLD_COEFFICIENT_B;
                break;
            case SIPPICAN_T4:
                break;
            case SIPPICAN_T5:
                B = SIPPICAN_T5_COEFFICIENT_B;
                break;
            case SIPPICAN_FAST_DEEP:
                B = SIPPICAN_FAST_DEEP_COEFFICIENT_B;
                break;
            case SIPPICAN_T6_OLD:
                B = SIPPICAN_T6_OLD_COEFFICIENT_B;
                break;
            case SIPPICAN_T6:
                B = SIPPICAN_T6_COEFFICIENT_B;
                break;
            case SIPPICAN_T7_OLD:
                B = SIPPICAN_T7_OLD_COEFFICIENT_B;
                break;
            case SIPPICAN_T7:
                B = SIPPICAN_T7_COEFFICIENT_B;
                break;
            case SIPPICAN_DEEP_BLUE_OLD:
                B = SIPPICAN_DEEP_BLUE_OLD_COEFFICIENT_B;
                break;
            case SIPPICAN_DEEP_BLUE:
                B = SIPPICAN_DEEP_BLUE_COEFFICIENT_B;
                break;
            case SIPPICAN_T10:
                B = SIPPICAN_T10_COEFFICIENT_B;
                break;
            case SIPPICAN_T11:
                B = SIPPICAN_T11_COEFFICIENT_B;
                break;
            case SIPPICAN_AXBT:
                B = SIPPICAN_AXBT_COEFFICIENT_B;
                break;
            case TSK_T4_OLD:
                B = TSK_T4_OLD_COEFFICIENT_B;
                break;
            case TSK_T4:
                B = TSK_T4_COEFFICIENT_B;
                break;
            case TSK_T6_OLD:
                B = TSK_T6_OLD_COEFFICIENT_B;
                break;
            case TSK_T6:
                B = TSK_T6_COEFFICIENT_B;
                break;
            case TSK_T7_OLD:
                B = TSK_T7_OLD_COEFFICIENT_B;
                break;
            case TSK_T7:
                B = TSK_T7_COEFFICIENT_B;
                break;
            case TSK_T5:
                B = TSK_T5_COEFFICIENT_B;
                break;
            case TSK_T10:
                B = TSK_T10_COEFFICIENT_B;
                break;
            case TSK_DEEP_BLUE_OLD:
                B = TSK_DEEP_BLUE_OLD_COEFFICIENT_B;
                break;
            case TSK_DEEP_BLUE:
                B = TSK_DEEP_BLUE_COEFFICIENT_B;
                break;
            case TSK_AXBT:
                B = TSK_AXBT_COEFFICIENT_B;
                break;
            case SPARTON_XBT1:
                B = SPARTON_XBT1_COEFFICIENT_B;
                break;
            case SPARTON_XBT3:
                B = SPARTON_XBT3_COEFFICIENT_B;
                break;
            case SPARTON_XBT4:
                B = SPARTON_XBT4_COEFFICIENT_B;
                break;
            case SPARTON_XBT5:
                B = SPARTON_XBT5_COEFFICIENT_B;
                break;
            case SPARTON_XBT5DB:
                B = SPARTON_XBT5DB_COEFFICIENT_B;
                break;
            case SPARTON_XBT7_OLD:
                B = SPARTON_XBT7_OLD_COEFFICIENT_B;
                break;
            case SPARTON_XBT7:
                B = SPARTON_XBT7_COEFFICIENT_B;
                break;
            case SPARTON_XBT7DB:
                B = SPARTON_XBT7DB_COEFFICIENT_B;
                break;
            case SPARTON_XBT10:
                B = SPARTON_XBT10_COEFFICIENT_B;
                break;
            case SPARTON_XBT20:
                B = SPARTON_XBT20_COEFFICIENT_B;
                break;
            case SPARTON_XBT20DB:
                B = SPARTON_XBT20DB_COEFFICIENT_B;
                break;
            case SPARTON_536AXBT:
                B = SPARTON_536AXBT_COEFFICIENT_B;
                break;
            case SIPPICAN_12:
                B = SIPPICAN_12_COEFFICIENT_B;
                break;

        }//end switch

        return B;
    }
     /**
     * This method returns the maximumm depth that the probe is designed for.
     *
     * @return This method returns the maximumm depth that the probe is designed for.
     * @param probeType the type of probe used.
     */
    public static double getMaxDepth(int probeType ) {
        double maxDepth = 4000.00;
        switch (probeType ) {
            case SIPPICAN_T4_OLD:
                maxDepth = SIPPICAN_T4_OLD_MAX_DEPTH;
                break;
            case SIPPICAN_T4:
                break;
            case SIPPICAN_T5:
                maxDepth = SIPPICAN_T5_MAX_DEPTH;
                break;
            case SIPPICAN_FAST_DEEP:
                maxDepth = SIPPICAN_FAST_DEEP_MAX_DEPTH;
                break;
            case SIPPICAN_T6_OLD:
                maxDepth = SIPPICAN_T6_OLD_MAX_DEPTH;
                break;
            case SIPPICAN_T6:
                maxDepth = SIPPICAN_T6_MAX_DEPTH;
                break;
            case SIPPICAN_T7_OLD:
                maxDepth = SIPPICAN_T7_OLD_MAX_DEPTH;
                break;
            case SIPPICAN_T7:
                maxDepth = SIPPICAN_T7_MAX_DEPTH;
                break;
            case SIPPICAN_DEEP_BLUE_OLD:
                maxDepth = SIPPICAN_DEEP_BLUE_OLD_MAX_DEPTH;
                break;
            case SIPPICAN_DEEP_BLUE:
                maxDepth = SIPPICAN_DEEP_BLUE_MAX_DEPTH;
                break;
            case SIPPICAN_T10:
                maxDepth = SIPPICAN_T10_MAX_DEPTH;
                break;
            case SIPPICAN_T11:
                maxDepth = SIPPICAN_T11_MAX_DEPTH;
                break;
            case SIPPICAN_AXBT:
                maxDepth = SIPPICAN_AXBT_MAX_DEPTH;
                break;
            case TSK_T4_OLD:
                maxDepth = TSK_T4_OLD_MAX_DEPTH;
                break;
            case TSK_T4:
                maxDepth = TSK_T4_MAX_DEPTH;
                break;
            case TSK_T6_OLD:
                maxDepth = TSK_T6_OLD_MAX_DEPTH;
                break;
            case TSK_T6:
                maxDepth = TSK_T6_MAX_DEPTH;
                break;
            case TSK_T7_OLD:
                maxDepth = TSK_T7_OLD_MAX_DEPTH;
                break;
            case TSK_T7:
                maxDepth = TSK_T7_MAX_DEPTH;
                break;
            case TSK_T5:
                maxDepth = TSK_T5_MAX_DEPTH;
                break;
            case TSK_T10:
                maxDepth = TSK_T10_MAX_DEPTH;
                break;
            case TSK_DEEP_BLUE_OLD:
                maxDepth = TSK_DEEP_BLUE_OLD_MAX_DEPTH;
                break;
            case TSK_DEEP_BLUE:
                maxDepth = TSK_DEEP_BLUE_MAX_DEPTH;
                break;
            case TSK_AXBT:
                maxDepth = TSK_AXBT_MAX_DEPTH;
                break;
            case SPARTON_XBT1:
                maxDepth = SPARTON_XBT1_MAX_DEPTH;
                break;
            case SPARTON_XBT3:
                maxDepth = SPARTON_XBT3_MAX_DEPTH;
                break;
            case SPARTON_XBT4:
                maxDepth = SPARTON_XBT4_MAX_DEPTH;
                break;
            case SPARTON_XBT5:
                maxDepth = SPARTON_XBT5_MAX_DEPTH;
                break;
            case SPARTON_XBT5DB:
                maxDepth = SPARTON_XBT5DB_MAX_DEPTH;
                break;
            case SPARTON_XBT7_OLD:
                maxDepth = SPARTON_XBT7_OLD_MAX_DEPTH;
                break;
            case SPARTON_XBT7:
                maxDepth = SPARTON_XBT7_MAX_DEPTH;
                break;
            case SPARTON_XBT7DB:
                maxDepth = SPARTON_XBT7DB_MAX_DEPTH;
                break;
            case SPARTON_XBT10:
                maxDepth = SPARTON_XBT10_MAX_DEPTH;
                break;
            case SPARTON_XBT20:
                maxDepth = SPARTON_XBT20_MAX_DEPTH;
                break;
            case SPARTON_XBT20DB:
                maxDepth = SPARTON_XBT20DB_MAX_DEPTH;
                break;
            case SPARTON_536AXBT:
                maxDepth = SPARTON_536AXBT_MAX_DEPTH;
                break;
            case SIPPICAN_12:
                maxDepth = SIPPICAN_12_MAX_DEPTH;
                break;

        }//end switch

        return maxDepth;
    }
     /**
     * This method returns a description for the probe.
     *
     * @return This method returns a description for the probe
     * @param probeType the type of probe used..
     */
    public static String getProbeDescription(int probeType ) {
        String probeDescription = "Unknown";
        switch (probeType ) {
            case SIPPICAN_T4_OLD:
                probeDescription = SIPPICAN_T4_OLD_DESCRIPTION;
                break;
            case SIPPICAN_T4:
                break;
            case SIPPICAN_T5:
                probeDescription = SIPPICAN_T5_DESCRIPTION;
                break;
            case SIPPICAN_FAST_DEEP:
                probeDescription = SIPPICAN_FAST_DEEP_DESCRIPTION;
                break;
            case SIPPICAN_T6_OLD:
                probeDescription = SIPPICAN_T6_OLD_DESCRIPTION;
                break;
            case SIPPICAN_T6:
                probeDescription = SIPPICAN_T6_DESCRIPTION;
                break;
            case SIPPICAN_T7_OLD:
                probeDescription = SIPPICAN_T7_OLD_DESCRIPTION;
                break;
            case SIPPICAN_T7:
                probeDescription = SIPPICAN_T7_DESCRIPTION;
                break;
            case SIPPICAN_DEEP_BLUE_OLD:
                probeDescription = SIPPICAN_DEEP_BLUE_OLD_DESCRIPTION;
                break;
            case SIPPICAN_DEEP_BLUE:
                probeDescription = SIPPICAN_DEEP_BLUE_DESCRIPTION;
                break;
            case SIPPICAN_T10:
                probeDescription = SIPPICAN_T10_DESCRIPTION;
                break;
            case SIPPICAN_T11:
                probeDescription = SIPPICAN_T11_DESCRIPTION;
                break;
            case SIPPICAN_AXBT:
                probeDescription = SIPPICAN_AXBT_DESCRIPTION;
                break;
            case TSK_T4_OLD:
                probeDescription = TSK_T4_OLD_DESCRIPTION;
                break;
            case TSK_T4:
                probeDescription = TSK_T4_DESCRIPTION;
                break;
            case TSK_T6_OLD:
                probeDescription = TSK_T6_OLD_DESCRIPTION;
                break;
            case TSK_T6:
                probeDescription = TSK_T6_DESCRIPTION;
                break;
            case TSK_T7_OLD:
                probeDescription = TSK_T7_OLD_DESCRIPTION;
                break;
            case TSK_T7:
                probeDescription = TSK_T7_DESCRIPTION;
                break;
            case TSK_T5:
                probeDescription = TSK_T5_DESCRIPTION;
                break;
            case TSK_T10:
                probeDescription = TSK_T10_DESCRIPTION;
                break;
            case TSK_DEEP_BLUE_OLD:
                probeDescription = TSK_DEEP_BLUE_OLD_DESCRIPTION;
                break;
            case TSK_DEEP_BLUE:
                probeDescription = TSK_DEEP_BLUE_DESCRIPTION;
                break;
            case TSK_AXBT:
                probeDescription = TSK_AXBT_DESCRIPTION;
                break;
            case SPARTON_XBT1:
                probeDescription = SPARTON_XBT1_DESCRIPTION;
                break;
            case SPARTON_XBT3:
                probeDescription = SPARTON_XBT3_DESCRIPTION;
                break;
            case SPARTON_XBT4:
                probeDescription = SPARTON_XBT4_DESCRIPTION;
                break;
            case SPARTON_XBT5:
                probeDescription = SPARTON_XBT5_DESCRIPTION;
                break;
            case SPARTON_XBT5DB:
                probeDescription = SPARTON_XBT5DB_DESCRIPTION;
                break;
            case SPARTON_XBT7_OLD:
                probeDescription = SPARTON_XBT7_OLD_DESCRIPTION;
                break;
            case SPARTON_XBT7:
                probeDescription = SPARTON_XBT7_DESCRIPTION;
                break;
            case SPARTON_XBT7DB:
                probeDescription = SPARTON_XBT7DB_DESCRIPTION;
                break;
            case SPARTON_XBT10:
                probeDescription = SPARTON_XBT10_DESCRIPTION;
                break;
            case SPARTON_XBT20:
                probeDescription = SPARTON_XBT20_DESCRIPTION;
                break;
            case SPARTON_XBT20DB:
                probeDescription = SPARTON_XBT20DB_DESCRIPTION;
                break;
            case SPARTON_536AXBT:
                probeDescription = SPARTON_536AXBT_DESCRIPTION;
                break;
            case SIPPICAN_12:
                probeDescription = SIPPICAN_12_DESCRIPTION;
                break;

        }//end switch

        return probeDescription;
    }

}
