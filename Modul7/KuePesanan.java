package Modul7;

public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    @Override
    public double hitungHarga() {
        return harga * berat;
    }

    @Override
    public String toString() {
        return String.format("Pesanan | %-15s Rp %, -10.0f %-10.2f kg Rp %, -12.0f",
                getNama(), harga, berat, hitungHarga());
    }
}