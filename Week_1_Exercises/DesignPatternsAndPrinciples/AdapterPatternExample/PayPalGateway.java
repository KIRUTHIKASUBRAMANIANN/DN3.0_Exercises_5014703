public class PayPalGateway {
    public void pay(String paymentMethod, double amount) {
        System.out.println("PayPal: Processing payment of " + amount + " using " + paymentMethod);
    }
}