package buildermethod;

import bookpkg.Publisher;

public class NorthernPublisherBuilder extends PublisherBuilder{
    private Publisher pub;
    @Override
    public void buildIdPub(String idPub) {
        pub.setIdPublisher(idPub);
    }

    @Override
    public void buildName(String name) {
        pub.setPublisherName(name);
    }

    public Publisher getPub() {
        return pub;
    }
}
