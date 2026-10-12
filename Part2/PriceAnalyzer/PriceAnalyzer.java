public class PriceAnalyzer {
    private final double price1;
    private final double price2;
    private final double price3;

    private double highest;
    private double lowest;
    private double average;
    private int aboveAverageCount;
    private boolean allEqual;

    public PriceAnalyzer(double price1, double price2, double price3) {
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
    }

    public void analyze() {
        highest = price1;

        if (price2 > highest) {
            highest = price2;
        }

        if (price3 > highest) {
            highest = price3;
        }

        lowest = price1;

        if (price2 < lowest) {
            lowest = price2;
        }

        if (price3 < lowest) {
            lowest = price3;
        }

        average = (price1 + price2 + price3) / 3.0;

        aboveAverageCount = 0;

        if (price1 > average) {
            aboveAverageCount++;
        }

        if (price2 > average) {
            aboveAverageCount++;
        }

        if (price3 > average) {
            aboveAverageCount++;
        }

        allEqual = (price1 == price2) && (price2 == price3);
    }

    public void showReport() {
        Utils.consoleClear();

        System.out.printf("Preço mais caro: R$ %.2f%n", highest);
        System.out.printf("Preço mais barato: R$ %.2f%n", lowest);
        System.out.printf("Média dos preços: R$ %.2f%n", average);
        System.out.println("Produtos acima da média: " + aboveAverageCount);
        System.out.println(allEqual ? "Os três preços são iguais." : "Os preços não são todos iguais.");
    }
}