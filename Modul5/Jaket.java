package Modul5;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Jaket {
    public static final int HARGA_A = 100000;
    public static final int HARGA_B = 125000;
    public static final int HARGA_C = 175000;

    private int jumlahA;
    private int jumlahB;
    private int jumlahC;

    public Jaket(int jumlahA, int jumlahB, int jumlahC) {
        this.jumlahA = jumlahA;
        this.jumlahB = jumlahB;
        this.jumlahC = jumlahC;
    }

    public int hitungTotal() {
        int total = 0;
        total += (jumlahA > 100) ? jumlahA * 95000 : jumlahA * HARGA_A;
        total += (jumlahB > 100) ? jumlahB * 120000 : jumlahB * HARGA_B;
        total += (jumlahC > 100) ? jumlahC * 160000 : jumlahC * HARGA_C;
        return total;
    }

    public void tampilkanNota() {
        // format angka dengan titik sebagai pemisah ribuan
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        DecimalFormat formatter = new DecimalFormat("#,###", symbols);

        System.out.println("CV. LABKOMDAS - Transaksi Jaket");
        System.out.println("----------------------------------");
        System.out.println("Jumlah Jaket A : " + jumlahA);
        System.out.println("Jumlah Jaket B : " + jumlahB);
        System.out.println("Jumlah Jaket C : " + jumlahC);
        System.out.println("----------------------------------");
        System.out.println("Harga Dasar:");
        System.out.println("Jaket A : Rp " + formatter.format(HARGA_A));
        System.out.println("Jaket B : Rp " + formatter.format(HARGA_B));
        System.out.println("Jaket C : Rp " + formatter.format(HARGA_C));
        System.out.println("----------------------------------");
        System.out.println("Diskon berlaku jika pembelian > 100");
        System.out.println("Jaket A : Rp 95.000");
        System.out.println("Jaket B : Rp 120.000");
        System.out.println("Jaket C : Rp 160.000");
        System.out.println("----------------------------------");
        System.out.println("GRAND TOTAL : Rp " + formatter.format(hitungTotal()));
    }
}
