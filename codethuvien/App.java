package codethuvien;
import java.util.List;
import java.util.Optional;
import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        Database db = new Database();
        db.ReadersRepo.add(new Readers("Room 1101, Empire State, New York, USA", "0123456789", 0, "Tom", "Tom123@gmail.com"));
        db.ReadersRepo.add(new Readers("số 2, Triều Khúc,Hà Nội", "0123456789", 0, "An", "An@gmail.com"));
        db.ReadersRepo.add(new Readers("Thắng Lợi ,Thường Tín,Hà NỘi", "0123456789", 0, "Thiện", "Thien@gmail.com"));
        db.ReadersRepo.add(new Readers("Seul, Korea", "0123456789", 0, "Lee Sung JI", "Lee123@gmail.com"));
        
        db.BookRepo.add(new Book(null, "Harry Poster", "Bloomsbury", Country.England, "Tiểu thuyết huyền bí", "J. K. Rowling", "3000"));
        db.BookRepo.add(new Book(null, "Truyện Kiều", null, Country.Vietnam, "Truyện thơ", "Nguyễn Du", "2000"));
        db.BookRepo.add(new Book(null, "Ông già và biển cả", "Ernest Hemingway", Country.Cuba , "Tiểu thuyết ngắn", "Ernest Hemingway", "200"));
        List<Readers> readers = db.ReadersRepo.getAll();
        for (Readers reader : readers) {
        System.out.println(reader);
        }

        List<Book> book = db.BookRepo.getAll();
        for(Book books : book){
            System.out.println(books);
        }
    //    db.BookRepo.deleteByID(2L);
    //    System.out.println("Sau khi xóa : ");
    //    for (Readers reader : readers) {
    //     System.out.println(reader);
    //     }
    // Khởi tạo từng mặt hàng trong một đơn hàng Order
        ArrayList<LineItem> list1 = new ArrayList<LineItem>();
        list1.add(new LineItem("Harry poster", 1000, 1));
        list1.add(new LineItem("Truyện Kiều", 2000, 1));
        list1.add(new LineItem("Ông già và biển cả", 3000, 2));

        db.VoucherRepo.add(new Voucher(1L, new Readers("Room 1101, Empire State, New York, USA", "0123456789", 0, "Tom", "Tom123@gmail.com") , LocalDate.now(), LocalDate.of(2022, 1, 21), "harry poster", list1 ));
        List<Voucher> vouchers = db.VoucherRepo.getAll();
        for(Voucher v : vouchers){
            System.out.println(v);
        }

    }
}
