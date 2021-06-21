package codethuvien;
import java.time.LocalDate;
import java.util.List;

public class Voucher implements Entity{
   
    private Long id;
    private Readers readers;
    private LocalDate Ngaythue;
    private LocalDate Ngayhentra;
    private List<LineItem> items; //chi tiết từng mặt hàng trong đơn hàng
    
    
    public Voucher(Long id, Readers readers, LocalDate localDate, LocalDate localDate2, String notes,
            List<LineItem> items) {
        this.id = id;
        this.readers = readers;
        Ngaythue = localDate;
        Ngayhentra = localDate2;
        this.items = items;
    }
    

    public void setId(Long id) {
        this.id = id;
    }


    public Readers getReaders() {
        return readers;
    }


    public void setReaders(Readers readers) {
        this.readers = readers;
    }


    public LocalDate getNgaythue() {
        return Ngaythue;
    }


    public void setNgaythue(LocalDate ngaythue) {
        Ngaythue = ngaythue;
    }


    public LocalDate getNgayhentra() {
        return Ngayhentra;
    }


    public void setNgayhentra(LocalDate ngayhentra) {
        Ngayhentra = ngayhentra;
    }



    public List<LineItem> getItems() {
        return items;
    }


    public void setItems(List<LineItem> items) {
        this.items = items;
    }
    

    @Override
    public Long getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Voucher [Ngayhentra=" + Ngayhentra + ", Ngaythue=" + Ngaythue + ", id=" + id + ", items=" + items
                + ", readers=" + readers + "]";
    }  
    
}
