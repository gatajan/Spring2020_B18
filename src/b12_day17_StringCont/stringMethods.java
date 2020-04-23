package b12_day17_StringCont;

public class stringMethods {
    public static void main(String[] args) {

         String str1 = "Hello Javengers";
         String str2 = "Hello Javengers";

         boolean R1 = str1 == str2; //true due to the one memory location
        System.out.println(R1);

        String str3 = new String("Hello Javengers");
        String str4 = new String("Hello Javengers");

        boolean R2 = str3 == str4; // false because memory locations are different,
        System.out.println(R2);

// METHODS OF STRING CLASS





    }
}
