import java.util.ArrayList;
import java.util.List;


/**
 * Осуществляет поиск комиксов по названию, автору или жанру. Формирует и выводит список по результату поиска.
 * Осуществляет поиск и по полному названию и по фрагменту.
 */
public class Search {
    public static void find(List<ComicBook> listCb) {
        System.out.println(UiMessage.SEARCH_MENU);
        int choice = Method.getInteger();
        Method.scanner.nextLine();
        switch (choice) {
            case 1:
                PrintOutput.printList(findByTitle(listCb));
                break;
            case 2:
                PrintOutput.printList(findByAuthor(listCb));
                break;
            case 3:
                PrintOutput.printList(findByGenre(listCb));
        }
    }


    public static List<ComicBook> findByTitle(List<ComicBook> listCb) {
        List<ComicBook> list = new ArrayList<>();
        System.out.println(UiMessage.TITLE);
        String title = Method.getString().toLowerCase();
        for (ComicBook cb : listCb) {
            if (cb.getTitle().toLowerCase().contains(title))
                list.add(cb);
        }
        return list;
    }

    public static List<ComicBook> findByAuthor(List<ComicBook> listCb) {
        List<ComicBook> list = new ArrayList<>();
        System.out.println(UiMessage.AUTHOR);
        String author = Method.getString().toLowerCase();
        for (ComicBook cb : listCb) {
            if (cb.getAuthor().toLowerCase().contains(author))
                list.add(cb);
        }
        return list;
    }

    public static List<ComicBook> findByGenre(List<ComicBook> listCb) {
        List<ComicBook> list = new ArrayList<>();
        System.out.println(UiMessage.GENRE_CHOICE_2);
        String genre = Method.getString().toLowerCase();
        for (ComicBook cb : listCb) {
            if (cb.getGenre().toLowerCase().contains(genre))
                list.add(cb);
        }
        return list;
    }
}
