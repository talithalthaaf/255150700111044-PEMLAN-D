package Modul2;

public class Rasional {
    int pembilang, penyebut;

    // Constructor default
    public Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    // Constructor berparameter
    public Rasional(int pbl, int pys) {
        pembilang = pbl;
        penyebut = pys;
    }

    // Mengecek apakah rasional valid
    public boolean isRasional() {
        return penyebut != 0;
    }

    // Menyederhanakan pecahan dengan for loop
    public void Sederhana() {
        if (penyebut != 0) {
            int A = (pembilang < penyebut) ? penyebut : pembilang;
            int B = (pembilang < penyebut) ? pembilang : penyebut;

            for (int temp = B; temp > 0; temp--) {
                if ((pembilang % temp == 0) && (penyebut % temp == 0)) {
                    pembilang /= temp;
                    penyebut /= temp;
                    break;
                }
            }
        }
    }

    // Cast ke double
    public double Cast() {
        if (penyebut == 0) return 0.0;
        return (double) pembilang / penyebut;
    }

    // Operator perbandingan
    public boolean moreThan(Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    public boolean lessThan(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }

    public boolean lessThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }

    public boolean greaterThanOrEqual(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }

    // Operator aritmatika
    public Rasional minus(Rasional A) {
        int pemb = (pembilang * A.penyebut) - (penyebut * A.pembilang);
        int peny = penyebut * A.penyebut;
        return new Rasional(pemb, peny);
    }

    public Rasional multiply(Rasional A) {
        int pemb = pembilang * A.pembilang;
        int peny = penyebut * A.penyebut;
        return new Rasional(pemb, peny);
    }

    public Rasional divide(Rasional A) {
        int pemb = pembilang * A.penyebut;
        int peny = penyebut * A.pembilang;
        return new Rasional(pemb, peny);
    }

    // Cetak pecahan
    public void cetak() {
        System.out.printf("%-15s: %d/%d%n", "Nilai Rasional", pembilang, penyebut);
    }
}

