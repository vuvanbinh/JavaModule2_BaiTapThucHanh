package baiTap3_QLDien.controller;

import baiTap3_QLDien.model.BienLai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qlbl {
    public List<BienLai> bienLais = new ArrayList<BienLai>();
    Scanner scan = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);

    public BienLai newBienLai() {
        System.out.println("Nhap ten : ");
        String ten = sc.nextLine();
        System.out.println("Nhap so nha :");
        int soNha = scan.nextInt();
        System.out.println("Nhap ma so cong to :");
        String msCongTo = sc.nextLine();
        System.out.println("Nhap chi so dien cu :");
        int soDienCu = scan.nextInt();
        System.out.println("Nhap chi so dien moi :");
        int soDienMoi = scan.nextInt();

        BienLai bienLai = new BienLai(ten, soNha, msCongTo, soDienCu, soDienMoi);
        return bienLai;
    }

    public void nhapBienLai() {
        System.out.println("Nhap so luong bien lai can them : ");
        int number = scan.nextInt();
        System.out.print("Nhap thong tin : \n");
        for (int i = 0; i < number; i++) {
            bienLais.add(newBienLai());
        }
    }

    public void hienThi() {
        for (BienLai t : bienLais
        ) {
            System.out.println(t);
        }
    }

    public void tienDienTra() {
        System.out.println("nhap so nha can tinh tien dien : ");
        int soNha = scan.nextInt();
        int index = -1;
        for (int i = 0; i < bienLais.size(); i++) {
            if (bienLais.get(i).getSoNha() == soNha) {
                index = i;
                break;
            }
        }
        if (index != -1) System.out.println(" Tien dien cua " +
                bienLais.get(index).getTen() + " la : " +
                bienLais.get(index).soTienPhaiTra());
        else System.out.println("khong co nha nay trong danh sach quan ly");
    }


}
