public class BoletoPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Pagamento via Boleto de R$" + amount + " realizado com sucesso.");
    }
}
