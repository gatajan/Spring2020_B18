package b12_day29_return_method;

import java.util.Arrays;

public class WarmUp_Returnlargest {
    public static void main(String[] args) {
        greaterName(90,20,30);

        int max = (int)greaterName(90,20,30);
        System.out.println(max);



        int[] arr = {20, 30, 1, 2, 3, 7, 9};
        int max1 = maximum(arr);
        System.out.println(max1);

        int[] arr2 = {100,45,567,67};
        int max2 = maximum(arr2);
        System.out.println(max2);


        String[] arr1 = {"Aman", "Mahriban", "Melek", "Anna", "Gul"};
        String result = str(arr1);
        System.out.println(result);

    }

    public static double greaterName(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);

        return arr[arr.length-1];
    }

    //write a method that accepts int array and returns the maximum number from the array

    public static int maximum(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    //Write a method that accepts String array, and returns the longest String value from the array
    public static String str(String[] arr) {
        String str1 = "";
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() > str1.length()) {
                str1 = arr[i];
            }
        }return str1;
    }
}
