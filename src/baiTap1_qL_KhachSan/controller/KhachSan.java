package baiTap1_qL_KhachSan.controller;

import baiTap1_qL_KhachSan.model.KhachHang;
import baiTap1_qL_KhachSan.model.Nguoi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class KhachSan {
    private List<KhachHang> khachHangs = new ArrayList<KhachHang>();

    public List<KhachHang> getKhachHangs() {
        return khachHangs;
    }

    public void setKhachHangs(List<KhachHang> khachHangs) {
        this.khachHangs = khachHangs;
    }

    public void nhapKH(KhachHang khachHang) {
        khachHangs.add(khachHang);
    }

    public KhachHang newKH() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap ten khach hang : ");
        String ten = scanner.nextLine();
        System.out.println("Nhap Ngay Sinh ");
        LocalDate ngaySinh = LocalDate.of
                (scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Nhap So CMT : ");
        int soCMT = scan.nextInt();
        System.out.println("Nhap so ngay tro : ");
        int soNgayTro = scan.nextInt();
        System.out.println("Nhap loai phong : ");
        scanner.nextLine();
        String loaiPhong = scanner.nextLine();
        KhachHang newKH = new KhachHang();
        if (loaiPhong.equals("VIP1")) newKH.setGiaPhong(200);
        else if (loaiPhong.equals("VIP2")) newKH.setGiaPhong(300);
        else newKH.setGiaPhong(400);

        newKH = new KhachHang(ten, ngaySinh, soCMT, soNgayTro
                , loaiPhong, newKH.getGiaPhong());

        return newKH;
    }

    public void themKH() {
//        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap so luong khach hang can them :");
        int number = scan.nextInt();
        for (int i = 0; i < number; i++) {
            khachHangs.add(newKH());
        }
    }

    public void hienThi() {
        for (Nguoi t : khachHangs
        ) {
            System.out.println(t.toString());
        }
    }

    public int getIndex() {
        Scanner scanner = new Scanner(System.in);
//        Scanner scan = new Scanner(System.in);
        System.out.println(" Nhap CMT khach hang : ");
        int cmt = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < khachHangs.size(); i++) {
            if (khachHangs.get(i).getSoCM() == cmt) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void xoa() {
        System.out.println("Nhap thong tin can xoa ");
        khachHangs.remove(getIndex());
    }

    public int traTienPhong() {
        System.out.println(" Nhap thong tin khach hang thanh toan tien phong :");
        return khachHangs.get(getIndex()).getTienPhong();
    }

}
