package b12_day36_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Review {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5,4,1,1,1,2,2,3,1));
        nums.removeAll(Arrays.asList(1,2));
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
    }
}
