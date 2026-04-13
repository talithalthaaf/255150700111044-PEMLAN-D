package Modul4;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Enkapsulasi");
        s1.setMark(90);

        System.out.println("s1Name is " + s1.getName());
        System.out.println("s1Mark is " + s1.getMark());
    }
}

