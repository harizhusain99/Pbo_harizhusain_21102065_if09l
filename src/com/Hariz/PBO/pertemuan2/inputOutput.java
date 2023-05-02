package com.Hariz.PBO.pertemuan2;

import java.util.Scanner;
public class inputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// variable

        System.out.println("Masukan nama anda : ");
        String nama = scanner.nextLine();

        System.out.println("Selamat pagi " +nama);
    }
}