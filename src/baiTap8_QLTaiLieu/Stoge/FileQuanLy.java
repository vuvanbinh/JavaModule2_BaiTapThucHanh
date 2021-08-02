package baiTap8_QLTaiLieu.Stoge;

import baiTap8_QLTaiLieu.model.TaiLieu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileQuanLy {
    public static void writeFile(List<TaiLieu> taiLieuList){
        try {
            FileOutputStream fos = new FileOutputStream("bai8_tailieu.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(taiLieuList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<TaiLieu> readFile(){
        List<TaiLieu> taiLieuList = new ArrayList<>();
        File file = new File("bai8_tailieu.txt");
        if(file.length()>0){
            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                taiLieuList = (List<TaiLieu>) ois.readObject();
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return taiLieuList;
    }
}
