package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Apple_question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int numbers = scan.nextInt();
        int[] raw = new int[numbers];
        for(int i = 0; i < numbers; i++) {
            System.out.println("Please enter the number:");
            int num = scan.nextInt();
            raw[i] = num;
        }
        System.out.println(Arrays.toString(raw));

        int count = 0;
        for(int i = 0; i < raw.length; i++) {
            if (raw[i] == 0) {
                count++;
            }
        }
        System.out.println(count);
        int[] result = new int[raw.length];
        int z = count;
        for (int i = 0; i < result.length; i++) {
            if (raw[i] != 0) {
                result[z] = raw[i];
                z++;
            }
        }
        System.out.print(Arrays.toString(result));
    }
}
