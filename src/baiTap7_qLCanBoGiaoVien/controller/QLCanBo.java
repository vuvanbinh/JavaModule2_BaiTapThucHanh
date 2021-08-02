package baiTap7_qLCanBoGiaoVien.controller;

import baiTap7_qLCanBoGiaoVien.model.CanBo;

import java.util.List;

public class QLCanBo {
    private String ten;
    private List<CanBo> canBoList;

    public QLCanBo() {
    }

    public QLCanBo(String ten, List<CanBo> canBoList) {
        this.ten = ten;
        this.canBoList = canBoList;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public List<CanBo> getCanBoList() {
        return canBoList;
    }

    public void setCanBoList(List<CanBo> canBoList) {
        this.canBoList = canBoList;
    }

    public void add(CanBo canBo){
        canBoList.add(canBo);
    }

    public CanBo getCanBo(int cmt){
        for (CanBo c : canBoList
             ) {
            if (c.getCmt()==cmt) return c;
        }
        return null;
    }

}
