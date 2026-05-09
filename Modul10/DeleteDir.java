package Modul10;

import java.io.File;

public class DeleteDir {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Talitha Althaf\\Documents\\PemlanModul10\\JAVACOBA");
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (File f : files) {
                f.delete();
            }
            boolean result = dir.delete();
            System.out.println(result ? "Berhasil menghapus direktori" : "Gagal menghapus direktori");
        } else {
            System.out.println("Direktori tidak ada");
        }
    }
}