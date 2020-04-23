package b12_day38_classAndObjectCont;

public class BankAccountObjects {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(); //created with default constructor

        account1.AccountHolder = "Annaly Gurbanov";
        account1.AccountNumber = 1232143242343543l;

        account1.showBalance();
        System.out.println("====================================");
        account1.deposit(200);
        System.out.println("======================================");
        account1.withdraw(300);
        account1.withdraw(500);

        BankAccount account2 = new BankAccount();
        account2.accountSetup("Mahriban", 9584987348756375l);
        account2.showBalance();
        account2.deposit(2000000);

        BankAccount account3 = new BankAccount("Melek", 5476576544656l);
        account3.showBalance();
        account3.deposit(20);
        account3.withdraw(30);
        account3.withdraw(200);
        account3.deposit(3000);
    }
}
