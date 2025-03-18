public class PixPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Pagamento via Pix de R$" + amount + " realizado com sucesso.");
    }
}
