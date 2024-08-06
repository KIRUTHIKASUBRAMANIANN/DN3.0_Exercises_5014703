public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Transferring " + amount + " to PayPal");
    }
}