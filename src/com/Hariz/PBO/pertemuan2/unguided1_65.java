package com.Hariz.PBO.pertemuan2;

import java.util.Scanner;

public class unguided1_65 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("== Program Menampilkan Bilangan Genap ==\n");

        System.out.print("Masukkan batas bilangan: ");
        int batas = input.nextInt();

        for (int i = 1; i <= batas; i++) {
            if (i % 2 == 0) {
                System.out.println("bilangan genap : " + i);
            }
        }
    }
}
