package b12_day36_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp_RemDubFromIntArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,1,5));
        System.out.println(remDub(list));

        ArrayList<String> str = new ArrayList<>(Arrays.asList("Melek", "Bekir", "Melek", "Mahriban", "Bekir"));
        System.out.println(remDub1(str));

        ArrayList<Character> chr = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'B'));

        System.out.println(remDub2(chr));
    }
////////////////////////////////////////////////////////////////////////////////////////////////////
    public static ArrayList<Integer> remDub(ArrayList<Integer> nums) {
      ArrayList<Integer> remDub = new ArrayList<>();
      for(Integer each : nums) {
          if(!remDub.contains(each)) {
              remDub.add(each);
          }
      } return remDub;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////

    public static ArrayList<String> remDub1(ArrayList<String> str) {
        ArrayList<String> list = new ArrayList<>();
        for(String each : str) {
            if(!list.contains(each)) {
                list.add(each);
            }
        } return list;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////

    public static ArrayList<Character> remDub2(ArrayList<Character> chr){
        ArrayList<Character> car = new ArrayList<>();
        for(Character each : chr) {
            if(!car.contains(each)) {
                car.add(each);

            }
        } return car;
    }

}
