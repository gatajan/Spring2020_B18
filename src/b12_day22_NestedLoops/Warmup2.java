package b12_day22_NestedLoops;

public class Warmup2 {
    public static void main(String[] args) {
        String pal = "ey edip adanada pide ye";
        String result ="";

/*        for(int i = pal.length()-1; i >= 0; i--) {
            result += pal.charAt(i);

        }
        if(pal.equalsIgnoreCase(result))
            System.out.println("true");
        else System.out.println("false");*/

/*        int i = pal.length()-1;
        while(i >= 0) {
            result += pal.charAt(i);
            i--;
        }
            if (pal.equalsIgnoreCase(result))
                System.out.println("true");
            else System.out.println("false");*/


        int i = pal.length()-1;
        do { result += pal.charAt(i);
        i--;}
        while(i >= 0);
        if (pal.equalsIgnoreCase(result))
            System.out.println("true");
        else System.out.println("false");

    }
}
