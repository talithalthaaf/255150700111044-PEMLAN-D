package Modul4;

import java.util.Scanner;

public class SwalayanTiny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // contoh data pelanggan
        Customer c1 = new Customer("Talitha", "5600000001", "1234", 2000000);

        System.out.print("Masukkan Nomor Pelanggan: ");
        String inputNumber = sc.nextLine();
        System.out.print("Masukkan PIN: ");
        String inputPin = sc.nextLine();

        if (c1.authenticate(inputNumber, inputPin)) {
            System.out.println("Login berhasil!");
            c1.showInfo();

            System.out.println("\nPilih Transaksi: 1. Top Up  2. Pembelian");
            int choice = sc.nextInt();
            System.out.print("Masukkan nominal: ");
            double amount = sc.nextDouble();

            if (choice == 1) {
                c1.topUp(amount);
            } else if (choice == 2) {
                c1.purchase(amount);
            }
        } else {
            System.out.println("Login gagal!");
        }
        sc.close();
    }
}

