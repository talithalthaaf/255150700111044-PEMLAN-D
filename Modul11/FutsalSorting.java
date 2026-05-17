package Modul11;

import java.util.*;

// Class utama
public class FutsalSorting {

    // Method untuk mencetak list pemain dengan format tabel rapi
    private static void printList(String judul, List<Pemain> tim) {
        System.out.println("\n" + judul);
        System.out.println("---------------------------------");
        System.out.printf("%-10s %-10s\n", "Tinggi", "Berat");
        System.out.println("---------------------------------");
        for (Pemain p : tim) {
            System.out.printf("%-10d %-10d\n", p.tinggi, p.berat);
        }
    }

    public static void main(String[] args) {
        // Data Tim A
        List<Pemain> timA = Arrays.asList(
                new Pemain(168, 50), new Pemain(170, 60), new Pemain(165, 56),
                new Pemain(168, 55), new Pemain(172, 60), new Pemain(170, 70),
                new Pemain(169, 66), new Pemain(165, 56), new Pemain(171, 72),
                new Pemain(166, 56)
        );

        // Data Tim B
        List<Pemain> timB = Arrays.asList(
                new Pemain(170, 66), new Pemain(167, 60), new Pemain(165, 59),
                new Pemain(166, 58), new Pemain(168, 58), new Pemain(175, 71),
                new Pemain(172, 68), new Pemain(171, 68), new Pemain(168, 65),
                new Pemain(169, 60)
        );

        // a. Urutkan berdasarkan tinggi badan Tim A
        timA.sort(Comparator.comparingInt(p -> p.tinggi));
        printList("Tim A Ascending Tinggi", timA);

        timA.sort(Comparator.comparingInt((Pemain p) -> p.tinggi).reversed());
        printList("Tim A Descending Tinggi", timA);

        // b. Urutkan berdasarkan berat badan Tim B
        timB.sort(Comparator.comparingInt(p -> p.berat));
        printList("Tim B Ascending Berat", timB);

        timB.sort(Comparator.comparingInt((Pemain p) -> p.berat).reversed());
        printList("Tim B Descending Berat", timB);

        // c. Cari nilai maksimum dan minimum
        int maxTinggiA = timA.stream().mapToInt(p -> p.tinggi).max().getAsInt();
        int minTinggiA = timA.stream().mapToInt(p -> p.tinggi).min().getAsInt();
        int maxBeratA = timA.stream().mapToInt(p -> p.berat).max().getAsInt();
        int minBeratA = timA.stream().mapToInt(p -> p.berat).min().getAsInt();

        int maxTinggiB = timB.stream().mapToInt(p -> p.tinggi).max().getAsInt();
        int minTinggiB = timB.stream().mapToInt(p -> p.tinggi).min().getAsInt();
        int maxBeratB = timB.stream().mapToInt(p -> p.berat).max().getAsInt();
        int minBeratB = timB.stream().mapToInt(p -> p.berat).min().getAsInt();

        System.out.printf("\nTim A → Tinggi Maks: %d, Min: %d | Berat Maks: %d, Min: %d\n",
                maxTinggiA, minTinggiA, maxBeratA, minBeratA);
        System.out.printf("Tim B → Tinggi Maks: %d, Min: %d | Berat Maks: %d, Min: %d\n",
                maxTinggiB, minTinggiB, maxBeratB, minBeratB);

        // d. Copy Tim B ke Tim C
        List<Pemain> timC = new ArrayList<>(timB);
        printList("Tim C (Copy dari Tim B)", timC);
    }
}
