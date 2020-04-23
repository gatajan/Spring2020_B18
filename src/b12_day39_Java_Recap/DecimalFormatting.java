package b12_day39_Java_Recap;

import java.text.DecimalFormat;

public class DecimalFormatting {
    public static void main(String[] args) {
        // DecimalFormatter Class. It is imported from java.text

        DecimalFormat format1 = new DecimalFormat("0.00");
        double b = 23.1245679;

        //format(double): formats the decimals and returns STRING value.
        String num1 = format1.format(b);
        System.out.println(num1);

        double c = 45.56789;
        System.out.println(format1.format(c)); // How to convert String to double?

        c = Double.parseDouble(format1.format(c)); //Convert String to number.
        double d = Double.valueOf(format1.format(c));
        System.out.println(d+5);



    }
}
