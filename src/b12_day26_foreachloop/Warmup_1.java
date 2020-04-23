package b12_day26_foreachloop;
// Write a program that can check if two Strings are build out of same letters.

// Hint: Use arrays and array methods.

import java.util.Arrays;
import java.util.Scanner;

public class Warmup_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word:");
        String str1 = scan.nextLine();
        System.out.println("Enter second word:");
        String str2 = scan.nextLine();

        String newStr1 = "";
        String newStr2 = "";
        for(int i = 0; i < str1.length(); i++) {
            if(!newStr1.contains("" + str1.charAt(i))) {
                newStr1 += "" + str1.charAt(i);
            }
        }
        for(int i = 0; i < str2.length(); i++) {
            if(!newStr2.contains("" + str2.charAt(i))) {
                newStr2 += "" + str2.charAt(i);
            }
        }
        System.out.println(newStr1);
        System.out.println(newStr2);


        String [] str1Array = newStr1.split("");
        String [] str2Array = newStr2.split("");

        System.out.println(Arrays.toString(str1Array));
        System.out.println(Arrays.toString(str2Array));

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        System.out.println(Arrays.toString(str1Array));
        System.out.println(Arrays.toString(str2Array));

        str1 = Arrays.toString(str1Array);
        str2 = Arrays.toString(str2Array);

        if(str1.equals(str2)) {
            System.out.println(true);
        } else System.out.println(false);
    }
}
