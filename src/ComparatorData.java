import java.util.Comparator;

public class ComparatorData implements Comparator<ComicBookSale> {

    public int compare (ComicBookSale a, ComicBookSale b){
        return a.getDate().compareTo(b.getDate());
    }
}
