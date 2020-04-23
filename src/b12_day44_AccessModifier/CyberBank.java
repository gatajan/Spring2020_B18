package b12_day44_AccessModifier;

import java.util.ArrayList;
import java.util.Arrays;

public class CyberBank {
public static void main (String[] args){
    bankAccount Annaly = new bankAccount();
    Annaly.setAccountHolder("Annaly Gurbanov");
    Annaly.setAccountNumber(349875498043l);

    System.out.println("Name: " + Annaly.getAccountHolder());
    System.out.println("Account number: " + Annaly.getAccountNumber());
    System.out.println("Available Balance: " + Annaly.getAvailableBalance());

    Annaly.deposit(2000);
    Annaly.checkingBalance();
    Annaly.withDraw(3000);



    bankAccount Melek = new bankAccount();
    Melek.setAccountHolder("Annaly");
    Melek.setAccountNumber(9898798698696l);
    Melek.getAccountInfo();
    Melek.deposit(50000);
    Melek.checkingBalance();
    Melek.withDraw(5000);
    Melek.getAccountInfo();
//////////////////////////////////////////////////////////////////////////////????????????????????????????????????????
    bankAccount[] accounts = {Annaly, Melek};
    ArrayList<bankAccount> Accounts = new ArrayList<>();
    Accounts.addAll(Arrays.asList(Annaly, Melek));
    System.out.println(Accounts);
    System.out.println(Arrays.toString(accounts));
}

}
