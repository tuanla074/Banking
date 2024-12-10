//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Joe John", 500.00);
        account.displayInfo();
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select Option: \n 1. Show info\n 2. Deposit\n 3. Withdraw \n0. Exit\n");
            int choice = scanner.nextInt();
            if (choice == 1) {
                account.displayInfo();
            } else if (choice == 2) {
                System.out.println("Select Amount Deposit:");
                double val = scanner.nextDouble();
                account.deposit(val);
            } else if (choice == 3) {
                System.out.println("Select Amount Withdrawn:");
                double val = scanner.nextDouble();
                account.withdraw(val);
            } else {
                break;
            }
        }
    }
}