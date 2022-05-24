package Homework.Lesson5.BankAccount;

public class BankAccount {
    int id;
    double balance;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    double replenishmentBankAccount(double value) {
        return balance += value;
    }

    double withdrawalFromAccount(double value) {
       return balance -= value;
    }
}
