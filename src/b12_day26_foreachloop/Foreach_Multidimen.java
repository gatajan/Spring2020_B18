package b12_day26_foreachloop;

import java.util.Arrays;

public class Foreach_Multidimen {
    public static void main(String[] args) {

        int[] arr1D = {1, 2, 3, 4, 5};

        int[][] arr2D = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10} };
        for(int i = 0; i < arr2D.length; i++) {
            for(int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
        }
        System.out.println("===========================================");

        for(int[] each : arr2D) {
            for(int each2 : each) {
                System.out.print(each2 + " ");
            }
        }
        System.out.println();

        String[][] str2D = {{"Bibish", "Sayfo"}, {"Mekan", "Melek", "Bekir"}};
        for(String[] each1 : str2D) {
            System.out.print(Arrays.toString(each1));
            for(String each2 : each1) {
                System.out.println(each2 + " ");
            }
            System.out.println();
        }
    }
}
