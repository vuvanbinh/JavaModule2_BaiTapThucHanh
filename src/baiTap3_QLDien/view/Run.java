package baiTap3_QLDien.view;

import baiTap3_QLDien.controller.Qlbl;
import baiTap3_QLDien.model.BienLai;

public class Run {
    public static void main(String[] args) {
        BienLai bienLai1 = new BienLai("nha1",01,"ct01",00,200);
        BienLai bienLai2 = new BienLai("nha2",02,"ct02",11,200);
        BienLai bienLai3 = new BienLai("nha3",03,"ct03",12,200);

        Qlbl binh = new Qlbl();
        binh.bienLais.add(bienLai1);
        binh.bienLais.add(bienLai2);
        binh.bienLais.add(bienLai3);
        binh.nhapBienLai();
        binh.hienThi();
        binh.tienDienTra();



    }
}
