package baiTap6_quanLyCanBo.model;

import java.time.LocalDate;

public class Worker extends Cadre {
    private String tier;

    public Worker(){};

    public Worker(String tier) {
        this.tier = tier;
    }

    public Worker(String name, LocalDate dateOfBirth,
                  String sex, String address, String tier) {
        super(name, dateOfBirth, sex, address);
        this.tier = tier;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String toString(){
        return " Worker . Tier : "+tier
                + super.toString();
    }
}
