package baiTap4_qLThuVien.controller;

import baiTap4_qLThuVien.model.BorrowCard;
import baiTap4_qLThuVien.storage.FileManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BorrowBookManager {
    private String name ;
    private List<BorrowCard> borrowCardList = new ArrayList<>();

    public BorrowBookManager() {
    }

    public BorrowBookManager(String name, List<BorrowCard> borrowCardList) {
        this.name = name;
        this.borrowCardList = borrowCardList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BorrowCard> getBorrowCardList() {
        return borrowCardList;
    }

    public void setBorrowCardList(List<BorrowCard> borrowCardList) {
        this.borrowCardList = borrowCardList;
    }

    public void addNewBorrowCard(BorrowCard borrowCard){
        borrowCardList.add(borrowCard);
        FileManager f = new FileManager();
        f.writeFileBorrowCard(borrowCardList);
    }

    public List<BorrowCard> getPayBookList(LocalDate cuoiThang){
        List<BorrowCard> borrowCards = new ArrayList<>();
        for (int i = 0; i < borrowCardList.size(); i++) {
            if(borrowCardList.get(i).getPayDate().
                    isEqual(cuoiThang)
                    || borrowCardList.get(i).getPayDate().
                    isBefore(cuoiThang)) {
                borrowCards.add(borrowCardList.get(i));
            }
        }
        return borrowCards;
    }



}
