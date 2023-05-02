package com.Hariz.PBO.pertemuan2;

import java.util.Scanner;

public class Unguided2_65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("== PROGRAM PENDAFTARAN MAHASISWA ==");
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        if (nama.isEmpty()) {
            System.out.println("Error: Nama tidak boleh kosong!");
            System.exit(0);
        }

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();

        if (umur < 17) {
            System.out.println("Error: Umur anda belum cukup!");
            System.exit(0);
        }

        System.out.println("Pilih Jurusan: ");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Rekayasa Perangkat Lunak");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();

        String programStudi = "";
        switch (pilihan) {
            case 1:
                programStudi = "Teknik Informatika";
                break;
            case 2:
                programStudi = "Sistem Informasi";
                break;
            case 3:
                programStudi = "Teknik Komputer";
                break;
            default:
                System.out.println("Error: Pilihan tidak tersedia!");
                System.exit(0);
        }

        System.out.println("== Data Pendaftaran ==");
        System.out.println("Nama lengkap: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jurusan: " + programStudi);
        System.out.println("== Data Pendaftaran ==");
    }
}