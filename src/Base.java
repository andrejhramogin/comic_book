import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ComicBase implements Serializable {

    List<ComicBook> comicBook = new ArrayList<>();

    public ComicBase(List<ComicBook> list) {
        this.comicBook = list;
    }

    public List<ComicBook> getComicBook() {
        return this.comicBook;
    }
}
