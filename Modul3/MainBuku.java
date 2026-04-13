package Modul3;

public class MainBuku {
    public static void main(String[] args) {
        // Objek buku konsisten dengan Bab 1–2
        Buku[] daftarBuku = {
                new Buku("Pemrograman Java", "Andi", "Informatika", 2020,
                        "Buku ini membahas dasar-dasar pemrograman Java."),
                new Buku("Algoritma dan Struktur Data", "Budi", "Graha Ilmu", 2018,
                        "Membahas konsep algoritma dan struktur data untuk mahasiswa."),
                new Buku("Basis Data", "Citra", "Erlangga", 2019,
                        "Buku ini menjelaskan konsep basis data relasional."),
        };

        // Cetak info dan jumlah kata sinopsis
        for (Buku b : daftarBuku) {
            b.cetakInfo();
            System.out.println("Jumlah kata sinopsis: " + b.hitungJumlahKata());
            System.out.println("-----------------------------");
        }

        // Bandingkan kesamaan antar buku
        System.out.println("Perbandingan kesamaan antar buku:");
        for (int i = 0; i < daftarBuku.length; i++) {
            for (int j = i + 1; j < daftarBuku.length; j++) {
                double persentase = daftarBuku[i].cekKesamaan(daftarBuku[j]);
                System.out.printf("Kesamaan %s dan %s: %.2f%%%n",
                        daftarBuku[i].getJudul(), daftarBuku[j].getJudul(), persentase);
            }
        }

        // Simpan dan baca file
        Buku b1 = daftarBuku[0];
        b1.simpanFile("buku.txt");
        Buku b2 = new Buku("", "", "", 0, "");
        b2.bacaFile("buku.txt");
        System.out.println("Data dari file:");
        b2.cetakInfo();

        // Hitung royalti
        int hargaBuku = 100000;
        System.out.println("Royalti default (10%): Rp " + b1.hitungRoyalti(hargaBuku));
        System.out.println("Royalti custom (15%): Rp " + b1.hitungRoyalti(hargaBuku, 15));
    }
}
