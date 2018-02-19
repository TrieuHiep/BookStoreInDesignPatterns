package factorymethod;

import model.bookpkg.Book;

public interface Factory {
    public abstract Book createBookObject(String typeBook);
}
