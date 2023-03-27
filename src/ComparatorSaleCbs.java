import java.util.Comparator;

public class ComparatorSaleCbs implements Comparator<ComicBookSale> {
    public int compare(ComicBookSale a, ComicBookSale b){
        return Integer.compare(b.getSale(), a.getSale());
    }
}
