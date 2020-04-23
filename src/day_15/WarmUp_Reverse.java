package day_15;

import java.util.Scanner;

public class WarmUp_Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();

        String reverse ="";

        for(int i = sentence.length()-1; i >= 0; i--) {
            reverse += sentence.charAt(i);
        }
        System.out.println("Reverse of the entered sentence: " + reverse);
    }
}
