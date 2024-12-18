package SOLID.LiskSP;

public class Dove extends Bird implements FlyAble {
    @Override
    public void fly() {
        System.out.println("Dove is flying");
    }

    @Override
    public void eat() {
        System.out.println("Dove is eating");
    }
}
