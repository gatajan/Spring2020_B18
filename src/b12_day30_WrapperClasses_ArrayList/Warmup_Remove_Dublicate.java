package b12_day30_WrapperClasses_ArrayList;

public class Warmup_Remove_Dublicate {
    public static void main(String[] args) {

        String k = RevDub("aaammmkkk");
        System.out.println(k);

    }

    public static String RevDub (String str) {

        String result ="";
        for(int i = 0; i < str.length(); i++) {
            if(!result.contains(str.substring(i, i+1))) {
                result += str.substring(i, i+1);
            }
        } return result;


    }
}
