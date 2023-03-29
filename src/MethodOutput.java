import java.util.List;

public class MethodOutput {

    public static void printList(List<ComicBook> listCb) {
        if (listCb.isEmpty()) {
            System.out.println(UiMessage.EMPTY_LIST);
        } else {
            listCb.forEach(MethodOutput::printComic);
        }
    }

    public static void printComic(ComicBook cb) {

        System.out.println(
                UiMessage.TITLE + cb.getTitle() + UiMessageEnum.SEP.getStr() +
                        UiMessage.AUTHOR + cb.getAuthor() + UiMessageEnum.SEP.getStr() +
                        UiMessage.PUBLISHING_HOUSE + cb.getPublishingHouse() + UiMessageEnum.SEP.getStr() +
                        UiMessage.PAGES_NUMBER + cb.getPagesNumber() + UiMessageEnum.SEP.getStr() +
                        UiMessage.GENRE + cb.getGenre() + UiMessageEnum.SEP.getStr() +
                        UiMessage.YEAR_OF_PUBLICATION + cb.getYear() + UiMessageEnum.SEP.getStr() +
                        UiMessage.COST_PRICE + cb.getCostPrice() + UiMessageEnum.SEP.getStr() +
                        UiMessage.RETAIL_PRICE + cb.getRetailPrice() + UiMessageEnum.SEP.getStr() +
                        UiMessage.CONTINUATION + cb.getContinuation() + UiMessageEnum.SEP.getStr() +
                        UiMessageEnum.QUANTITY.getStr() + cb.getComicQuantity() + UiMessageEnum.SEP.getStr() +
                        UiMessage.SALES_VOLUME + cb.getNumberOfSales());
    }

    public static void printList1(List<ComicBookSale> listCbs) {
        if (listCbs.isEmpty()) {
            System.out.println(UiMessage.EMPTY_LIST);
        } else {
            listCbs.forEach(MethodOutput::printComicSales);
        }
    }

    //Выводит ComicBookSale (название, автор, жанр, продажи, дата продажи)
    public static void printComicSales(ComicBookSale cbs) {
        System.out.println(
                        UiMessage.TITLE + cbs.getTitle() + UiMessageEnum.SEP.getStr() +
                        UiMessage.AUTHOR + cbs.getAuthor() + UiMessageEnum.SEP.getStr() +
                        UiMessage.GENRE + cbs.getGenre() + UiMessageEnum.SEP.getStr() +
                        UiMessage.SALES_VOLUME + cbs.getSale() + UiMessageEnum.SEP.getStr() +
                        UiMessage.DATA + cbs.getDate());
    }

    //Выводит ComicBookSale в виде пары "жанр/продажи"
    public static void printComicSalesByGenre(ComicBookSale cbs) {
        System.out.println(
                        UiMessage.GENRE + cbs.getGenre() + UiMessageEnum.SEP.getStr() +
                        UiMessage.SALES_VOLUME + cbs.getSale() + UiMessageEnum.SEP.getStr());
    }
}
