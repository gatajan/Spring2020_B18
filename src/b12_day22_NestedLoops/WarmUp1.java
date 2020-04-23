package b12_day22_NestedLoops;

public class WarmUp1 {
    public static void main(String[] args) {

        String num = "";

        for(int i = 1; i <= 30; i++) {

            if(i % 3 == 0 && i % 5 == 0) {
                num += "FFINRA ";
            }

            else if(i % 3 == 0) {
                num += "FIN ";
            }

           else if(i % 5 == 0) {
                num += "RA ";
            }
            else num += i + " ";
        }
        System.out.println(num + " ");
    }
}
