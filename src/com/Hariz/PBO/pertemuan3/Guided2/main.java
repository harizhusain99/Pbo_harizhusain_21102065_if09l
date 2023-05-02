package com.Hariz.PBO.pertemuan3.Guided2;

public class main {
    public static void main(String[] args) {
        SepedaMotor Kawasaki = new

                SepedaMotor("Kawasaki", "R15", 100000000);

        SepedaMotor Yamaha = new SepedaMotor("Yamaha",

                "Mio", 10000000);

        SepedaMotor Honda = new SepedaMotor("Honda",

                "Vario", 25000000);

        Kawasaki.showInfo();
        Yamaha.showInfo();
        Honda.showInfo();
    }
}
