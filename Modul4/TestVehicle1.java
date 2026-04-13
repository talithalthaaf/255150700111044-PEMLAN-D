package Modul4;

public class TestVehicle1 {
    public static void main(String[] args) {
        Vehicle1 vehicle = new Vehicle1(10000);

        System.out.println("Add box #1 (500kg): " + vehicle.addBox(500));

        // tambahan sesuai soal
        System.out.println("Add load(100kg) : " + (vehicle.load = 500));

        System.out.println("Vehicle load is " + vehicle.load + "kg");
    }
}






