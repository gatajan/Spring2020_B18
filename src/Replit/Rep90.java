package Replit;
import java.util.Scanner;
public class Rep90 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        String result = word.replace("java", "");
        int count = (word.length() - result.length())/4;
        System.out.println(count);

    }
}
