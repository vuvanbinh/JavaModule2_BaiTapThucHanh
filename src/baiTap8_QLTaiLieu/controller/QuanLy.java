package baiTap8_QLTaiLieu.controller;

import baiTap8_QLTaiLieu.Stoge.FileQuanLy;
import baiTap8_QLTaiLieu.model.TaiLieu;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
    private String name;
    private List<TaiLieu> taiLieuList = new ArrayList<>();

    public QuanLy(String name, List<TaiLieu> taiLieuList) {
        this.name = name;
        this.taiLieuList = taiLieuList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TaiLieu> getTaiLieuList() {
        return taiLieuList;
    }

    public void setTaiLieuList(List<TaiLieu> taiLieuList) {
        this.taiLieuList = taiLieuList;
    }

    public void add(TaiLieu taiLieu){
        taiLieuList.add(taiLieu);
        FileQuanLy.writeFile(taiLieuList);
    }

    public TaiLieu timTaiLieu(String maTaiLieu){
        for (TaiLieu t : taiLieuList
             ) {
            if (t.getMaTaiLieu().equals(maTaiLieu)) return t;
        }
        return null;
    }
}
