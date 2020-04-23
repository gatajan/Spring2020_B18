package b12_day24_arrays_recap;

import java.util.Arrays;

public class Array_recap {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[array1.length + array2.length];

        for(int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        System.out.println(Arrays.toString(array3));

        for(int k = array1.length; k < array3.length; k++) {
            array3[k] = array2[k-array1.length];
        }
        System.out.println(Arrays.toString(array3));
    }
}
