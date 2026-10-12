import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils.consoleClear();
        Scanner input = new Scanner(System.in);

        int number;
        do {
            System.out.print("Digite um número inteiro positivo: ");
            number = input.nextInt();
          
            if (number <= 0) {
                System.out.println("Valor inválido! Deve ser positivo.");
            }
        } while (number <= 0);

        System.out.println();
        NumberTable.showPowers(number);

        System.out.println();
        NumberTable.showMultiplicationTable(number);

        input.close();
    }
}