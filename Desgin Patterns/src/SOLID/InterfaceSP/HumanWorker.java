package SOLID.InterfaceSP;

public class HumanWorker implements Workable, Sleepable{
    @Override
    public void sleep() {
        System.out.println("Human is sleeping");
    }

    @Override
    public void work() {
        System.out.println("Human is working");
    }
}
