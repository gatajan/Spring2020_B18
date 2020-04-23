package WarmUp_Muhtar;

import java.util.Arrays;
import java.util.Scanner;

public class longestStringFromArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many words do you want to enter?");
        int words = scan.nextInt();
        String[] strArr = new String[words];
        for(int i = 1; i <= words; i++) {
            System.out.println("Please enter " + i + " word:");
            String word = scan.next();
            strArr[i-1] = word;
        }
        System.out.println(Arrays.toString(strArr));

        String longest = "";

        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].length() > longest.length()) {
                longest = strArr[i];
            }
        }
        System.out.println(longest);

        String shortest = longest;
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].length() < shortest.length()) {
                shortest = strArr[i];
            }
        }
        System.out.println(shortest);
    }
}
