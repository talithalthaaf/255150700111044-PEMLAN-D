package Modul2;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); // membersihkan buffer

        Student[] siswa = new Student[jumlah];

        // Input data siswa
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%nData siswa ke-%d%n", i + 1);
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Alamat: ");
            String alamat = input.nextLine();
            System.out.print("Umur: ");
            int umur = input.nextInt();
            System.out.print("Nilai Matematika: ");
            double math = input.nextDouble();
            System.out.print("Nilai Bahasa Inggris: ");
            double english = input.nextDouble();
            System.out.print("Nilai IPA: ");
            double science = input.nextDouble();
            input.nextLine(); // membersihkan buffer

            siswa[i] = new Student(nama, alamat, umur, math, english, science);
        }

        // Tampilkan semua data siswa
        System.out.printf("%n=== Data Semua Siswa ===%n");
        for (Student s : siswa) {
            s.displayMessage();
            System.out.println();
        }

        // Tampilkan jumlah objek
        Student.jumlahObjek();

        input.close();
    }
}

