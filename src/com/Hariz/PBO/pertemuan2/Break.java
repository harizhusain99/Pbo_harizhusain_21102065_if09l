package com.Hariz.PBO.pertemuan2;

public class Break {
    public static void main(String[] args) {
        int p=0;
        while (p <= 100){
            System.out.println("Jalan yuk, hari ke : "+p+" ");
            //p+=10;

            if (p==50){
                System.out.println("Capek Broo!!");
                break;
            }
            p+=10;  //bisa di taruh bawah system
        }
    }
}

