package com.example.bean_creation;

public class Student {
    private String studentName;
    private int studentAge;

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

    public Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }

    public void init(){
        System.out.println("inside init method");
    }

    public void destroy(){
        System.out.println("inside destroy method");
    }
}
