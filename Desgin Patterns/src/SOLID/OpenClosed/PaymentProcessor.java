package SOLID.OpenClosed;

public class PaymentProcessor {
    public static void main(String[] args) {
        processPayment(new CryptoPayment(), 100);
        processPayment(new PaypalPayment(), 200);
    }

    public static void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}
