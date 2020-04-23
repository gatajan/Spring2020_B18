package b12_day41_initializerBlocks;

/*
Initializer blocks:

1. Static Initializer Block - used for initializing static variables.

Static members: 1. Static Variable - declared in the class, outside any method, WITH static keyword.
                                   - It is also called "Class Variables.
                                   - Shared by the class and all the objects of the class

                2. Static Methods  - a method that can be called using class name. Only method that
                                     can be called class name.
                                   - belongs to the class

                3. Static initializer block
                - used for initializing static variables.
                - Get executed just once
                -

                static {
                    statement;     - Static Initializer block is executed as soon as class is loaded.
                                   -
                }


                4. Inner class (nested class)


2. Instance Initializer Block: - used for initializing instance variables.
                               - belongs to objects and executed once object is created
                               -
    {
    statement;
    }

*/

public class staticBlock {

    public staticBlock() {
        System.out.println("This is constructor"); // depends on creation of object.
                                                    // executes as many as object numbers.
    }

    static {
        System.out.println("static block 2"); // Execution does not depend on object and execution is once.
    }
                                            // Executed from top to bottom.
    static {
        System.out.println("static block 1"); // Several SBs can be created within the class.
    }

    public static void main(String[] args) {
        //System.out.println("Main method");

        staticBlock obj1 = new staticBlock();
        staticBlock obj2 = new staticBlock();
        staticBlock obj3 = new staticBlock();
        staticBlock obj4 = new staticBlock();
        staticBlock obj5 = new staticBlock();
    }
}
