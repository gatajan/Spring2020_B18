package b12_day16_recap;

import java.util.Scanner;

public class next_Vs_nextLine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String f = scan.next();

        System.out.println("Enter your last name");
        String l = scan.next();

        System.out.println("Your first name is " + f);
        System.out.println("Your last name is " + l);

    }
}
