package SpringB18;

public class ifWarmUp {
    public static void main(String[] args) {

        int Age = 30;
        boolean goodPerson = false;

            if(Age >= 18) {
                if(goodPerson) {
                    System.out.println("Alchohol is bad for your health");
                } else {
                    System.out.println("You can buy cigarettes");
                    if(Age >= 21) {
                        System.out.println("You can buy hookah");
                    }
                    if(Age >= 25) {
                        System.out.println("You can buy alcohol");
                    }
                }

            } else if(Age < 18 && Age >= 0 ) {
                System.out.println("Go get your milk and drink");
            } else
                System.out.println("Invalid Entry");


        }
    }
