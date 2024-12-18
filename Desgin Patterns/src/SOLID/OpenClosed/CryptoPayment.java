package SOLID.OpenClosed;

public class CryptoPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Crypto payment of: $" + amount);
    }
}
