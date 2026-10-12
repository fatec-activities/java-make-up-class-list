public class SalesStats {
    private int count;
    private double total;
    private double highest;
    private double lowest;
    private int above100;
    private int below20;

    public SalesStats() {
        count = 0;
        total = 0;
        highest = 0;
        lowest = 0;
        above100 = 0;
        below20 = 0;
    }

    public void addSale(double value) {
        if (count == 0) {
            highest = value;
            lowest = value;
        }

        count++;
        total += value;

        if (value > highest) {
            highest = value;
        }
     
        if (value < lowest) {
            lowest = value;
        }

        if (value > 100) {
            above100++;
        }
      
        if (value < 20) {
            below20++;
        }
    }

    public double getAverage() {
        return total / count;
    }

    public void showReport() {
        Utils.consoleClear();

        if (count == 0) {
            System.out.println("Nenhuma venda foi registrada.");
            return;
        }

        System.out.println("Quantidade de produtos vendidos: " + count);
        System.out.printf("Valor total faturado: R$ %.2f%n", total);
        System.out.printf("Preço médio: R$ %.2f%n", getAverage());
        System.out.printf("Maior valor: R$ %.2f%n", highest);
        System.out.printf("Menor valor: R$ %.2f%n", lowest);
        System.out.println("Produtos acima de R$ 100,00: " + above100);
        System.out.println("Produtos abaixo de R$ 20,00: " + below20);
    }
}