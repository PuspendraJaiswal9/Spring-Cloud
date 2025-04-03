package com.example.bean_creation;

public class StudentOne {
    private String studentOneName;
    private int studentOneAge;

    public String getStudentOneName() {
        return studentOneName;
    }

    public void setStudentOneName(String studentOneName) {
        this.studentOneName = studentOneName;
    }

    public int getStudentOneAge() {
        return studentOneAge;
    }

    public void setStudentOneAge(int studentOneAge) {
        this.studentOneAge = studentOneAge;
    }

    public StudentOne(String studentOneName, int studentOneAge) {
        this.studentOneName = studentOneName;
        this.studentOneAge = studentOneAge;
    }

    public StudentOne() {
    }

    @Override
    public String toString() {
        return "StudentOne{" +
                "studentOneName='" + studentOneName + '\'' +
                ", studentOneAge=" + studentOneAge +
                '}';
    }
}
