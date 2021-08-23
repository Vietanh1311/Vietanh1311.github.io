public class _724_Find_Pivot_Index {
    public static void main(String[] args) {
        int nums[] = { 2, 1, -1 };
        System.out.println(pivotIndex(nums));
    }

    // public static int pivotIndex(int[] nums) {
    // int leftsum = 0;
    // int rightsum = 0;
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = 0; j < i; j++) {
    // leftsum += nums[j];

    // }
    // for (int j = i + 1; j < nums.length; j++) {
    // rightsum += nums[j];

    // }
    // if (leftsum == rightsum) {
    // return i;
    // }
    // leftsum=0;
    // rightsum=0;
    // }
    // return -1;

    // }
    public static int pivotIndex(int[] nums) {
        int leftsum = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            
            if (sum - leftsum - nums[i] == leftsum) {
                return i;
            }
            leftsum += nums[i];

        }
        return -1;

    }

}
