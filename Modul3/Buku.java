package Modul3;

import java.io.*;

public class Buku {
    private String judul;
    private String penulis;
    private String penerbit;
    private int tahunTerbit;
    private String sinopsis;

    // Constructor lengkap
    public Buku(String judul, String penulis, String penerbit, int tahunTerbit, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.sinopsis = sinopsis;
    }

    // Getter untuk atribut private
    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public String getPenerbit() { return penerbit; }
    public int getTahunTerbit() { return tahunTerbit; }
    public String getSinopsis() { return sinopsis; }

    // Cetak info buku
    public void cetakInfo() {
        System.out.println("Judul     : " + judul);
        System.out.println("Penulis   : " + penulis);
        System.out.println("Penerbit  : " + penerbit);
        System.out.println("Tahun     : " + tahunTerbit);
        System.out.println("Sinopsis  : " + sinopsis);
    }

    // Hitung jumlah kata sinopsis
    public int hitungJumlahKata() {
        if (sinopsis == null || sinopsis.isEmpty()) return 0;
        return sinopsis.trim().split("\\s+").length;
    }

    // Cek kesamaan antar buku
    public double cekKesamaan(Buku other) {
        int poin = 0;
        if (this.judul.equalsIgnoreCase(other.judul)) poin++;
        if (this.penulis.equalsIgnoreCase(other.penulis)) poin++;
        if (this.penerbit.equalsIgnoreCase(other.penerbit)) poin++;
        if (this.tahunTerbit == other.tahunTerbit) poin++;
        return (poin / 4.0) * 100;
    }

    // Baca file
    public void bacaFile(String pathFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            String line = br.readLine();
            if (line != null) {
                String[] data = line.split(";");
                if (data.length >= 2) {
                    judul = data[0].trim();
                    penulis = data[1].trim();
                }
            }
        } catch (IOException e) {
            System.out.println("Error membaca file: " + e.getMessage());
        }
    }

    // Simpan file
    public void simpanFile(String namaFile) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(namaFile))) {
            bw.write(judul + ";" + penulis);
        } catch (IOException e) {
            System.out.println("Error menyimpan file: " + e.getMessage());
        }
    }

    // Royalti default 10%
    public double hitungRoyalti(int harga) {
        return harga * 0.10;
    }

    // Royalti custom sesuai persen
    public double hitungRoyalti(int harga, double persen) {
        return harga * (persen / 100.0);
    }
}
