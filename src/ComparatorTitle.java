import java.util.Comparator;

public class TitleComparator implements Comparator<ComicBook> {
    public int compare(ComicBook a, ComicBook b){
        return a.getTitle().compareTo(b.getTitle());
    }
}
