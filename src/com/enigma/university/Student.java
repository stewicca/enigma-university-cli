package com.enigma.university;

public class Student {
    private String name;
    private Integer age;
    private String major;

    public Student() {
    }

    public Student(String name, Integer age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }
}