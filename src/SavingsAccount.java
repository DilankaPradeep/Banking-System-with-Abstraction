public class SavingsAccount implements Account{

    private String accountNumber;
    private double balance;
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance!");
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
    }
}
