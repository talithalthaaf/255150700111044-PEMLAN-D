package Modul6;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahun, int bulan, int hari, int jumlahAnak,
                   String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, hari, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (superPendapatanGaji() * 0.10);
    }

    private double superPendapatanGaji() {
        return superPendapatanTanpaTunjangan();
    }

    private double superPendapatanTanpaTunjangan() {
        return super.getPendapatan();
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartemen : " + departemen;
    }
}