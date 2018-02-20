package buildermethod;

import bookpkg.Author;
import bookpkg.Publisher;

public class TestBuilder {
    public static void main(String[] args) {
        AuthorDirector authorDirector = new AuthorDirector();
        ForeignAuthorBuilder authorBuilder = new ForeignAuthorBuilder();
        authorDirector.construct(authorBuilder, "Au01","Fujiko F.Fujio","Fujiko F.Fujio");
        Author au = authorBuilder.getAu();

        PublisherDirector publisherDirector = new PublisherDirector();
        NorthernPublisherBuilder northernPub = new NorthernPublisherBuilder();
        publisherDirector.construct(northernPub, "Pub01", "Kim Dong");
        Publisher pub = northernPub.getPub();


    }
}
