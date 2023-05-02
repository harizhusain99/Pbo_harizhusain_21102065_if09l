package com.Hariz.PBO.pertemuan2;

public class looping {
    public static void main(String[] args){
        //for
        for (int i=0; i<10; i++){
            System.out.println("Looping....( "+ (i+1) +" )");
        }
        //while
        int j=0;
        while (j<=10){
            System.out.println("looping while ( "+j+" )");
            j+=1;
        }
        System.out.println("Looping while Selesai !");
        //do while
        int k=10;
        do {
            System.out.println("looping do while ( "+k+" )");
            k--;
        }while (k>0);
        System.out.println("Looping do while Selesai!");
    }
}



