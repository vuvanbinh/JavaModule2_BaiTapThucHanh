package baiTap8_QLTaiLieu.model;

import java.time.LocalDate;

public class Bao extends TaiLieu {
    private LocalDate ngayPhatHanh;


    public Bao(LocalDate ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(String maTaiLieu, String tenNhaSX, int soBan, LocalDate ngayPhatHanh) {
        super(maTaiLieu, tenNhaSX, soBan);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public LocalDate getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(LocalDate ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Loai tai lieu : Bao{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                '}';
    }
}
