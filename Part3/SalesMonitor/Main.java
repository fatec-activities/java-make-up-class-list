import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils.consoleClear();
      
        Scanner input = new Scanner(System.in);

        SalesStats stats = new SalesStats();

        double value;
        do {
            System.out.print("Digite o valor do produto (-1 para sair): R$ ");
            value = input.nextDouble();

            if (value != -1) {
                stats.addSale(value);
            }
        } while (value != -1);

        stats.showReport();
        input.close();
    }
}