public class HeightStats {
    private int count;
    private double sum;
    private double highest;
    private double lowest;
    private int above180;
    private int below160;

    public HeightStats() {
        count = 0;
        sum = 0;
        highest = 0;
        lowest = 0;
        above180 = 0;
        below160 = 0;
    }

    public void addHeight(double height) {
        if (count == 0) {
            highest = height;
            lowest = height;
        }

        count++;
        sum += height;

        if (height > highest) {
            highest = height;
        }
        if (height < lowest) {
            lowest = height;
        }

        if (height > 1.80) {
            above180++;
        }
        if (height < 1.60) {
            below160++;
        }
    }

    public double getAverage() {
        return sum / count;
    }

    public void showReport() {
        Utils.consoleClear();

        if (count == 0) {
            System.out.println("Nenhuma altura foi cadastrada.");
            return;
        }

        System.out.println("Quantidade total: " + count);
        System.out.printf("Média de altura: %.2f m%n", getAverage());
        System.out.printf("Maior altura: %.2f m%n", highest);
        System.out.printf("Menor altura: %.2f m%n", lowest);
        System.out.println("Pessoas > 1.80m: " + above180);
        System.out.println("Pessoas < 1.60m: " + below160);
    }
}