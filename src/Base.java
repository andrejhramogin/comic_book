import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Base implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<ComicBook> listComic = new ArrayList<>();

    public Base() {
    }

    public Base(List<ComicBook> lcb) {
        this.listComic = lcb;
    }

    public List<ComicBook> getListComic() {
        return this.listComic;
    }
}
