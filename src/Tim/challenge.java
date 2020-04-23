package Tim;

public class challenge {
    public static void main(String[] args) {
        double d1 = 20.0;
        double d2 = 80.0;
        double result = (d1 + d2)*100;
        System.out.println(result);

        double remainder = result % 30;
        System.out.println(remainder);

        boolean b1 = (remainder == 0) ? true : false;
        System.out.println(b1);

        if (!b1) {
            System.out.println("Got some remiander");
            System.out.println("hello");
        }

    }
}
