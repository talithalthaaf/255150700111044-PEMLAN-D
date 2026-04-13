package Modul3;

public class Lingkaran {
    private int alas;
    private int tinggi;

    // Constructor 1 parameter (alas)
    public Lingkaran(int alas) {
        this.alas = alas;
    }

    // Constructor 2 parameter (alas, tinggi)
    public Lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Constructor dengan parameter tinggi (dibedakan dengan boolean)
    public Lingkaran(int tinggi, boolean isTinggi) {
        this.tinggi = tinggi;
    }

    // Constructor dengan parameter String (alas, tinggi)
    public Lingkaran(String alas, String tinggi) {
        this.alas = Integer.parseInt(alas);
        this.tinggi = Integer.parseInt(tinggi);
    }

    public int hitungLuasSegitiga() {
        return (alas * tinggi) / 2;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public static void main(String[] args) {
        // Objek dengan constructor 1 parameter
        Lingkaran L1 = new Lingkaran(10);
        L1.setTinggi(5);
        System.out.println("Luas segitiga L1: " + L1.hitungLuasSegitiga());

        // Objek dengan constructor 2 parameter
        Lingkaran L2 = new Lingkaran(8, 6);
        System.out.println("Luas segitiga L2: " + L2.hitungLuasSegitiga());

        // Objek dengan constructor int tinggi (dibedakan dengan boolean)
        Lingkaran L3 = new Lingkaran(7, true);
        L3.alas = 9; // isi alas belakangan
        System.out.println("Luas segitiga L3: " + L3.hitungLuasSegitiga());

        // Objek dengan constructor String
        Lingkaran Lstring = new Lingkaran("12", "4");
        System.out.println("Luas segitiga Lstring: " + Lstring.hitungLuasSegitiga());
    }
}

