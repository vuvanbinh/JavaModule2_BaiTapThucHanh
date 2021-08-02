package baiTap6_quanLyCanBo.controller;

import baiTap6_quanLyCanBo.model.Cadre;

import java.util.ArrayList;
import java.util.List;

public class ManageCadre {

    private List<Cadre> cadres = new ArrayList<>();

    public ManageCadre() {
    }

    public ManageCadre(List<Cadre> cadres) {
        this.cadres = cadres;
    }

    public List<Cadre> getCadres() {
        return cadres;
    }

    public void setCadres(List<Cadre> cadres) {
        this.cadres = cadres;
    }



    public void addCadre(Cadre newCadre) {
        cadres.add(newCadre);
    }

    public String disPlay() {
        for (Cadre t : cadres
        ) {
            System.out.println(t);
        }
        return "";
    }

    public void searchCadre(String name) {
        int index = -1;
        for (int i = 0; i < cadres.size(); i++) {
            if (cadres.get(i).getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("Khong co ten vua nhap vao ");
        }else System.out.println("Thong tin cua ten vua nhap la :" +
                cadres.get(index));
    }


}
