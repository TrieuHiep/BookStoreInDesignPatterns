package buildermethod;

import bookpkg.Author;
import bookpkg.Publisher;

public abstract class BookBuilder {
    abstract public void buildId(int id);
    abstract public void buildName(String name);
    abstract public void buildAuthor(Author author);
    abstract public void buildPublisher(Publisher publisher);
    abstract public void buildPrice(double price);

}
