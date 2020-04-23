package day_14_StringManipulation;
import java.util.Scanner;

public class Check_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String split = scan.next();
        System.out.println("Number of people:");
        int number = scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();
        System.out.println("Service quality:");
        String SQ = scan.next();

        String people = (number == 1) ? "&" : (number == 2) ? "&&":
                (number == 3) ? "&&&" : (number == 4) ? "&&&&": "&&&&&";

        double tip = (SQ.equalsIgnoreCase("Excellent")) ? 0.25 : (SQ.equalsIgnoreCase("Great")) ? 0.2 :
                (SQ.equalsIgnoreCase("Good")) ? 0.15 : (SQ.equalsIgnoreCase("Fair")) ? 0.1 : (SQ.equalsIgnoreCase("Poor")) ? 0.05 : 0;

        double totalTip = tip * checkAmount;
        double totalPayment = totalTip + checkAmount;
        double totalPayPerPerson = totalPayment/number;

        System.out.println("Number of people entered: " + people);
        System.out.println("Total to pay: " + totalPayment);
        System.out.println("Total tip: " + totalTip);
        if(split.equalsIgnoreCase("Yes")) {
            System.out.println("Total per person: " + totalPayPerPerson);
            System.out.println("Tip per person: " + totalTip/number);
        } else {
            System.out.println("No split");
        }


    }
}

