package Homework.Lesson5.BankAccount;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("Musa", new BankAccount(1, 200.80));
        Human human2 = new Human("Ivan", new BankAccount(6, 300.80));
        human.humanInfo();
        human2.humanInfo();
        System.out.println();

        human.bankAccount.replenishmentBankAccount(400);
        human2.bankAccount.withdrawalFromAccount(100);
        System.out.println("Account status after replenishment: " + human.bankAccount.balance);
        System.out.println("Account status after withdrawal: " + human2.bankAccount.balance);
    }
}
