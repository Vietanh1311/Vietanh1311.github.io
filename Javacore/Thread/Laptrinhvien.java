package Thread;

public class Laptrinhvien extends Nhanvien {
    private int luongcoban;
    private int sogioovertime;


    
    public Laptrinhvien(String maNhanVien, String hoten, int tuoi, int soDienThoai, String email, int luongcoban,
            int sogioovertime) {
        super(maNhanVien, hoten, tuoi, soDienThoai, email);
        this.luongcoban = luongcoban;
        this.sogioovertime = sogioovertime;
    }

    public Laptrinhvien(String maNhanVien, String hoten, int tuoi, int soDienThoai, String email) {
        super(maNhanVien, hoten, tuoi, soDienThoai, email);
    }

    public int getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(int luongcoban) {
        this.luongcoban = luongcoban;
    }

    public int getSogioovertime() {
        return sogioovertime;
    }

    public void setSogioovertime(int sogioovertime) {
        this.sogioovertime = sogioovertime;
    }
    
    @Override
    public String toString() {
        return "Laptrinhvien [luongcoban=" + luongcoban + ", MaNhanVien=" + getMaNhanVien() + ", Hoten=" + getHoten()
                + ", tuoi=" + getTuoi() + ", soDienThoai=" + getSoDienThoai() + ", email=" + getEmail()
                 +", sogioovertime=" + sogioovertime + ", luongthucte=" + hashCode() + "]";
    }
    @Override
    public int hashCode() {
        return luongcoban+sogioovertime*50000;

    }
}
