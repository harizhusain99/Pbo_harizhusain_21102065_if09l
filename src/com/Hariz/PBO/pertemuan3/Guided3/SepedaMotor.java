package com.Hariz.PBO.pertemuan3.Guided3;

public class SepedaMotor {
    //Atribut
    private String merek;
    private String tipe;
    private int harga;
    //Constructor
    public SepedaMotor(){}
    //Constructor Berparameter
    public SepedaMotor(String merek, String tipe, int
            harga) {

        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;
    }
    //Method
    public void showInfo(){
        System.out.println("Merek : " + merek);
        System.out.println("Tipe : " + tipe);
        System.out.println("Harga : " + harga);
        System.out.println();
    }
}
