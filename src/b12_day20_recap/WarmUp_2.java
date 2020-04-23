package b12_day20_recap;

import java.util.Scanner;

public class WarmUp_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        System.out.println("Enter 5 numbers");

        for(int i = 1; i <= 5; i++) {
            int inputNum = input.nextInt();
            if(inputNum > max) {
                max = inputNum;
            }

        }
        System.out.println(max);

    }
}
