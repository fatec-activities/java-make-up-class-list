public class Employee {
    private final String name;
    private final double hoursWorked;
    private final double paymentPerHour;
    private final double inssDiscountPercent;

    private double grossSalary;
    private double inssDiscount;
    private double netSalary;

    public Employee(String name, double hoursWorked, double paymentPerHour, double inssDiscountPercent) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.paymentPerHour = paymentPerHour;
        this.inssDiscountPercent = inssDiscountPercent;
    }

    public void calculateGrossSalary() {
        this.grossSalary = hoursWorked * paymentPerHour;
    }

    public void calculateInssDiscount() {
        this.inssDiscount = grossSalary * (inssDiscountPercent / 100.0);
    }

    public void calculateNetSalary() {
        calculateInssDiscount();

        this.netSalary = grossSalary - inssDiscount;
    }

    public void showReport() {
        Utils.consoleClear();

        System.out.printf("Funcionário: %s%n", name);
        System.out.printf("Salário Bruto: R$ %.2f%n", grossSalary);
        System.out.printf("Desconto INSS: R$ %.2f%n", inssDiscount);
        System.out.printf("Salário Líquido: R$ %.2f%n", netSalary);
    }
}