package Modul9Bab8;

public class Pemlan extends MataKuliah {
    public Pemlan(int tugas, int kuis, int uts, int uas) {
        super(tugas, kuis, uts, uas);
    }

    @Override
    public double hitungNilaiAkhir() {
        return (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
    }
}