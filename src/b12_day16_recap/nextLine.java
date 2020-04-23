package b12_day16_recap;

import java.util.Scanner;

public class nextLine {
    public static void main(String[] args) {
/*        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your phone number");
        int phonenum = scan.nextInt();
scan.nextLine();
        System.out.println("Enter your name");
        String name = scan.nextLine();*/

    Scanner zip = new Scanner(System.in);

        System.out.println("Enter your zip code");
        int zipcode = zip.nextInt();

        zip.nextLine();

        System.out.println("Enter your city");
        String city = zip.nextLine();

        System.out.println("Enter your state");
        String state = zip.nextLine();

        System.out.println("Enter your phone number");
        String phone = zip.nextLine();

        System.out.println(zipcode + "\n" + city + "\n" + state + "\n" + phone );

    }
}
