package model.itemspkg.bookpkg;

import model.itemspkg.Product;
import model.itemspkg.bookpkg.Publisher;

public class Book extends Product {
    protected int idBook;
    protected String author;
    protected Publisher publisher;

    public Book() {
    }

    public Book(int idBook, String bookName, String author, Publisher publisher) {
        this.idBook = idBook;
        this.author = author;
        this.publisher = publisher;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
