package com.enigma.university;

public class ShowMenu {
    public int mainMenu() {
        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println("Main Menu");
        System.out.println("-".repeat(50));
        System.out.println("1. Add Mahasiswa");
        System.out.println("2. Delete Mahasiswa");
        System.out.println("3. View All Mahasiswa");
        System.out.println("4. Exit");
        int input = InputUtils.inputInt("Masukkan menu yang dipilih");
        System.out.println("-".repeat(50));
        return input;
    }

    public void addMahasiswa() {
        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println("Add Mahasiswa");
        System.out.println("-".repeat(50));
    }

    public void deleteMahasiswa() {
        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println("Delete Mahasiswa");
        System.out.println("-".repeat(50));
    }

    public void viewAllMahasiswa() {
        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println("View All Mahasiswa");
        System.out.println("-".repeat(50));
    }
}