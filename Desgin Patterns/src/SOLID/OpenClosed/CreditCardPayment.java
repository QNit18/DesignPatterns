package SOLID.OpenClosed;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment of: $" + amount);
    }
}
