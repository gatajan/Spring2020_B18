package Day09IfStatement;

import java.util.Scanner;

public class Scannerclass {
    public static void main(String[] args) {
/*        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Byte Value");
        byte byteNum = input.nextByte();
        System.out.println("You have entered: " + byteNum);
        System.out.println("Enter another Byte Value");
        byte byteNum2 = input.nextByte();
        System.out.println("You have entered: " + byteNum2);
        System.out.println("Addition is: " + (byteNum + byteNum2));

        Scanner input2 = new Scanner(System.in);
        System.out.println("Type your name");
        String str  = input2.nextLine();
        System.out.println("What is your name?" + str);
 */


/*Scanner number = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = number.nextDouble();
        System.out.println("Enter second number");
        double num2 = number.nextDouble();

        System.out.println("Sum of the " + num1 + " and " + num2 + " is equal to " + (num1+num2) );*/

/*Scanner number = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = number.nextInt();
        System.out.println("Enter second number");
        int num2 = number.nextInt();
        System.out.println("Enter third number");
        int num3 = number.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("Largest number is " + num1);
        } else if(num2 > num1 && num2 > num3) {
            System.out.println("Largest number is " + num2);
            } else System.out.println("Largest number is " + num3);*/

Scanner name = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String firsName = name.nextLine();
        System.out.println("Enter your Last Name");
        String lastName = name.nextLine();
        System.out.println(firsName + " " + lastName);

    }
}
