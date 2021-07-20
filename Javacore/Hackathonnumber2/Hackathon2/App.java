package Hackathonnumber2.Hackathon2;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Repository repository = new Repository();
        
        System.out.println("Menu lựa chọn");
        System.out.println("1.Xem tất cả thông tin khách hàng. ");
        System.out.println("2.Xem thông tin khách hàng nữ hoặc nam . ");
        System.out.println("3.Thêm khách hàng vào danh sách .");
        System.out.println("4.Tìm kiếm thông tin dựa vào mã khách hàng .");
        System.out.println("0.Thoát chương trình ");
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        switch (n) {
            case 1:{
                repository.print();
                break;
            }
            case 2:{
                System.out.println("Bạn muốn xem thông tin khách nữa hay nam : Nam gõ 1 hoặc nữ gõ 2");
                int k = input.nextInt();
                switch (k) {
                    case 1:{
                        repository.Sex1();
                        break;
                    }
                    case 2:{
                        repository.Sex2();
                        break;
                    }
                }
            }
            case 3:{
                repository.AddCustomer();
                repository.print();
                break;
            }
            case 4:{
                repository.SearchByCode();
            }
            case 5:{
                break;
            }
        }
    }
}
