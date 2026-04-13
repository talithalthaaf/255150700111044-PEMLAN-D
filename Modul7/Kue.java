package Modul7;

public abstract class Kue {
    public String nama;
    public double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();

    @Override
    public String toString() {
        return String.format("Nama: %s | Harga: Rp %, .0f", nama, harga);
    }
}
