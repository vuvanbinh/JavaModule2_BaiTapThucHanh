package baiTap5_QL.model;

import java.io.Serializable;
import java.util.List;

public class HoDan implements Serializable {
    private int soNha;
    private int soThanhVien;
    private List<Nguoi> thanhViens;

    public HoDan() {
    }

    public HoDan(int soNha, int soThanhVien, List<Nguoi> thanhVien) {
        this.soNha = soNha;
        this.soThanhVien = soThanhVien;
        this.thanhViens = thanhVien;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public List<Nguoi> getThanhViens() {
        return thanhViens;
    }

    public void setThanhVien(List<Nguoi> thanhViens) {
        this.thanhViens = thanhViens;
    }

    @Override
    public String toString() {
        return "HoDan{" +
                "soNha=" + soNha +
                ", soThanhVien=" + soThanhVien +
                ", thanhVien=" + thanhViens +
                '}';
    }
}
