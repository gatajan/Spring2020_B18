package b12_day40_Static_Variables_Methods;
/// STATIC: means that can be accessed through the CLASS name.
/// Static members in class belongs to class.
/// Static Variables, Static Methods, Static Initilizer block, Static Inner class(nested class)

//////////////////////////////// INSTANCE VARIABLES /////////////////////////////
// Created in the class outside any method.
// Belongs to the object
// Each object will have its own copy

////////////////////////////////  LOCAL VARIABLES /////////////////////////////
// Declared within the method or blocks and can be used within the method or block.


///////////////////////////////  STATIC VARIABLES  ////////////////////////////
// Created in the class outside any method with static keyword.
// It is shared by class and all objects of the class and called as through the class name.
// Static variable has only one copy
public class Static_Keyword {

    int b; //Instance variables
    static int a = 100; //Static variables
    static String name;

    public static void main(String[] args) {

        Static_Keyword obj1 = new Static_Keyword();
        obj1.b = 200;
        Static_Keyword obj2 = new Static_Keyword();
        obj2.b = 300;
        System.out.println(obj1.b);
        System.out.println(obj2.b);


        System.out.println(Static_Keyword.a);
        System.out.println(obj1.a);
        System.out.println(obj2.a);

        System.out.println("=============================================");

        Static_Keyword obj3 = new Static_Keyword();
        System.out.println(obj3.a);

        Static_Keyword st1 = new Static_Keyword();
        st1.name = "Omer";
        System.out.println(st1.name);
        Static_Keyword st2 = new Static_Keyword();
        st2.name = "Mehmet";
        System.out.println(st2.name);
        Static_Keyword st3 = new Static_Keyword();
        System.out.println(st3.name);

        System.out.println(st1.name);

    }
}
