import java.util.List;

public class MethodEditing {
    /**
     * Редактирование данных комиксов. Находит комиксы по названию и запускает метод редактирования по очереди для
     * каждого найденного комикса. Выводит комискс до редактирования.
     */
    public static void selectComicAndEdit(List<ComicBook> listCb) {

        MethodAddDelete.scanner.nextLine();
        System.out.println(UiMessage.TITLE);
        String title = MethodAddDelete.getString().toLowerCase();

        for (ComicBook cb : listCb) {
            if (cb.getTitle().toLowerCase().contains(title)) {
                MethodOutput.printComic(cb);
                selectDataAndEdit(cb);
            }
        }
        WriteFile.writeToFile(listCb, "comic.bin" );
    }

    /**
     * Метод принимает лист комиксов, идет поиск по названию (строгое соответсвие названия), находит один комикс,
     * затем редактируются поля. Записывает отредактированный лист в файл.
     */
    public static void edit(List<ComicBook> listCb) {
        selectDataAndEdit(MethodSearch.selectComicByTitle(listCb));
        WriteFile.writeToFile(listCb, "comic.bin");
    }

    /**
     * Выбор поля для редактирования и ввод новых данных. Можно редактиовать любые поля в любом порядке до команды
     * выхода. После изменения каждого поля выводит комикс на экран.
     */
    public static void selectDataAndEdit(ComicBook cb) {
        System.out.println(UiMessage.EDITING);
        String choice = MethodAddDelete.getString();
        switch (choice) {
            case "t":
                System.out.println(UiMessage.TITLE);
                cb.setTitle(MethodAddDelete.getString());
                break;
            case "a":
                System.out.println(UiMessage.AUTHOR);
                cb.setAuthor(MethodAddDelete.getString());
                break;
            case "p":
                System.out.println(UiMessage.PUBLISHING_HOUSE);
                cb.setPublishingHouse(MethodAddDelete.getString());
                break;
            case "n":
                System.out.println(UiMessage.PAGES_NUMBER);
                cb.setPagesNumber(MethodAddDelete.getInteger());
                break;
            case "q":
                System.out.println(UiMessage.QUANTITY);
                cb.setComicQuantity(MethodAddDelete.getInteger());
                break;
            case "g":
                System.out.println(UiMessage.GENRE_CHOICE);
                cb.setGenre(MethodAddDelete.getString());
                break;
            case "y":
                System.out.println(UiMessage.YEAR_OF_PUBLICATION);
                cb.setYear(MethodAddDelete.getInteger());
                break;
            case "cp":
                System.out.println(UiMessage.COST_PRICE);
                cb.setCostPrice(MethodAddDelete.getDouble());
                break;
            case "r":
                System.out.println(UiMessage.RETAIL_PRICE);
                cb.setRetailPrice(MethodAddDelete.getDouble());
                break;
            case "c":
                System.out.println(UiMessage.CONTINUATION);
                cb.setContinuation(MethodAddDelete.getString());
                break;
            case "qq":
                return;
        }
        MethodOutput.printComic(cb);
        selectDataAndEdit(cb);
    }
}