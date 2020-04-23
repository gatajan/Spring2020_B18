package b12_day17_StringCont;

public class Umida2 {

    public static boolean prime (int numValue) {

        boolean flag = true;

        for (int i = 2; i < numValue; i++) {
            if (numValue % i == 0) {
                flag = false;
                break;
            }

            else flag = true;
        }

        return flag;

    }


    public static void main(String[] args) {
        boolean b = prime(3);
        System.out.println(b);
    }
}
