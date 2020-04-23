package b12_day17_StringCont;

public class umida {

    public static int sumOf(int NumValue) {

        int result = 0;

        for(int i = 1; i <= NumValue; i++) {

            if(i % 3 == 0 || i % 5 == 0)
                result += i;

            else continue;
        }
        return result;
    }


    public static void main(String[] args) {
        int num = sumOf(15);
        System.out.println(num);
    }
}
