package buoi3.bai1;

import java.util.Scanner;

public class cach2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mời bạn nhập tháng");
        int n = input.nextInt();
        switch (n) {
            case 1, 3 ,5, 7, 8, 10, 12:{
                System.out.println("Tháng có 31 ngày");
                break;
            }
            case 4, 6, 9, 11:{
                System.out.println("Tháng có 30 ngày");
                break;
            }
            case 2:{
                System.out.println("Tháng có 28 ngày");
                break;
            }
            default:{
                System.out.println("Nhập sai .");
            }

        }
    }

    
}
