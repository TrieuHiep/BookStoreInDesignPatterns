package bookpkg;

public class NovelBook extends  Book{
    private int totalChapter;

    public NovelBook() {
    }

    public NovelBook(String idBook, String bookName, Author author,
                     double price, Publisher publisher,
                     int totalChapter) {
        super(idBook, bookName, author, price, publisher);
        this.totalChapter = totalChapter;
    }

    public int getTotalChapter() {
        return totalChapter;
    }

    public void setTotalChapter(int totalChapter) {
        this.totalChapter = totalChapter;
    }
}
