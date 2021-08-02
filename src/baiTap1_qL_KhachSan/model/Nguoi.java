package baiTap1_qL_KhachSan.model;

import java.time.LocalDate;

public abstract class Nguoi {
    private String ten;
    private LocalDate ngaySinh;
    private int soCM;

    public Nguoi() {
    }

    public Nguoi(String ten, LocalDate ngaySinh, int soCM) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.soCM = soCM;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getSoCM() {
        return soCM;
    }

    public void setSoCM(int soCM) {
        this.soCM = soCM;
    }


    @Override
    public String toString(){
        return " Ten : "+ten
                +", Ngay sinh : "+ngaySinh
                +", So CM : " + soCM;
    }

    public abstract int getTienPhong();
}
