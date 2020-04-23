package b12_day21_while_dowhile;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");

        String str = "book";

        String sentence = scan.nextLine();

        int count = 0;

        for(int i = 0; i < sentence.length()-3; i++ ) {

            if(sentence.substring(i, i+4).equals("book")) {
                count ++;
            }
        }

    }
}
