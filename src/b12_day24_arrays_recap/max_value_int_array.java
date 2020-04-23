package b12_day24_arrays_recap;

import java.util.Scanner;

public class max_value_int_array {
    public static void main(String[] args) {
        ////////////////////////////// ASSIGNING ARRAYS VIA SCANNER //////////////////////
        int[] array = new int[5];
        Scanner scan = new Scanner(System.in);
        int max = 0;

        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter " + (i+1) + " number");
            array[i] = scan.nextInt();
        }
        ///////////////////////////// PRINTING ARRAYS /////////////////////////////////
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        /////////////////////////////// MAXIMUM NUMBER /////////////////////////////////

        int Max = 0;
        for(int j = 0; j < array.length; j++) {
            if(array[j] > Max) {
                Max = array[j];
            }
        }
        System.out.println("Maximum number entered: " + Max);

        int secondMax = 0;
        for(int k = 0; k < array.length; k++) {
            if(array[k] > secondMax && array[k] != Max) {
                secondMax = array[k];
            }
        }
        System.out.println("Second maximum number entered: " + secondMax);

        //////////////////////////////////////////===MINIMUM NUMBER ====///////////////////

        int min =999999999;
        for(int a = 0; a < array.length; a++) {
            if(array[a] < min)
                min = array[a];
        }
        System.out.println("Minimum number entered is:" + min);

        int secondMin = 999999999;
        for(int b = 0; b < array.length; b++) {
            if(array[b] < secondMin && array[b] > min)
                secondMin = array[b];
        }
        System.out.println("Second minimum number entered is: " + secondMin);




    }
}
