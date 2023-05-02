package com.Hariz.PBO.pertemuan3.Guided4;

public class Main {
    public static void main(String[] args) {
//Lebih Sederhana
        SepedaMotor vespa = new SepedaMotor("vespa",

                "Vespa Metic", 40000000);
        vespa.showInfo();
//Proses berjalannya Getter and Setter pada main

//Sebelum Perubahan
        System.out.println(

                "Motor Merek : " + vespa.getMerek()

                        +

                        " Dengan tipe (before) : " +

                        vespa.getTipe()
        );
//Melakukan Proses Perubahan
        vespa.setTipe("Sprint");
//Lihat Hasil Perubahan
        System.out.println(

                "Motor Merek : " + vespa.getMerek()

                        +

                        " Dengan tipe (after) : " +

                        vespa.getTipe()
        );
    }
}


