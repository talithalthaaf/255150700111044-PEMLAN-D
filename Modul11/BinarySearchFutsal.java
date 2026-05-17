package Modul11;

import java.util.*;

public class BinarySearchFutsal {

    // Method untuk cetak hasil pencarian dengan format rapi
    private static void printSearch(String judul, int value) {
        System.out.printf("%-40s : %d\n", judul, value);
    }

    public static void main(String[] args) {
        // Data Tim A
        List<Integer> tinggiA = Arrays.asList(168, 170, 165, 168, 172, 170, 169, 165, 171, 166);
        List<Integer> beratA  = Arrays.asList(50, 60, 56, 55, 60, 70, 66, 56, 72, 56);

        // Data Tim B
        List<Integer> tinggiB = Arrays.asList(170, 167, 165, 166, 168, 175, 172, 171, 168, 169);
        List<Integer> beratB  = Arrays.asList(66, 60, 59, 58, 58, 71, 68, 68, 65, 60);

        // Urutkan data agar konsisten
        Collections.sort(tinggiA);
        Collections.sort(beratA);
        Collections.sort(tinggiB);
        Collections.sort(beratB);

        // Cetak data rapi
        System.out.println("\n=== Data Tim A (Tinggi) === " + tinggiA);
        System.out.println("=== Data Tim A (Berat)  === " + beratA);
        System.out.println("=== Data Tim B (Tinggi) === " + tinggiB);
        System.out.println("=== Data Tim B (Berat)  === " + beratB);

        // b) Jumlah pemain Tim B dengan tinggi tertentu
        int count168 = Collections.frequency(tinggiB, 168);
        int count160 = Collections.frequency(tinggiB, 160);

        // c) Jumlah pemain Tim A dengan berat tertentu
        int count56 = Collections.frequency(beratA, 56);
        int count53 = Collections.frequency(beratA, 53);

        System.out.println("\n=== Hasil Pencarian ===");
        printSearch("Jumlah pemain Tim B tinggi 168 cm", count168);
        printSearch("Jumlah pemain Tim B tinggi 160 cm", count160);
        printSearch("Jumlah pemain Tim A berat 56 kg", count56);
        printSearch("Jumlah pemain Tim A berat 53 kg", count53);

        // d) Apakah ada data yang sama?
        boolean samaTinggi = !Collections.disjoint(tinggiA, tinggiB);
        boolean samaBerat  = !Collections.disjoint(beratA, beratB);

        System.out.println("\n=== Perbandingan Antar Tim ===");
        System.out.printf("%-40s : %s\n", "Apakah ada tinggi badan sama?", samaTinggi ? "Ya" : "Tidak");
        System.out.printf("%-40s : %s\n", "Apakah ada berat badan sama?", samaBerat ? "Ya" : "Tidak");
    }
}
