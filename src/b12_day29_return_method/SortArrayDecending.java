package b12_day29_return_method;

import java.util.Arrays;

public class SortArrayDecending {
    public static void main(String[] args) {
        int[] m = {13, 20, 42, 67, 5, 1};
        System.out.println(Arrays.toString(Sort(m)));

    }

    public static int[] Sort(int[] arr){

        Arrays.sort(arr);
        int[] k = new int[arr.length];
            for (int i = arr.length - 1; i >= 0; i--) {
                k[arr.length-i-1] = arr[i];
            } return k;
    }
}
