package baiTap5_QL.storage;

import baiTap5_QL.controller.KhuPho;
import baiTap5_QL.model.HoDan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileKhuPho {
    public static void writeFile(List<HoDan>hoDans){
        File file = new File("bai5_quanLyKhuPho.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hoDans);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<HoDan> readFile(){
        List<HoDan> hoDans = new ArrayList<>();
        File file = new File("bai5_quanLyKhuPho.txt");
            if(file.length()>0) {
                try {
                    FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    hoDans = (List<HoDan>) ois.readObject();
                    ois.close();
                    fis.close();
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        return hoDans;
    }
}
