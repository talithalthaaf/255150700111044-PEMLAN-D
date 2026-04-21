package Modul8;

public class MainClass {
    public static void main(String[] args) {
        Manusia m = new Manusia("Talitha Althaf", 18);
        m.tampilkanNama();
        m.tampilkanUmur();
        m.makan();
        m.berjalan();
        m.bersuara();

        System.out.println();

        // Objek baru Hewan dengan method tambahan
        Hewan h = new Hewan();
        h.makan();
        h.berjalan();
        h.bersuara();
        h.tidur();
    }
}
