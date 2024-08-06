package com.library;

public class LibraryManagementDriver {
    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem(5);

        // Adding books
        lms.addBook(new Book("B001", "To Kill a Mockingbird", "Harper Lee"));
        lms.addBook(new Book("B002", "1984", "George Orwell"));
        lms.addBook(new Book("B003", "Moby Dick", "Herman Melville"));
        lms.addBook(new Book("B004", "The Great Gatsby", "F. Scott Fitzgerald"));
        lms.addBook(new Book("B005", "War and Peace", "Leo Tolstoy"));

        // Linear search
        System.out.println("\nSearching for '1984' using linear search:");
        Book book = lms.linearSearchByTitle("1984");
        if (book != null) {
            System.out.println("Book found: " + book);
        } else {
            System.out.println("Book not found");
        }

        // Binary search
        System.out.println("\nSearching for '1984' using binary search:");
        book = lms.binarySearchByTitle("1984");
        if (book != null) {
            System.out.println("Book found: " + book);
        } else {
            System.out.println("Book not found");
        }
    }
}
