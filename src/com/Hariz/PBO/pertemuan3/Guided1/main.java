package com.Hariz.PBO.pertemuan3.Guided1;

public class main {
    public static void main(String[] args) {
        SepedaMotor suzuki = new SepedaMotor();
        SepedaMotor honda = new SepedaMotor();
        SepedaMotor yamaha = new SepedaMotor();

/*        suzuki.merek = "Suzuki";
        suzuki.tipe = "GSX 165";
        suzuki.harga = 250000000;

        yamaha.merek = "Yamaha";
        yamaha.tipe = "YZF R15";
        yamaha.harga = 250000000;

        honda.merek = "Honda";
        honda.tipe = "GSX 165";
        honda.harga = 250000000;


        suzuki.showInfo();
        yamaha.showInfo();
        honda.showInfo();

        yamaha.metod();
*/
        //showInfo dan metod ambil dari atas
        // setelah itu ambil dari sepeda motor terkait pertanyaan
        // isi atau inputan dari main

        SepedaMotor vespa = new SepedaMotor("vespa", " Vespa Matic", 4000000);

        //sebelum perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerek() + "Dengan Tipe (bifore) : "+ vespa.getTipe()
        );

        //melakukan proses perubahan tipe motor
        vespa.setTipe("sprint");

        //lihat hasil perubahan
        System.out.println(
                "Montor Merek : " + vespa.getMerek() + "dengan tipe (after) " + vespa.getTipe()
        );
    }
}
