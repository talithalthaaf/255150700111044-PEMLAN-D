package Modul7;

public class MainKue {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];

        daftarKue[0] = new KuePesanan("Brownies", 50000, 2);
        daftarKue[1] = new KueJadi("Donat", 3000, 10);
        daftarKue[2] = new KuePesanan("Tart", 75000, 1.5);
        daftarKue[3] = new KueJadi("Roti Sobek", 4000, 8);
        daftarKue[4] = new KuePesanan("Lapis Legit", 60000, 2.2);
        daftarKue[5] = new KueJadi("Kue Cubit", 2000, 15);
        daftarKue[6] = new KuePesanan("Cheesecake", 80000, 1.8);
        daftarKue[7] = new KueJadi("Kue Lumpur", 2500, 12);
        daftarKue[8] = new KuePesanan("Kue Putu", 30000, 3);
        daftarKue[9] = new KueJadi("Nastar", 3500, 20);
        daftarKue[10] = new KuePesanan("Bolu", 45000, 2.5);
        daftarKue[11] = new KueJadi("Kue Kering", 4000, 25);
        daftarKue[12] = new KuePesanan("Kue Lapis", 55000, 1.7);
        daftarKue[13] = new KueJadi("Kue Sus", 3000, 18);
        daftarKue[14] = new KuePesanan("Kue Pandan", 50000, 2.1);
        daftarKue[15] = new KueJadi("Apem", 2500, 14);
        daftarKue[16] = new KuePesanan("Red Velvet", 90000, 1.3);
        daftarKue[17] = new KueJadi("Klepon", 2000, 30);
        daftarKue[18] = new KuePesanan("Caramel", 65000, 2.4);
        daftarKue[19] = new KueJadi("Pia", 5000, 10);

        System.out.println("=== DAFTAR KUE ===");
        System.out.printf("%-8s %-15s %-12s %-12s %-15s%n",
                "Jenis", "Nama", "Harga", "Qty", "Harga Total");
        System.out.println("-------------------------------------------------------------------");

        double totalSemua = 0;
        double totalPesanan = 0, totalBerat = 0;
        double totalJadi = 0, totalJumlah = 0;
        Kue maxKue = daftarKue[0];

        for (Kue k : daftarKue) {
            System.out.println(k);

            double hargaTotal = k.hitungHarga();
            totalSemua += hargaTotal;
            if (hargaTotal > maxKue.hitungHarga()) maxKue = k;

            if (k instanceof KuePesanan) {
                totalPesanan += hargaTotal;
                totalBerat += ((KuePesanan) k).berat;
            } else {
                totalJadi += hargaTotal;
                totalJumlah += ((KueJadi) k).jumlah;
            }
        }

        System.out.println("\n=== RINGKASAN ===");
        System.out.printf("Total semua kue      : Rp %, .0f%n", totalSemua);
        System.out.printf("Total Kue Pesanan    : Rp %, .0f | Berat: %.2f kg%n", totalPesanan, totalBerat);
        System.out.printf("Total Kue Jadi       : Rp %, .0f | Jumlah: %.0f pcs%n", totalJadi, totalJumlah);
        System.out.printf("Kue harga terbesar   : %s (Rp %, .0f)%n", maxKue.nama, maxKue.hitungHarga());
    }
}
