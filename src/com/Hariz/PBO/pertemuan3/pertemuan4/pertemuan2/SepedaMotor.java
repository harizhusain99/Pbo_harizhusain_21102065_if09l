package com.Hariz.PBO.pertemuan3.pertemuan4.pertemuan2;

public class SepedaMotor {

    //klik kanan->ganarate->pilih semua
    //Atribut
/*    String merek;
    String tipe;
    int harga;
  */      //Constructor

    private String merek;
    private String tipe;
    private int harga;
      //Constructor
    public SepedaMotor() {}

    public SepedaMotor(String merek, String tipe, int harga) {
        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;
    }

    public void showInfo() {
            System.out.println("Merek : " + merek);
            System.out.println("Tipe : " + tipe);
            System.out.println("Harga : " + harga);
            System.out.println();
        }

    public String getMerek() {
        return merek;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void metod() {
                System.out.println("Merek : " + merek);
                System.out.println("Tipe : " + tipe);
                System.out.println("Harga : " + harga);
                System.out.println();

        }
}

