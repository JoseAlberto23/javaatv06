public class PaymentFactory {
    public static PaymentStrategy getPaymentMethod(int option) {
        return switch (option) {
            case 1 -> new PixPayment();
            case 2 -> new CreditCardPayment();
            case 3 -> new BoletoPayment();
            default -> throw new IllegalArgumentException("Opção de pagamento inválida.");
        };
    }
}
