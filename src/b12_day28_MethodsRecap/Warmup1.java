package b12_day28_MethodsRecap;

import java.util.Arrays;

public class Warmup1 {
    public static void main(String[] args) {
        Array1To100();

    }


    public static void Array1To100() {
        int[] numbers = new int[100];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }
        System.out.println(Arrays.toString(numbers));

        for(int each : numbers) {
            if(each % 2 ==1){
                continue;
            }
            System.out.print(each + " ");
        }
    }
}

