package Modul6;

public class MainInheritance {
    public static void main(String[] args) {
        Manusia a = new Manusia("A", "111", true, true);
        Manusia b = new Manusia("B", "112", false, true);
        Manusia c = new Manusia("C", "113", true, false);

        MahasiswaFILKOM mhs1 = new MahasiswaFILKOM("165150300111100", 2.8, "D", "114", true, false);
        MahasiswaFILKOM mhs2 = new MahasiswaFILKOM("165150400111101", 3.2, "E", "115", false, false);
        MahasiswaFILKOM mhs3 = new MahasiswaFILKOM("165150700111102", 3.9, "F", "116", true, false);

        Pekerja p1 = new Pekerja(1000, 2024, 1, 1, 2, "G", "117", true, true);
        Pekerja p2 = new Pekerja(2000, 2017, 1, 1, 0, "H", "118", false, true);
        Pekerja p3 = new Pekerja(3000, 2006, 1, 1, 10, "I", "119", true, true);

        Manager man = new Manager("HRD", 7500, 2011, 1, 1, 3, "J", "120", true, true);

        System.out.println(a);
        System.out.println("\n" + b);
        System.out.println("\n" + c);
        System.out.println("\n" + mhs1);
        System.out.println("\n" + mhs2);
        System.out.println("\n" + mhs3);
        System.out.println("\n" + p1);
        System.out.println("\n" + p2);
        System.out.println("\n" + p3);
        System.out.println("\n" + man);
    }
}