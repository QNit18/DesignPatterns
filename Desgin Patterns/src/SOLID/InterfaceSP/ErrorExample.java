package SOLID.InterfaceSP;

public class ErrorExample {

    // In this example, RobotWorker violates the ISP because it is forced to implement methods (eat() and sleep())
    // that are irrelevant to its functionality, leading to unnecessary exceptions.

    // Violating ISP: Large, general-purpose interface
    interface Worker {
        void work();
        void eat();
        void sleep();
    }

    // Human worker that implements all methods
    class HumanWorker implements Worker {
        @Override
        public void work() {
            System.out.println("Working...");
        }

        @Override
        public void eat() {
            System.out.println("Eating...");
        }

        @Override
        public void sleep() {
            System.out.println("Sleeping...");
        }
    }

    // Robot worker forced to implement unnecessary methods
    class RobotWorker implements Worker {
        @Override
        public void work() {
            System.out.println("Working...");
        }

        @Override
        public void eat() {
            throw new UnsupportedOperationException("Robots don't eat.");
        }

        @Override
        public void sleep() {
            throw new UnsupportedOperationException("Robots don't sleep.");
        }
    }

}
