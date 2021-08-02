package baiTap4_qLThuVien.storage;

import baiTap4_qLThuVien.model.BorrowCard;
import baiTap4_qLThuVien.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public static void writeFileStudent(List<Student> studentList){
        try {
            FileOutputStream fos = new FileOutputStream("bai4Student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readFileStudent(){
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("bai4Student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

     public static void writeFileBorrowCard(List<BorrowCard> borrowCardList){
        try {
            FileOutputStream fos = new FileOutputStream("bai4BorrowCard.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(borrowCardList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<BorrowCard> readFileBorrowCard(){
        List<BorrowCard> borrowCards = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("bai4BorrowCard.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            borrowCards = (List<BorrowCard>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return borrowCards;
    }



}
