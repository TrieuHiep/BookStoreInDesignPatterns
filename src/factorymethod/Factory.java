package factorymethod;

import model.itemspkg.bookpkg.Book;

public interface Factory {
    public abstract Book createBookObject(String typeBook);
}
