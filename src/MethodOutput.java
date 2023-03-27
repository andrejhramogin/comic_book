import java.util.List;

public class MethodOutput {

    public static void printList(List<ComicBook> listCb) {
        if (listCb.isEmpty()) {
            System.out.println(UiMessage.EMPTY_LIST);
        } else {
            listCb.forEach(MethodOutput::printComic);
        }
    }

    public static void printComic(ComicBook cb){

        System.out.println(
                        UiMessage.TITLE + cb.getTitle() + UiMessage.SEP +
                        UiMessage.AUTHOR + cb.getAuthor() + UiMessage.SEP +
                        UiMessage.PUBLISHING_HOUSE + cb.getPublishingHouse() + UiMessage.SEP +
                        UiMessage.PAGES_NUMBER + cb.getPagesNumber() + UiMessage.SEP +
                        UiMessage.GENRE + cb.getGenre() + UiMessage.SEP +
                        UiMessage.YEAR_OF_PUBLICATION + cb.getYear() + UiMessage.SEP +
                        UiMessage.COST_PRICE + cb.getCostPrice() + UiMessage.SEP +
                        UiMessage.RETAIL_PRICE + cb.getRetailPrice() + UiMessage.SEP +
                        UiMessage.CONTINUATION + cb.getContinuation() + UiMessage.SEP +
                        UiMessage.QUANTITY + cb.getComicQuantity() + UiMessage.SEP +
                        UiMessage.SALES_VOLUME + cb.getNumberOfSales());
    }

    public static void printList1(List<ComicBookSale> listCbs) {
        if (listCbs.isEmpty()) {
            System.out.println(UiMessage.EMPTY_LIST);
        } else {
            listCbs.forEach(MethodOutput::printComicSales);
        }
    }

    public static void printComicSales(ComicBookSale cbs){
        System.out.println(
                        UiMessage.TITLE + cbs.getTitle() + UiMessage.SEP +
                        UiMessage.AUTHOR + cbs.getAuthor() + UiMessage.SEP +
                        UiMessage.GENRE + cbs.getGenre() + UiMessage.SEP +
                        UiMessage.SALES_VOLUME + cbs.getSale() + UiMessage.SEP +
                        UiMessage.DATA + cbs.getDate());
    }
}
