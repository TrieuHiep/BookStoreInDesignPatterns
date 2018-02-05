import bookpkg.Book;
import factorymethod.BookFactoryImpl;
import factorymethod.Factory;

public class MainClass {
    public static void main(String[] args) {
        Factory factory = new BookFactoryImpl();
        Book bookObject = factory.createBookObject("novel");
    }
}
