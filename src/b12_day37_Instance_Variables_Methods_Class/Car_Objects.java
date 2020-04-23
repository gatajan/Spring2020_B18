package b12_day37_Instance_Variables_Methods_Class;

public class Car_Objects {
    public static void main(String[] args) {
        Instance_Variables car1 = new Instance_Variables(); // 1ST OBJECT
        // Class Name      ObjName      Constructor
        car1.Brand = "BMW";
        car1.Color = "White";
        car1.Milage = 12875;
        car1.Model = "X6";
        car1.Year = 2020;
        car1.Price = 79899.99;
        System.out.println(car1.Brand);
        System.out.println(car1.Color);
        System.out.println(car1.Milage);
        System.out.println(car1.Model);
        System.out.println(car1.Price);
        System.out.println(car1.Year);


        Instance_Variables car2 = new Instance_Variables(); // 2nd OBJECT
        car2.Price = 45789.45;
        car2.Year = 2019;
        car2.Model = "Tesla Model S";
        car2.Milage = 4500;
        car2.Color = "Silver";
        car2.Brand = "Tesla";
        System.out.println(car2.Brand);
        System.out.println(car2.Color);
        System.out.println(car2.Milage);
        System.out.println(car2.Model);
        System.out.println(car2.Price);
        System.out.println(car2.Year);

        car1.drive(); // Calls drive method.
        car2.drive(); // Tesla is driven

        car1.start(); //BMW is starting
        car2.start(); //Tesla is starting

        car1.getInfo();

        Instance_Variables car3 = new Instance_Variables(); // 3RD OBJECT
        car3.getInfo(); // default values
        car3.Brand = "Lexus";
        car3.Model = "RX350";
        car3.Year = 2020;
        car3.Milage = 25000;
        car3.Color = "Red";
        car3.Price = 40000;
        car3.getInfo();

    }
}
