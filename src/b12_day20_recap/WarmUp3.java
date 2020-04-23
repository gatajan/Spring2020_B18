package b12_day20_recap;

import java.util.Scanner;

public class WarmUp3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min =0;
        System.out.print("Enter 5 numbers");

        for(int i = 1; i <= 5; i++) {

            int inputNum = input.nextInt();
            if(min > inputNum) {
                min = inputNum;
            }

        }
        System.out.println("Min Value is: " + min);

    }
}
