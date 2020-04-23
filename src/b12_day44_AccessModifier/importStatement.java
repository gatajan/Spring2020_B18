package b12_day44_AccessModifier;

//import: Normal import.

// STATIC IMPORT: used for importing class members
//          EX: import static PackageName.ClassName.StaticName;

// Assert.assertTrue();


public class importStatement {

    public static String name = "Jennet";
    public static String ID = "007";
    public static String schoolName = "Cybertek";
    private static String password = "cybertek";
    static int age = 20; // default access modifier. It can be only access within the class.

    public static void printHello(){
        System.out.println("Hello");
    }


}
