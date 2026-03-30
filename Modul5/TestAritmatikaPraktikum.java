package Modul5;

public class TestAritmatikaPraktikum {
    public static void main(String[] args) {
        // memanggil static method langsung lewat nama class
        System.out.println("Penjumlahan: " + AritmatikaPraktikum.penjumlahan(10, 5));
        System.out.println("Pengurangan: " + AritmatikaPraktikum.pengurangan(10, 5));

        // membuat objek untuk memanggil non static method
        AritmatikaPraktikum ar = new AritmatikaPraktikum();
        System.out.println("Perkalian: " + ar.perkalian(10, 5));
        System.out.println("Pembagian: " + ar.pembagian(10, 5));
        System.out.println("Pecahan sederhana: " + ar.sederhana(20, 60));
    }
}

