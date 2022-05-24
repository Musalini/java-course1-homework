package Homework.Lesson5.BankAccount;

public class Human {
    String name;
    BankAccount bankAccount;

    public Human(String name, BankAccount bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
    }

    void humanInfo() {
        System.out.println("Person's name: " + name);
        System.out.println("Bank account status: " + bankAccount.balance);
    }
}
