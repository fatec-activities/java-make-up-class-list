import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils.consoleClear();

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de p: ");
        int p = input.nextInt();

        System.out.print("Digite o valor de q: ");
        int q = input.nextInt();

        System.out.println();
        System.out.println("Operação p / q: " + (p / q));
        System.out.println("Operação (float) p / q: " + ((float) p / q));
        System.out.println("Operação (double) (p / q): " + ((double) (p / q)));

        System.out.println();
        System.out.println("Por que a 3ª deu diferente?");
        System.out.println("-> Em (double) (p / q), a divisão acontece ANTES do cast.");
        System.out.println("-> Como p e q são int, a divisão é inteira e perde a parte decimal.");
        System.out.println("-> Só depois o resultado vira double, mas o valor já foi truncado.");

        input.close();
    }
}