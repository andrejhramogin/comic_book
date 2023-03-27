import java.util.List;

/**
 * Метод находит комикс по названию, запрашивает число комиксов для продажи, уменьшает количество оставшихся комиксов,
 * вносит в поле продаж проданное число комиксов. Данные продаж суммируются с предыдущими.
 * Создает экземпляр ComicBookSale, получает из файла "comic2.bin" лист и добавляет в него данный экземрляр.
 * Отправляет лист на запись в файл.
 */
public class MethodSale {

    public static void sell(List<ComicBook> listCb, List<ComicBookSale> listCbs) {
        ComicBook cb = MethodSearch.selectComicByTitle(listCb);
        System.out.println(UiMessage.HOW_MANY);
        int quantity = MethodAddDelete.getInteger();
        MethodAddDelete.scanner.nextLine();

        if (quantity > cb.getComicQuantity()) {
            System.out.println(UiMessage.AVAILABLE_QUANTITY + "(" + cb.getComicQuantity() + ")");
            sell(listCb, listCbs);
        } else {
//            List<ComicBookSale> listCbs = ReadFile.readBaseSalesFromFile().getListComic();
            cb.setNumberOfSales(cb.getNumberOfSales() + quantity);
            cb.setComicQuantity(cb.getComicQuantity() - quantity);
            MethodOutput.printComic(cb);
            WriteFile.writeToFile(listCb, "comic.bin");
            ComicBookSale cbs = new ComicBookSale(cb.getTitle(), cb.getAuthor(), cb.getGenre(), quantity, ComicBookSale.setDate());
            listCbs.add(cbs);
            WriteFile.writeSalesToFile(listCbs);
        }
    }
}
