package baiTap7_qLCanBoGiaoVien.controller;

import baiTap7_qLCanBoGiaoVien.model.CanBoGiaoVien;

import java.util.ArrayList;
import java.util.List;

public class QLCanBoGiaoVien {
    private String ten;
    private List<CanBoGiaoVien> canBoGiaoVienList;

    public QLCanBoGiaoVien() {
    }

    public QLCanBoGiaoVien(String ten, List<CanBoGiaoVien> canBoGiaoVienList) {
        this.ten = ten;
        this.canBoGiaoVienList = canBoGiaoVienList;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public List<CanBoGiaoVien> getCanBoGiaoVienList() {
        return canBoGiaoVienList;
    }

    public void setCanBoGiaoVienList(List<CanBoGiaoVien> canBoGiaoVienList) {
        this.canBoGiaoVienList = canBoGiaoVienList;
    }

    public void add(CanBoGiaoVien canBoGiaoVien){
        canBoGiaoVienList.add(canBoGiaoVien);
    }

    public List<CanBoGiaoVien> luongCao(){
        List<CanBoGiaoVien> canBoGiaoViens = new ArrayList<>();
        for (int i = 0; i < canBoGiaoVienList.size(); i++) {
            if (canBoGiaoVienList.get(i).getLuong() > 800){
                canBoGiaoViens.add(canBoGiaoVienList.get(i));
            }
        }
        return canBoGiaoViens;
    }

}
