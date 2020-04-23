package SpringB18;

public class Shorthandoperators {
    public static void main(String[] args) {
        int a = 2;
        a*= 3;
        System.out.println(a);

        int b = a*=10;
        System.out.println(b);
        System.out.println(a);

        int a1 = 100;
        int b1 = a1*=2 + ++a1;
        // b1 = a1*(2 + ++a1)
        // b1 = 100 * (2+101)
        // b1 = 10300
        System.out.println(b1);

        boolean R4 = true != false || false == !true;
        System.out.println(R4);

        boolean R5 = true != false && false == !true;

        int c = 10 % 4;
        System.out.println(c);






    }
}
