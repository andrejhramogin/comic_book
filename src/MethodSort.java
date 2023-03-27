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
        Collections.addAll(cbs, new ComicBookSale("children`s stories", 0),
                new ComicBookSale("detective", 0),
                new ComicBookSale("fantasy", 0),
                new ComicBookSale("action", 0),
                new ComicBookSale("science fiction", 0),
                new ComicBookSale("thriller", 0),
                new ComicBookSale("romantic", 0));

        for (int i = 0; i < list.size(); i++) {
            ComicBookSale icb = list.get(i);

            for (int j = 0; j < cbs.size(); j++) {
                ComicBookSale jcb = cbs.get(j);

                if (icb.getGenre().equals(jcb.getGenre())) {
                    jcb.setSale(jcb.getSale() + icb.getSale());
                    break;
                }
            }
        }
        sortSaleComicBookSale(cbs);
    }
}
