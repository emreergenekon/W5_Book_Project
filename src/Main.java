import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", "1925");
        Book book2 = new Book("Moby Dick", 635, "Herman Melville", "1851");
        Book book3 = new Book("1984", 328, "George Orwell", "1949");
        Book book4 = new Book("To Kill a Mockingbird", 281, "Harper Lee", "1960");
        Book book5 = new Book("Pride and Prejudice", 279, "Jane Austen", "1813");

        // Set to store books sorted by name
        Set<Book> booksByName = new TreeSet<>();
        booksByName.add(book1);
        booksByName.add(book2);
        booksByName.add(book3);
        booksByName.add(book4);
        booksByName.add(book5);

        System.out.println("İsme göre sıralanmış kitaplar: ");
        System.out.println("-------------------------------");
        for (Book book : booksByName) {
            System.out.println(book);
        }

        // Comparator to sort books by page count
        Comparator<Book> pageCountComparator = new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return Integer.compare(b1.getPageCount(), b2.getPageCount());
            }
        };

        // Set to store books sorted by page count
        Set<Book> booksByPageCount = new TreeSet<>(pageCountComparator);
        booksByPageCount.addAll(booksByName);

        System.out.println("\nSayfa sayısına göre sıralanmış kitaplar:");
        System.out.println("------------------------------------------");
        for (Book book : booksByPageCount) {
            System.out.println(book);
        }
    }
}
