package Thread;

public class Kiemchungvien extends Nhanvien {
    private int luongcoban;
    private int soloi;
    
    public Kiemchungvien(String maNhanVien, String hoten, int tuoi, int soDienThoai, String email) {
        super(maNhanVien, hoten, tuoi, soDienThoai, email);
    }
    
    public Kiemchungvien(String maNhanVien, String hoten, int tuoi, int soDienThoai, String email, int luongcoban,
            int soloi) {
        super(maNhanVien, hoten, tuoi, soDienThoai, email);
        this.luongcoban = luongcoban;
        this.soloi = soloi;
    }

    

    public int getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(int luongcoban) {
        this.luongcoban = luongcoban;
    }

    public int getSoloi() {
        return soloi;
    }

    public void setSoloi(int soloi) {
        this.soloi = soloi;
    }

    @Override
    public String toString() {
        return "Kiemchungvien [luongcoban=" + luongcoban + ", MaNhanVien=" + getMaNhanVien() + ", Hoten=" + getHoten()
        + ", tuoi=" + getTuoi() + ", soDienThoai=" + getSoDienThoai() + ", email=" + getEmail()
         +", soloi"+soloi + ", luongthucte=" + hashCode() + "]";
    }
    @Override
    public int hashCode() {
        return luongcoban+soloi*10000;

    }
    
    
    
    
}
