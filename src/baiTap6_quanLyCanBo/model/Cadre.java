package baiTap6_quanLyCanBo.model;

import java.time.LocalDate;

public abstract class Cadre {
    private String name;
    private LocalDate dateOfBirth;
    private String sex;
    private String address;

    public Cadre() {
    }

    public Cadre(String name, LocalDate dateOfBirth, String sex, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return " Name : "+ name
                +" , Date of birth : "+ dateOfBirth
                +" , Sex : "+ sex
                +" , Address : "+address;
    }
}
