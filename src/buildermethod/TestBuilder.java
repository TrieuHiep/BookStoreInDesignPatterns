package buildermethod;

import bookpkg.Author;
import bookpkg.Publisher;

public class TestBuilder {
    public static void main(String[] args) {
        /*Create a foreign author*/
        AuthorDirector authorDirector = new AuthorDirector();
        ForeignAuthorBuilder authorBuilder = new ForeignAuthorBuilder();
        authorDirector.construct(authorBuilder, "Au01","Fujiko F.Fujio","Fujiko F.Fujio");
        Author au = authorBuilder.getAu();

        /*Create a northern publisher*/
        PublisherDirector publisherDirector = new PublisherDirector();
        NorthernPublisherBuilder northernPub = new NorthernPublisherBuilder();
        publisherDirector.construct(northernPub, "Pub01", "Kim Dong");
        Publisher pub = northernPub.getPub();

        /*Create a novel book*/
        NovelDirector novelDirector = new NovelDirector();
        NovelBuilder novelBuilder = new NovelBuilder();
        novelDirector.construct(novelBuilder, "Nov01", "Doraemon", au, pub, 69, 24);

    }
}
