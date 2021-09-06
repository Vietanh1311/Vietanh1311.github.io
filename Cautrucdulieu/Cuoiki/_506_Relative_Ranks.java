import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class _506_Relative_Ranks {
    public static void main(String[] args) {
        int score[] = {5,4,3,2,1};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    
    
    }
    public static String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<score.length;i++) {
            map.put(score[i],i);
        }
        String[] arr = new String[score.length];
        Arrays.sort(score);
        int size=score.length;
        if((size-1)>=0)
            arr[map.get(score[size-1])]="Gold Medal";
        if((size-2)>=0)
            arr[map.get(score[size-2])]="Silver Medal";
        if((size-3)>=0)
            arr[map.get(score[size-3])]="Bronze Medal";
        for(int i=size-4;i>=0;i--) {
            int index=map.get(score[i]);
            arr[index]=String.valueOf(size-i);
        }
        return arr;
    }
}
