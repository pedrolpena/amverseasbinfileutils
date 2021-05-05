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
public final class WindInstrument {

    public static final int UNCERTIFIED_INSTRUMENT_MPS = 0;
    public static final String UNCERTIFIED_INSTRUMENT_MPS_DESCRIPTION = "Uncertified Instruments meters/sec";

    public static final int CERTIFIED_INSTRUMENT_MPS = 1;
    public static final String CERTIFIED_INSTRUMENT_MPS_DESCRIPTION = "Certified Instruments meters/sec";

    public static final int UNCERTIFIED_INSTRUMENT_KNOTS = 2;
    public static final String UNCERTIFIED_INSTRUMENT_KNOTS_DESCRIPTION = "Uncertified Instruments knots";

    public static final int CERTIFIED_INSTRUMENT_KNOTS = 3;
    public static final String CERTIFIED_INSTRUMENT_KNOTS_DESCRIPTION = "Certified Instruments knots";

    public static final int UNCERTIFIED_INSTRUMENT_KPH = 4;
    public static final String UNCERTIFIED_INSTRUMENT_KPH_DESCRIPTION = "Uncertified Instruments kilometers/hour";

    public static final int CERTIFIED_INSTRUMENT_KPH = 5;
    public static final String CERTIFIED_INSTRUMENT_KPH_DESCRIPTION = "Certified Instruments kilometers/hour";

    public static String getInstrumentDescription(int code) {

        String description = "Missing";
        switch (code) {

            case UNCERTIFIED_INSTRUMENT_MPS:
                description = UNCERTIFIED_INSTRUMENT_MPS_DESCRIPTION;
                break;

            case CERTIFIED_INSTRUMENT_MPS:
                description = CERTIFIED_INSTRUMENT_MPS_DESCRIPTION;
                break;

            case UNCERTIFIED_INSTRUMENT_KNOTS:
                description = UNCERTIFIED_INSTRUMENT_KNOTS_DESCRIPTION;
                break;

            case CERTIFIED_INSTRUMENT_KNOTS:
                description = CERTIFIED_INSTRUMENT_KNOTS_DESCRIPTION;
                break;

            case UNCERTIFIED_INSTRUMENT_KPH:
                description = UNCERTIFIED_INSTRUMENT_KPH_DESCRIPTION;
                break;

            case CERTIFIED_INSTRUMENT_KPH:
                description = CERTIFIED_INSTRUMENT_KPH_DESCRIPTION;
                break;

        }

        return description;

    }
}
