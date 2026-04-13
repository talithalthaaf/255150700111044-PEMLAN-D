package Modul7;

public abstract class Kue {
    private String nama;
    public double harga; // sesuai instruksi: wajib public

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public abstract double hitungHarga();

    @Override
    public String toString() {
        return String.format("Nama: %s | Harga: Rp %, .0f", nama, harga);
    }
}
