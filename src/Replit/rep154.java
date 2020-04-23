package Replit;

public class rep154 {
    public static void main(String[] args) {
        int num=1020; // int number
        int count =0;
        while (num > 0) {

            System.out.println( num % 10);

            num = num / 10;
            count++;

        }
        System.out.println(count);
    }
}
