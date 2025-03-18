import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o método de pagamento:");
        System.out.println("1 - Pix");
        System.out.println("2 - Cartão de Crédito");
        System.out.println("3 - Boleto");
        int option = scanner.nextInt();
        System.out.print("Digite o valor da transação: R$");
        double amount = scanner.nextDouble();
        PaymentStrategy paymentMethod = PaymentFactory.getPaymentMethod(option);
        PaymentProcessor processor = new PaymentProcessor();
        processor.process(paymentMethod, amount);
    }
}
