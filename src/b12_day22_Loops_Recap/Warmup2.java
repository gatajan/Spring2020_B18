package b12_day22_Loops_Recap;

public class Warmup2 {
    public static void main(String[] args) {

/*        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);*/

/*        int sum = 0;
        int i = 1;

        while(i <= 10) {
            if(i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);*/

        int sum = 0;
        int i = 1;

        do {
            if(i % 2 == 0) {
            sum += i;
            }
            i++;
        } while(i <= 10);
        System.out.println(sum);

    }
}
