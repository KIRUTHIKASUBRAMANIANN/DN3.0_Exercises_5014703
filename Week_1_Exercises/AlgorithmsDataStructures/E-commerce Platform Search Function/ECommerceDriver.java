package com.ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class ECommerceDriver {
    public static void main(String[] args) {
        // Create an array of products
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Tablet", "Electronics"),
            new Product("P004", "Headphones", "Accessories"),
            new Product("P005", "Monitor", "Electronics")
        };

        // Linear search
        System.out.println("Linear Search:");
        Product foundProduct = Search.linearSearch(products, "P003");
        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct.getProductName());
        } else {
            System.out.println("Product not found");
        }

        // Sort the products array by productId for binary search
        Arrays.sort(products, Comparator.comparing(Product::getProductId));

        // Binary search
        System.out.println("\nBinary Search:");
        foundProduct = Search.binarySearch(products, "P003");
        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct.getProductName());
        } else {
            System.out.println("Product not found");
        }
    }
}
