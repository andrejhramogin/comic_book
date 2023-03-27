import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BaseSales implements Serializable {
    private List<ComicBookSale> listComic = new ArrayList<>();

    public BaseSales() {
    }

    public BaseSales(List<ComicBookSale> lcb) {
        this.listComic = lcb;
    }

    public List<ComicBookSale> getListComic() {
        return this.listComic;
    }
}
