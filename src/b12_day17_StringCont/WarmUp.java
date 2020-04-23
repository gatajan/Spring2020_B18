package b12_day17_StringCont;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Name");
        String firstName = input.nextLine();

        System.out.println("Enter your Last name");
        String lastName = input.nextLine();

        String fullName = lastName.concat(" " + firstName);
        System.out.println(fullName);

        System.out.println("Your full name has " + (fullName.length()-1) + " characters");
        System.out.println(fullName.charAt(1));

        input.close();
    }
}
