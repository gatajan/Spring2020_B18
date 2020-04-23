package b12_day29_return_method;
/*The benefits of overload method:
1. Improves the reusability
2. Improves readablity
3. very flexile
*
*
* */
import java.util.Arrays;
//All the methods can be overloaded. "Main" method included.
public class Method_Overloading {
    public static void main(String[] args) {
        int result = sum(10,20);
        int result1 = sum(2,3,4);

        int[] arr = {1,2,3,4};
        Sort(arr);
        System.out.println();
        char[] arr1 = {'a', 'b', 'h'};
        Sort(arr1);
        System.out.println();
        String[] arr2 = {"Ana", "Bekir", "Melek"};
        Sort(arr2);

    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int sum(int a, int b, int c) {
        return a+b+c;
    }

    public static double sum(double a, double b) {
        return a+b; //
    }

    // Arrays.sort(): is a method overloading. It contains all the data types.

    //write method called sort, that can sort an int array in descending order

    public static void Sort(int[] arr) {
        Arrays.sort(arr);
        for(int  i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Sort(char[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Sort(String[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
