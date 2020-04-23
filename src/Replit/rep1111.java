package Replit;

import java.util.Scanner;

public class rep1111 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num3 = scan.nextDouble();
        int num=(int)num3;
        isPalindrome(num); }
    public static void isPalindrome(int num) {
        String fakenumber = "" + num; // Since I cannot get the length of an int I convert my int to String. Also, I am not going
        // to use the final result so there is no problem to conver to String.
        // Therefor,when user enters a number , I will be able to get the number of digits fromt it.
        //I concat my number to the String with ""+
        String reversenumber = ""; //This is the number that I am going to get at the end. I am going to concat each digit starting from
        // last index number here.
        for (int i = fakenumber.length() - 1; i >= 0; i--) { //my loop is sayind that start from the last index number
            reversenumber += fakenumber.charAt(i);}                    //and call the each index number one by one
        if (fakenumber.equals(reversenumber)) {           //Since this is a String and I can user the equals method in order to find the
            // boolean response
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
