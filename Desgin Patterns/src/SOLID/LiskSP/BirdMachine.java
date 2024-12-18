package SOLID.LiskSP;

public class BirdMachine {
    public static void main(String[] args) {
        BirdMachine birdMachine = new BirdMachine();
        birdMachine.letBirdFly(new Penguin());
        birdMachine.letBirdFly(new Dove());
    }
    public void letBirdFly(Bird bird) {
        if(bird instanceof FlyAble){
            ((FlyAble) bird).fly();
        }else{
            System.out.println("This bird can't fly");
        }
    }
}
