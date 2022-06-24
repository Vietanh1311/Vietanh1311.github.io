package Tuan4b2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class app {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 4, 6, 9, 11, 2, 7, 3, 8));
        List<Integer> b = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 5, 10, 11, 6));
        SortRemoveDuplicates(a, b);
    }

    public static void SortRemoveDuplicates(List<Integer> a, List<Integer> b) {
        TreeSet<Integer> c = new TreeSet<Integer>();
        c.addAll(a);
        c.addAll(b);
        for (Integer integer : c) {
            System.out.print(integer + " ");
        }
    }
}
