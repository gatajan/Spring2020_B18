package b12_day30_WrapperClasses_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Practice {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Annaly");
        nameList.add("Mahriban");
        System.out.println(nameList);

        //Create array list called student names
        //Create scanner object called scanner
        //
        Scanner scan = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        while(true) {
            System.out.println("Enter name: ");
            String name = scan.nextLine();
            studentNames.add(name);
            System.out.println("Do you want to add another name?");
            String Answer = scan.nextLine().toLowerCase();
            if(Answer.equals("yes") || Answer.equals("no")){
                System.out.println("Invalid");
                break;
            }
            if(Answer.equalsIgnoreCase("no")) break;
        }
        System.out.println(studentNames);
    }
}
