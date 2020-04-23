package Day09IfStatement;

public class SwitchWarmup {
    public static void main(String[] args) {
        String day = "Monday";
        switch(day) {
            case "Monday":
            case "Tuesday":
                System.out.println("Java class days");
                break;

            case "Thursday":
            case "Friday":
                System.out.println("Selenium class days");
                break;

            case "Wednesday":
            case "Saturday":
                System.out.println("SQL class days");
                break;

            default:
                System.out.println("day off");
        }

    }
}
