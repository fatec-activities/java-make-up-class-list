public class Vehicle {
    private final String driverName;
    private final double distanceTraveled;
    private final double fuelUsed;
    private final double pricePerLiter;

    private double averageConsumption;
    private double totalCost;

    public Vehicle(String driverName, double distanceTraveled, double fuelUsed, double pricePerLiter) {
        this.driverName = driverName;
        this.distanceTraveled = distanceTraveled;
        this.fuelUsed = fuelUsed;
        this.pricePerLiter = pricePerLiter;
    }

    public void calculateConsumption() {
        this.averageConsumption = distanceTraveled / fuelUsed;
    }

    public void calculateTotalCost() {
        this.totalCost = fuelUsed * pricePerLiter;
    }

    public void showReport() {
        Utils.consoleClear();

        System.out.printf("Motorista: %s%n", driverName);
        System.out.printf("Distância: %.1f km%n", distanceTraveled);
        System.out.printf("Combustível Gasto: %.1f L%n", fuelUsed);
        System.out.printf("Consumo Médio: %.2f km/l%n", averageConsumption);
        System.out.printf("Custo Total: R$ %.2f%n", totalCost);
    }
}