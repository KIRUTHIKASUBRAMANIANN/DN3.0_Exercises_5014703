public class Main {
    public static void main(String[] args) {
        
        PayPalAdapter paypalAdapter = new PayPalAdapter(new PayPalGateway());
        StripeAdapter stripeAdapter = new StripeAdapter(new StripeGateway());
        AuthorizeNetAdapter authorizeNetAdapter = new AuthorizeNetAdapter(new AuthorizeNetGateway());

        
        paypalAdapter.processPayment("credit card", 100.0);
        stripeAdapter.processPayment("credit card", 200.0);
        authorizeNetAdapter.processPayment("credit card", 300.0);
    }
}