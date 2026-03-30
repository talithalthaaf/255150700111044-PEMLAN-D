package Modul5;

public class AritmatikaPraktikum {
    // static method: bisa dipanggil langsung tanpa objek
    public static int penjumlahan(int a, int b) {
        return a + b;
    }

    public static int pengurangan(int a, int b) {
        return a - b;
    }

    // non static method: harus dipanggil lewat objek
    public int perkalian(int a, int b) {
        return a * b;
    }

    public double pembagian(int a, int b) {
        if (b == 0) {
            System.out.println("Error: pembagian dengan nol!");
            return 0;
        }
        return (double) a / b;
    }

    // method non static untuk menyederhanakan pecahan
    public String sederhana(int pembilang, int penyebut) {
        int gcd = gcd(pembilang, penyebut);
        return (pembilang / gcd) + "/" + (penyebut / gcd);
    }

    // method bantu untuk mencari FPB
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

