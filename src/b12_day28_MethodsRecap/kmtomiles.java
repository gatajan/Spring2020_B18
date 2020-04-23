package b12_day28_MethodsRecap;

public class kmtomiles {
    public static void main(String[] args) {
        kmToMiles(22);
        System.out.println("======================================");
        gallonsToLiters(37);
    }



    public static void kmToMiles(double km) {
        double miles = km/2.2;
        System.out.println(km + " kilometers is equal to " + miles + " miles.");
    }

    public static void gallonsToLiters(double gallon) {
        double liter = gallon*3.785;
        System.out.println(gallon + " gallons is equal to " + liter + " liters.");
    }

    public static void operatorCalculation(int a, int b, String c) {
    }
    }

