package day10_Switch_Scanner;

import java.util.Scanner;

public class dayswarmup {
    public static void main(String[] args) {
/*        byte day = 4;
        String days = "";

        if(day >= 1 && day <= 7) {
            if(day == 1) days = "Monday";
            else if(day == 2) days = "Tuesday";
            else if(day == 3) days = "Wednesday";
            else if(day == 4) days = "Thursday";
            else if(day == 5) days = "Friday";
            else if(day == 6) days = "Saturday";
            else days = "Sunday";
        } else days = "Invalid";
        System.out.println(days);*/


        Scanner day = new Scanner(System.in);
        System.out.println("Enter week days as number");
        byte num = day.nextByte();

        String weekdays = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" :
                          (num == 3) ? "Wednesday" : (num == 4) ? "Thursday" :
                                  (num == 5) ? "Friday" : (num == 6) ? "Saturday" :
                                          (num == 7) ? "Sunday" : "Invalid";
        System.out.println(weekdays);


    }

}
