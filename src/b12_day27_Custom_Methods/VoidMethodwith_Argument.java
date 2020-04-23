package b12_day27_Custom_Methods;

public class VoidMethodwith_Argument {

    /*
    Methods with parameters - sometime method needs specific information to perform its task.
    Then, we need to declare the method with parameters.

    Ex:
    int[] arr = {1,2,3};
    Arrays.sort(arr);
    array is the argument, and sort method. Functionality id to sort the given array.

    methods with argument:
    acc-modifier -  specifier - return-type - name(parameter) {

    }
     */

    public static void main(String[] args) {
        oddOrEven(100);
        int z =50;
        oddOrEven(z);
        SumOfTwoNum(10, 20);
        RemoveDublicates("aabbbcccdddkkk");

    }

    public static void oddOrEven(int a) {
        if(a % 2 ==0) {
            System.out.println(a + " even number");
        } else System.out.println(a + " is odd number");
    }

    public static void SumOfTwoNum(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is: " + (a+b));
    }

    public static void RemoveDublicates(String a) {
        String b = "";
        for(int i = 0; i < a.length(); i++) {
            if(!b.contains(a.substring(i, i+1))) {
                b += "" + a.charAt(i);
            }
        }
        System.out.println(b);
    }



}
