package b12_day22_NestedLoops;

import java.util.Scanner;

public class Practice_Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Which operation do you want to do?");
        String mult = scan.next().toLowerCase();

        switch(mult) {
            case("multiplication"): {
                while(true) {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter two numbers:");
                    int a = input.nextInt();
                    int b = input.nextInt();
                    System.out.println("Multiplication is: " + (a * b));
                    System.out.println("Do you want to continue?");
                    input.nextLine();
                    String answer = input.nextLine().toLowerCase();

                    while(!(answer.equals("yes") || answer.equals("no"))) {
                        System.out.println("Please make up your mind");
                        System.out.println("Do you want to continue?");
                        answer = input.nextLine();
                    } if(answer.equals("no"))
                        break;
                }

            }
            break;

            case("division"): {
                while(true) {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter two numbers:");
                    int c = input.nextInt();
                    int d = input.nextInt();
                    System.out.println("Division is: " + (c / d));
                    System.out.println("Do you want to continue?");
                    input.nextLine();
                    String answer = input.nextLine().toLowerCase();

                    while (!(answer.equals("yes") || answer.equals("no"))) {
                        System.out.println("Please make up your mind");
                        System.out.println("Do you want to continue?");
                        answer = input.nextLine();
                    }
                    if (answer.equals("no"))
                        break;


                }
            }

        }

    }
}
