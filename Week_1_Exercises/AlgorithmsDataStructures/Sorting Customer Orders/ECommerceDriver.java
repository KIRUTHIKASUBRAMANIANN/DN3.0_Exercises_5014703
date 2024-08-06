package com.ecommerce;

import java.util.Arrays;

public class ECommerceDriver {
    public static void main(String[] args) {
        // Create an array of orders
        Order[] orders = {
            new Order("O001", "Alice", 250.0),
            new Order("O002", "Bob", 150.0),
            new Order("O003", "Charlie", 300.0),
            new Order("O004", "David", 100.0),
            new Order("O005", "Eve", 200.0)
        };

        // Print original orders
        System.out.println("Original Orders:");
        printOrders(orders);

        // Sort orders using Bubble Sort
        Sort.bubbleSort(orders);
        System.out.println("\nOrders after Bubble Sort:");
        printOrders(orders);

        // Shuffle orders to demonstrate Quick Sort
        shuffleArray(orders);

        // Sort orders using Quick Sort
        Sort.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders after Quick Sort:");
        printOrders(orders);
    }

    // Method to print orders
    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    // Method to shuffle the array
    private static void shuffleArray(Order[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = (int)(Math.random() * (i + 1));
            Order temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
