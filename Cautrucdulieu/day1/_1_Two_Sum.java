public class _1_Two_Sum {
    public static void main(String[] args) {
        int nums[]={3,3};
        twoSum(nums , 6);
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = 1; j < nums.length ;j++){
                if(target == nums[j]+nums[i]){
                    System.out.println("["+ i +","+ j+ "]");
                    
                }
                          
            }
           
        }

        return nums;
    }
}
