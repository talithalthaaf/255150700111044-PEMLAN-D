package Modul10;

import java.io.File;

public class ListFile {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Talitha Althaf\\Documents\\Talitha Althaf Nugroho\\KULIAH\\Semester 1\\JAVA\\Pemlan Praktek\\LAPRAK PEMLAN\\src"); // contoh direktori
        if (dir.exists() && dir.isDirectory()) {
            String[] files = dir.list();
            System.out.println("Daftar file dalam direktori:");
            for (String f : files) {
                System.out.println(f);
            }
        } else {
            System.out.println("Direktori tidak ada");
        }
    }
}