package bookpkg;

public class Book {
    protected String idBook;
    protected String bookName;
    protected Author author;
    protected double price;
    protected Publisher publisher;

    public Book() {
    }

    public Book(String idBook, String bookName, Author author, double price, Publisher publisher) {
        this.idBook = idBook;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
