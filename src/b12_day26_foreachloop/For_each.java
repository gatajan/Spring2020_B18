package b12_day26_foreachloop;

import java.util.Arrays;

public class For_each {
    public static void main(String[] args) {
        // For each loop is used to access the value in a collection of values such as Arrays.
        // It is a loop that is already iterated.
        // Never be infinite loop
        /*
        syntax of for each loop:
            for(DataType each : VariableNameOfCollection) {
                }
         When we should use this? when we don't need to create index variables.

         */
        int[] arr = {1, 2, 3, 4, 5};
        for(int i= 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("===========================");

        for(int each : arr) {
            System.out.println(each);
        }

        String[] str1 = {"A", "B", "C",};
        for(String each : str1) {
            System.out.print(each + " ");
        }

        System.out.println("=========================================");

        char[] ch = {'z', 'x', 'y', 'c', 'a', 'b'};
        Arrays.sort(ch);
        for(char each : ch) {
            System.out.println(each);
        }

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        for(int each : arr1) {
            if(each % 2 ==0) // prints all even numbers
            System.out.print(each + " ");
        }
    }
}
