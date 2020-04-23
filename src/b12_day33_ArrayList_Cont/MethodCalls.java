package b12_day33_ArrayList_Cont;

public class MethodCalls {
    public static void main(String[] args) {
        method3();
        int max2 = max(2, 3);
        System.out.println(max2);

        int max3 = max(5, 4, 10);
        System.out.println(max3);

        maximum(300, 100, 50);

        String str = print(45, 12, 88);
        System.out.println(str);
    }

    public static void method1() {
        System.out.println("A");
    }

    public static void method2() {
        method1();
        System.out.println("B");
    }
    public static void method3() {
        method2();
        System.out.println("C");
    }

    public static int max(int a, int b) {
        return(a > b) ? a : b;
    }
    public static int max(int a, int b, int c) {
        int largestNum = max(a,b);
        return(largestNum > c) ? largestNum : c;
    }
    public static void maximum(int a, int b, int c) {
        System.out.println(max(a, b, c));
    }
    public static String print(int a, int b, int c) {
        maximum(a, b, c);
        return "900";
    }
}
