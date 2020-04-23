package b12_day33_ArrayList_Cont;

import java.util.Arrays;

public class Warmup_1 {
    public static void main(String[] args) {
        int[] str = {3, 1, 5, 6, 2, 0};
        str = sort(str);
        System.out.println(Arrays.toString(str));

        double[] str2 = {10.5, 3.2, 4, 3.0, 10};
        str2 = sort(str2);
        System.out.println(Arrays.toString(str2));

        char[] str3 = {'v', 'b', 't', 'y'};
        str3 = sort(str3);
        System.out.println(Arrays.toString(str3));
    }

    public static int[] sort(int[] arr) {
        Arrays.sort(arr);
        int z = 0;
        int[] descending = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            descending[z] = arr[i];
            z++;
        }
        return descending;
    }

    public static double[] sort(double[] arr) {
        Arrays.sort(arr);
        int z = 0;
        double[] descending = new double[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            descending[z] = arr[i];
            z++;
        }
        return descending;
    }

    public static char[] sort(char[] arr) {
        Arrays.sort(arr);
        int z = 0;
        char[] descending = new char[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            descending[z] = arr[i];
            z++;
        }
        return descending;

    }
}