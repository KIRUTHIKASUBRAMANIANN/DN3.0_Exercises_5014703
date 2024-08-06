public class StripeGateway {
    public void charge(String paymentMethod, double amount) {
        System.out.println("Stripe: Charging " + amount + " using " + paymentMethod);
    }
}