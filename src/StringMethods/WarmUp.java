package StringMethods;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {

        /*
        scanner warmup tasks:
    1. write a program that can calculate the area of circle
                needed information:
                                    1. radius of the cirle
    2. Ask user to enter two words. Then add them together and print.
                        Input:
                            one
                            eight
                        Output:
                            oneeight
    3. Write a Java Program that can calculate the garde of a student based on the score,
        implement the following logic:
                If marks < 60, then print "Fail"
                If marks >= 60, but less than 90, then print "Pass"
                If marks >= 90, then print "Passed with Distinction"
                MUST use scanner
    4. Revenue can be calculated as the selling price of the product times the quantity sold,
    i.e. revenue = price × quantity. Write a program that asks the user to enter product price
    and quantity and then calculate the revenue. If the revenue is more than 5000 a discount
    is 10% offered. Program should display the discount and net revenue.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 words");

        String word1 = scan.next();
        String word2 = scan.next();

        System.out.println(word1.concat(word2));


    }
}
