package b12_day34_ArrayList_Constructor;

import java.util.ArrayList;
import java.util.Scanner;

public class WarmUp_ArrayList {
    public static void main(String[] args) {
/*        Double d = Double.valueOf("123.34");
        Double d1 = Double.parseDouble("123.34");

        boolean b = (d==d1);
        System.out.println(b);


        System.out.println(d+1);
        System.out.println(d1+1);*/

        ArrayList<Integer> maxnum = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter");
        int count = scan.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int i = 0; i < count; i++) {
            System.out.println("Please enter an integer: ");
            maxnum.add(scan.nextInt());
            if(maxnum.get(i) > max) {
                max = maxnum.get(i);
            }
            if(maxnum.get(i) < min) {
                min = maxnum.get(i);
            }
        }
        System.out.println(maxnum);
        System.out.println(max);
        System.out.println(min);



    }
}
