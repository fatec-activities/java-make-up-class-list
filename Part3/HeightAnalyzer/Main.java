import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils.consoleClear();
      
        Scanner input = new Scanner(System.in);

        HeightStats stats = new HeightStats();

        double height;
        do {
            System.out.print("Digite a altura (m) [0 para sair]: ");
            height = input.nextDouble();

            if (height != 0) {
                stats.addHeight(height);
            }
        } while (height != 0);

        stats.showReport();
      
        input.close();
    }
}