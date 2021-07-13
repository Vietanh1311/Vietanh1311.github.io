package BookStore;

public class TextBook extends Book implements IMuon, IKho {

    private int Sotrang;
    private String TinhTrang;
    private int Tongsoluong;
    private int soluongmuon;

    public TextBook( String tensach, String nhaxuatban, int namsanxuat, int sotrang, String tinhTrang,
            int tongsoluong, int soluongmuon) {
        super( tensach, nhaxuatban, namsanxuat);
        Sotrang = sotrang;
        TinhTrang = tinhTrang;
        Tongsoluong = tongsoluong;
        this.soluongmuon = soluongmuon;
    }

    public int getSotrang() {
        return Sotrang;
    }

    public void setSotrang(int sotrang) {
        Sotrang = sotrang;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        TinhTrang = tinhTrang;
    }

    public int getTongsoluong() {
        return Tongsoluong;
    }

    public void setTongsoluong(int tongsoluong) {
        Tongsoluong = tongsoluong;
    }

    public int getSoluongmuon() {
        return soluongmuon;
    }

    public void setSoluongmuon(int soluongmuon) {
        this.soluongmuon = soluongmuon;
    }

    public TextBook( String tensach, String nhaxuatban, int namsanxuat) {
        super( tensach, nhaxuatban, namsanxuat);
    }

    @Override
    public String toString() {
        return "TextBook [Sotrang=" + Sotrang + ", Nhaxuatban =" + getNhaxuatban() + ", Namsanxuat =" + getNamsanxuat()
                + ", Masach=" + getMasach() + ", TenSach=" + getTensach().toString() + ", TinhTrang=" + TinhTrang
                + ", Tongsoluong=" + Tongsoluong + ", soluongmuon=" + soluongmuon +", tonkho: "+ TonKho()+", Vị trí: "+ ViTri(1)+ "]";
    }
    @Override
    public int TonKho() {
        return Tongsoluong - soluongmuon;
    }

    @Override
    public String ViTri(int vt) {
        return "Hang: "+vt;
    }
    

}
