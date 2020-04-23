package b12_day22_NestedLoops;

public class NestedLoop {
    public static void main(String[] args) {

      /*  for(int i = 1; i <= 7; i++) {
            for(int z = 1; z <= i; z++) {
            System.out.print("*");
            } System.out.println();
        }*/

/*      int i = 1;
      while (i <= 7) {
          int z = 1;
          while(z <= i) {
              System.out.print("*");
              z++;
          }
          System.out.println();
          i++;
      }*/

/*        for(int i = 1; i <= 7; i++) {
            int z = 1;
            while (z <= i) {
                System.out.print("*");
                z++;
            }
            System.out.println();

        }*/
/*        int i = 1;
        while (i <= 7) {
            for(int z = 1; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
            }*/

        int i = 1;

        do {
            for(int z = 1; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
            } while (i <= 7);





    }
}
