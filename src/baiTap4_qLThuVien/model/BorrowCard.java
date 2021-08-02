package baiTap4_qLThuVien.model;



import java.io.Serializable;
import java.time.LocalDate;

public class BorrowCard implements Serializable {
    private int borrowCoupon;
    private LocalDate borrowDate;
    private LocalDate payDate;
    private String bookName;
    private String bookCode;
    private Student student;

    public BorrowCard() {
    }

    public BorrowCard(int borrowCoupon, LocalDate borrowDate,
                      LocalDate payDate, String bookName, String bookCode, Student student) {
        this.borrowCoupon = borrowCoupon;
        this.borrowDate = borrowDate;
        this.payDate = payDate;
        this.bookName = bookName;
        this.bookCode = bookCode;
        this.student = student;
    }

    public int getBorrowCoupon() {
        return borrowCoupon;
    }

    public void setBorrowCoupon(int borrowCoupon) {
        this.borrowCoupon = borrowCoupon;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getPayDate() {
        return payDate;
    }

    public void setPayDate(LocalDate payDate) {
        this.payDate = payDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

//    @Override
//    public String toString() {
//        return "BorrowCard{" +
//                ", student=" + student +
//                ", bookName='" + bookName + '\'' +
//                "payDate=" + payDate +
//                '}';
//    }

    @Override
    public String toString() {
        return "BorrowCard{" +
                "borrowCoupon=" + borrowCoupon +
                ", borrowDate=" + borrowDate +
                ", payDate=" + payDate +
                ", bookName='" + bookName + '\'' +
                ", bookCode='" + bookCode + '\'' +
                ", student=" + student +
                '}';
    }
}
