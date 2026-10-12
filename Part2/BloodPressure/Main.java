import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils.consoleClear();

        Scanner input = new Scanner(System.in);

        int age;

        do {
            System.out.print("Digite a idade: ");

            age = input.nextInt();

            if (age <= 0) {
                System.out.println("Idade inválida! Deve ser maior que zero.");
            }
        } while (age <= 0);

        int pressure;

        do {
            System.out.print("Digite a pressão sistólica (mmHg): ");

            pressure = input.nextInt();

            if (pressure <= 0) {
                System.out.println("Pressão inválida! Deve ser maior que zero.");
            }
        } while (pressure <= 0);

        Patient patient = new Patient(age, pressure);
        patient.classify();
        patient.showReport();

        input.close();
    }
}