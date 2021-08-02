package baiTap4_qLThuVien.controller;

import baiTap4_qLThuVien.model.Student;
import baiTap4_qLThuVien.storage.FileManager;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private String name;
    private List<Student> studentList = new ArrayList<>();

    public StudentManager() {
    }

    public StudentManager(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void add(Student student){
        studentList.add(student);
        FileManager f = new FileManager();
        f.writeFileStudent(studentList);
    }

    public Student findById(int id){
        for (Student t: studentList
             ) {
            if(t.getId()==id) return t;
        }
        return null;
    }

}
