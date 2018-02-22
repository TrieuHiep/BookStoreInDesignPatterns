package buildermethod.book;

import bookpkg.Author;

public class ForeignAuthorBuilder extends AuthorBuilder{
    private Author au;

    @Override
    public void buildIdAu(String idAu) {
        au.setIdAu(idAu);
    }

    @Override
    public void buildName(String name) {
        au.setName(name);
    }

    @Override
    public void buildPenName(String penName) {
        au.setPenName(penName);
    }


    public Author getAu() {
        return au;
    }
}
