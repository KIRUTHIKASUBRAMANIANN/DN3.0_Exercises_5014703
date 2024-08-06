public class Main {
    public static void main(String[] args) {
        
        PaymentStrategy creditCard = new CreditCardPayment();


        PaymentStrategy paypal = new PayPalPayment();


        PaymentContext creditCardContext = new PaymentContext(creditCard);
        PaymentContext paypalContext = new PaymentContext(paypal);

       
        creditCardContext.makePayment(100.00);
        paypalContext.makePayment(50.00);
    }
}