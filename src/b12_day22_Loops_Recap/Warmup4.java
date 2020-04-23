package b12_day22_Loops_Recap;

import java.util.Scanner;

public class Warmup4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        int min = 1;
        for(int i = 1; i <= 10; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();
            sum += num;
            if(num > max) {
                max = num;
            }
            if(num < min) min = num;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);



    }
}
