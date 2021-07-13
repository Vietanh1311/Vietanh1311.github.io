package BookStore;

public class Project extends Book{
    private int Sotrang;
    private String Tinhtrang;
    private int Nambaove;

    
    public Project( String tensach, String nhaxuatban, int namsanxuat, int sotrang, String tinhtrang,
            int nambaove) {
        super( tensach, nhaxuatban, namsanxuat);
        Sotrang = sotrang;
        Tinhtrang = tinhtrang;
        Nambaove = nambaove;
    }

    public Project( String tensach, String nhaxuatban, int namsanxuat) {
        super( tensach, nhaxuatban, namsanxuat);
    }

    public int getSotrang() {
        return Sotrang;
    }

    public void setSotrang(int sotrang) {
        Sotrang = sotrang;
    }

    public String getTinhtrang() {
        return Tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        Tinhtrang = tinhtrang;
    }

    public int getNambaove() {
        return Nambaove;
    }

    public void setNambaove(int nambaove) {
        Nambaove = nambaove;
    }

    @Override
    public String toString() {
        return super.toString() +"Project [Nambaove=" + Nambaove+", Nhaxuatban =" + getNhaxuatban() + ", Namsanxuat =" + getNamsanxuat()
        +  ", TenSach=" + getTensach().toString() + ", Sotrang=" + Sotrang + ", Tinhtrang=" + Tinhtrang + "]";
    }
    
    
    
}
