package b12_day44_AccessModifier;

public class bankAccount {

    private String accountHolder;
    private long accountNumber;
    private double availableBalance;
////////////////////////////////////////////////////   GETTER  //////////////////////////////////////////////
    public String getAccountHolder() {
        return accountHolder;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public double getAvailableBalance() {
        return availableBalance;
    }
    /////////////////////////////////////////////////  SETTER  ////////////////////////////////////////////
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

/////////////////////////////////////////////////////  METHODS //////////////////////////////////////////////

    //ACTIONS - DEPOSIT

    public void deposit (double amount){
        availableBalance += amount;
    }

    public void withDraw(double amount){
        if(availableBalance < 0) {
            System.out.println("Your account balance is less than Zero");
            return;
        }
        if(amount > availableBalance) {
            availableBalance -= 35;
        }
        availableBalance -= amount;
        System.out.println("Available balance: " + availableBalance);
    }

    public void checkingBalance() {
        System.out.println("Available balance: " + availableBalance);
    }

    public void getAccountInfo() {
        System.out.println("Name: " + getAccountHolder());
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Available Balance: " + getAvailableBalance());
    }







}
