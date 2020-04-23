package Day09IfStatement;

public class WarmupTest {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        int max = 0;

        if(num1 > num2) {
            max = num1;
        } else
            max = num2;

        System.out.println(max);


        int max2 = (num1 >num2) ? num1: num2;
        System.out.println(max2);



        String str = (false) ? "Hello" : "Hola";
        System.out.println(str);

        String result = (9 >10) ? "9 is greater" : "10 is greater";
        System.out.println(result);

        int age = 22;
        String eligibility = "";

        String eligibletovote = (age > 21) ? "YES" : "NO";

        System.out.println(eligibletovote);








    }
}
