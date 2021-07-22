package Ontapjavacore;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Repository repository = new Repository();
        System.out.println("Menu lựa chọn");
        System.out.println("1.Xem sản phẩm");
        System.out.println("2.Thêm mới sản phẩm ");
        System.out.println("3.Tìm sản phẩm theo mã và sửa sản phẩm đó");
        System.out.println("4.Tìm sản phẩm theo mã sản phẩm và xóa sản phẩm đó");
        System.out.println("5.Xem sản phẩm và số lượng bán được");
        System.out.println("6.Liệt kê loại sản phẩm và số lượng sản phẩm thuộc loại đó");
        System.out.println("7.Sắp xếp sản phẩm theo tên");
        System.out.println("8.Vẽ hình chữ nhật rỗng ruột ");
        System.out.println("Mời bạn nhập lựa chọn:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        switch (n) {
            case 1:{
                repository.print();
                break;
            }
            case 2:{
                repository.add();
                System.out.println("Danh sách sau khi thêm là :");
                repository.print();
                break;
            }
            case 3:{
                System.out.println("Mời bạn nhập sản phẩm muốn tìm :");
                Long id = input.nextLong();
                System.out.println("Sản phẩm bạn muốn tìm : ");
                repository.findById(id);
                // repository.update(t);
                break;
                
            }
            case 4:{
                System.out.println("Mời bạn nhập id muốn tìm: ");
                Long id = input.nextLong();
                System.out.println("Sản phẩm bạn muốn tìm : ");
                repository.findById(id);
                System.out.println("Danh sách sau khi xóa sản phẩm đó :");
                repository.deleteByID(id);
                repository.print();
                
                
                break;
            }
            case 5:{
                repository.case5();
                break;
            }
            case 6:{
                System.out.println("Đồ gia dụng: ");
                repository.dogiadung();
                System.out.println("Thời trang :");
                repository.thoitrang();
                System.out.println("Mỹ phẩm :");
                repository.mypham();
                System.out.println("Thức ăn :");
                repository.doan();
                break;
            }
            case 7:{
                repository.SortName();
                repository.print();
                break;
            }
            case 8:{
                repository.vehinhchunhat();
            }
        }
        
    }
}
