package baiTap8_QLTaiLieu.model;

import java.io.Serializable;

public abstract class TaiLieu implements Serializable {
    private String maTaiLieu;
    private String tenNhaSX;
    private int soBan;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String tenNhaSX, int soBan) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaSX = tenNhaSX;
        this.soBan = soBan;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaSX() {
        return tenNhaSX;
    }

    public void setTenNhaSX(String tenNhaSX) {
        this.tenNhaSX = tenNhaSX;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", tenNhaSX='" + tenNhaSX + '\'' +
                ", soBan=" + soBan +
                '}';
    }
}
