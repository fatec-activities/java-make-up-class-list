public class NumberAnalyzer {
    private final int n1;
    private final int n2;
    private final int n3;

    private int highest;
    private int lowest;
    private double average;
    private int multiplesOf3;
    private int multiplesOf5;
    private boolean allEqual;

    public NumberAnalyzer(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public void analyze() {
        highest = n1;

        if (n2 > highest) {
            highest = n2;
        }

        if (n3 > highest) {
            highest = n3;
        }

        lowest = n1;

        if (n2 < lowest) {
            lowest = n2;
        }

        if (n3 < lowest) {
            lowest = n3;
        }

        average = (n1 + n2 + n3) / 3.0;

        multiplesOf3 = 0;

        if (n1 % 3 == 0) {
            multiplesOf3++;
        }

        if (n2 % 3 == 0) {
            multiplesOf3++;
        }

        if (n3 % 3 == 0) {
            multiplesOf3++;
        }

        multiplesOf5 = 0;

        if (n1 % 5 == 0) {
            multiplesOf5++;
        }

        if (n2 % 5 == 0) {
            multiplesOf5++;
        }

        if (n3 % 5 == 0) {
            multiplesOf5++;
        }

        allEqual = (n1 == n2) && (n2 == n3);
    }

    public void showReport() {
        Utils.consoleClear();

        System.out.println("Maior valor: " + highest);
        System.out.println("Menor valor: " + lowest);
        System.out.printf("Média aritmética: %.2f%n", average);
        System.out.println("Múltiplos de 3: " + multiplesOf3);
        System.out.println("Múltiplos de 5: " + multiplesOf5);
        System.out.println(allEqual ? "Todos os valores são idênticos." : "Os valores não são todos idênticos.");
    }
}