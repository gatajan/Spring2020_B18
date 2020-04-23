package b12_day29_return_method;

public class Tim_Challenge {
    public static void main(String[] args) {
        double result = calcFeetAndInchesToCentimeters(-1,6);
        double result2 = calcFeetAndInchesToCentimeters(30);
        System.out.println(result);
        System.out.println(result2);

    }
    public static double calcFeetAndInchesToCentimeters(double ft, double inch) {
       double centimeters=0;
        if(ft >= 0 && 12 > inch && inch >= 0) {
            centimeters = ft/0.032808 + inch/0.39370;
           }
            else {
                return -1;
        }
            return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inch) {
        double centimeters =0;
        if(inch >=0) {
            centimeters = inch/0.39370;
        } else {
            return -1;
        } return centimeters;
    }
}
