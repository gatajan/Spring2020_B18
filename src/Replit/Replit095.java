package Replit;

import java.util.Scanner;

public class Replit095 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = "";
        if(str.indexOf("bread") == str.lastIndexOf("bread")) result += "nothing";
        else result += str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
        System.out.println(result);
    }
}
