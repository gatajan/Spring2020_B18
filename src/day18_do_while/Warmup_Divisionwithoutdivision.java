package day18_do_while;

public class Warmup_Divisionwithoutdivision {
    public static void main(String[] args) {
        int a = 40;
        int b = 6;
        int count = 0;
        if(b == 0) {
            System.exit(0);
        }
        if(a == 0) System.out.println("Result is " + count);
        while(a >= b) {
            a -= b;
            count++;
        }
        System.out.println(count);

        for(int i = 1; i < a; i++) {
            if(a >= b) {
                a -= b;
                count++;
            }
        } System.out.println(count);
        System.out.println("Remainder: " + a);

    }
}
