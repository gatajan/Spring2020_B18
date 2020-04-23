package Replit;

public class Umida_3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int elvalue = 3;
        System.out.println(getIndexNumber(array, elvalue));
    }
    public static int getIndexNumber (int[] number, int elementValue) {
        int result = -1;
        for(int i = 0; i <number.length; i++) {
            if(number[i] == elementValue)
                result = i;
        }
        return result;
    }
}
