package factorymethod;

import bookpkg.Book;

public interface Factory{
    public abstract Book createBookObject(String typeBook);
}
