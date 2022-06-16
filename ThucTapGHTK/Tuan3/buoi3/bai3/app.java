package buoi3.bai3;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên tố mà bạn muốn tính :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(Cach1(n));
        System.out.println(Cach2(n));
        System.out.println(Cach3(n));
    }

    public static int Cach1(int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (isPrimeNumber(i) == true) {
                total += i;
            }
        }
        return total;
    }

    public static int Cach2(int n) {
        int i = 1;
        int total = 0;
        while (i < n) {
            if (isPrimeNumber(i) == true) {
                total += i;
            }
            i++;
        }
        return total;
    }

    public static int Cach3(int n) {
        int i = 1;
        int total = 0;
        do {
            if (isPrimeNumber(i) == true) {
                total += i;
            }
            i++;
        } while (i < n);

        return total;
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
