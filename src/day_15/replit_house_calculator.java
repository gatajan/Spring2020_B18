package day_15;
import java.util.*;
public class replit_house_calculator {
    public static void main(String[] args) {
    //DO NOT CHANGE
    int propertyPrice = 0;

    Scanner scan = new Scanner(System.in);
    System.out.println("*****************************************");
    System.out.println("* Welcome to the RealEstate calculator! *");
    System.out.println("*****************************************");

    System.out.println("Enter your property type:");
    String propertyType = scan.nextLine();
    if(propertyType.equals("Condo")) propertyPrice += 50000;
    if(propertyType.equals("Townhouse")) propertyPrice += 75000;
    if(propertyType.equals("Single Family Home")) propertyPrice += 95000;

    System.out.println("How many bedrooms do you have?");
    int numberOfBedrooms = scan.nextInt();
    propertyPrice += numberOfBedrooms*30000;

    System.out.println("Do you have a backyard?");
    boolean backyard = scan.nextBoolean();
    if(backyard) {
        if(propertyType.equals("Condo")) {
            System.out.println("Backyard is not available for condo!");
        }else propertyPrice += 5000;
    }

    System.out.println("Do you have a garage?");
    boolean garage = scan.nextBoolean();
    if(garage){
        System.out.println("How many spots?");
        int garageSpots = scan.nextInt();
        if(garageSpots > 10) System.out.println("Pardon, it's not a public parking!");
        if(garageSpots <= 10) propertyPrice += 20000*garageSpots;
    }

    System.out.println("How close is metro station?");
    float metroAccessibility = scan.nextFloat();
    if(0 < metroAccessibility && metroAccessibility <= 1) propertyPrice += 10000;
    if(1 < metroAccessibility && metroAccessibility < 3) propertyPrice += 5000;

    System.out.println("How close is highway?");
    float highwayAccessibility = scan.nextFloat();
    if(highwayAccessibility <= 1) propertyPrice += 15000;
    if(1 < highwayAccessibility && highwayAccessibility < 5) propertyPrice += 8000;
    if(5 < highwayAccessibility && highwayAccessibility <= 20) propertyPrice += 4000;

    System.out.println("What's the rating of nearest school?");
    float schoolScore = scan.nextFloat();
    if(8 < schoolScore && schoolScore <= 10) propertyPrice += 45000;
    else if(4 <= schoolScore && schoolScore < 8) propertyPrice += 20000;
    else propertyPrice += 5000;

    System.out.println("Does any of your family members smoking?");
    boolean smoking = scan.nextBoolean();
    if(smoking) propertyPrice -= 5000;

    System.out.println("Market report has been generated.");
    System.out.println("Your estimate market price is: " + propertyPrice + "$");

}
}

