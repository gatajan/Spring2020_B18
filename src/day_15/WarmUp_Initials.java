package day_15;

import java.util.Scanner;

public class WarmUp_Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String name = scan.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();

        String initial = "" + name.toUpperCase().charAt(0) + lastName.toUpperCase().charAt(0);
        System.out.println("Initial is " + initial);

    }
}
