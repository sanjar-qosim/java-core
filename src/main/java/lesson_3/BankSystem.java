package lesson_3;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class BankSystem {

    public ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(String fio, double balance) {
        Account account = new Account(fio, balance);
        accounts.add(account);
        System.out.println("The account was successfully added!");
        System.out.println(account);
    }

    public void getAccountInfo(long accountNumber) {
        for (Account tmp : accounts) {
            if (tmp.accountNumber == accountNumber) {
                System.out.println(tmp);
                break;
            }
        }
    }

    public void deleteAccount(long accountNumber) {
        for (Account tmp : accounts) {
            if (tmp.accountNumber == accountNumber) {
                accounts.remove(tmp);
                System.out.println("Account was deleted successfully!");
                break;
            }
        }
    }

    public void replenishAccount(long accountNumber, double money) {
        for (Account tmp : accounts) {
            if (tmp.accountNumber == accountNumber) {
                tmp.setBalance(money);
                System.out.println("Replenishment was added successfully!");
                System.out.println("Current balance: " + tmp.getBalance());
                break;
            }
        }
    }

    public void transferMoneyBetweenAccounts(long sendersAccount, long receiversAccount, double money) {
        Account sender = null;
        Account receiver = null;

        for (Account tmp : accounts) {
            if (tmp.accountNumber == sendersAccount) {
                sender = tmp;
            }

            if (tmp.accountNumber == receiversAccount) {
                receiver = tmp;
            }
        }

        if (sender != null && receiver != null && money > 0) {
            if (sender.balance > money) {
                sender.balance -= money;
                receiver.balance += money;
                System.out.println("Money has been successfully transferred!");
            } else {
                System.out.println("Sender's money is not enough!");
            }
        } else {
            System.out.println("Users not found!");
        }
    }

    // inner class for creating account
    private class Account {

        private final String fio;
        private final long accountNumber;
        @Getter
        @Setter
        private double balance;

        public Account(String fio, double balance) {
            this.fio = fio;
            this.balance = balance;
            AccountNumberGenerator accountNumberGenerator = new AccountNumberGenerator();
            accountNumber = accountNumberGenerator.generate();
        }

        @Override
        public String toString() {
            return "Account{" +
                    "fio='" + fio + '\'' +
                    ", accountNumber=" + accountNumber +
                    ", balance=" + balance +
                    '}';
        }

        // inner-inner class for generating account number
        private static class AccountNumberGenerator {
            public long generate() {
                Random random = new Random();
                return random.nextLong(16);
            }
        }
    }
}
