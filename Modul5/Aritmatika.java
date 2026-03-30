package Modul5;

public class Aritmatika {
    public void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("Nilai penjumlahan adalah : " + nilai);
    }

    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("Nilai perkalian adalah : " + nilai);

        // tambahan dari soal 5: memanggil method non static di dalam method static
        Aritmatika obj = new Aritmatika();
        obj.hitungPenjumlahan(a, b);
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("Nilai pengurangan adalah : " + nilai);
    }

    // tambahan dari soal 6: method non static dengan parameter String
    public double hitungPembagian(String nil1, String nil2) {
        double a = Double.parseDouble(nil1);
        double b = Double.parseDouble(nil2);

        if (b == 0) {
            System.out.println("Error: pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }

        double hasil = a / b;
        System.out.println("Nilai pembagian adalah : " + hasil);
        return hasil;
    }
}







