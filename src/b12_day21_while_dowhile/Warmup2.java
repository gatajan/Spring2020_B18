package b12_day21_while_dowhile;

public class Warmup2 {
    public static void main(String[] args) {

        String s1 = "aabazzbcc";
        String result = "";

        for(int i = 0; i < s1.length()-1; i++) {
            if(s1.charAt(i) == s1.charAt(i+1)) {
                result += s1.charAt(i);
            }
        }
        System.out.println(result);


    }
}
