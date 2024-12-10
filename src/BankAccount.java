public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid Amount");
            return;
        }
        balance += amount;
        System.out.println("Money Deposited. Current balance: " + balance);
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid Amount");
            return;
        } else if (amount > balance){
            System.out.println("Insufficient Fund");
            return;
        }
        balance -= amount;
        System.out.println("Money Withdrawn. Current balance: " + balance);
    }

    public void displayInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Thank You!");
    }
}
