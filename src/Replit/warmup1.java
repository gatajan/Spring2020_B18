package Replit;

public class warmup1 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "B", "C", "A"};


        for(String each : arr) {
            int count = 0;
            for(String each1 : arr) {
                if(each.equals(each1)) {
                    count++;
                }
            } if(count == 1) System.out.println(each);
        }
    }
}
