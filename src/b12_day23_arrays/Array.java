package b12_day23_arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        String[] AllStudent = {"Ibrahim", "Zuleyha", "Elina"};

        System.out.println(AllStudent[0]);
        AllStudent[0] = "Marufjan"; // Reassigned to different value
        System.out.println(AllStudent[0]);


        // 2nd way of initializing Arrays without giving value

        int[] array = new int[4]; // this array can contain 4 values
        System.out.println(array.length);
        System.out.println(array[0]); // 0
        System.out.println(array[1]); // 0
        System.out.println(array[3]); // 0

        int[] array2;
        // System.out.println(array2[0]); // Array's size is not initilized

        // give values to the array:
        array[1] = 100;
        System.out.println(array[1]);
        array[0] = 200;
        System.out.println(array[0]);
        array[3] = 500;
        System.out.println(array[3]);

        /// SCANNER////////////////////////////////////////////////////////////////////

        Scanner scan = new Scanner(System.in);

        int[] Inputs = new int[10];

        for(int i = 0; i < Inputs.length; i++){
            System.out.println("Enter a number");
            Inputs[i] = scan.nextInt();
        }
        for(int i = 0; i < Inputs.length; i++) {
            System.out.println(Inputs[i] + " ");
        }






    }
}
