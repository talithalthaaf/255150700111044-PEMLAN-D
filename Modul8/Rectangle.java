package Modul8;

public class Rectangle implements Colorable, Comparable {
    private String warna;
    private int kategori;

    public Rectangle() { }

    public Rectangle(String warna) {
        this.warna = warna;
    }

    @Override
    public void howToColor() {
        if (this.warna == null) {
            System.out.println("Tidak ada warna, kotak masih polos.");
        } else {
            System.out.println("Bangun kotak sudah diwarnai dengan warna " + this.warna);
        }
    }

    @Override
    public void compareTo(Object obj) {
        this.kategori = (int) obj;
        if (this.kategori == 0) {
            System.out.println("Ukuran cat cocok untuk kategori " + this.kategori + " yaitu 2.5L");
        } else {
            System.out.println("Ukuran cat cocok untuk kategori " + this.kategori + " yaitu 6.5L");
        }
    }
}