// package day2;

import java.util.Arrays;


public class _414_Third_Maximum_Number {
    public static void main(String[] args) {
        int nums[] = { 1, 2 };

        thirdMax(nums);
    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int location = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[location]) {
                nums[++location] = nums[i];
            }
        }
        if (location < 2) {
            return nums[location];
        }
        return nums[location -2] ;

    }
}
