package bookpkg;

public class Author {
    private String idAu;
    private String name;
    private String penName;

    public Author() {
    }

    public Author(String idAu, String name, String penName) {
        this.idAu = idAu;
        this.name = name;
        this.penName = penName;
    }

    public Author(String name, String penName) {
        this.name = name;
        this.penName = penName;
    }

    public String getIdAu() {
        return idAu;
    }

    public void setIdAu(String idAu) {
        this.idAu = idAu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }
}
