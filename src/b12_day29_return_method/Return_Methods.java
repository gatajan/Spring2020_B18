package b12_day29_return_method;

public class Return_Methods {
    public static void main(String[] args) {
        name(); //This is a string value

        String str = name();
        System.out.println(str);
        addition(2,3);
        long num =addition(2,3);

        System.out.println(addition(2,3));



        sum(5,20);

    }


    //There are 2 RETURN statement in Java: One is used for exiting the method, other
    // one used for to return a value from the method.

    public static String name() {
        return "z";
    }
    ////////////////////////////////////////////////////////////////////////////////////
    public static Boolean b() {
        return 8>9;
    }

    public static int addition(int a, int b) {
        return a+b;
    }
    public static void sum(int a, int b) {
        System.out.println(a+b);
    }


}
