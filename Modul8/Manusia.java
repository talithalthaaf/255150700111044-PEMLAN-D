package Modul8;

public class Manusia implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;

    // Konstruktor dengan parameter
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public void makan() {
        System.out.println("Makan pakai sendok garpu");
    }

    @Override
    public void berjalan() {
        System.out.println("Jalan pakai dua kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Suaranya merdu");
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur saya: " + this.umur);
    }

    public void tampilkanNama() {
        System.out.println("Nama saya: " + this.nama);
    }
}
