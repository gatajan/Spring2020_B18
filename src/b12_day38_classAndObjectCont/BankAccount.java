package b12_day38_classAndObjectCont;

public class BankAccount {

    String AccountHolder;
    long AccountNumber;
    double Balance;

    String username, password;

    public BankAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public BankAccount() {
    }
    public BankAccount(String AccountHolder, long AccountNumber) {
        this.AccountHolder = AccountHolder;
        this.AccountNumber =AccountNumber;
    }

    public void deposit(double amount) {
        System.out.println("===========================================================");
        String acct = "" + AccountNumber;
        System.out.println("Account Number: xx" + acct.substring(12));
        System.out.println("Depositing $" + amount + " to the account " + acct);
        Balance += amount;
        System.out.println("Balance is $" + Balance);
    }

    public void withdraw(double amount) {
        System.out.println("============================================================");
        if(Balance <= 0) {
            System.out.println("No available balance!");
            return; // exits the method withdraw
        }
        String acct = "" + AccountNumber;
        System.out.println("Account Number: xx" + acct.substring(12));
        System.out.println("Withdrawing $" + amount + " from the account " + acct);
        Balance -= amount;
        if(Balance < 0) {
            Balance -= 35;
        }
        System.out.println("Balance is $" + Balance);
        if(Balance < 0) {
            Balance -= 35;
        }
    }

    public void showBalance() {
        System.out.println("=============================================================");
        String acct = "" + AccountNumber;
        System.out.println("Account Holder: " + AccountHolder);
        System.out.println("Account Number: xx" + acct.substring(12));
        System.out.println("Available Balance: $" + Balance);
    }

    public void accountSetup(String AccountHolder, long AccountNumber) {
        this.AccountHolder = AccountHolder;
        this.AccountNumber = AccountNumber;

    }
}
