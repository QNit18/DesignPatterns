package SOLID.LiskSP;

public class ErrorExample {
    // Base class
    class Bird {
        public void fly() {
            System.out.println("Flying...");
        }
    }

    // Subclass that can fly
    class Sparrow extends Bird {
        @Override
        public void fly() {
            System.out.println("Sparrow flying...");
        }
    }

    // Subclass that cannot fly
    class Penguin extends Bird {
        @Override
        public void fly() {
            throw new UnsupportedOperationException("Penguins can't fly");
        }
    }

    // Some client code using the Bird class
    class BirdFeeder {
        public void letBirdFly(Bird bird) {
            bird.fly();  // This works fine for Sparrows, but throws an exception for Penguins
        }
    }

}
