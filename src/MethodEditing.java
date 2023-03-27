import java.util.List;

public class Editing {
    /**
     * Редактирование данных комиксов. Находит комиксы по названию и запускает метод редактирования по очереди для
     * каждого найденного комикса. Выводит комискс до редактирования.
     */
    public static void selectComicAndEdit(List<ComicBook> listCb) {

        Method.scanner.nextLine();
        System.out.println(UiMessage.TITLE);
        String title = Method.getString().toLowerCase();

        for (ComicBook cb : listCb) {
            if (cb.getTitle().toLowerCase().contains(title)) {
                PrintOutput.printComic(cb);
                selectDataAndEdit(cb);
            }
        }
        WriteFile.writeToFile(listCb);
    }

    /**
     * Выбор поля для редактирования и ввод новых данных. Можно редактиовать любые поля в любом порядке до команды
     * выхода. После изменения каждого поля выводит комикс на экран.
     */
    public static void selectDataAndEdit( ComicBook cb) {
        System.out.println(UiMessage.EDITING);
        String choice = Method.getString();
        switch (choice) {
            case "t":
                System.out.println(UiMessage.TITLE);
                cb.setTitle(Method.getString());
                break;
            case "a":
                System.out.println(UiMessage.AUTHOR);
                cb.setAuthor(Method.getString());
                break;
            case "p":
                System.out.println(UiMessage.PUBLISHING_HOUSE);
                cb.setPublishingHouse(Method.getString());
                break;
            case "n":
                System.out.println(UiMessage.PAGES_NUMBER);
                cb.setPagesNumber(Method.getInteger());
                break;
            case "q":
                System.out.println(UiMessage.QUANTITY);
                cb.setComicQuantity(Method.getInteger());
                break;
            case "g":
                System.out.println(UiMessage.GENRE_CHOICE);
                cb.setGenre(Method.getString());
                break;
            case "y":
                System.out.println(UiMessage.YEAR_OF_PUBLICATION);
                cb.setYear(Method.getInteger());
                break;
            case "cp":
                System.out.println(UiMessage.COST_PRICE);
                cb.setCostPrice(Method.getDouble());
                break;
            case "r":
                System.out.println(UiMessage.RETAIL_PRICE);
                cb.setRetailPrice(Method.getDouble());
                break;
            case "c":
                System.out.println(UiMessage.CONTINUATION);
                cb.setContinuation(Method.getString());
                break;
            case "qq":
                return;
            default:
                selectDataAndEdit(cb);
        }
        PrintOutput.printComic(cb);
        selectDataAndEdit(cb);
    }
}