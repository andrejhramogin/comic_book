import java.util.List;

public class MethodPrintOutput {

    public static void printList(List<ComicBook> listCb) {
        if (listCb.isEmpty()) {
            System.out.println(UiMessage.EMPTY_LIST);
        } else {
            listCb.forEach(MethodPrintOutput::printComic);
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

    public static void printList1(List<ComicBookSale> listCb) {
        if (listCb.isEmpty()) {
            System.out.println(UiMessage.EMPTY_LIST);
        } else {
            listCb.forEach(MethodPrintOutput::printComicSales);
        }
    }

    public static void printComicSales(ComicBookSale cb){
        System.out.println(
                        UiMessage.TITLE + cb.getTitle() + UiMessage.SEP +
                        UiMessage.AUTHOR + cb.getAuthor() + UiMessage.SEP +
                        UiMessage.GENRE + cb.getGenre() + UiMessage.SEP +
                        UiMessage.SALES_VOLUME + cb.getSale() + UiMessage.SEP +
                        UiMessage.DATA + cb.getDate());
    }
}
