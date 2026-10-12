import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils.consoleClear();
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int n1 = input.nextInt();

        System.out.print("Digite o 2º número: ");
        int n2 = input.nextInt();

        System.out.print("Digite o 3º número: ");
        int n3 = input.nextInt();

        NumberAnalyzer analyzer = new NumberAnalyzer(n1, n2, n3);
        analyzer.analyze();
        analyzer.showReport();

        input.close();
    }
}