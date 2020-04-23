package b12_day22_NestedLoops;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two numbers");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("Addition is: " + (a + b));
            System.out.println("Do you want to continue");
            String answer = scan.next();

            while (!(answer.equals("yes") || answer.equals("no") )) {
                System.out.println("Invalid entry");
                System.out.println("Do you want to continue?");
                answer = scan.next();
            }

            if(answer.equalsIgnoreCase("no")) {
                break;
            }

        }





    }
}
