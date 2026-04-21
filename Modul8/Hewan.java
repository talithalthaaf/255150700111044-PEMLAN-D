package Modul8;

public class Hewan implements MakhlukHidup {
    @Override
    public void makan() {
        System.out.println("Hewan makan dengan mulut");
    }

    @Override
    public void berjalan() {
        System.out.println("Hewan berjalan dengan 4 kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Hewan bersuara sesuai jenisnya");
    }

    // Method tambahan yang berbeda dari sebelumnya
    public void tidur() {
        System.out.println("Hewan sedang tidur");
    }
}
