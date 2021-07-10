package Stream.baitapvenha;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Repository repository = new Repository();
        System.out.println("Mời bạn chọn danh mục :");
        System.out.println("1.Điện thoại");
        System.out.println("2.Laptop");
        System.out.println("3.Apple");
        System.out.println("4.Phụ kiện");
        System.out.println("5.Tìm theo giá ");
        System.out.println("6.Tìm theo tên ");
        System.out.println("7.Nhấn 0 để thoát .");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        switch (n) {
            case 1:
                repository.dienthoai();
            case 2:
                repository.Laptop();
            case 3:
                repository.Apple();
            case 4:
                repository.Phukien();
            case 5: {
                System.out.println("Mời bạn chọn mức giá : ");
                System.out.println("1.Dưới 2 triệu");
                System.out.println("2.Từ 2 - 4 triệu");
                System.out.println("3.Từ 4 - 7 triệu");
                System.out.println("4.Từ 7 - 13 triệu");
                System.out.println("5.Trên 13 triệu");
                int i = input.nextInt();
                switch (i) {
                    case 1:
                    repository.gia();
                    case 2:
                    repository.gia2();
                    case 3:
                    repository.gia3();
                    case 4:
                    repository.gia4();
                    case 5:
                    repository.gia5();
                }
            }
            case 6 :
            {
                System.out.print("Mời bạn nhập tên sản phẩm : ");
                repository.timkiem();
            }
            case 7 :
            System.exit(0);
            

        }

    }
}
