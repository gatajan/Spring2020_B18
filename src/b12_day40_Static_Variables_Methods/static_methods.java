package b12_day40_Static_Variables_Methods;
// Static Methods: A method that we can call through the class name.
// There is no object instances
public class static_methods {

    static long num1;
    long num2;


    public static void printHello() {
        System.out.println("Hello cybertek");

    }

    public static void main(String[] args) {
        static_methods.printHello();
        //static_methods.method2(); This method is not static.

        static_methods obj1 = new static_methods();
        obj1.method2();
        obj1.num2 = 23;
        System.out.println(obj1.num2);

        System.out.println(num1);
        // System.out.println(num2); this is not static, gives compile error.
        System.out.println(static_methods.num1);



    }

    public void method2() {
        System.out.println("B");
        //This is not static. This is instance method.
    }
}
