package b12_day27_Custom_Methods;

import org.w3c.dom.ls.LSOutput;

/*
Declaration of method: access-modifier specifier return-type methodName() {
                        statements
                        }

 */
//================= CUSTOM METHOD =======================================
public class VoidMethod {
    public static void main(String[] args) {
        even1To100();
        myFirstMethod();
        /*
        Method is grouping a series of statements to perform specific task.
        benefits: reusable. organized code.

         */

    }




    public static void myFirstMethod() {
        System.out.println("Hello World!");
        System.out.println("Cybertek Batch12");

    }

    public static void even1To100 () {
        for(int i = 0; i < 20; i++) {
            if(i % 2 != 0) {
                continue;
            } System.out.print(i + " ");
        }
        System.out.println();

    }
}
