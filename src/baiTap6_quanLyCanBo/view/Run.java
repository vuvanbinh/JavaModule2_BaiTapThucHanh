package baiTap6_quanLyCanBo.view;

import baiTap6_quanLyCanBo.controller.ManageCadre;
import baiTap6_quanLyCanBo.model.Cadre;
import baiTap6_quanLyCanBo.model.Employee;
import baiTap6_quanLyCanBo.model.Engineer;
import baiTap6_quanLyCanBo.model.Worker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    static List<Cadre> cadres = new ArrayList<>();
    static ManageCadre manageCadre = new ManageCadre();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        Cadre cadre1 = new Worker("CongNhan1", LocalDate.of(1999, 1, 1),
                "nam", "Ha Noi", "Bac1");
        Cadre cadre2 = new Employee("NhanVien1", LocalDate.of(1999, 1, 1),
                "nam", "Ha Noi", "CongViec1");
        Cadre cadre3 = new Engineer("kySu1", LocalDate.of(1999, 1, 1),
                "nam", "Ha Noi", "NganhNghe1");

        cadres.add(cadre1);
        cadres.add(cadre2);
        cadres.add(cadre3);
        manageCadre.setCadres(cadres);

        themNhanVien();
        manageCadre.disPlay();
        System.out.println("Nhap ten can tim");
        String name = scanner.nextLine();
        manageCadre.searchCadre(name);


    }

    public static Cadre newWorker() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhap thon tin cong nhan : \n");
        System.out.println("Nhap ten ");
        String ten = scanner.nextLine();
        System.out.println("Nhap ngay sinh :");
        LocalDate ngaySinh = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println("Nhap gioi tinh  ");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhap dia chi : ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhap bac cong nhan : ");
        String capBac = scanner.nextLine();

        Worker worker = new Worker(ten, ngaySinh, gioiTinh, diaChi, capBac);
        return worker;
    }

    public static Cadre newEmployee() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhap thon nhan vien : \n");
        System.out.println("Nhap ten ");
        String ten = scanner.nextLine();
        System.out.println("Nhap ngay sinh :");
        LocalDate ngaySinh = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println("Nhap gioi tinh  ");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhap dia chi : ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhap bac nhan vien : ");
        String congViec = scanner.nextLine();

        Employee employee = new Employee(ten, ngaySinh, gioiTinh, diaChi, congViec);
        return employee;
    }

    public static Cadre newEngineer() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhap thon tin ky su : \n");
        System.out.println("Nhap ten ");
        String ten = scanner.nextLine();
        System.out.println("Nhap ngay sinh :");
        LocalDate ngaySinh = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println("Nhap gioi tinh  ");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhap dia chi : ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhap nganh nghe : ");
        String ngheNghiep = scanner.nextLine();

        Engineer engineer = new Engineer(ten, ngaySinh, gioiTinh, diaChi, ngheNghiep);
        return engineer;
    }

    public static void themNhanVien() {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Nhap 1 de them cong nhan : \n " +
                "Nhap 2 de them nhan vien : \n Nhap 3 de them ky su : \n");
        int number = scan.nextInt();
        switch (number) {
            case 1:
                manageCadre.addCadre(newWorker());
                break;
            case 2:
                manageCadre.addCadre(newEmployee());
                break;

            case 3:
                manageCadre.addCadre(newEngineer());
                break;
        }
    }


}
