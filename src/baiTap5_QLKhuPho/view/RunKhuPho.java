package baiTap5_QL.view;

import baiTap5_QL.controller.KhuPho;
import baiTap5_QL.model.HoDan;
import baiTap5_QL.model.Nguoi;
import baiTap5_QL.storage.FileKhuPho;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunKhuPho {
    private static List<HoDan> hoDans = new ArrayList<>();

    public static void main(String[] args) {
        hoDans = FileKhuPho.readFile();
        KhuPho binh = new KhuPho("binh", hoDans);
        menu(binh);
    }

    public static void menu(KhuPho binh) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            System.out.println();
            System.out.println("MENU");
            System.out.println("An 1 de them ho dan vao danh sach :");
            System.out.println("An 2 hien thi danh sach ho dan trong khu pho :");
            System.out.println("An 3 de xem danh sach thanh vien trong mot ho dan :");
            System.out.println("An 4 de hien thi ho gia dinh co nguoi nam nay mung tho 80 tuoi :");
            System.out.println("An 0 de thoat :");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    addHoDan(binh);
                    break;
                case 2:
                    hienThiHoDanTrongKhuPho(binh);
                    break;
                case 3:
                    hienThiThanhVienTrongHoDan(binh);
                    break;
                case 4:
                    hienThiMungTho80(binh);
                    break;
            }
        }
    }

    public static Nguoi newNguoi() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten : ");
        String ten = scanner.nextLine();
        System.out.println(" Nhap ngay sinh : ");
        LocalDate ngaySinh = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println(" Nhap nghe nghiep : ");
        String ngheNghiep = scanner.nextLine();
        Nguoi nguoi = new Nguoi(ten, ngaySinh, ngheNghiep);
        return nguoi;
    }

    public static List<Nguoi> thanhViens(int soThanhVien) {
        List<Nguoi> thanhViens = new ArrayList<>();
        for (int i = 0; i < soThanhVien; i++) {
            System.out.println("Nhap thong tin thanh vien thu " + (i + 1));
            thanhViens.add(newNguoi());
        }
        return thanhViens;
    }

    public static void hienThiThanhVienTrongHoDan(KhuPho binh) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin so nha muon xem danh sach thanh vien :  ");
        int soNha = scan.nextInt();
        System.out.println(" Danh sach thanh vien cua so nha " + soNha + " :");
        for (int i = 0; i < binh.getHoDanList().size(); i++) {
            List<HoDan> hodans = binh.getHoDanList();
            if (hodans.get(i).getSoNha() == soNha) {
                List<Nguoi> nguois = hodans.get(i).getThanhViens();
                for (Nguoi t : nguois
                ) {
                    System.out.println(t);
                }
            }
        }
    }

    public static HoDan newHoDan() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println(" Nhap so nha : ");
        int soNha = scan.nextInt();
        System.out.println("Nhap so thanh vien : ");
        int soThanhVien = scan.nextInt();
        List<Nguoi> thanhViens = thanhViens(soThanhVien);

        HoDan hoDan = new HoDan(soNha, soThanhVien, thanhViens);
        return hoDan;
    }

    public static void hienThiHoDanTrongKhuPho(KhuPho binh) {
        System.out.println("Danh sach ho dan trong khu pho : ");
        for (HoDan t : binh.getHoDanList()
        ) {
            System.out.println(t);
        }
    }

    public static void addHoDan(KhuPho binh) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so ho dan muon them vao : ");
        int soHoDan = scan.nextInt();
        for (int i = 0; i < soHoDan; i++) {
            System.out.println("Nhap thong tin nha thu " + (i + 1));
            binh.add(newHoDan());
        }
    }

    public static void hienThiMungTho80(KhuPho binh) {
        System.out.println("Danh sach ho dan co nguoi nung tho 80 tuoi vao nam nay la : ");
        if (binh.mungTho80() != null) {
            for (HoDan t : binh.mungTho80()
            ) {
                System.out.println(t);
            }
        } else {
            System.out.println("Trong khu pho nam nay khong co ai mung tho 80 ");
        }
    }
}
