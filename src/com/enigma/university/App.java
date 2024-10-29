package com.enigma.university;

public class App {
    public static void start() {
        ShowMenu showMenu = new ShowMenu();
        StudentCRUD studentCRUD = new StudentCRUD();

        while (true) {
            int menu = showMenu.mainMenu();
            switch (menu) {
                case 1:
                    showMenu.addMahasiswa();
                    String name = InputUtils.inputName("Nama (3-20 Karakter)");
                    int age = InputUtils.inputAge("Umur (min 17 Tahun)");
                    String major = InputUtils.inputMajor("Jurusan (maks 10 Karakter)");
                    studentCRUD.addStudent(new Student(name, age, major));
                    break;
                case 2:
                    showMenu.deleteMahasiswa();
                    studentCRUD.removeLastStudent();
                    break;
                case 3:
                    showMenu.viewAllMahasiswa();
                    studentCRUD.showStudents();
                    break;
                case 4:
                    return;
            }
        }
    }
}