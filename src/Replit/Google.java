package Replit;




public class Google {
    public static void main(String[] args) {
        String str = "Hello World";
        int n = 5;
        String result = "";
        for(int i = 0; i < str.length(); i+= n) {
            if((i+n) > str.length()-1) {
                result = str.substring(i);
            } else
            result = str.substring(i, i+n);
            System.out.println(result);
        }
    }
}
