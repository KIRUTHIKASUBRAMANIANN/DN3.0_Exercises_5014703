
public class InventoryDriver {
    public static void main(String[] args) {
        // Create an inventory instance
        Inventory inventory = new Inventory();

        // Create some product instances
        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        Product product2 = new Product("P002", "Smartphone", 20, 499.99);
        Product product3 = new Product("P003", "Tablet", 15, 299.99);

        // Add products to the inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Print all products in the inventory
        System.out.println("Inventory after adding products:");
        printInventory(inventory);

        // Update a product
        Product updatedProduct = new Product("P002", "Smartphone", 25, 479.99);
        inventory.updateProduct(updatedProduct);

        // Print all products after update
        System.out.println("\nInventory after updating product P002:");
        printInventory(inventory);

        // Delete a product
        inventory.deleteProduct("P003");

        // Print all products after deletion
        System.out.println("\nInventory after deleting product P003:");
        printInventory(inventory);
    }

    // Method to print all products in the inventory
    private static void printInventory(Inventory inventory) {
        for (Product product : inventory.getProducts().values()) {
            System.out.println("Product ID: " + product.getProductId() +
                    ", Name: " + product.getProductName() +
                    ", Quantity: " + product.getQuantity() +
                    ", Price: $" + product.getPrice());
        }
    }
}
