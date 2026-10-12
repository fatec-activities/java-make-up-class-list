public class NumberTable {
    private NumberTable() {
    }

    public static void showPowers(int number) {
        System.out.println("Potências de " + number + " (expoente 1 a 10):");
        for (int exp = 1; exp <= 10; exp++) {
            System.out.printf("%d^%d = %.0f%n", number, exp, Math.pow(number, exp));
        }
    }

    public static void showMultiplicationTable(int number) {
        System.out.println("Tabela de multiplicação " + number + " x " + number + ":");

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                System.out.printf("%4d", row * col);
            }

            System.out.println();
        }
    }
}