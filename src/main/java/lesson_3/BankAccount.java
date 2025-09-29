package lesson_3;

import java.util.Random;

public class BankAccount {

    private final String fio;
    private final long accountNumber;
    private double balance;
    private double deposit;

    public BankAccount(String fullName) {
        AccountNumberGenerator generator = new AccountNumberGenerator();
        this.accountNumber = generator.generate();
        this.fio = fullName;
    }

    public void deposit(double money) {
        if (balance == 0 && money > 0) {
            this.balance = money;
            this.deposit = money;
            System.out.println("Deposit added successfully!");
        } else if (money < 0) {
            System.out.println("Invalid data!");
        } else if (balance > 0) {
            System.out.println("You have previously made a deposit!");
        }
    }

    public void showInfo(){
        System.out.println("Full name: " + fio + "\nAccount number: " + accountNumber);
    }

    public void withdraw(double money) {
        if (balance != 0 && balance > deposit && money > 0) {
            balance -= money;
            System.out.println("Withdraw completed successfully!\nYour current balance: " + balance);
        } else if (balance < deposit) {
            System.out.println("You don't have enough money!");
        } else if (money < 0) {
            System.out.println("Invalid data!");
        }
    }

    public double getBalance() {
        return balance - deposit;
    }

    // inner class for generating account number
    private static class AccountNumberGenerator {
        public long generate() {
            Random random = new Random();
            return random.nextLong(16);
        }
    }
}
