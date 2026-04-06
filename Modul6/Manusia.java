package Modul6;

public class Manusia {
    private String nama;
    private String nik;
    private boolean jenisKelamin; // true = laki-laki, false = perempuan
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25 : 20;
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        return "Nama : " + nama +
                "\nNIK : " + nik +
                "\nJenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan") +
                "\nPendapatan : " + getPendapatan();
    }
}