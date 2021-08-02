package baiTap8_QLTaiLieu.view;

import baiTap8_QLTaiLieu.Stoge.FileQuanLy;
import baiTap8_QLTaiLieu.controller.QuanLy;
import baiTap8_QLTaiLieu.model.*;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    private static List<TaiLieu> taiLieuList = new ArrayList<>();

    public static void main(String[] args) {

        taiLieuList = FileQuanLy.readFile();

        QuanLy binh = new QuanLy("Binh", taiLieuList);
//        binh.add(new Sach("ma01", "nhaSX1", 100, "Sach1", 200));
//        binh.add(new Sach("ma02", "nhaSX2", 200, "Sach2", 400));
//        binh.add(new TapChi("ma03", "nhaSX3", 500, "soPhatHanh1", "2021-7"));
//        binh.add(new TapChi("ma04", "nhaSX3", 400, "soPhatHanh2", "2021-5"));
//        binh.add(new Bao("ma05", "nhaSX4", 400, LocalDate.of(2021, 5, 1)));
//        binh.add(new Bao("ma06", "nhaSX4", 600, LocalDate.of(2021, 6, 1)));
        menu(binh);
    }

    public static void menu(QuanLy binh) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println(" Menu : ");
            System.out.println("An 1 de them tai lieu : ");
            System.out.println("An 2 de hien thi danh sach tai lieu : ");
            System.out.println("An 3 de tim kiem tai lieu : ");
            System.out.println("An 0 de thoat : ");

            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap so tai lieu muon them : ");
                    int number = scan.nextInt();
                    int i = 0;
                    while (i < number) {
                        System.out.println("An 1 de them sach : ");
                        System.out.println("An 2 de them tap chi : ");
                        System.out.println("An 3 de them bao : ");
                        int num = scan.nextInt();
                        switch (num) {
                            case 1:
                                System.out.println("Nhap thong tin sach : ");
                                binh.add(newSach());
                                break;
                            case 2:
                                System.out.println("Nhap thong tin tap chi : ");
                                binh.add(newTapChi());
                                break;
                            case 3:
                                System.out.println("Nhap thong tin bao : ");
                                binh.add(newBao());
                                break;
                        }
                        i++;
                    }
                    break;
                case 2:
                    System.out.println("Danh sach tai lieu : ");
                    hienThiTaiLieu(binh);
                    break;
                case 3:
                    hienThiTimKiem(binh);
                    break;
            }
        }
    }

    public static TaiLieu newSach() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma tai lieu : ");
        String maTaiLieu = scanner.nextLine();
        System.out.println("Nhap ten nha san xuat : ");
        String tenNhaSX = scanner.nextLine();
        System.out.println("Nhap so ban phat hanh :");
        int soBan = scan.nextInt();
        System.out.println("Nhap ten tac gia :");
        String tenTacGia = scanner.nextLine();
        System.out.println("Nhap so trang :");
        int soTrang = scan.nextInt();

        TaiLieu sach = new Sach(maTaiLieu, tenNhaSX, soBan, tenTacGia, soTrang);
        return sach;
    }

    public static TaiLieu newTapChi() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma tai lieu : ");
        String maTaiLieu = scanner.nextLine();
        System.out.println("Nhap ten nha san xuat : ");
        String tenNhaSX = scanner.nextLine();
        System.out.println("Nhap so ban phat hanh :");
        int soBan = scan.nextInt();
        System.out.println("Nhap so phat hanh :");
        String soPhatHanh = scanner.nextLine();
        System.out.println("Nhap thang phat hanh :");
        String thangPhatHanh = scanner.nextLine();

        TaiLieu tapChi = new TapChi(maTaiLieu, tenNhaSX, soBan, soPhatHanh, thangPhatHanh);
        return tapChi;
    }

    public static TaiLieu newBao() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ma tai lieu : ");
        String maTaiLieu = scanner.nextLine();
        System.out.println("Nhap ten nha san xuat : ");
        String tenNhaSX = scanner.nextLine();
        System.out.println("Nhap so ban phat hanh :");
        int soBan = scan.nextInt();
        System.out.println("Nhap ngay phat hanh :");
        LocalDate ngayPhatHanh = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

        TaiLieu bao = new Bao(maTaiLieu, tenNhaSX, soBan, ngayPhatHanh);
        return bao;
    }

    public static void hienThiTimKiem(QuanLy binh) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma tai lieu can tim kiem : ");
        String maTaiLieu = scanner.nextLine();
        System.out.println();
        System.out.println(" Tai lieu can tim co thong tin : ");
        System.out.println(binh.timTaiLieu(maTaiLieu));
    }

    public static void hienThiTaiLieu(QuanLy binh) {
        for (TaiLieu t : binh.getTaiLieuList()
        ) {
            System.out.println(t);
        }
    }
}
