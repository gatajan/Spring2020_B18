package b12_day23_arrays;

import java.util.Scanner;

public class warmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int count = 0;
        if(num2 != 0) {
            while (num1 >= num2) {
                num1 -= num2;
                count++;
            }
            System.out.println("division is: " + count);
        } else System.out.println("Invalid entry");
    }
}
