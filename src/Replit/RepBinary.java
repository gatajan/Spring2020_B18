package Replit;

import java.util.Scanner;

public class RepBinary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }
        int decimal =0;
        for(int i = 7; i >= 0; i--){
            if(binary[i] == 1) decimal += Math.pow(2, 7-i);
        } System.out.println(decimal);
    }
}
