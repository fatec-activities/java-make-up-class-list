public class TemperatureTable {

    private TemperatureTable() {
    }

    public static void showTable(int initial, int end, int step) {
        Utils.consoleClear();

        System.out.printf("%10s %12s %10s%n", "Celsius", "Fahrenheit", "Kelvin");

        if (initial <= end) {
            for (int c = initial; c <= end; c += step) {
                printRow(c);
            }
        } else {
            for (int c = initial; c >= end; c -= step) {
                printRow(c);
            }
        }
    }

    private static void printRow(int celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("%8.1f °C %8.1f °F %8.2f K%n", (double) celsius, fahrenheit, kelvin);
    }
}