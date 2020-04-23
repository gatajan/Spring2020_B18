package b12_day24_arrays_recap;

import java.util.Arrays;
import java.util.Scanner;

public class finding_longest_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String longest = " ";
        String shortest = "                                                        ";
        String [] str = new String[5];

//////////////////////////////////// ASSIGNING ARRAY VIA SCANNER /////////////////////
        for(int i = 0; i < str.length; i++) {
            System.out.println("Enter a word");
            str[i] = scan.next();

        }
        System.out.println(Arrays.toString(str));
        ////////////////////////// LONGEST NAME //////////////////////////////////////

        for(int i =0; i < str.length; i++) {
            if(str[i].length() > longest.length()) {
                longest = str[i];
            }

        } System.out.println("The longest name is: " + longest);

        ///////////////////// SHORTEST NAME /////////////////////////////////////////

        for(int i =0; i < str.length; i++) {
            if(str[i].length() < shortest.length()) {
                shortest = str[i];
            }

        } System.out.println("The longest name is: " + shortest);

    }
}
