package Replit;

import java.util.Arrays;

public class Sudoxo {
    public static void main(String[] args) {
        int[][] sudoxo = {{1,2,3,4,5,6,7,8,9}, {1,2,3,4,5,6,7,8,9}, {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9}, {1,2,3,4,5,6,7,8,9}, {1,2,3,4,5,6,7,8,9},
                {1,2,3,4,5,6,7,8,9}, {1,2,3,4,5,6,7,8,9}, {1,2,3,4,5,6,7,8,9}};

        for(int j =0; j < 9; j++) {
            int z = 1;
            for(int i = 0; i < 9; i++) {
                if(sudoxo[j][i] > 0 && sudoxo[j][i] < 10 && sudoxo[j][i] != sudoxo[j][z]) {
                    z++;
                } else {
                    System.out.println(false);
                    System.exit(0);
                System.out.print(sudoxo[j][i] + " ");
                }

            }
            System.out.println();
        }


    }
}
