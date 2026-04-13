package Modul4;

public class Customer {
    private String name;
    private String customerNumber;
    private String pin;
    private double balance;
    private boolean blocked = false;
    private int wrongAttempts = 0;

    public Customer(String name, String customerNumber, String pin, double balance) {
        this.name = name;
        this.customerNumber = customerNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean authenticate(String inputNumber, String inputPin) {
        if (blocked) return false;
        if (customerNumber.equals(inputNumber) && pin.equals(inputPin)) {
            wrongAttempts = 0;
            return true;
        } else {
            wrongAttempts++;
            if (wrongAttempts >= 3) blocked = true;
            return false;
        }
    }

    public void topUp(double amount) {
        balance += amount;
        System.out.printf("%-15s: Rp%.2f\n", "Top Up", amount);
        System.out.printf("%-15s: Rp%.2f\n", "Saldo Baru", balance);
    }

    public void purchase(double amount) {
        if (balance - amount < 10000) {
            System.out.println("Transaksi gagal, saldo tidak mencukupi.");
            return;
        }
        double cashback = calculateCashback(amount);
        balance = balance - amount + cashback;
        System.out.printf("%-15s: Rp%.2f\n", "Pembelian", amount);
        System.out.printf("%-15s: Rp%.2f\n", "Cashback", cashback);
        System.out.printf("%-15s: Rp%.2f\n", "Saldo Baru", balance);
    }

    private double calculateCashback(double amount) {
        String prefix = customerNumber.substring(0, 2);
        if (prefix.equals("38")) { // Silver
            return (amount > 1000000) ? amount * 0.05 : 0;
        } else if (prefix.equals("56")) { // Gold
            return (amount > 1000000) ? amount * 0.07 : amount * 0.02;
        } else if (prefix.equals("74")) { // Platinum
            return (amount > 1000000) ? amount * 0.10 : amount * 0.05;
        }
        return 0;
    }

    public void showInfo() {
        System.out.printf("%-15s: %s\n", "Nama", name);
        System.out.printf("%-15s: %s\n", "Nomor", customerNumber);
        System.out.printf("%-15s: Rp%.2f\n", "Saldo", balance);
        System.out.printf("%-15s: %s\n", "Status", blocked ? "Terblokir" : "Aktif");
    }
}

