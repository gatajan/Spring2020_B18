package b12_day22_NestedLoops;

public class Muradil {
    public static void main(String[] args) {

       for(int z = 0; z <= 10; z++) {
            for (int i = 0; i <= z; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for(int k =10; k >=0; k--) {
            for(int a = 0; a <= k; a++ ) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
