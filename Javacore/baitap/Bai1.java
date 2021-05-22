package baitap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập N : ");
        int n = sc.nextInt();
        String[][] a = new String[100][100]; // Khai báo mảng 2 chiều có tên là a

        // Hình1
        System.out.println("Hình 1");
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                a[i][j] = " * "; // gán mảng 2 chiều bằng * với i là hàng còn j là cột
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a[i][j] + " "); // in ra mang 2 chiều
            }
            System.out.println();
        }
        //hình 2 
        System.out.println("hình 2"); // Chia thành 2 vòng for một vòng chạy từ 0 đến N-1 còn 1 vòng chạy từ N-2 về 0 với điều kiện như trong if
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j==0 || j==i) { 
                System.out.print(a[i][j]+ "");
                }
                else System.out.print("   ");
            }
            System.out.println();
        }
        for (int i = n-2; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (j==0 || j==i) {
                System.out.print(a[i][j]+ "");
                }
                else System.out.print("   ");
            }
            System.out.println();
        }
        // Hình Chữ Nhật 
        System.out.println("Hình 3"); // Cho người dùng nhập chiều cao và chiều rộng xong cho vòng for chạy từ 0 đến A và B với điều kiện Dòng 1 và cuối thì in full *
        System.out.print("Nhập chiều rộng tam giác : ");
        int A = sc.nextInt();
        System.out.print("Nhập chiều cao tam giác : ");
        int B = sc.nextInt();
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                if (j==0 || i==A-1 || j==B-1 || i==0) {
                System.out.print(a[i][j]+ "");
                }
                else System.out.print("   ");
            }
            System.out.println();
        }
        
    }
}