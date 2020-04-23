package b12_day37_Instance_Variables_Methods_Class;
/*
1. Instance variables - object variables, are created within the class and outside of the methods.
2. Instance Methods: methods belong to the object, does not have the specifier static.
Designed to work as a instance of the class.
Instance method declaration"
    access-modifier /// return type /// method name

 */
public class Instance_Variables {

    // CAR example:
    String Brand;
    String Model;
    int Year;
    String Color;
    double Price;
    long Milage;
    // These are the attributes of the car class.

    public void drive() {
        System.out.println(Brand + " is driven");
    }
    public void start() {
        System.out.println(Brand + " is started");
    }
    public void getInfo() {
        System.out.println(Year + " " + Brand + " " + Model + " " + Color + " " + Price + " " + Milage);
    }

}
