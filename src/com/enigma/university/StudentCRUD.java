package com.enigma.university;

import java.util.ArrayList;
import java.util.List;

public class StudentCRUD {
    List<Student> students = new ArrayList<>();

    public void showStudents() {
        for (int i = 0; i < students.size(); i++) {
            if (i != 0) System.out.println();
            System.out.printf("%d.\n", i + 1);
            System.out.println("Name: " + students.get(i).getName());
            System.out.println("Umur: " + students.get(i).getAge());
            System.out.println("Jurusan: " + students.get(i).getMajor());
            if (i == students.size() - 1) System.out.println("-".repeat(50));
        }
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("-".repeat(50));
    }

    public void removeLastStudent() {
        int index = students.size() - 1;

        try {
            students.remove(index);
        } catch (Exception error) {
            System.out.println("Gagal Menghapus Mahasiswa");
            System.out.println("-".repeat(50));
        }

        System.out.println("Mahasiswa yang terakhir masuk di delete:" + index);
        System.out.println("Sukses Menghapus Mahasiswa");
        System.out.println("-".repeat(50));
    }
}