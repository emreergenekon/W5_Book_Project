public class Book implements Comparable<Book> {
    private String name;
    private int pageCount;
    private String author;
    private String publicationDate;

    // Constructor
    public Book(String name, int pageCount, String author, String publicationDate) {
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    // compareTo method to compare books by name
    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);
    }

    // toString method to display book information
    @Override
    public String toString() {
        return "Book{name='" + name + "', pageCount=" + pageCount + ", author='" + author + "', publicationDate='" + publicationDate + "'}";
    }
}
