package StringMethods;

import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args) {

        /*
        4. Revenue can be calculated as the selling price of the product times the quantity sold,
    i.e. revenue = price × quantity. Write a program that asks the user to enter product price
    and quantity and then calculate the revenue. If the revenue is more than 5000 a discount
    is 10% offered. Program should display the discount and net revenue.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter price");
        double price = input.nextDouble();
        System.out.println("Enter quantity");
        int quantity = input.nextInt();
        double revenue = price*quantity;

        if(revenue > 5000 ) {
            System.out.println("Discount: 10%");
            System.out.println("Net revenue:" + revenue*0.9);
        } else {
            System.out.println("Discount: 0%");
            System.out.println("Net revenue:" + revenue);
        }

    }
}
