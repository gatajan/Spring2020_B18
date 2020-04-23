package b12_day30_WrapperClasses_ArrayList;

/*
Wrapper Classes: Every primitive in java as a class that;s designed to it.
Primitive Types - Wrapper class:
byte,                  Byte,
short,                 Short,
int,      Auto-boxing  Integer
long,       =====>>>>  Long
float,      Un-boxing  Float
double,   <<========   Double
boolean,               Boolean
char                   Char

All wrapper class presented in "java.lang" package.
String class is also presented in java.lang package.
All classes in package "java.lang" imported by default.

default values of primitives:
byte, short, int, long ======>>> 0
float, double ===============>>> 0.0
boolean       ===============>>> false

deafult values of Wrapper Classes are "NULL"

 */

import java.util.Arrays;

public class Wrapper_Classes {
    public static void main(String[] args) {
        int numInt = 10;
        Integer numInteger = 10;

        double numDouble = 5.5;
        Double numdouble = 5.5;

        long numlong = 20L;

        Long numLong = numlong;   //Auto-Boxing - converting primitve values to wrapper class.

        Boolean result = false;
        boolean booleanResult = result; // Un-boxing

        int[] arr = new int[3]; // 0, 0, 0
        System.out.println(Arrays.toString(arr));

        Integer[] arr1 = new Integer[3];
        System.out.println(Arrays.toString(arr1));

        int num1 =10;
        // intnum.method(); Primitive does not have methods. Variable num1 is not a reference of an object.

        Integer num = 20;
        int x = num.MAX_VALUE;
    }
}
