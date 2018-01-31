package factorymethod;

import bookpkg.Book;
import bookpkg.NovelBook;
import bookpkg.TechniqueBook;

public class BookFactory implements Factory {
    @Override
    public Book createBookObject(String typeBook) {
        if (typeBook.equals("Novel")) {
            return new NovelBook();
        } else if (typeBook.equals("Technique")) {
            return new TechniqueBook();
        }
        return null;
    }
}
