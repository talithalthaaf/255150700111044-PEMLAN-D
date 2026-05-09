package Modul10;

import java.io.FileReader;
import java.io.IOException;

public class NoCheckExample {
    public static void main(String[] args) {
        try {
            // mencoba langsung membaca file yang tidak ada
            FileReader reader = new FileReader("tidak_ada.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Terjadi error: " + e.getMessage());
        }
    }
}