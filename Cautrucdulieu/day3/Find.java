import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // System.out.println("nhập số cần tìm : ");
        // Scanner input = new Scanner(System.in);
        // int x = input.nextInt();
        // int result = find(x, a); 
        // if(result == -1) 
        // System.out.print("Element is not present in array"); 
        // else
        // System.out.print("Element is present at index " + result); 
        System.out.println(find(9, a, a.length-1));
    }

    // public static int find(int x, int[] a) {
    //     int n = a.length;
    //     for (int i = 0; i < n; i++) {
    //         if (a[i] == x)
    //             return i;
    //     }
    //     return -1;

    // }
    public static int find(int x, int[] a,int i){
        if(i<0){
            return -1;
        }
        if(a[i]==x){
            return i;
        }
        return find(x, a, i-1);   
    }

}
