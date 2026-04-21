package Modul8;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public int getPayableAmount() {
        int totalBelanja = 0;
        for (Invoice inv : invoices) {
            totalBelanja += inv.getPayableAmount();
        }
        return salaryPerMonth - totalBelanja;
    }

    public void tampilkanInfo() {
        System.out.println("No. Registrasi: " + registrationNumber);
        System.out.println("Nama: " + name);
        System.out.println("Gaji per bulan: Rp" + salaryPerMonth);
        System.out.println("Total gaji setelah potongan: Rp" + getPayableAmount());
        System.out.println("\nDetail belanja:");
        for (Invoice inv : invoices) {
            inv.tampilkanDetail();
        }
    }
}
