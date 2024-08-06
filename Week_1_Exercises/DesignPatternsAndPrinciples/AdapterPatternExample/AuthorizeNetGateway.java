public class AuthorizeNetGateway {
    public void authorize(String paymentMethod, double amount) {
        System.out.println("Authorize.net: Authorizing " + amount + " using " + paymentMethod);
    }
}