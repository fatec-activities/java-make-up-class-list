import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils.consoleClear();

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do motorista: ");
        String name = input.nextLine();

        System.out.print("Digite a distância percorrida (km): ");
        double distance = input.nextDouble();

        System.out.print("Digite o combustível gasto (litros): ");
        double liters = input.nextDouble();

        System.out.print("Digite o preço do litro (R$): ");
        double pricePerLiter = input.nextDouble();

        Vehicle vehicle = new Vehicle(name, distance, liters, pricePerLiter);
        vehicle.calculateConsumption();
        vehicle.calculateTotalCost();
        vehicle.showReport();

        input.close();
    }
}