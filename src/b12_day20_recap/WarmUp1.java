package b12_day20_recap;

import java.util.Scanner;

public class WarmUp1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter random 10 numbers");
        int sum = 0;
        for(int i = 1; i <= 5; i++) {
            int inputNum = input.nextInt();
            sum += inputNum;
        }
        System.out.println(sum);





    }
}
