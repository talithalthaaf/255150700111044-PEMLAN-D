package Modul4;

public class Vehicle1 {
    double load, maxLoad; // default access (package-private)

    public Vehicle1(double max) {
        this.maxLoad = max;
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








