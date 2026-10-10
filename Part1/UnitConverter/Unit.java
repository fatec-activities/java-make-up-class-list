public class Unit {
    private final double celsius;

    private double fahrenheit;
    private double kelvin;

    public Unit(double celsius) {
        this.celsius = celsius;
    }

    public void calculateFahrenheit() {
        this.fahrenheit = (celsius * 1.8) + 32;
    }

    public void calculateKelvin() {
        this.kelvin = celsius + 273.15;
    }

    public void showReport() {
        Utils.consoleClear();

        System.out.printf("Temperatura em Celsius: %.2f °C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);
    }
}