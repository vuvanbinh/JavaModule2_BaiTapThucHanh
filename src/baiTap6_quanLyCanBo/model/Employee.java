package baiTap6_quanLyCanBo.model;

import java.time.LocalDate;

public class Employee extends Cadre{
    private String work ;

    public Employee() {
    }

    public Employee(String name, LocalDate dateOfBirth,
                    String sex, String address, String work) {
        super(name, dateOfBirth, sex, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String toString(){
        return " Employee .  Work : "+work
                + super.toString();
    }
}
