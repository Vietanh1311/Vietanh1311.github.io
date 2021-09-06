import java.util.Arrays;

public class _896_Monotonic_Array {
    public static void main(String[] args) {
        int num[] = { 1, 1, 2, 0 };
        System.out.println(isMonotonic(num));
    }

    public static boolean isMonotonic(int[] nums) {
        int n = nums.length - 1;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i + 1] >= nums[i]) {
                count1++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i + 1] <= nums[i]) {
                count2++;
            }
        }
        if (count1 == n || count2 == n) {
            return true;
        }

        return false;

    }

}
