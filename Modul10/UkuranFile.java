package Modul10;

import java.io.File;

public class UkuranFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.exists()) {
            long size = file.length(); // bytes
            if (size < 1024 * 1024) {
                System.out.printf("Ukuran file: %.2f KB\n", size / 1024.0);
            } else {
                System.out.printf("Ukuran file: %.2f MB\n", size / (1024.0 * 1024));
            }
        } else {
            System.out.println("File tidak ada");
        }
    }
}
