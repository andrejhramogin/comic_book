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

    //Выводит List<ComicBook>, отсортированный по названию в алфавитном порядке.
    public static void sortSaleByTitle(List<ComicBook> list) {
        list.stream()
                .sorted(new ComparatorTitle())
                .forEach(MethodOutput::printComic);
    }

    //Выволит List<ComicBook>, отсортированный по объему продаж в порядке убывания.
    public static void sortAllSale(List<ComicBook> list) {
        list.stream()
                .sorted(new ComparatorSaleCb())
                .forEach(MethodOutput::printComic);
    }

    //Выводит List<ComicBookSale>, отсортированный по продажам по жанру по убыванию
    public static void sortSaleComicBookSaleByGenre(List<ComicBookSale>list){
        list.stream()
                .sorted(new ComparatorSaleCbs())
                .forEach(MethodOutput::printComicSalesByGenre);
    }

    //Выводит List<ComicBookSale> отсортированный по дате продажи по возрастанию.
    public static void sortBySalesData(List<ComicBookSale> list) {
        list.stream()
                .sorted(new ComparatorData())
                .forEach(MethodOutput::printComicSales);
    }


    //формирует List<ComicBookSale> по паре "жанр/продажи".
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
        sortSaleComicBookSaleByGenre(cbs);
    }

    public static void sortByAuthor(List<ComicBookSale>list){

    }

}
