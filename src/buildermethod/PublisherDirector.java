package buildermethod;

public class PublisherDirector {
    public void construct(PublisherBuilder publisherBuilder, String idPub, String name){
        publisherBuilder.buildIdPub(idPub);
        publisherBuilder.buildName(name);
    }
}
