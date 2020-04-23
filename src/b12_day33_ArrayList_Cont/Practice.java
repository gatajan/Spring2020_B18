package b12_day33_ArrayList_Cont;

public class Practice {
    public static void main(String[] args) {
        String str = str1("AAABBCCCCDYYK");
        System.out.println(str);

    }

    public static String str(String str) {
        String str1 = "";
        for (int j = 0; j < str.length(); j++) {
            if (!str1.contains(str.substring(j, j + 1))) {
                str1 += str.substring(j, j + 1);
            }
        }
        return str1;
    }

    public static int num(String a, String b){
        int count = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == b.charAt(0)) {
                count++;
            }
        } return count;
    }

    public static String str1(String input) {
        String remDub = str(input);
        String result = "";
        for(int i = 0; i < remDub.length(); i++) {
            int count = num(input, remDub.substring(i, i + 1));
            result += remDub.substring(i, i+1) + count;
        } return result;
    }
}
