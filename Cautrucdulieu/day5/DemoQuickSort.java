import java.util.Arrays;

public class DemoQuickSort {

    public void sortArray(int[] nums, int ileft, int iright) {
       
        if (ileft >= iright) {
            return;
        }
        int imid = (ileft + iright) / 2;
        int key = nums[imid];

        int pivot = partiton(nums, ileft, iright, key);

        sortArray(nums, ileft, pivot-1);
        sortArray(nums, pivot, iright);

    }

    private int partiton(int[] nums, int ileft, int iright, int key) {
        int il = ileft;
        int ir = iright;

        while (il <= ir) {
            while (nums[il] < key) {
                il++;
            }
            while (nums[ir] > key) {
                ir--;
            }
            if (il <= ir) {
                
                int temp = nums[il];
                nums[il] = nums[ir];
                nums[ir] = temp;
                il++;
                ir--;
            }
            
        }

        return il;
    }

}
