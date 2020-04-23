package b12_day34_ArrayList_Constructor;

import b12_day23_arrays.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_MethodsCont {
    public static void main(String[] args) {

        /*
        indexOf(), lastIndexOf()
        Converting Array to arrayList
        removeAll(), addAll()
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//autoboxing
        list.add(Integer.valueOf("33")); //none boxing
        list.add(Integer.parseInt("100")); // autoboxing
        list.add(200);
        list.add(33);

        //indexOf(Object): returns the first index number for a given object.
        //If it returns negative number, it means the given object is not exist.
        int a = list.indexOf(200);
        System.out.println(a);

        //lastIndexOf(object): Returns last occured object' index number.

        int b = list.lastIndexOf(33);
        System.out.println(b);

        ///////////////////// Converting Array to ArrayList ////////////////////////////////
        // Arrays.asList(Object Array): used for converting object arrays to List interface.
        Integer[] arr = {1, 2, 3, 4, 5};

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        list2.add(100);
        System.out.println(list2);

        String[] arr2 = {"Java", "Pyton", "C#", "C++"};
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList(arr2));
        System.out.println(list3.isEmpty());
        list3.add("F");
        System.out.println(list3);

        ////////////////////////// addAll(Interface) //////////////////////////////////////////
        // Is used for storing multiple objects to array list.
        //Arrays.asList: is one of the Interface.

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Almaz", "Ibrahim", "Tabi"));
        System.out.println(names);
        String[] allnames = {"Hakan", "Alex","Rowshen"};
        names.addAll(Arrays.asList(allnames));
        System.out.println(names);

        ///////////////////////// removeAll(Interface) ///////////////////////////////////////
        // removes all the objects.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(5,5,5,6,7,8,9,0,1,1,1,2,2,2,2,3,3,3,4,4,4));
        System.out.println(numbers);
        numbers.removeAll(Arrays.asList(1));
        System.out.println(numbers);

        /////////////////////////// SORTING THE ARRAYLIST ///////////////////////////////////
        //Sort method from collections class.

        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
