package b12_day20_recap;

import java.util.Scanner;

public class WarmUp5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Grader!");

        for(int i = 1; i <= 5; i++) {
            System.out.println("Please enter subject name number "+ i + " and score for this subject");
            String subject = scan.next();
            double grade = scan.nextDouble();
        }


    }
}
