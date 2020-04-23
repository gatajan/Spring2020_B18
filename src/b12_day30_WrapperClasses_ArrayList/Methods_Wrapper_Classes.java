package b12_day30_WrapperClasses_ArrayList;
/*
Usuful methods of Wrapper Class:
Max_Value
Min_Value
parse methods
ValueOfmethods


 */
public class Methods_Wrapper_Classes {
    public static void main(String[] args) {
        ///////////// MAX-MIN VALUE METHOD //////////////////////
        int max = Integer.MAX_VALUE;
        System.out.println(max); // It returns max value of primitive. Max number of Int.

        byte maxByte = Byte.MAX_VALUE;
        System.out.println(maxByte);

        char maxChar = Character.MAX_VALUE;
        System.out.println(maxChar);

        ////////////////////// PARSE METHODS /////////////////////////////////////
        /*
        Converts String values to PRIMITIVES.
        parseInt("strValue"): takes the String and converts the string to int
         */
        Integer num1 = Integer.parseInt("123"); // Auto-boxing
        System.out.println(num1+1);
        Double numdoub = Double.parseDouble("12.2");
        System.out.println(numdoub);
        int num2 = Integer.parseInt("125"); // none boxing because both of them are primitive
        System.out.println(num2 + 1);

        byte num3 = (byte)Integer.parseInt("129"); // none boxing because both of them are primitive
        System.out.println(num3 + 1);

        /////////////////////////////////// ValueOfMethods////////////////////////////////////////
        //Converts String value to WRAPPER CLASS values

        int z = Integer.valueOf("1234"); //unboxing
        Integer z1 = Integer.valueOf("2345"); // none
        Integer z2 = (int)Integer.valueOf("1234"); // Auto-boxing
        System.out.println(z2);







    }
}
