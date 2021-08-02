package baiTap6_quanLyCanBo.model;

import java.time.LocalDate;

public class Engineer extends Cadre {
    private String profession;

    public Engineer() {
    }

    public Engineer(String name, LocalDate dateOfBirth,
                    String sex, String address, String profession) {
        super(name, dateOfBirth, sex, address);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String toString(){
        return " Engineer . Profession : "+ profession
                + super.toString();
    }
}
