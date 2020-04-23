package Replit;

public class warmup420 {

    private static String remDub(String str) {
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            if(!result.contains(str.substring(i, i+1))) {
                result += str.substring(i, i+1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
    String str = remDub("aappllm");
        System.out.println(str);
    }

    public static String getRemDub(String str) {
        return remDub(str);
    }

    public static int result(String a, String b){
        int count =0;
        for(int i = 0; i < a.length(); i++) {
            if(a.substring(i, i+1).equals(b)) {
                count++;
            }
        }
        return count;
    }

    public static String frek (String str) {
        String rst ="";
        for(int i = 0; i < getRemDub(str).length(); i++) {
            rst += getRemDub(str).substring(i, i+1) + result(str, getRemDub(str).substring(i, i+1));
        }
        return rst;
    }

    public static String getDriver1 (String browser) {
        String result="";
        switch(browser) {
            case "chrome": result = "Chrome driver";
            break;
            case "firefox": result = "Firefox driver";
            break;

        }
        return result;
    }



}
