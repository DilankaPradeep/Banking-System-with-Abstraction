public class CurrentAccount implements Account{
    private String accountNumber;
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) balance -= amount;
        else System.out.println("Overdraft limit exceeded!");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
