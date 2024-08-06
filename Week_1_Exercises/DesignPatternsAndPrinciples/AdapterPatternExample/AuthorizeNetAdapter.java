public class AuthorizeNetAdapter implements PaymentProcessor {
    private AuthorizeNetGateway authorizeNetGateway;

    public AuthorizeNetAdapter(AuthorizeNetGateway authorizeNetGateway) {
        this.authorizeNetGateway = authorizeNetGateway;
    }

    @Override
    public void processPayment(String paymentMethod, double amount) {
        authorizeNetGateway.authorize(paymentMethod, amount);
    }
}