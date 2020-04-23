package b12_day44_AccessModifier;
import static b12_day44_AccessModifier.importStatement.name; //It imports just static "name".
import static b12_day44_AccessModifier.importStatement.*; //It imports all the static members from class.
public class Test {
    public static void main(String[] args) {
        System.out.println(name); // or we can call it through class name.
        System.out.println(ID);
        System.out.println(schoolName);
        printHello();
        System.out.println(age);
    }
}
