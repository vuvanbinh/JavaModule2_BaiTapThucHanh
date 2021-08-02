package baiTap5_QL.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Nguoi implements Serializable {
    private String ten;
    private LocalDate ngaySinh;
    private String ngheNghiep;

    public Nguoi() {
    }

    public Nguoi(String ten, LocalDate ngaySinh, String ngheNghiep) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.ngheNghiep = ngheNghiep;
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

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ten='" + ten + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                '}';
    }
}
