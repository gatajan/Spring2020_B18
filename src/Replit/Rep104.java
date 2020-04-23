package Replit;

import java.util.Scanner;

public class Rep104 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        boolean b = true;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 5 && nums[i + 1] == 5) {
                count++;
            }
        } if(count > 0) System.out.println(true);
        else System.out.println(false);
    }
}
