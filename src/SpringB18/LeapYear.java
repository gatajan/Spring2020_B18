package SpringB18;

public class LeapYear {
    public static void main(String[] args) {
        short year = 2020;
        boolean leapYear = year % 4 == 0;
        System.out.println(year + " is leap year: " + leapYear);

        int number = 65;
        boolean divisibleBy2 = number % 2 == 0;
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        String result2 = number + " is divisible by 2: " + divisibleBy2;
        String result3 = number + " is divisible by 3: " + divisibleBy3;
        String result5 = number + " is divisible by 5: " + divisibleBy5;
        System.out.println(result2 + "\n" + result3 + "\n" + result5);


    }
}
