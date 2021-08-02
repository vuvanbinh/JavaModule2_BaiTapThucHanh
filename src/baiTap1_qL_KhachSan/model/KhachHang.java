package baiTap1_qL_KhachSan.model;

import baiTap1_qL_KhachSan.model.Nguoi;

import java.time.LocalDate;

public class KhachHang extends Nguoi {
    private int soNgayTro;
    private String loaiPhong;
    private int giaPhong;

    public KhachHang(){};

    public KhachHang(int soNgayTro, String loaiPhong, int giaPhong) {
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public KhachHang(String ten, LocalDate ngaySinh, int soCM, int soNgayTro, String loaiPhong, int giaPhong) {
        super(ten, ngaySinh, soCM);
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public int getSoNgayTro() {
        return soNgayTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(int giaPhong) {
        this.giaPhong = giaPhong;
    }

    public int getTienPhong(){
        return soNgayTro*giaPhong;
    }

    public String toString(){
      return   super.toString() +
              ", So ngay tro : "+ soNgayTro
              +", Loai Phong : "+ loaiPhong
              +", Gia phong : "+ giaPhong
                +" \n";
    }

}
