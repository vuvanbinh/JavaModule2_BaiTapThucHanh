package baiTap3_QLDien.model;

public class BienLai extends KhachHang {
    private int soDienCu;
    private int soDienMoi;

    public BienLai() {
    }

    public BienLai(String ten, int soNha, String mSCongTo) {
        super(ten, soNha, mSCongTo);
    }

    public BienLai(int soDienCu, int soDienMoi) {
        this.soDienCu = soDienCu;
        this.soDienMoi = soDienMoi;
    }

    public BienLai(String ten, int soNha, String mSCongTo, int soDienCu, int soDienMoi) {
        super(ten, soNha, mSCongTo);
        this.soDienCu = soDienCu;
        this.soDienMoi = soDienMoi;
    }

    public int getSoDienCu() {
        return soDienCu;
    }

    public void setSoDienCu(int soDienCu) {
        this.soDienCu = soDienCu;
    }

    public int getSoDienMoi() {
        return soDienMoi;
    }

    public void setSoDienMoi(int soDienMoi) {
        this.soDienMoi = soDienMoi;
    }

    public String toString(){
        return super.toString() +
                ", So dien cu : " + soDienCu
                + ", So dien moi : "+ soDienMoi;
    }

    @Override
    public int soTienPhaiTra() {
        return (soDienMoi-soDienCu)*750;
    }

}
