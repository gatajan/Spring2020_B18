package b12_day16_recap;

import java.util.Scanner;

public class warmup {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String firstName = name.nextLine().toUpperCase();
        System.out.println("Enter your Last Name");
        String lastName = name.nextLine().toUpperCase() ;
        System.out.println("Enter your age");
        int age = name.nextInt();

        String lastFirst = lastName.concat(" " + firstName);
        lastFirst = lastFirst.toUpperCase();
        System.out.println(lastFirst + " is " + age + " years old");
    }
}
