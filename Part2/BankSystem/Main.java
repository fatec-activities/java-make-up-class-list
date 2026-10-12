import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Utils.consoleClear();

        Scanner input = new Scanner(System.in);

        BankAccount account = new BankAccount(1000.00);

        int option;
        do {
            printMenu();
            System.out.print("Opção: ");
            option = input.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    account.showBalance();
                    break;
                case 2:
                    deposit(account, input);
                    break;
                case 3:
                    withdraw(account, input);
                    break;
                case 4:
                    savingsYield(account);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            if (option != 0) {
                System.out.println();
                System.out.println("Pressione ENTER para continuar...");

                input.nextLine();
                input.nextLine();

                Utils.consoleClear();
            }

        } while (option != 0);

        input.close();
    }

    private static void printMenu() {
        System.out.println("====================================");
        System.out.println("SISTEMA BANCÁRIO");
        System.out.println("====================================");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Realizar Depósito");
        System.out.println("3 - Realizar Saque");
        System.out.println("4 - Simular Rendimento da Poupança (1 mês - 0.5%)");
        System.out.println("0 - Sair");
        System.out.println("====================================");
    }

    private static void deposit(BankAccount account, Scanner input) {
        Utils.consoleClear();

        System.out.print("Digite o valor do depósito: R$ ");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Erro: o valor do depósito deve ser maior que zero.");
            return;
        }

        account.deposit(amount);

        System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", amount);
        System.out.printf("Novo saldo: R$ %.2f%n", account.getBalance());
    }

    private static void withdraw(BankAccount account, Scanner input) {
        Utils.consoleClear();

        System.out.print("Digite o valor do saque: R$ ");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Erro: o valor do saque deve ser maior que zero.");
            return;
        }

        if (amount > account.getBalance()) {
            System.out.println("Erro: saldo insuficiente.");
            System.out.printf("Saldo disponível: R$ %.2f%n", account.getBalance());
            return;
        }

        account.withdraw(amount);

        System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", amount);
        System.out.printf("Novo saldo: R$ %.2f%n", account.getBalance());
    }

    private static void savingsYield(BankAccount account) {
        Utils.consoleClear();

        double before = account.getBalance();
        account.applySavingsYield();
        double after = account.getBalance();

        System.out.println("Simulação de rendimento da poupança (0.5% ao mês)");
        System.out.printf("Saldo anterior: R$ %.2f%n", before);
        System.out.printf("Rendimento: R$ %.2f%n", after - before);
        System.out.printf("Novo saldo: R$ %.2f%n", after);
    }
}