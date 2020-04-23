package b12_day35_Constructor_Continue;
/*
1. Used for creating an object.
2. Every single class must have a constructor.
3. Default constructor will be assigned automatically if you don't declare a custom constructor.
3. Only Constructor calls other constructor. There is no return type and specifier.
4. Constructor name must be same as class name.
5. Any method in Java, can be overloaded including Constructor methods.
6. Constructor can be declared with multiple parameters.

//////////////////// CONSTRUCTION CALLS ///////////////////////////////////////////////////////////
6. Constructor call is priority. It should be placed in first place in a caller method. it should be
first statement in a caller method body.
7. A constructor can only call a single other constructor.
8. Constructor can not call itself or contain itself within the constructor.
9. "this()" is used to call constructor and this is used to call Instances of objects.

 */
public class ConstructorCont {


    public ConstructorCont(int num) { // Constructor name.
        System.out.println("Constructor with argument: " + num);
    }

    public ConstructorCont(boolean a) {
        this(100);   // <<<< THIS IS THE WAY TO CALL A CONSTRUCTOR>>>>>
        System.out.println("constructor with argument of: " + a);
    }

    public static void main(String[] args) {
        //ConstructorCont obj = new ConstructorCont("Hello"); //Creating an object.
        // Gives compile error due to the "Hello" because there is no constructor for it.

        ConstructorCont obj2 = new ConstructorCont(9); //Creating object
        // YOU NEED TO CREATE OBJECT FOR AN EXISTING CONSTRUCTOR>>>>>

        ConstructorCont obj3 = new ConstructorCont(true);
        System.out.println(obj3);

    }
}
