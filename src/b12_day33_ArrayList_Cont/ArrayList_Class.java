package b12_day33_ArrayList_Cont;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList_Class {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        ////////////////////// ADD(OBJECT) METHOD //////////////////////////////
        shoppingList.add("Potato");
        shoppingList.add("Orange");
        shoppingList.add("Grape");
        shoppingList.add("Melon");

        System.out.println(shoppingList);

        ///////////////////////// ADD(INDEX, OBJECT) //////////////////////////

        shoppingList.add(1, "Strawberry");
        System.out.println(shoppingList);
        //shoppingList.add(6, "Water"); // You cant give empty index number, it will give error.
        System.out.println(shoppingList);

        ////////////////////// GET METHOD ////////////////////////////////////

        ArrayList<String> names = new ArrayList<>();
        names.add("Mahriban");
        names.add("Bekir");
        names.add("Annaly");
        names.add("Melek");
        names.add(0, "Gurbanov");

        String str1 = names.get(2);
        System.out.println(str1);
        System.out.println(names.get(0));

        ////////////////////////////////////////// SIZE() METHOD //////////////////
        System.out.println("===============================================");
        int length = names.size();

        for(int i = 0; i < names.size(); i++) {
            String each = names.get(i) + " ";
            System.out.print(each);
        }

        for(String each : names) {
            System.out.print(each + " ");
        }
        System.out.println("===========================================");
        ////////////////////// CLEAR() METHOD /////////////////////////////////////
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Holy");
        names1.add("Ekrem");
        names1.add("Jeyhun");
        names1.add("Mekan");
        System.out.println(names1);
        System.out.println(names1.size());
        names1.clear();
        System.out.println(names1);

        System.out.println("===============================================");

        ///////////////////////////////// SET(index, object METHOD /////////////////////////////
        // Given object will replace the object in given index number.

        ArrayList<String> Javengers = new ArrayList<>();
        Javengers.add("Ferhat");
        Javengers.add("Guljannat");
        Javengers.add("Seyfo");
        Javengers.add("Mert");

        Javengers.set(0, "Mahriban");
        System.out.println(Javengers);

        ////////////////////////// CONTAINS(object) ////////////////////////////////
        ArrayList<String> goodGuys = new ArrayList<>();
        goodGuys.add("Hakan");
        goodGuys.add("Ihsan");
        goodGuys.add("Tim");
        goodGuys.add("Ibrahim");

        boolean result = goodGuys.contains("Tim");
        System.out.println(result);

        /////////////////////////// EQUALS(ArrayList)//////////////////////////
        //Checks if 2 Array List are equal or not.

        ArrayList<String>badGuys= new ArrayList<>();
        badGuys.add("Muhtar");
        badGuys.add("Asiya");
        badGuys.add("Bekir");

        boolean result2 = badGuys.equals(goodGuys); //false
        System.out.println(result2);

        if(goodGuys.contains("Ibrahim") || badGuys.contains("Ibrahim")) {
            System.out.println("Ibrahim is a good guy");
        }

        /////////////////// REMOVE(index number)////////////////////////////
        // Removes the object at given index number.

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);//Auto boxing
        num.add(2);//Auto boxing
        num.add(3);//Auto boxing
        num.add(4);//Auto boxing
        num.add(5);//Auto boxing

        num.remove(1);
        num.remove(2);
        System.out.println(num);
        System.out.println(num.size());

        //////////////////// REMOVE(Integer) && REMOVE(int-index)//////////////////////////////////
        //Removes the first matching object and return boolean value.
        //remove(int): removes an object for given index number as int.

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);//Auto boxing
        num1.add(2);//Auto boxing
        num1.add(3);//Auto boxing
        num1.add(4);//Auto boxing
        num1.add(5);//Auto boxing

        Integer a = 1;
        num1.remove(a);
        System.out.println(num1);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Houston");
        cities.add("Houston");
        cities.add("Dallas");
        cities.add("NYC");
        cities.add("Ashagabat");

        /*cities.remove("Houston");
        System.out.println(cities);*/

        if(cities.remove("Houston")) {
            cities.remove(2);
        }
        cities.add(1, "London");
        System.out.println(cities);

        ArrayList<Integer> price = new ArrayList<>();
        price.add(1);
        price.add(2);
        price.add(3);
        price.add(4);
        price.add(5);

        price.remove(Integer.parseInt("2")); //parse returns primitive. So 2 will be index.
        System.out.println(price);

        price.remove(Integer.valueOf("5")); //valueof returns object, not primitive.
        System.out.println(price);

    }
}
