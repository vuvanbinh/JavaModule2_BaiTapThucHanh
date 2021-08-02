package baiTap7_qLCanBoGiaoVien.view;

import baiTap7_qLCanBoGiaoVien.controller.QLCanBo;
import baiTap7_qLCanBoGiaoVien.controller.QLCanBoGiaoVien;
import baiTap7_qLCanBoGiaoVien.model.CanBo;
import baiTap7_qLCanBoGiaoVien.model.CanBoGiaoVien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    private static List<CanBo> canBos = new ArrayList<>();
    private static List<CanBoGiaoVien> canBoGiaoViens = new ArrayList<>();

    public static void main(String[] args) {
        QLCanBo binh = new QLCanBo("binh", canBos);
        QLCanBoGiaoVien binh2 = new QLCanBoGiaoVien("binh2", canBoGiaoViens);

        binh.add(new CanBo("canBo1", 123, LocalDate.of(1999, 1, 1), "HD"));
        binh.add(new CanBo("canBo2", 124, LocalDate.of(1998, 1, 1), "HP"));
        binh.add(new CanBo("canBo3", 125, LocalDate.of(1997, 1, 1), "HN"));
        binh.add(new CanBo("canBo4", 126, LocalDate.of(1996, 1, 1), "HD"));

        binh2.add(new CanBoGiaoVien(800, 300, 200,
                new CanBo("canBo1", 123, LocalDate.of(1999, 1, 1), "HD")));
        binh2.add(new CanBoGiaoVien(800, 100, 200,
                new CanBo("canBo2", 124, LocalDate.of(1998, 1, 1), "HP")));
        binh2.add(new CanBoGiaoVien(800, 50, 200,
                new CanBo("canBo3", 125, LocalDate.of(1997, 1, 1), "HN")));
        binh2.add(new CanBoGiaoVien(800, 400, 200,
                new CanBo("canBo4", 126, LocalDate.of(1996, 1, 1), "HD")));

        showMenu(binh, binh2);
    }

    public static void showMenu(QLCanBo binh, QLCanBoGiaoVien binh2) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println(" Menu : ");
            System.out.println(" An 1 de them can bo :");
            System.out.println(" An 2 de hien thi danh sach can bo :");
            System.out.println(" An 3 de them  giao vien : ");
            System.out.println(" An 4 de hien thi danh sach giao vien :");
            System.out.println(" An 5 de hien thi giao vien co muc luong cao tren 800 ");
            System.out.println("An 0 de thoat : ");

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("nhap so luong can bo muon them vao :");
                    int num = scan.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.println("Nhap thong tin can bo " + (i + 1) + " :");
                        binh.add(newCanBo());
                    }
                    break;
                case 2:
                    System.out.println("Danh sach can bo : ");
                    hienThiCanBo(binh);
                    break;
                case 3:
                    binh2.add(newCanBoGiaoVien(binh));
                    break;
                case 4:
                    System.out.println("Danh sach giao vien : ");
                    hienThiCBGV(binh2);
                    break;
                case 5:
                    System.out.println("Danh sach giao vien co muc luong cao hon 800 : ");
                    hienThiGiaoVienLuongCao(binh2);
            }
        }
    }

    public static CanBo newCanBo() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten :");
        String ten = scanner.nextLine();
        System.out.println("Nhap chung minh thu ");
        int cmt = scan.nextInt();
        System.out.println("Nhap ngay sinh : ");
        LocalDate ngaySinh = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println(" Nhap que quan : ");
        String queQuan = scanner.nextLine();

        CanBo canBo = new CanBo(ten, cmt, ngaySinh, queQuan);
        return canBo;
    }

    public static void hienThiCanBo(QLCanBo binh) {
        for (CanBo c : binh.getCanBoList()
        ) {
            System.out.println(c);
        }
    }

    public static CanBoGiaoVien newCanBoGiaoVien(QLCanBo binh) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap luong cung : ");
        int luongCung = scan.nextInt();
        System.out.println("Nhap tien thuong : ");
        int thuong = scan.nextInt();
        System.out.println("Nhap tien phat :");
        int phat = scan.nextInt();
        System.out.println("Nhap cmt cua can bo  :");
        int cmt = scan.nextInt();
        CanBo canBo = binh.getCanBo(cmt);

        CanBoGiaoVien canBoGiaoVien = new CanBoGiaoVien(luongCung, thuong, phat, canBo);
        return canBoGiaoVien;
    }

    public static void hienThiCBGV(QLCanBoGiaoVien binh2) {
        for (CanBoGiaoVien c : binh2.getCanBoGiaoVienList()
        ) {
            System.out.println(c);
        }
    }

    public static void hienThiGiaoVienLuongCao(QLCanBoGiaoVien binh2) {
        for (CanBoGiaoVien c : binh2.luongCao()
        ) {
            System.out.println(c.getCanBo() + ", muc luong : " + c.getLuong());
        }
    }
}

