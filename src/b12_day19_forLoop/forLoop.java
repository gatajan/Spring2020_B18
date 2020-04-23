package b12_day19_forLoop;

public class forLoop {
    public static void main(String[] args) {

        /*for(int i = 0; i < 10; i++) {
//          init, condition, iteration
            System.out.println("Hello");*/
            // Repeating
       /* for(int i = 1; i <= 10; i++) {
            System.out.println(i + "    " + i*i);*/

/*       int num=3;
       for(int i = 1; i <= 10; i++) {

           System.out.print(num*i+ " ");*/

           String str = "Java";
           String rev = "";

           for(int i = str.length()-1; i >= 0; i--) {
               rev += str.charAt(i);
           }
        System.out.println(rev);
    }


    }

