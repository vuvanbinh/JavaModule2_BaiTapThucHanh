package baiTap3_QLDien.model;

public abstract class KhachHang implements TienDien {
    private String ten;
    private int soNha;
    private String mSCongTo;

    public KhachHang() {
    }

    public KhachHang(String ten, int soNha, String mSCongTo) {
        this.ten = ten;
        this.soNha = soNha;
        this.mSCongTo = mSCongTo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getmSCongTo() {
        return mSCongTo;
    }

    public void setmSCongTo(String mSCongTo) {
        this.mSCongTo = mSCongTo;
    }

    public String toString(){
        return "Ten : "+ten
                +", So nha : "+ soNha
                +", Ma so cong to :"+ mSCongTo;
    }


}
