public class _704_Binary_Search {
    public static void main(String[] args) {
        int nums[] = {1,2,3, 4, 5, 6, 7, 8};
        // System.out.println(seach(nums, 8));
        System.out.println(binarySearch(nums, 3));
    }
    public static int seach(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] nums,int target){
        int n = nums.length;
        int ileft = 0;
        int iright =n-1;
        
        while(ileft <= iright){
            int imid = (ileft+iright) / 2;
            if(target > nums[imid]){
                ileft = imid +1;
            }
            else if(target < nums[imid]){
                iright = imid -1;
            }
            else{
                return imid;
            }
        }
        return -1;

    }
}
