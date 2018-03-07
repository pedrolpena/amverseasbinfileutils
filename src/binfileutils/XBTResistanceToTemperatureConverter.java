package binfileutils;

/**
 * This Class has methods to convert XBT thermistor resistance values read by
 * the recording device to temperature in degrees celcius.
 *
 * @author Pedro Pena
 * @version 1.0
 *
 */
public class XBTResistanceToTemperatureConverter {

    /**
     * Converts a single XBT thermistor resistance values read by the recording
     * device to a temperature in degrees celcius.
     *
     * @param resistance the resistance measured in ohms.
     * @return A single temperature point.
     */
    double convertResistaceToTemperature(double resistance) {
        double dnlr = Math.log(resistance);
        double temp = (1.0 / (0.001290123 + 0.00023322529 * dnlr
                + 0.00000045791293 * dnlr * dnlr
                + 0.000000071625593 * dnlr * dnlr * dnlr));
        temp -= 273.15;
        return temp;
    }

    /**
     * Converts an array XBT thermistor resistance values read by the recording
     * device to a temperature in degrees celcius.
     *
     * @param resistance an array of the resistances measured in ohms.
     * @return An array of temperatures.
     */
    double[] convertResistaceToTemperature(double[] resistance) {
        int len = resistance.length;
        double[] temps = new double[len];

        for (int i = 0; i < len; i++) {
            temps[i] = convertResistaceToTemperature(resistance[i]);

        }
        return temps;
    }

}
