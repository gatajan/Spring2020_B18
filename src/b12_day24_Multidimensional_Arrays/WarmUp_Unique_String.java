package b12_day24_Multidimensional_Arrays;

public class WarmUp_Unique_String {
    public static void main(String[] args) {
        //// WRITE A PROGRAM THAT CAN PRINT OUT THE UNIQUE VALUES FROM STRING ARRAY

        String[] arr = {"Annaly", "Bekir", "C", "C"};

        for(int j = 0; j < arr.length; j++) {
            int count = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.println( arr[j] );
            }
        }
    }
}
