package b12_day46_superKeywords;

/* "super.: used for calling instances from "super class"
*   It can only be used in "sub" class
* super(): "Constructor in inheritance". It is not inherited automatically. At least one from the super class
* has to be called to sub class.
* */

public class superKeyword extends A {

    public superKeyword(int a) { //Constructor can only call other constructor.
        super(10); // Super class constructor needs to be called.
    }
    public void method() {
        super.Name = "Mahir"; // This is used for calling instances from inherited class.
        this.Name = "Ihsan"; // This is used for calling instances within the class.
    }
}

class A {
    String Name = "Madina";

    public A(int a) { //Construction with argument in Super class needs to be called manually
    }
        }
