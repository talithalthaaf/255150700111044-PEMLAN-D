package Modul8;

public class MainPraktikum {
    public static void main(String[] args) {
        Invoice[] belanja = {
                new Invoice("Buku Tulis", 3, 5000),
                new Invoice("Pulpen", 2, 3000),
                new Invoice("Snack", 5, 2000)
        };

        Employee emp = new Employee(101, "Talitha Althaf Nugroho", 2000000, belanja);
        emp.tampilkanInfo();
    }
}
