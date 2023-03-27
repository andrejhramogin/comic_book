import java.util.List;

public class MethodSortByTitle {
    public static void sortByTitle(List<ComicBook> list){
        list.stream()
                .sorted(new ComparatorTitle())
                .forEach(MethodPrintOutput::printComic);
    }
}
