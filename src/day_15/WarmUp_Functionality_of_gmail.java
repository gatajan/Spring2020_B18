package day_15;

public class WarmUp_Functionality_of_gmail {
    public static void main(String[] args) {

        String username = "cybertek.batch17@gmail.com";
        String password = "JavaBeauties";

        if(username.toLowerCase().endsWith("@gmail.com")) {
            if(password.equals("JavaBeauties")) {
                System.out.println("Login successfull!");
            } else System.out.println("Invalid username or password");
        } else System.out.println("It is not a valid email");


    }
}
