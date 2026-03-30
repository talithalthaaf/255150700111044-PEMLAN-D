package Modul5;

import java.util.Scanner;

public class TestJaket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Input Pembelian Jaket ===");
        System.out.print("Masukkan jumlah Jaket A: ");
        int a = input.nextInt();
        System.out.print("Masukkan jumlah Jaket B: ");
        int b = input.nextInt();
        System.out.print("Masukkan jumlah Jaket C: ");
        int c = input.nextInt();

        Jaket pembelian = new Jaket(a, b, c);

        System.out.println("\n=== Nota Transaksi ===");
        pembelian.tampilkanNota();

        input.close();
    }
}