public class _26_Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,2,3,3,4};

        removeDuplicates(nums);
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
                
            }
        }
        
        return i++;
    }
}
