package Modul9Bab8;

public abstract class MataKuliah {
    protected int tugas;
    protected int kuis;
    protected int uts;
    protected int uas;

    public MataKuliah(int tugas, int kuis, int uts, int uas) {
        this.tugas = tugas;
        this.kuis = kuis;
        this.uts = uts;
        this.uas = uas;
    }

    public abstract double hitungNilaiAkhir();
}
