package baiTap1_qL_KhachSan.view;

import baiTap1_qL_KhachSan.controller.KhachSan;
import baiTap1_qL_KhachSan.model.KhachHang;

import java.time.LocalDate;

public class Run {
    public static void main(String[] args) {
        KhachHang khachHang1 = new KhachHang("kh1", LocalDate.of(1999, 5, 6),
                1233, 3, "VIP1", 100);

        KhachSan binh = new KhachSan();
        binh.getKhachHangs().add(khachHang1);
        binh.themKH();
        binh.hienThi();
        binh.xoa();
        binh.hienThi();
        System.out.println("So tien phong phai tra la : "+ binh.traTienPhong());

    }

}
