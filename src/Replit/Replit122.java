package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit122 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        int max = -999999;
        for(int each : inhabitants) {
            if(each > max) {
                max = each;
            }
        }
        int count = 0;
        while(max > 1) {
            count++;
            max = max/2;
        }

        int day = 0;
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            for (int i = 0; i <= count; i++) {
                for (int j = 0; j < inhabitants.length; j++) {
                    inhabitants[j] = inhabitants[j] / 2;
                }
                System.out.println("Day " + (i+1) + " " + Arrays.toString(inhabitants));
            }
            System.out.println("---- EXTINCT ----");
    }
}
