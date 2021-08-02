package baiTap8_QLTaiLieu.model;

public class Sach extends TaiLieu{
    private String tacGia;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tacGia, int soTrang) {
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    public Sach(String maTaiLieu, String tenNhaSX, int soBan, String tacGia, int soTrang) {
        super(maTaiLieu, tenNhaSX, soBan);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Loai tai lieu : Sach{" +
                "tacGia='" + tacGia + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }
}
