import java.util.*;


/**
 * Сортирует лист ComicBook по выбору: по названию, по общему объему продаж (популярности).
 * Выводит на консоль отсортированный лист.
 */
public class MethodSort {

    public static void sort(List<ComicBook> list) {
        System.out.println("To sort by title - press t\nTo sort by popularity - press p");
        String choice = MethodAddDelete.getString();
        switch (choice) {
            case "t":
                sortSaleByTitle(list);
                break;
            case "p":
                sortAllSale(list);
                break;
            default:
                sort(list);
        }
    }

    public static void sortSaleByTitle(List<ComicBook> list) {
        list.stream()
                .sorted(new ComparatorTitle())
                .forEach(MethodOutput::printComic);
    }

    public static void sortAllSale(List<ComicBook> list) {
        list.stream()
                .sorted(new ComparatorSaleCb())
                .forEach(MethodOutput::printComic);
    }

    public static void sortSaleComicBookSale(List<ComicBookSale>list){
        list.stream()
                .sorted(new ComparatorSaleCbs())
                .forEach(MethodOutput::printComicSalesByGenre);
    }

    public static void sortBySalesData(List<ComicBookSale> list) {
        list.stream()
                .sorted(new ComparatorData())
                .forEach(MethodOutput::printComicSales);
    }

    public static void sortSalesByGenre(List<ComicBookSale> list) {

        List<ComicBookSale> cbs = new ArrayList<>();
        Collections.addAll(cbs, new ComicBookSale(UiMessage.CHILDREN, 0),
                new ComicBookSale(UiMessage.DETECTIVE, 0),
                new ComicBookSale(UiMessage.FANTASY, 0),
                new ComicBookSale(UiMessage.ACTION, 0),
                new ComicBookSale(UiMessage.SCIENCE_FICTION, 0),
                new ComicBookSale(UiMessage.THRILLER, 0),
                new ComicBookSale(UiMessage.ROMANTIC, 0));

        for (ComicBookSale icb : list) {
            for (ComicBookSale jcb : cbs) {
                if (icb.getGenre().equals(jcb.getGenre())) {
                    jcb.setSale(jcb.getSale() + icb.getSale());
                    break;
                }
            }
        }
        sortSaleComicBookSale(cbs);
    }
}
