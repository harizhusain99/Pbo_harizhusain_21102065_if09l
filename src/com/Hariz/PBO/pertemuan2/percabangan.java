package com.Hariz.PBO.pertemuan2;

import java.util.Scanner;

public class percabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Sebuah Bilangan : ");
        int bilangann = scanner.nextInt();  //deklarasi

        if(bilangann>0){
            System.out.println("Bilangan Positif");     //jika kurang lebih daro 0 muncul positif
        }else if(bilangann<0) {
            System.out.println("Bilangan Negatif");
        }else {
            System.out.println("Bilangan Nol");
        }
    }
}

