public class _1512_Number_of_Good_Pairs {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 5 };
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }

        }

        return count;

    }

}
