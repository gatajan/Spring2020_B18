package WarmUp_Muhtar;

import java.text.DecimalFormat;

public class AverageNumberOfIntArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7};
        int sum = 0;
        int avg = 1;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        } avg = sum/arr.length;
        System.out.println(avg);

        DecimalFormat DF = new DecimalFormat("0.00");
        System.out.println(DF.format(avg));
    }
}
