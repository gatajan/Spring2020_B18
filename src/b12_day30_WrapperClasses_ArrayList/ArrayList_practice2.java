package b12_day30_WrapperClasses_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i <= 30; i+=2) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(4));

        for(int each: list) { //unboxing
            System.out.print(each + " ");
        }
        System.out.println();
        //OR//
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

            int num = list.get(7); //unboxing. There is no primitives in array list.
            //list.clear();
            System.out.print(list.get(2)); // It has been cleared. No warapper classes.
        }

        System.out.println();
        ///////// ArrayList Sorting ////////////////////////////
        //Collections class is in "java.util" package.

        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 20; i >= 0; i--) {
            list2.add(i);
        }
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
    }
}
