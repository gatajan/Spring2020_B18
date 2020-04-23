package Replit;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {
        String str1 = "aabbccdd";
        String str2 = "abcdk";

        String remDub1 = "";
        for(int i = 0; i < str1.length(); i++) {
            if(!remDub1.contains(str1.substring(i, i+1))) {
                remDub1 += str1.charAt(i);
            }
        }
        String remDub2 = "";
        for(int i = 0; i < str2.length(); i++) {
            if(!remDub2.contains(str2.substring(i, i+1))) {
                remDub2 += str2.charAt(i);
            }
        }
        String[] Arr1 = remDub1.split("");
        String[] Arr2 = remDub2.split("");

        Arrays.sort(Arr1);
        Arrays.sort(Arr2);
        System.out.println(Arrays.toString(Arr1));
        System.out.println(Arrays.toString(Arr2));

        boolean result = Arrays.equals(Arr1, Arr2);
        System.out.println(result);
    }
}
