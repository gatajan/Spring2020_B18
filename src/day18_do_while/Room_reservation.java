package day18_do_while;

import java.util.Scanner;

public class Room_reservation {
    public static void main(String[] args) {


        while (true) {
            Scanner scan = new Scanner(System.in);
            int price = 0;
            System.out.println("Which bedroom do you want to reserve?");
            String bedroom = scan.nextLine();

            while (!(bedroom.equalsIgnoreCase("King Bed") ||
                    bedroom.equalsIgnoreCase("Queen Bed") ||
                    bedroom.equalsIgnoreCase("Single Bed"))) {
                System.out.println("Invalid entry, please re-enter!" + "\n" +
                        "Which bedroom do you want to reserve?");
                bedroom = scan.nextLine();
            }
            if (bedroom.equalsIgnoreCase("King Bed")) price += 120;
            if (bedroom.equalsIgnoreCase("Queen Bed")) price += 100;
            if (bedroom.equalsIgnoreCase("Single Bed")) price += 80;

            System.out.println("Do you want to reserve another room?");
            bedroom = scan.next();
            while (!(bedroom.equalsIgnoreCase("No") ||
                    bedroom.equalsIgnoreCase("Yes"))) {
                System.out.println("Invalid entry, please re-enter!");
                bedroom = scan.nextLine();
            }
            if (bedroom.equalsIgnoreCase("no")) {
                System.out.println("Your total is " + price);
                break;
            }

        }
    }
}
