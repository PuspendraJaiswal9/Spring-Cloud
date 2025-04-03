package com.example.bean_creation;



public class Student {
    private String studentName;
    private int studentAge;
    private StudentOne obj;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public StudentOne getObj() {
        return obj;
    }

    public void setObj(StudentOne obj) {
        this.obj = obj;
    }

    public Student(String studentName, int studentAge, StudentOne obj) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.obj = obj;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", obj=" + obj +
                '}';
    }
}
