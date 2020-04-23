package b12_day18_StringCont;

import java.util.Scanner;

public class warmup2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name and last name:");

        String firstName = scan.nextLine();
        String lastName = scan.nextLine();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = ("" + lastName.charAt(0)).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(firstName + " " + lastName);


    }
}
