package Modul3;

public class HitungLuas {
    // Method dengan parameter int
    public static int HitungLuas(int a, int b) {
        return a * b;
    }

    // Method dengan parameter double
    public static double HitungLuas(double value, double value2) {
        return value * value2;
    }

    // Versi void (contoh soal nomor 3)
    public static void HitungLuas(double value, double value2, boolean isVoid) {
        System.out.println("Luas: " + (value * value2));
    }

    public static void main(String[] args) {
        // Memanggil method dengan parameter int
        System.out.println("Luas (int): " + HitungLuas(5, 10));

        // Memanggil method dengan parameter double
        System.out.println("Luas (double): " + HitungLuas(5.5, 10.2));

        // Memanggil versi void
        HitungLuas(7.0, 3.0, true);
    }
}

