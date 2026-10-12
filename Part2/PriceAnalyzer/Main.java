import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils.consoleClear();
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preço do 1º produto: ");
        double p1 = input.nextDouble();

        System.out.print("Digite o preço do 2º produto: ");
        double p2 = input.nextDouble();

        System.out.print("Digite o preço do 3º produto: ");
        double p3 = input.nextDouble();

        PriceAnalyzer analyzer = new PriceAnalyzer(p1, p2, p3);
        analyzer.analyze();
        analyzer.showReport();

        input.close();
    }
}