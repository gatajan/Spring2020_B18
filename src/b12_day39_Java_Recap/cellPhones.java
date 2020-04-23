package b12_day39_Java_Recap;

import org.w3c.dom.ls.LSOutput;

public class cellPhones {
/////////////////////////////////// INSTANCE VARIABLES ///////////////////////////////////////////////////////////
    // Instance variables are objects created in the class outside of methods.
    String brand, model, color;
    double screenSize;
    double price;

    ///////////////////////////////////// CONSTRUCTORS /////////////////////////////////////////////////////////
    public cellPhones() {  // giving default values to variables with default constructor
        brand = "iPhone";
        model = "iPhone X";
        screenSize = 5.8; //////////////////////////// DEFAULT CONSTRUCTOR WITH MANUAL ARGUMENT ////////////////////
        color = "white";
        price = 700;
    }
    public cellPhones (String brand, double price, String color, double screenSize, String model) {
        this.brand = brand; // this.is used for calling instance variables.
        this.price = price;
        this.color = color;               /////////////////////// CUSTOM CONSTRUCTOR WITH ARGUMENT ////////////////
        this.screenSize = screenSize;
        this.model = model;
    }



///////////////////////////////// INSTANCE METHODS ////////////////////////////////////////////////////////////

    // Instance methods does not have static specifier but do have return type.
    public void call (long phoneNumber) {
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }

    public void sendMessage(long phoneNumber) {
        System.out.println("Sending messages to " + phoneNumber);
    }

    public void getInfo() {
        System.out.println(brand + " " + model + " " + color + " " + screenSize + " " + price);
    }
}
