package baiTap7_qLCanBoGiaoVien.model;

public class CanBoGiaoVien {
    private int luongCung;
    private int thuong;
    private int phat;
    private CanBo canBo;

    public CanBoGiaoVien() {
    }

    public CanBoGiaoVien(int luongCung, int thuong, int phat, CanBo canBo) {
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
        this.canBo = canBo;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public int getPhat() {
        return phat;
    }

    public void setPhat(int phat) {
        this.phat = phat;
    }

    public CanBo getCanBo() {
        return canBo;
    }

    public void setCanBo(CanBo canBo) {
        this.canBo = canBo;
    }

    public int getLuong (){
        int luong = luongCung + thuong - phat;
        return luong;
    }


    @Override
    public String toString() {
        return "CanBoGiaoVien{" +
                "luongCung=" + luongCung +
                ", thuong=" + thuong +
                ", phat=" + phat +
                ", canBo=" + canBo +
                '}';
    }
}
