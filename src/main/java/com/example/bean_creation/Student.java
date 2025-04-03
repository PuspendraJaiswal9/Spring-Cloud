package com.example.bean_creation;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String studentName;
    private int age;
    private List<String> phoneNumber;
    private Set<String> address;
    private Map<String,String> course;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    public Student(String studentName, int age, List<String> phoneNumber, Set<String> address, Map<String, String> course) {
        this.studentName = studentName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.course = course;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", address=" + address +
                ", course=" + course +
                '}';
    }
}
