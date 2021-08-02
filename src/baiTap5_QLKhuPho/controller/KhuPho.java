package baiTap5_QL.controller;

import baiTap5_QL.model.HoDan;
import baiTap5_QL.model.Nguoi;
import baiTap5_QL.storage.FileKhuPho;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;


public class KhuPho {
    private String ten;
    private List<HoDan> hoDanList;

    public KhuPho() {
    }

    public KhuPho(String ten, List<HoDan> hoDanList) {
        this.ten = ten;
        this.hoDanList = hoDanList;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public List<HoDan> getHoDanList() {
        return hoDanList;
    }

    public void setHoDanList(List<HoDan> hoDanList) {
        this.hoDanList = hoDanList;
    }

    public void add(HoDan hoDan){
        hoDanList.add(hoDan);
        FileKhuPho.writeFile(hoDanList);
    }
    public  List<HoDan> mungTho80(){
        List<HoDan> hoDans = null;
        for (int i = 0; i < hoDanList.size(); i++) {
           List<Nguoi> nguois = hoDanList.get(i).getThanhViens();
            for (int j = 0; j < nguois.size(); j++) {
                LocalDate ngaySinh = nguois.get(j).getNgaySinh();
                LocalDate today = LocalDate.now();
                if(ngaySinh.plusYears(80).isAfter(today.with(TemporalAdjusters.firstDayOfYear()))&&
                        ngaySinh.plusYears(80).isBefore(today.with(TemporalAdjusters.lastDayOfYear()))){
                    hoDans = new ArrayList<>();
                    hoDans.add(hoDanList.get(i));
                }
            }
        }
        return hoDans;
    }
}
