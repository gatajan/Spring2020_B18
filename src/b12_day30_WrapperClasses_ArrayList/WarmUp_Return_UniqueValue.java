package b12_day30_WrapperClasses_ArrayList;

public class WarmUp_Return_UniqueValue {
    public static void main(String[] args) {

        String result = UniqueValue("AABBCDEEEK");
        System.out.println(result);
    }
    public static String UniqueValue (String str) {
        String RevDub ="";
        for(int i = 0; i < str.length(); i++) {
            if(!RevDub.contains(str.substring(i, i+1))) {
                RevDub += str.substring(i, i+1);
            }
        }
        String unique ="";
        for(int i = 0; i < RevDub.length(); i++) {

            int count = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == RevDub.charAt(i)){
                    count++;
                }
            }
            if(count == 1) unique += RevDub.substring(i, i+1);
        }
      return unique;
    }
}
