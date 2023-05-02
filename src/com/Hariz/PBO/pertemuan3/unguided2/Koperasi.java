package com.Hariz.PBO.pertemuan3.unguided2;

public class Koperasi {
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBarang;

    // constructor
    public Koperasi(String namaBarang, int hargaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    // setter
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    // getter
    public String getNamaBarang() {
        return this.namaBarang;
    }

    public int getHargaBarang() {
        return this.hargaBarang;
    }

    public int getJumlahBarang() {
        return this.jumlahBarang;
    }

    // method untuk menghitung total harga barang
    public int getTotalHarga() {
        return this.hargaBarang * this.jumlahBarang;
    }

    // method untuk menampilkan detail barang
    public void tampilDetailBarang() {
        System.out.println("Nama Barang : " + this.namaBarang);
        System.out.println("Harga Barang : " + this.hargaBarang);
        System.out.println("Jumlah Barang : " + this.jumlahBarang);
        System.out.println("Total Harga : " + this.getTotalHarga());
    }
}

