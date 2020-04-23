package b12_day29_return_method;

public class Challenge {
    public static void main(String[] args) {

       String result =  displayHighScorePosition("Bekir", calculateHighScorePosition(1500));
        System.out.println(result);
        String result1 =  displayHighScorePosition("Bekir", calculateHighScorePosition(900));
        System.out.println(result1);

    }
    public static String displayHighScorePosition (String playerName, int position) {
        String display = "" + playerName + " managed to get into position " + position +
        " on the high score table.";
        return display;
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore > 1000) return 1;
        else if(playerScore > 500 && playerScore < 1000) return 2;
        else if(playerScore > 100 && playerScore < 500) return 3;
        else return 4;

    }
}
