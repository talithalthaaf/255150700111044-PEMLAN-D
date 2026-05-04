package Modul9Bab8;

public class Probstat extends MataKuliah {
    public Probstat(int tugas, int kuis, int uts, int uas) {
        super(tugas, kuis, uts, uas);
    }

    @Override
    public double hitungNilaiAkhir() {
        return (tugas * 0.25) + (kuis * 0.15) + (uts * 0.3) + (uas * 0.3);
    }
}