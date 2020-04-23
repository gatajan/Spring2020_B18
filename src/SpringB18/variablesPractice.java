package SpringB18;
import Replit.warmup420;
public class variablesPractice {
    public static void main(String[] args) {
        int a1 = 100;
        float f1 = a1;
        System.out.println(f1);

        int x = 2;
        System.out.println(x++);

        int a =1;

        a= -a-- + ((a++ / -a--) *--a);
        // a = -1 + ((0/-1)*0)
        // a = 0
        System.out.println(a);

        int b = 50;

        b = --b + b++ + b-- + b++;
        //a = 49 + 49 + 50 + 49=197;
        System.out.println(b);

        int z = 4;
        int y = z * 4 - (z+=2);
        // y = 16 - 4
        System.out.println(y);

        int c = 100;
        int v = c+=50;
        System.out.println(v);



        String str = warmup420.getRemDub("aaabbbccmm");
        System.out.println(str);

        int freq = warmup420.result("AAABB", "A");
        System.out.println(freq);

        String rstk = warmup420.frek("ABABCB");
        System.out.println(rstk);

    }
}
