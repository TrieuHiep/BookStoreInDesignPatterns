package buildermethod.book;

import bookpkg.Author;
import bookpkg.Publisher;
import buildermethod.book.NovelBuilder;

public class NovelDirector {
    public void construct(NovelBuilder novelBuilder, String id, String name, Author au, Publisher pub, double price, int totalChapter){
        novelBuilder.buildId(id);
        novelBuilder.buildName(name);
        novelBuilder.buildAuthor(au);
        novelBuilder.buildPublisher(pub);
        novelBuilder.buildPrice(price);
        novelBuilder.buildTotalChapter(totalChapter);
    }
}