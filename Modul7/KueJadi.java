package Modul7;

public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        return harga * jumlah * 2;
    }

    @Override
    public String toString() {
        return String.format("Jadi    | %-15s Rp %, -10.0f %-10.0f pcs Rp %, -12.0f",
                getNama(), harga, jumlah, hitungHarga());
    }
}