import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils.consoleClear();

        // ? AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
        demoWidening();
        demoCasting();
        demoOverflow();
        demoPromotion();
        demoChar();
        demoDivision();
    }

    private static void demoWidening() {
        System.out.println("1. Conversão implícita (widening)");

        int smallInt = 100;
        double bigDouble = smallInt;

        System.out.println("int 100 virou double: " + bigDouble);
        System.out.println();
    }

    private static void demoCasting() {
        System.out.println("2. Conversão explícita (casting manual)");

        double value = 9.78;
        int truncated = (int) value;

        System.out.println("double 9.78 virou int: " + truncated);
        System.out.println();
    }

    private static void demoOverflow() {
        System.out.println("3. Overflow de byte");

        byte b = 127; // * limite do byte
        b++;

        System.out.println("byte 127 + 1 = " + b);
        System.out.println();
    }

    private static void demoPromotion() {
        System.out.println("4. Promoção de byte + short");

        byte x = 10;
        short y = 20;
        int sum = x + y; // * byte + short sempre vira int

        System.out.println("byte 10 + short 20 = int " + sum);
        System.out.println();
    }

    private static void demoChar() {
        System.out.println("5. Char + inteiro");

        char letter = 'A';
        int letterValue = letter; // * char tem valor numérico (ASCII)
        char nextLetter = (char) (letter + 1);

        System.out.println("'A' vale " + letterValue + " e a próxima letra é " + nextLetter);
        System.out.println();
    }

    private static void demoDivision() {
        System.out.println("6. Divisão inteira vs real");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite x: ");
        int x = input.nextInt();

        System.out.print("Digite y: ");
        int y = input.nextInt();

        // ! sddjhfnksjldhflsjdhflksdjfhlsdkjfhd
        System.out.println("x / y = " + (x / y));
        System.out.println("(double) x / y = " + ((double) x / y));
        System.out.println();
        System.out.println("Por que diferem?");
        System.out.println("-> Na 1ª, int / int faz divisão inteira e corta a parte decimal.");
        System.out.println("-> Na 2ª, o cast em x faz o Java promover tudo pra double antes de dividir.");

        input.close();
    }
}