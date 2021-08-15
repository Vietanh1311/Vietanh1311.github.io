import java.util.Arrays;

public class BubleSort {

    public int[] BSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length-1; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

        }
        return nums;

    }
}
