package baiTap4_qLThuVien.view;

import baiTap4_qLThuVien.controller.BorrowBookManager;
import baiTap4_qLThuVien.controller.StudentManager;
import baiTap4_qLThuVien.model.BorrowCard;
import baiTap4_qLThuVien.model.Student;
import baiTap4_qLThuVien.storage.FileManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
    private static List<Student> studentList = new ArrayList<>();
    private static List<BorrowCard> borrowCardList = new ArrayList<>();

    public static void main(String[] args) {
        studentList = FileManager.readFileStudent();
//        borrowCardList = FileManager.readFileBorrowCard();

        StudentManager binh = new StudentManager("binh", studentList);
        BorrowBookManager cuong = new BorrowBookManager("cuong", borrowCardList);

        binh.add(new Student("sv1", 111, "1999-1-1", "lop1"));
        binh.add(new Student("sv2", 222, "1998-1-1", "lop2"));
        binh.add(new Student("sv3", 333, "1997-1-1", "lop3"));

        cuong.addNewBorrowCard(new BorrowCard(1, LocalDate.of(2021, 7, 1),
                LocalDate.of(2021, 7, 20), "tenSach1", "code1",
                new Student("sv1", 111, "1999-1-1", "lop1")));
        cuong.addNewBorrowCard(new BorrowCard(2, LocalDate.of(2021, 7, 1),
                LocalDate.of(2021, 8, 25), "tenSach2", "code2",
                new Student("sv2", 222, "1998-1-1", "lop2")));
        cuong.addNewBorrowCard(new BorrowCard(3, LocalDate.of(2021, 7, 1),
                LocalDate.of(2021, 9, 21), "tenSach3", "code3",
                new Student("sv3", 333, "1997-1-1", "lop3")));
        cuong.addNewBorrowCard(new BorrowCard(4, LocalDate.of(2021, 7, 1),
                LocalDate.of(2021, 7, 27), "tenSach4", "code4",
                new Student("sv4", 444, "1996-1-1", "lop4")));

        showMenu(binh,cuong);

    }


    public static Student newStudent() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap ten : ");
        String name = scanner.nextLine();
        System.out.println("Nhap id sinh vien ");
        int id = scan.nextInt();
        System.out.println("Nhap ngay sinh : ");
        String dob = scanner.nextLine();
        System.out.println("Nhap lop : ");
        String classes = scanner.nextLine();
        Student student = new Student(name, id, dob, classes);

        return student;
    }

    public static void hienThiStudent(StudentManager binh) {
        for (Student t : binh.getStudentList()
        ) {
            System.out.println(t);
        }
    }

    public static void showMenu(StudentManager binh , BorrowBookManager cuong) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu : ");
            System.out.println(" An 1 de them sinh vien ");
            System.out.println(" An 2 hien thi danh sach sinh vien : ");
            System.out.println(" An 3 Them the thu vien ");
            System.out.println(" An 4 Hien thi danh sach sinh vien tra sach vao cuoi thang : ");
            System.out.println(" An 0 thoat : ");

            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    binh.add(newStudent());
                    break;
                case 2:
                    hienThiStudent(binh);
                    break;
                case 3 :
                    cuong.addNewBorrowCard(newBorrowCard(binh,cuong));
                    break;
                case 4 :
                    showPayBook(cuong);
                    break;
            }
        }
    }

    public static BorrowCard newBorrowCard(StudentManager s, BorrowBookManager b) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap so phieu : ");
        int borrowCoupon = scan.nextInt();
        System.out.println("Nhap ngay muon : ");
        LocalDate brrowDate = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println("Nhap so ngay muon muon ");
        int numDay = scan.nextInt();
        LocalDate payDate = brrowDate.plusDays(numDay);
        System.out.println("Nhap ten sach ");
        String bookName = scanner.nextLine();
        System.out.println("Nhap ma sach ");
        String bookCode = scanner.nextLine();
        System.out.println("Nhap id cua sinh vien muon sach ");
        int id = scan.nextInt();
        Student student = s.findById(id);

        BorrowCard borrowCard = new BorrowCard
                (borrowCoupon, brrowDate, payDate, bookName, bookCode, student);
        return borrowCard;
    }

    public static void showBrrowCards(BorrowBookManager cuong) {
        for (BorrowCard b : cuong.getBorrowCardList()
        ) {
            System.out.println(b);
        }
    }

    public static void showPayBook(BorrowBookManager cuong) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ngay tra sach in ra danh sach sinh vien :");
        LocalDate ngay = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        for (BorrowCard c : cuong.getPayBookList(ngay)
        ) {
            System.out.println( c.getStudent() + ",Ten sach " + c.getBookName() + ", Ngay tra : " + c.getPayDate());
        }
    }


}
