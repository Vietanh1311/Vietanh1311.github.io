import java.util.Arrays;

public class _1051_Height_Checker {
    public static void main(String[] args) {
        int heights[]={5,1,2,3,4};
        heightChecker(heights);
    }
    public static int heightChecker(int[] heights) {
        int [] excepted = Arrays.copyOf(heights, heights.length);
        Arrays.sort(excepted);

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i; j < i+1; j++){
                if(excepted[i]!=heights[j]){
                    count++;
                }
            }
        }
       System.out.println(count);
        return count;
    }
    
}
