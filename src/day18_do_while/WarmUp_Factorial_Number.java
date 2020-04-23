package day18_do_while;

public class WarmUp_Factorial_Number {
    public static void main(String[] args) {
        int input = 5;
        int result =1;

        for(int i = 2; i <= input; i++) {
            result *= i;
        }
        System.out.println(result);

        int i = 0;
        int j = 7;
        for(i=0; i < 10; ) {
            i+=2;
            System.out.println(i);
        }
    }
}
