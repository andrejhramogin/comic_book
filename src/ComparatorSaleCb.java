import java.util.Comparator;

public class ComparatorSaleCb implements Comparator<ComicBook> {
    public int compare(ComicBook a, ComicBook b){
        return Integer.compare(b.getNumberOfSales(), a.getNumberOfSales());
    }
}
