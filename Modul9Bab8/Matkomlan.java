package Modul9Bab8;

public class Matkomlan extends MataKuliah {
    public Matkomlan(int tugas, int kuis, int uts, int uas) {
        super(tugas, kuis, uts, uas);
    }

    @Override
    public double hitungNilaiAkhir() {
        return (tugas * 0.3) + (kuis * 0.2) + (uts * 0.25) + (uas * 0.25);
    }
}