package b12_day33_ArrayList_Cont;

import java.util.ArrayList;

public class ArrayList_methodsCont {
    public static void main(String[] args) {

        //////////////////// SET(index number, Object) //////////////////////////
        ArrayList<String> list = new ArrayList<>();
        list.add("Jena");
        list.add("Mary");
        list.add("Annaly");
        list.add("Mahriban");

        list.set(1, "Bekir");
        System.out.println(list);
        list.remove(0);
        list.add(0, "Melek");
        System.out.println(list);


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(200);

    }
}
