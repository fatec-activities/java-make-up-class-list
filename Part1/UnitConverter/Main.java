import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils.consoleClear();
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();

        Unit temp = new Unit(celsius);
        temp.calculateFahrenheit();
        temp.calculateKelvin();
        temp.showReport();

        input.close();
    }
}