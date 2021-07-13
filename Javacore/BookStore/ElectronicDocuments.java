package BookStore;

public class ElectronicDocuments extends Book{
    private int DungLuong;
    private int Luottai;
    private int Giathanh;
    
    public ElectronicDocuments( String tensach, String nhaxuatban, int namsanxuat, int dungLuong,
            int luottai, int giathanh) {
        super( tensach, nhaxuatban, namsanxuat);
        DungLuong = dungLuong;
        Luottai = luottai;
        Giathanh = giathanh;
    }

    public ElectronicDocuments( String tensach, String nhaxuatban, int namsanxuat) {
        super( tensach, nhaxuatban, namsanxuat);
    }
    

    public int getDungLuong() {
        return DungLuong;
    }

    public void setDungLuong(int dungLuong) {
        DungLuong = dungLuong;
    }

    public int getLuottai() {
        return Luottai;
    }

    public void setLuottai(int luottai) {
        Luottai = luottai;
    }

    public int getGiathanh() {
        return Giathanh;
    }

    public void setGiathanh(int giathanh) {
        Giathanh = giathanh;
    }

    @Override
    public String toString() {
        return "ElectronicDocuments [DungLuong=" + DungLuong + ", Giathanh=" + Giathanh + ", Luottai=" + Luottai + "]";
    }
    
    
    
}
