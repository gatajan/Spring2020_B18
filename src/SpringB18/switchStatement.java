package SpringB18;

public class switchStatement {
    public static void main(String[] args) {

        int score = 1;

        if(score == 1) {
            System.out.println("1");
        } else if(score == 2) {
            System.out.println("2");
        } else System.out.println("Invalid");


        // Switch statement


        switch (score) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("Invalid");
                break;

        }

        char grade = 'A';

        switch (grade) {


            case 'D':
                System.out.println("Passed with B");
            case 'C':
                System.out.println("Passed with A");
            default:
                System.out.println("Failed");
        }


        int a = 5;
        switch (a) {
            case 5:
                System.out.println("Friday");
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid entry");
                break;


        }


        String US = "A";
        switch (US) {
            case "US":
            case "USA":
            case "America":
                System.out.println("America");
                break;

            default:
                    System.out.println("Not America");
                    break;


        }
    }
}
