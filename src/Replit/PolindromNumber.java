package Replit;

import java.util.Scanner;

public class PolindromNumber {
    public static void main(String[] args) {
        int num = 111112;

        int count = count(num);

        int[] arr = new int[count];

        int i =0;
        while (num > 0) {
            arr[i] = num % 10;
            num = num / 10;
            i++;
        }

        int k = 0;
        int[] arr2 = new int[count];
        for(int j = count-1; j >= 0; j--) {
            arr2[j] = arr[k];
            k++;
        }

        int result = 0;
        for(int z = 0; z < count; z++) {
            if(arr[z] == arr2[z]){
                result++;
            }
        }
        if(result == count){
            System.out.println(true);
        } else System.out.println(false);
    }

    public static int count(int num) {
        int count =0;
        while (num > 0) {
            num /= 10;
            count++;
        } return count;
    }
}

class A {
    public static void main(String[] args) {
        int num = 1002;
        int num1=0;
        int num2=num;
        while (num2 !=0)  {
            num1 = num1*10 + num2%10;     // 2, 20, 200, 2001
            num2 = num2/10;               // 100, 10, 1,
        }
        System.out.println(num1);
        if(num==num1){System.out.println(true);}
        else{System.out.println(false);}
    }
}