public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void applySavingsYield() {
        balance *= 1.005;
    }

    public void showBalance() {
        Utils.consoleClear();
        System.out.printf("Saldo atual: R$ %.2f%n", balance);
    }
}