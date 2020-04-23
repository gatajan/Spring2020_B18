package b12_day19_forLoop;

import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args) {
/*      Scanner scan = new Scanner(System.in);
        int max = 0;
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i+1) + " number:");
            int number = scan.nextInt();
            if(number > max) {
                max = number;
            }
        }
        System.out.println(max);*/

/*        Scanner scan = new Scanner(System.in);
        int min = 999999999;
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i+1) + " number:");
            int number = scan.nextInt();
            if(number < min) {
                min = number;
            }
        }
        System.out.println(min);*/

        Scanner scan = new Scanner(System.in);
        String maxLength = "";
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter " + (i+1) + " word:");
            String longest = scan.next();
            if(longest.length() > maxLength.length()) {
                maxLength = longest;
            }
        }
        System.out.println(maxLength);
    }
}
