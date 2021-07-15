package Thread;

public class Nhanvien {
    private String MaNhanVien;
    private String Hoten;
    private int Tuoi;
    private int SoDienThoai;
    private String email;
    public Nhanvien(String maNhanVien, String hoten, int tuoi, int soDienThoai, String email) {
        MaNhanVien = maNhanVien;
        Hoten = hoten;
        Tuoi = tuoi;
        SoDienThoai = soDienThoai;
        this.email = email;
    }
    public String getMaNhanVien() {
        return MaNhanVien;
    }
    public void setMaNhanVien(String maNhanVien) {
        MaNhanVien = maNhanVien;
    }
    public String getHoten() {
        return Hoten;
    }
    public void setHoten(String hoten) {
        Hoten = hoten;
    }
    public int getTuoi() {
        return Tuoi;
    }
    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }
    public int getSoDienThoai() {
        return SoDienThoai;
    }
    public void setSoDienThoai(int soDienThoai) {
        SoDienThoai = soDienThoai;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Nhanvien [Hoten=" + Hoten + ", MaNhanVien=" + MaNhanVien + ", SoDienThoai=" + SoDienThoai + ", Tuoi="
                + Tuoi + ", email=" + email + "]";
    }
    
}
