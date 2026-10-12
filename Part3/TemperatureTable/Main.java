import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils.consoleClear();
      
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura inicial (°C): ");
        int initial = input.nextInt();

        System.out.print("Digite a temperatura final (°C): ");
        int end = input.nextInt();

        int step;
   
        do {
            System.out.print("Digite o passo: ");
            step = input.nextInt();
           
            if (step <= 0) {
                System.out.println("Passo inválido! Deve ser maior que zero.");
            }
        } while (step <= 0);

        TemperatureTable.showTable(initial, end, step);

        input.close();
    }
}