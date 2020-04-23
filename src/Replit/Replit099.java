package Replit;

import java.util.Scanner;

public class Replit099 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;
        int output = 0;
        String remDoub = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(remDoub.contains("" + str.charAt(i)))) {
                remDoub += str.charAt(i);
            }
        }
        System.out.println(remDoub);

        for (int j = 0; j < remDoub.length(); j++) {
            for (int i = 0; i < str.length(); i++) {
                if (remDoub.charAt(j) == str.charAt(i))
                    count++;
                if (count == 3 && remDoub.charAt(j) == str.charAt(i - 1) && remDoub.charAt(j) == str.charAt(i - 2)) {
                    output += 1;
                }
                if (count == 4 && remDoub.charAt(j) == str.charAt(i - 1) && remDoub.charAt(j) == str.charAt(i - 2))
                    output += 1;
                if (count == 5)
                    output += 1;
            }
            System.out.println( output);
        }
    }
}
