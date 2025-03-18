public class PaymentProcessor {
    public void process(PaymentStrategy strategy, double amount) {
        strategy.processPayment(amount);
    }
}
