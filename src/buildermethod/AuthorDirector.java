package buildermethod;

public class AuthorDirector {
    public void construct(AuthorBuilder authorBuilder, String idAu, String name, String penName){
        authorBuilder.buildIdAu(idAu);
        authorBuilder.buildName(name);
        authorBuilder.buildPenName(penName);
    }
}
