package b12_day30_WrapperClasses_ArrayList;

/*
ArrayList class:
1. presented in "java.util". import java.util.ArrayList;
2. It does not support Primitives.
3. Similar to arrays but we store Objects(non primitive)
4. ArrayList size is automatically adjusted (dynamic)
5. ArrayList is ordered, it has index numbers.

Declaration of arrylist:
ArrayList<ClassType>variableName = new ArrayList<>();

Methods of ArrayList:
1. add(Value):
2. get(indexValue): It gets idvidual index value from ArrayList.
3. size(): return the length (total number of values) from the arrylist
4. clear(): clears the array, removes all the values out from the array.
5. Collections.sort(Variable Name): Sorting ArryList.

 */

import java.util.ArrayList;

public class Array_ListClass {
    public static void main(String[] args) {
/////////////////////////// DECLARATION /////////////////////////////////////
        ArrayList<Integer> list = new ArrayList<>(); //preferred
        ArrayList<Integer> list2 = new ArrayList<Integer>();
/////////////////////// ADD METHOD /////////////////////////////////////////
        list2.add(10); //auto-boxing
        list2.add(20);
        list2.add(30);
        System.out.println(list2);

        //////////////////// GET METHOD ////////////////////////////////////
        System.out.println(list2.get(1));
///////////////////////////// SIZE() METHOD ////////////////////////////////
        System.out.println(list2.size());

        //////////////////////// CLEAR METHOD ////////////////////////////////
        list2.clear();
        System.out.println(list2);

    }
}

