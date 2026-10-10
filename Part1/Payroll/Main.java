import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils.consoleClear();

        Scanner input = new Scanner(System.in);

        System.out.print("Nome do Funcionário: ");
        String name = input.nextLine();

        System.out.print("Horas trabalhadas: ");
        double hoursWorked = input.nextDouble();

        System.out.print("Salário por hora: ");
        double paymentPerHour = input.nextDouble();

        System.out.print("Desconto INSS (%): ");
        double inssDiscountPercent = input.nextDouble();

        Employee employee = new Employee(name, hoursWorked, paymentPerHour, inssDiscountPercent);

        employee.calculateGrossSalary();
        employee.calculateInssDiscount();
        employee.calculateNetSalary();
        employee.showReport();

        input.close();
    }
}
