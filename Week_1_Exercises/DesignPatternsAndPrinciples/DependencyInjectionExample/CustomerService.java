public class CustomerService {
    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void findCustomer(int id) {
        Customer customer = repository.findCustomerById(id);
        System.out.println("Found customer: " + customer.getName());
    }
}