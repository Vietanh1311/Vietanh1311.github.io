import java.util.Arrays;

public class DemoMergeSort {

    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public int[] mergeSort(int nums[], int ileft, int iright) {
        if (ileft == iright) {
            int singleElement[] = { nums[ileft] };
            return singleElement;
        }
        int imid = (ileft + iright) / 2;
        int nums1[] = mergeSort(nums, ileft, imid);
        int nums2[] = mergeSort(nums, imid + 1, iright);

        int result[] = merge(nums1, nums2);

        return result;
    }

    private int[] merge(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int result[] = new int[n];
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        while (i < n) {
            if (i1 < nums1.length && i2 < nums2.length) {
                if (nums1[i1] <= nums2[i2]) {
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = nums2[i2];
                    i++;
                    i2++;
                    
                }
            } else {
                if (i1 < nums1.length) {
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = nums2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }
}
