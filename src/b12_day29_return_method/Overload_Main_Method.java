package b12_day29_return_method;

public class Overload_Main_Method {
    public static void main(String[] kfc) {
        System.out.println("String Array");
        boolean[] array1 = {true, false};
        main(array1);
        double[] array2 = {0.1, 8.7};
        main(array2);
    }

// Return type doe not matter.
    public static void main(int[] args) {
        System.out.println("Int Array");
    }
    public static boolean main(double[] argsdbl) {
        System.out.println("double Array");
        return true;
    }
    public static int main(boolean[] bln) {
        System.out.println("Boolean Array");
        return 3;
    }

}
