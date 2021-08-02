package baiTap7_qLCanBoGiaoVien.model;

import java.time.LocalDate;

public class CanBo {
    private String ten;
    private int cmt ;
    private LocalDate ngaySinh;
    private String queQuan;

    public CanBo() {
    }

    public CanBo(String ten, int cmt , LocalDate ngaySinh, String queQuan) {
        this.ten = ten;
        this.cmt = cmt;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
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

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getCmt() {
        return cmt;
    }

    public void setCmt(int cmt) {
        this.cmt = cmt;
    }



    public String toString(){
        return "Ten : " + ten
                +", Ngay sinh : " + ngaySinh
                +", Que quan : " + queQuan;
    }
}
