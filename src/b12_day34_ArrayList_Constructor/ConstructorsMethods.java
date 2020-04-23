package b12_day34_ArrayList_Constructor;

import java.lang.reflect.Array;

/*
 - 3 types of methods. VOID, RETURN and CONSTRUCTOR.
 - Constructor is a very special method. Constructor with an argument.
 - Declaration of constructor: access - modifier and className(parameter) {}
 - Constructor doesn't have a return type and specifier
 - Constructor name must be same with the class name.
 - Every single class must have a constructor.
 - If you didn't give the constructor then compiler assigns default constructor. No parameter/argument.
 - Default constructor: w/o argument
 - Constructor is used for to create the object of the class
 - Only a constructor can call another constructor. Nothing else can call it.
 - Constructor execution is depend on the creation of the object.
 - Used for creating an object of the class.
 - Constructor methods can be overloaded.
 */
    public class ConstructorsMethods {
    public static void main(String[] args) {
        ConstructorsMethods obj = new ConstructorsMethods(10); //Creation of the object in a class.
        method1();
    }

    public ConstructorsMethods() {
        System.out.println("Default Constructor");
    }
    public ConstructorsMethods(String str) {
        System.out.println("I'm a constructor with an argument of String ");
    }
    public static void method1() {
        ConstructorsMethods obj2 = new ConstructorsMethods("Annaly");
    }

    public ConstructorsMethods(int i) {
        System.out.println("I'm an int constructor" + i);
    }
}
