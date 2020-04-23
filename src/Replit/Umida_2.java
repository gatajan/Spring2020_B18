package Replit;

public class Umida_2 {
    public static void main(String[] args) {
        Umida_2 obj = new Umida_2();
        String result = obj.concatString("java", "awsome");
        System.out.println(result);
    }

    String concatString (String str, String str1) {
        String result = "";
        if(str.charAt(str.length()-1) == str1.charAt(0)) {
            result = str.substring(0) + str1.substring(1);
        } else result = str.concat(str1);
        return result;
    }
}
