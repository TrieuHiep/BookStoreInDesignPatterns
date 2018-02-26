package factorymethod;

import model.itemspkg.bookpkg.Book;
import model.itemspkg.bookpkg.NovelBook;
import model.itemspkg.bookpkg.TechniqueBook;

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
