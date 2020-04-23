package b12_day22_NestedLoops;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many items are your purchasing?");
        int number = scan.nextInt();
        double totalPrice = 0;
        String items = "";

        for(int i = 1; i <= number; i++) {
            System.out.print("What is Item " + i);
            String item = scan.nextLine();
            System.out.println("How much is " +item);
            double price = scan.nextDouble();
            totalPrice += price;
            items += " " + item + ",";
        }
        System.out.println("Your items: " + items);
        System.out.println("Your total Price: $" + totalPrice);

    }
}
