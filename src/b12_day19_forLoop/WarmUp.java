package b12_day19_forLoop;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username and password:");

        String userName = scan.nextLine().toLowerCase();
        String password = scan.nextLine();

        boolean gmail = userName.endsWith("@gmail.com");
        boolean pass = password.equals("Javengers");

        if(gmail && pass)
            System.out.println("logged in successfully");
        else if(!gmail)
            System.out.println("It is not a valid email");
        else System.out.println("Invalid username or password");

    }
}
