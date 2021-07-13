package BookStore;

import java.util.Optional;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Chào mừng bạn đến với Book Store ");
        System.out.println("Mời bạn chọn Loại : ");
        System.out.println("1.Sách Giáo Khoa ");
        System.out.println("2.Đồ Án");
        System.out.println("3.Tài Liệu điện tử ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        switch (n) {
            case 1: {
                Database db = new Database();
                db.TextBookRepo.add(new TextBook("Toán lớp 1", "Bộ Giáo dục", 2012, 220, "đủ ", 500, 200));
                db.TextBookRepo.add(new TextBook("Toán lớp 2", "Bộ Giáo dục", 2017, 200, "đủ ", 480, 100));
                db.TextBookRepo.add(new TextBook("Toán lớp 3", "Bộ Giáo dục", 2019, 180, "đủ ", 350, 150));
                db.TextBookRepo.add(new TextBook("Toán lớp 4", "Bộ Giáo dục", 2011, 150, "đủ ", 420, 180));
                db.TextBookRepo.add(new TextBook("Toán lớp 5", "Bộ Giáo dục", 2015, 170, "đủ ", 310, 220));

                List<TextBook> textbook = db.TextBookRepo.getAll();
                for (TextBook textbooks : textbook) {
                    System.out.println(textbooks);
                }
                System.out.println("Đây là những sách hiện có .");
                System.out.println("Bạn muốn thêm tài liệu gì không ?");
                System.out.println("Chọn 1 để thêm,sửa và xóa Hoặc Chọn 0 để thoát");
                int i = input.nextInt();
                switch (i) {
                    case 0:
                        break;
                    case 1: {
                        System.out.println("Mời bạn chọn ");
                        System.out.println("1.Thêm");
                        System.out.println("2.Sửa");
                        System.out.println("3.Xóa");
                        int a = input.nextInt();
                        switch (a) {
                            case 1: {
                                System.out.println("Tên sách: ");
                                String tensach = input.nextLine();
                                System.out.println("Nhà xuất bản: ");
                                String nhaxuatban = input.nextLine();
                                System.out.println("Năm sản xuất: ");
                                int namsanxuat = input.nextInt();
                                System.out.println("Số trang: ");
                                int sotrang = input.nextInt();
                                System.out.println("Tình Trạng: ");
                                String tinhTrang = input.nextLine();
                                System.out.println("Tổng số lượng: ");
                                int tongsoluong = input.nextInt();
                                System.out.println("Số lượng Mượn: ");
                                int soluongmuon = input.nextInt();
                                db.TextBookRepo.add(new TextBook(tensach, nhaxuatban, namsanxuat, sotrang, tinhTrang,
                                        tongsoluong, soluongmuon));
                                System.out.println("Danh sách sau khi thêm ");
                                for (TextBook textbooks : textbook) {
                                    System.out.println(textbooks);
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("Chọn sách mà bạn muốn update :");

                                // System.out.println("Tên sách: ");
                                // String tensach = input.nextLine();
                                // System.out.println("Nhà xuất bản: ");
                                // String nhaxuatban = input.nextLine();
                                // System.out.println("Năm sản xuất: ");
                                // int namsanxuat = input.nextInt();
                                // System.out.println("Số trang: ");
                                // int sotrang = input.nextInt();
                                // System.out.println("Tình Trạng: ");
                                // String tinhTrang = input.nextLine();
                                // System.out.println("Tổng số lượng: ");
                                // int tongsoluong = input.nextInt();
                                // System.out.println("Số lượng Mượn: ");
                                // int soluongmuon = input.nextInt();
                                // db.TextBookRepo.update(new TextBook(tensach, nhaxuatban, namsanxuat, sotrang,
                                // tinhTrang, tongsoluong, soluongmuon));
                                // System.out.println("Danh sách sau khi update ");
                                // for (TextBook textbooks : textbook) {
                                // System.out.println(textbooks);
                                // }
                                db.TextBookRepo
                                        .update(new TextBook("Toán lớp 3", "Bộ Giáo dục", 2019, 180, "đủ ", 350, 150));
                                for (TextBook textbooks : textbook) {
                                    System.out.println(textbooks);
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Mời bạn nhập mã sách muốn xóa");
                                Long id = input.nextLong();
                                db.TextBookRepo.deleteByID(id);

                                System.out.println("Danh sách sau khi xóa : ");
                                for (TextBook textbooks : textbook) {
                                    System.out.println(textbooks);
                                }

                                break;

                            }
                        }

                    }
                }
                break;
            }
            case 2: {
                System.out.println("Làm tương tự case 1");
            }
            case 3: {
                System.out.println("Làm tương tự case 1 Vì chiều em phải đi làm thêm nên cô giáo thông cảm cho em .");
            }

        }

    }
}
