package b12_day22_Loops_Recap;

public class warmup1 {
    public static void main(String[] args) {
/*        int sum =0;
        for(int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println(sum);*/


/*        int sum1 = 0;

        int i = 1;
        while(i <= 1000) {

            sum1 += i;
            i++;
        }
        System.out.println(sum1);*/

        int sum = 0;
        int i = 0;

        do {
            sum += i;
            i++;

        }
            while (i <= 1000);

        System.out.println(sum);

    }
}
