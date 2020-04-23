package SpringB18;

public class ifWarmup1 {
    public static void main(String[] args) {

        // Write program that can find number of days for a given month. Use nested if. Assume Feb has 28 days.

        int month = 2;
        int year = 2019;
        if (year % 4 != 0) {
            if (month > 0 && month < 13) {
                if (month != 2) {
                    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                        System.out.println("31 Days");
                    } else System.out.println("30 Days");


                } else System.out.println("28 Days");
            } else System.out.println("Invalid entry");
        } else {
            if (month > 0 && month < 13) {
                if (month != 2) {
                    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                        System.out.println("31 Days");
                    } else System.out.println("30 Days");


                } else System.out.println("29 Days");
            } else System.out.println("Invalid entry");
        }

        //Warm up question 2

        int num1 = 2;
        int num2 = 3;
        int num3 = 'A';

        if(num1 == num2) {
            if(num2 == num3) {
                System.out.println("All equal");
            } else System.out.println("n1 and n2 are equal");
            }
        else if(num1 == num3) {
            System.out.println("n1 and n3 are equal");
        } else if(num2 == num3) {
            System.out.println("n2 and n3 are equal");
        } else System.out.println("none of the are equal");
    }
}
