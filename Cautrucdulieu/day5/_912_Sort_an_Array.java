import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _912_Sort_an_Array {
    public static void main(String[] args) {
        int nums[] = { 1, 9, 5, 8, 2, 4, 3, 7, 5, 6, 7, 8, 2, 31, 3, 34, 143, 53, 321, 4546, 123 };

        DemoMergeSort mdemo = new DemoMergeSort();
        DemoQuickSort dsort = new DemoQuickSort();
        insertSort isort = new insertSort();
        SelectionSort ssort = new SelectionSort();
        BubleSort bsort = new BubleSort();

        long startTime1 = System.nanoTime();
        System.out.println(Arrays.toString(mdemo.sortArray(nums)));
        long endTime1 = System.nanoTime();
        long totalTime1 = endTime1 - startTime1;
        System.out.println("Thời gian chạy của mergeSort  : " + totalTime1);

        long startTime2 = System.nanoTime();
        dsort.sortArray(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        long endTime2 = System.nanoTime();
        long totalTime2 = endTime2 - startTime2;
        System.out.println("Thời gian chạy của quickSort  : " + totalTime2);

        long startTime3 = System.nanoTime();
        isort.sortArray(nums);
        System.out.println(Arrays.toString(nums));
        long endTime3 = System.nanoTime();
        long totalTime3 = endTime3 - startTime3;
        System.out.println("Thời gian chạy của insertSort  : " + totalTime3);

        long startTime4 = System.nanoTime();
        ssort.sortArray(nums);
        System.out.println(Arrays.toString(nums));
        long endTime4 = System.nanoTime();
        long totalTime4 = endTime4 - startTime4;
        System.out.println("Thời gian chạy của SelectiontSort  : " + totalTime4);

        long startTime5 = System.nanoTime();
        bsort.BSort(nums);
        System.out.println(Arrays.toString(nums));
        long endTime5 = System.nanoTime();
        long totalTime5 = endTime5 - startTime5;
        System.out.println("Thời gian chạy của BubleSort  : " + totalTime5);

        Map<Integer, String> sortOder = new HashMap<Integer, String>();
        sortOder.put((int) totalTime1 , "QuickSort");
        sortOder.put((int) totalTime2 , "MergeSort");
        sortOder.put((int) totalTime3 , "InsertSort");
        sortOder.put((int) totalTime4 , "SelectionSort");
        sortOder.put((int) totalTime5 , "BubleSort");
        
        Set<Integer> set = sortOder.keySet();
        
        for (Integer key : set) {
            System.out.println(key + " " + sortOder.get(key));
        }
    }

}
