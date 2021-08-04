public class _485_Max_Consecutive_Ones {
    public static void main(String[] args){
        int nums[]={1,0,1,1,1,0,1};
        findMaxConsecutiveOnes(nums);
        System.out.println("Done");
        
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max=0;
        for (int i : nums) {
            if(i==1){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        System.out.println(max);
        return max;
    }
    
}
