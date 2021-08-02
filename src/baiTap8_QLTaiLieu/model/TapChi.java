package baiTap8_QLTaiLieu.model;

public class TapChi extends TaiLieu{
    private String soPhatHanh;
    private String thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String soPhatHanh, String thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(String maTaiLieu, String tenNhaSX, int soBan, String soPhatHanh, String thangPhatHanh) {
        super(maTaiLieu, tenNhaSX, soBan);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Loai tai lieu : TapChi{" +
                "soPhatHanh='" + soPhatHanh + '\'' +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
