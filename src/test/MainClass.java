package test;

import bookpkg.Book;
import factorymethod.BookFactory;
import factorymethod.Factory;

public class MainClass {
    public static void main(String[] args) {
        Factory factory = new BookFactory();
        Book book  = factory.createBookObject("novel");
        System.out.println(book);
    }
}
