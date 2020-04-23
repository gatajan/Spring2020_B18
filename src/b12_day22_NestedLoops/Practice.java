package b12_day22_NestedLoops;

public class Practice {
    public static void main(String[] args) {
        int i = 6;

        do {
            for(int z = 1; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        } while (i >= 0);
    }
}
