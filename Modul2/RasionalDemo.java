package Modul2;

public class RasionalDemo {
    public static void main(String[] args) {
        Rasional R1 = new Rasional(1, 2); // 1/2
        Rasional R2 = new Rasional(1, 3); // 1/3

        System.out.printf("%-15s: ", "R1");
        R1.cetak();
        System.out.printf("%-15s: ", "R2");
        R2.cetak();

        System.out.printf("%-15s: %b%n", "R1 rasional?", R1.isRasional());
        System.out.printf("%-15s: %b%n", "R2 rasional?", R2.isRasional());

        System.out.printf("%-15s: %b%n", "R1 < R2", R1.lessThan(R2));
        System.out.printf("%-15s: %b%n", "R1 <= R2", R1.lessThanOrEqual(R2));
        System.out.printf("%-15s: %b%n", "R1 >= R2", R1.greaterThanOrEqual(R2));
        System.out.printf("%-15s: %b%n", "R1 > R2", R1.moreThan(R2));

        Rasional hasilMinus = R1.minus(R2);
        Rasional hasilKali = R1.multiply(R2);
        Rasional hasilBagi = R1.divide(R2);

        System.out.printf("%-15s: ", "R1 - R2");
        hasilMinus.cetak();
        System.out.printf("%-15s: ", "R1 * R2");
        hasilKali.cetak();
        System.out.printf("%-15s: ", "R1 / R2");
        hasilBagi.cetak();
    }
}

