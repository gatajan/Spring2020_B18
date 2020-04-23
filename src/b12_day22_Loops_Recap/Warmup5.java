package b12_day22_Loops_Recap;

public class Warmup5 {
    public static void main(String[] args) {

        char ch = 65;

        /*for(int i=65; i <= 122; i++) {

            if(i <= 90)
            System.out.print(ch +" ");
            if(i >96 && i <= 122)
                System.out.print(ch +" ");
            ch += 1;
        }*/

/*        int i = 65;

        while(i <= 122) {
            if(i <= 90)
                System.out.print(ch +" ");
            if(i >96 && i <= 122)
                System.out.print(ch +" ");
            ch += 1;
            i++;
        }*/

        int i = 65;

        do {
            if(i <= 90)
                System.out.print(ch +" ");
            if(i >96 && i <= 122)
                System.out.print(ch +" ");
            ch += 1;
            i++;
        } while(i <= 122);

    }
}
