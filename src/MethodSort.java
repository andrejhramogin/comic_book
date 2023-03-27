import java.util.List;


/**
 * Сортирует лист ComicBook по выбору: по названию, по общему объему продаж (популярности).
 * Выводит на консоль отсортированный лист.
 */
public class MethodSort {

    public static void sort(List<ComicBook> list){
        System.out.println("To sort by title - press t\nTo sort by popularity - press p");
        String choice = MethodAddDelete.getString();
        switch (choice){
            case "t":
                sortByTitle(list);
                break;
            case "p":
                sortBySale(list);
                break;
            default:  sort(list);
        }
    }

    public static void sortByTitle(List<ComicBook> list){
        list.stream()
                .sorted(new ComparatorTitle())
                .forEach(MethodOutput::printComic);
    }

    public static void sortBySale(List<ComicBook> list){
        list.stream()
                .sorted(new ComparatorSale())
                .forEach(MethodOutput::printComic);
    }

    public static void sortBySalesData(List<ComicBookSale> list){
        list.stream()
                .sorted(new ComparatorData())
                .forEach(MethodOutput::printComicSales);
    }
}
