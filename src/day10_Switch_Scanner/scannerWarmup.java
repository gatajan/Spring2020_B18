package day10_Switch_Scanner;

import java.util.Scanner;

public class scannerWarmup {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = input.nextInt();
        System.out.println("How may hours do you work in a week?");
        int hours = input.nextInt();
        int hourlyRate = salary/(52*hours);
        System.out.println(hourlyRate);

    }
}
