package BookStore;

public class Book implements Entity{
    private Long Masach;
    private String Tensach;
    private String Nhaxuatban;
    private int Namsanxuat;

    public Book( String tensach, String nhaxuatban, int namsanxuat) {
        Masach = IdGenerator.getNewID();
        Tensach = tensach;
        Nhaxuatban = nhaxuatban;
        Namsanxuat = namsanxuat;
    }
    
    
    public Long getMasach() {
        return Masach;
    }


    public void setMasach(Long masach) {
        Masach = masach;
    }


    public String getTensach() {
        return Tensach;
    }
    public void setTensach(String tensach) {
        Tensach = tensach;
    }
    public String getNhaxuatban() {
        return Nhaxuatban;
    }
    public void setNhaxuatban(String nhaxuatban) {
        Nhaxuatban = nhaxuatban;
    }
    public int getNamsanxuat() {
        return Namsanxuat;
    }
    public void setNamsanxuat(int namsanxuat) {
        Namsanxuat = namsanxuat;
    }
    @Override
    public String toString() {
        return "Book [Masach=" + Masach + ", Namsanxuat=" + Namsanxuat + ", Nhaxuatban=" + Nhaxuatban + ", Tensach="
                + Tensach + "]";
    }

    @Override
    public Long getId() {
        // TODO Auto-generated method stub
        return Masach;
    }
    

    
}
