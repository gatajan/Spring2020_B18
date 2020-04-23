package b12_day40_Static_Variables_Methods;
public class static_practice {

    static String name;
    static double staticNum = 10.5;

    public static void main(String[] args) {

        System.out.println(static_practice.staticNum);

        static_practice obj1 = new static_practice();
        obj1.staticNum = 4.5;
        System.out.println(obj1.staticNum);

        static_practice obj2 = new static_practice();
        System.out.println(obj2.staticNum);

        static_methods.printHello();
    }
}
