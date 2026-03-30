package Modul5;

import java.util.Scanner;

public class MainAritmatika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai 1 : ");
        int nil1 = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        int nil2 = in.nextInt();

        // memanggil method static
        Aritmatika.hitungPengurangan(nil1, nil2);

        System.out.print("Masukkan nilai 1 : ");
        nil1 = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        nil2 = in.nextInt();

        // memanggil method static (sekarang juga memanggil penjumlahan di dalamnya)
        Aritmatika.hitungPerkalian(nil1, nil2);

        System.out.print("Masukkan nilai 1 : ");
        int value1 = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        int value2 = in.nextInt();

        // memanggil method non static
        Aritmatika a = new Aritmatika();
        a.hitungPenjumlahan(value1, value2);

        // tambahan dari soal 6: memanggil method pembagian dengan parameter String
        System.out.print("Masukkan nilai 1 (String) : ");
        String str1 = in.next();
        System.out.print("Masukkan nilai 2 (String) : ");
        String str2 = in.next();

        a.hitungPembagian(str1, str2);

        in.close();
    }
}
