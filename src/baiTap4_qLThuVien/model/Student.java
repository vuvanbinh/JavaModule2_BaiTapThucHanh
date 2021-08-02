package baiTap4_qLThuVien.model;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int id;
    private String dob;
    private String classes;

    public Student() {
    }

    public Student(String name, int id, String dob, String classes) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dob='" + dob + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
