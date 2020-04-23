package b12_day23_arrays;

public class Warmup2 {
    public static void main(String[] args) {

        //Write a program that can find the unique characters from a String.

        String str = "ALL THE LETTERS";
        String Unique = "";


        for(int j = 0; j < str.length(); j++) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals("" + str.charAt(j))) {
                    count++;
                }
            }
            if (count == 1)
                Unique += str.charAt(j);
        }
        System.out.println(Unique);

    }
}
