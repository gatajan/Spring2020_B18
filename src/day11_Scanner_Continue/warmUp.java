package day11_Scanner_Continue;

import java.util.Scanner;

public class warmUp {
    public static void main(String[] args) {
     /*   Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary, state tax and federal tax:");
        int salary = scan.nextInt();
        int stateTax = scan.nextInt();
        int federalTax = scan.nextInt();
        int salaryAfterTax = salary - (salary*stateTax/100) - (salary*federalTax/100);

        System.out.println(salaryAfterTax + " $");

        scan.close();*/


        String browserName = "annaly";

        switch(browserName) {

            case "chrome":
                System.out.println("Your selected browser is Chrome");
                break;
            case "firefox":
                System.out.println("Your selected browser is Firefox");
                break;
            case "safari":
                System.out.println("Your selected browser is Safari");
                break;
            case "opera":
                System.out.println("Your selected browser is Opera");
                break;
            default:
                System.out.println("Invalid browser name");
        }

    }
}
