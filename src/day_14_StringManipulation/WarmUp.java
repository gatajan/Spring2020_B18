package day_14_StringManipulation;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word = scan.nextLine();
        String middle = "";

        if((word.length() % 2 == 0)) {
            middle = word.substring((word.length() - 2) / 2, (word.length() - 2) / 2 + 2);
        }
        System.out.println(middle);
        if((word.length() % 2 != 0)) {
            middle = word.substring(((word.length() - 1) / 2), ((word.length() - 1) / 2) + 1);
            System.out.println(middle);
        }

    }
}
