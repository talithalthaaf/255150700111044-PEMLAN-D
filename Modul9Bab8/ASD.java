package Modul9Bab8;

public class ASD extends MataKuliah {
    public ASD(int tugas, int kuis, int uts, int uas) {
        super(tugas, kuis, uts, uas);
    }

    @Override
    public double hitungNilaiAkhir() {
        return (tugas * 0.25) + (kuis * 0.25) + (uts * 0.25) + (uas * 0.25);
    }
}

