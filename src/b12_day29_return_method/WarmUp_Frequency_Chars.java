package b12_day29_return_method;

// Write a method that can find the frequency of characteristics in String

import b12_day23_arrays.Array;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUp_Frequency_Chars {
    public static void main(String[] args) {
        freqOfChar("AABBCCDDKKKKK" );

    }
    ///////////////////////////////////// LONGER WAY ////////////////////////////////////
    public static void frequencyOfCharacteristics() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.nextLine();

        String noDublicate = "";
        for(int i = 0; i < word.length(); i++) {
            if(!noDublicate.contains(word.substring(i, i+1))) {
                noDublicate += word.charAt(i);
            }
        }
        System.out.println(noDublicate);

        for(int i = 0; i < noDublicate.length(); i++) {
            int count = 0;
            for(int j = 0; j < word.length(); j++) {
                if(noDublicate.substring(i, i+1).equals(word.substring(j, j+1))) {
                    count++;
                }
            } System.out.print("" + noDublicate.substring(i, i+1) + count);
        }
    }
////////////////////////////////////// SHORTER WAY //////////////////////////////////////
    public static void freqOfChar(String str) {
         //expected result = A4B4C2D2;
        String expectedResult = "";

        for(int j= 0; j < str.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            } expectedResult += "" + str.charAt(j) + count;
            str = str.replace("" + str.charAt(j), "");
        }
        System.out.println(expectedResult);
////////////////// INCOMPLETE //////////////////////////
    }
}
