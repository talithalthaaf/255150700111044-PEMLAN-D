package Modul5;

public class Vehicle1 {
    private double load;
    private static final double maxLoad = 10000; // variabel maxLoad dijadikan static

    public Vehicle1() {
        this.load = 0;
    }

    public double getLoad() {
        return this.load;
    }

    public double getMaxLoad() {
        return maxLoad; // akses langsung ke variabel static
    }

    public boolean addBox(double weight) {
        double temp = this.load + weight;
        if (temp <= maxLoad) {
            this.load = temp;
            return true;
        } else {
            return false;
        }
    }
}
