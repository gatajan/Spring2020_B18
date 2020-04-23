package b12_day22_NestedLoops;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter two numbers:");
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println("Multiplication is: " + (a * b));
            System.out.println("Do you want to continue?");
            input.nextLine();
            String answer = input.nextLine().toLowerCase();

            while(!(answer.equals("yes") || answer.equals("No"))) {
                System.out.println("Please make up your mind");
                System.out.println("Do you want to continue?");
                answer = input.nextLine();
            }
            if(answer.equals("no")) {
                break;
            }
        }









    }
}
