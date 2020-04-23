package b12_day41_initializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlockPractice {

    public static String name; //Public Static Variable
    public static int[] arr1;
    public static ArrayList<String> list = new ArrayList<>();
    public static ArrayList<String> students = new ArrayList<>();
    public static String[] online = {"Mekan", "Gurban", "Sapar", "Jemshit"};
    public static String[] inClass = {"Selbi", "Melek", "Mahriban", "Jeren"};


    static {
        name = "Annaly";
        arr1 = new int[5]; // {0,0,0,0,0}
        arr1[0] = 1; // {1,0,0,0,0}
        arr1[3] = 3; // {1,0,3,0,0}
        System.out.println("This is static");

        list.add("Coffee");
        list.add("Tea");

        students.addAll(Arrays.asList(online));
    }

    static {
        name = "Mahriban"; //It takes last initialization.
        arr1 = new int[3]; // {0,0,0}
        arr1[1] = 2; // {0,2,0}
        list.add("Break");

        students.addAll(Arrays.asList(inClass));
    }

    public staticBlockPractice() {
        name = "This is constructor"; //If you don't create an object, constructor never get executed.
    }

    public static void main(String[] args) {

        staticBlockPractice obj1 = new staticBlockPractice();
        System.out.println(name); //null

        System.out.println(Arrays.toString(arr1));
        System.out.println(list);
        System.out.println(students);


    }
}
