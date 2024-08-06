public class CustomerRepositoryImpl implements CustomerRepository {
    public Customer findCustomerById(int id) {
        
        return new Customer("John Doe", id, "123 Main St");
    }
}