package b12_day24_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUp_Unique_values_fromArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int [10];

        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter a number");
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));


        for(int j = 0; j < array.length; j++) {
            int count = 0; //////////////////////////// ???????????????
            for(int i = 0; i < array.length; i++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.print(array[j] + " ");
            }
        }





    }
}
