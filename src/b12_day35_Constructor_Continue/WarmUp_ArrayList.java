package b12_day35_Constructor_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp_ArrayList {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    ArrayList<Integer> result = arr(arr);
        System.out.println(result);
        ///////////////////////////////////////////////////////////////////////////
        Integer[] inarr = {34, 100, 78, 99};
        System.out.println(max(inarr));
///////////////////////////////////////////////////////////////////////////////////
        ArrayList<Integer> max2 = new ArrayList<>();
        max2.addAll(Arrays.asList(67, 3, 5, 99, 76));
        System.out.println(max2);
        System.out.println(arrayListMax(max2));
     //////////////////////////////////////////////////////////////////////////////
     ArrayList<Integer> min = new ArrayList<>();
     min.addAll(Arrays.asList(67, 3, 5, 99, 76));
        System.out.println(min);
        System.out.println(arrayListMin(min));



        ArrayList<Integer> exm = new ArrayList<>(Arrays.asList(12, 12, 45, 50));
        System.out.println(exm);
        exm.removeAll(Arrays.asList(12));
        System.out.println(exm);
    }






////////////////////////// Returns intArray to ArrayList ////////////////////////////////////
    public static ArrayList<Integer> arr (int [] arr) {
        ArrayList<Integer> num = new ArrayList<>();
        Integer[] INT = new Integer[arr.length];
        for(int each : arr) {
            num.add(each);
        }
        return num;
    }

    //////////////////////////// Returns Integer Array max ///////////////////////////////////

    public static Integer max(Integer[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        } return max;
    }
//////////////////////////////////// Accepts Integer ArrayList, returns Second Max number ///////
    public static Integer arrayListMax(ArrayList<Integer> arr) {
        Integer max = Integer.MIN_VALUE;
        Integer max2 = Integer.MIN_VALUE+1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > max) {
                max = arr.get(i);
            }
        } arr.remove(max);
        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max2) {
                max2 = arr.get(i);
            }
        } return max2;
    }

    //////////////////////////// Accepts an Integer ArrayList, returns 2nd minimum number ///////////
public static Integer arrayListMin(ArrayList<Integer> arr) {
        Integer min = Integer.MAX_VALUE;
        Integer min2 = Integer.MAX_VALUE+1;
        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        for(int i = 0; i < arr.size(); i++) {
        if (min2 > arr.get(i) && min < min2) {
            min2 = arr.get(i);
        }
    } return min2;

        //////////////////////////
}
}
