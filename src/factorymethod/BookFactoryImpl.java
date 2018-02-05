package factorymethod;

import bookpkg.Book;
import bookpkg.NovelBook;
import bookpkg.TechniqueBook;

public class BookFactoryImpl implements Factory {
    @Override
    public Book createBookObject(String typeBook) {
        switch (typeBook) {
            case "technique": {
                return new TechniqueBook();
            }
            case "novel": {
                return new NovelBook();
            }
        }
        return null;
    }
}
