package buildermethod;

import bookpkg.Author;
import bookpkg.NovelBook;
import bookpkg.Publisher;

public class NovelBuilder extends BookBuilder{
    private NovelBook novel;

    @Override
    public void buildId(String id) {
        novel.setIdBook(id);
    }

    @Override
    public void buildName(String name) {
        novel.setBookName(name);
    }

    @Override
    public void buildAuthor(Author author) {
        novel.setAuthor(author);
    }

    @Override
    public void buildPublisher(Publisher publisher) {
        novel.setPublisher(publisher);
    }

    @Override
    public void buildPrice(double price) {
        novel.setPrice(price);
    }

    public void buildTotalChapter(int chapter){
        novel.setTotalChapter(chapter);
    }

    public NovelBook getNovel() {
        return novel;
    }
}
