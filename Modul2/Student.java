package Modul2;

public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;

    // Static counter untuk menghitung jumlah objek
    private static int counter = 0;

    // Constructor default
    public Student() {
        name = "";
        address = "";
        age = 0;
        counter++;
    }

    // Constructor berparameter
    public Student(String n, String a, int ag, double math, double english, double science) {
        name = n;
        address = a;
        age = ag;
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        counter++;
    }

    // Hitung rata-rata
    private double getAverage() {
        return (mathGrade + englishGrade + scienceGrade) / 3;
    }

    // Status akhir
    public boolean statusAkhir() {
        return getAverage() >= 61;
    }

    // Tampilkan informasi siswa dengan format rapi
    public void displayMessage() {
        System.out.printf("%-15s: %s%n", "Nama", name);
        System.out.printf("%-15s: %s%n", "Alamat", address);
        System.out.printf("%-15s: %d%n", "Umur", age);
        System.out.printf("%-15s: %.2f%n", "Nilai rata-rata", getAverage());
        System.out.printf("%-15s: %s%n", "Status", statusAkhir() ? "Lolos" : "Remidi");
    }

    // Tampilkan jumlah objek
    public static void jumlahObjek() {
        System.out.printf("%-15s: %d%n", "Jumlah objek", counter);
    }
}

