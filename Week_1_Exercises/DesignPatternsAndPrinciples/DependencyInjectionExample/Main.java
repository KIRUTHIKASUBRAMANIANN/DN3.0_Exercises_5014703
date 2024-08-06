public class Main {
    public static void main(String[] args) {
        // Create a customer repository implementation
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Create a customer service with the repository
        CustomerService service = new CustomerService(repository);

        // Use the service to find a customer
        service.findCustomer(1);
    }
}