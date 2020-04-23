package b12_day22_Loops_Recap;

public class Warmup3 {
    public static void main(String[] args) {
/*        int sum = 1;
        for(int i = 0; i <= 10; i++) {
            if(i % 2 ==1) {
                sum += i;
            }
        }
        System.out.println(sum);*/


/*        int sum = 0;
        int i = 1;

        while (i <= 10) {
            if (i % 2 == 1) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);*/

        int sum = 0;
        int i = 0;

        do {
            i++;
            if (i % 2 == 1) {
                sum += i;
            }
        } while(i < 10);

        System.out.println(sum);
    }
}
