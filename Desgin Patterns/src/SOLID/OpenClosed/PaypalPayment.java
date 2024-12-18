package SOLID.OpenClosed;

public class PaypalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal payment of: $" + amount);
    }
}
