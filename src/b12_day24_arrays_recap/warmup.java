package b12_day24_arrays_recap;

import java.util.Arrays;
import java.util.Scanner;

public class warmup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int [5];
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter " + (i+1) + " number:");
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of the Int arrays is equal to: " + sum);
    }
}
