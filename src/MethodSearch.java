import java.util.ArrayList;
import java.util.List;


/**
 * Осуществляет поиск комиксов по названию, автору или жанру. Формирует и выводит список по результату поиска.
 * Осуществляет поиск и по полному названию и по фрагменту.
 */
public class MethodSearch {
    public static void find(List<ComicBook> listCb) {
        System.out.println(UiMessage.SEARCH_MENU);
        int choice = MethodAddDelete.getInteger();
        MethodAddDelete.scanner.nextLine();
        switch (choice) {
            case 1:
                MethodOutput.printList(findByTitle(listCb));
                break;
            case 2:
                MethodOutput.printList(findByAuthor(listCb));
                break;
            case 3:
                MethodOutput.printList(findByGenre(listCb));
        }
    }


    public static List<ComicBook> findByTitle(List<ComicBook> listCb) {
        List<ComicBook> list = new ArrayList<>();
        System.out.println(UiMessage.TITLE);
        String title = MethodAddDelete.getString().toLowerCase();
        for (ComicBook cb : listCb) {
            if (cb.getTitle().toLowerCase().contains(title))
                list.add(cb);
        }
        return list;
    }

    public static List<ComicBook> findByAuthor(List<ComicBook> listCb) {
        List<ComicBook> list = new ArrayList<>();
        System.out.println(UiMessage.AUTHOR);
        String author = MethodAddDelete.getString().toLowerCase();
        for (ComicBook cb : listCb) {
            if (cb.getAuthor().toLowerCase().contains(author))
                list.add(cb);
        }
        return list;
    }

    public static List<ComicBook> findByGenre(List<ComicBook> listCb) {
        List<ComicBook> list = new ArrayList<>();
        System.out.println(UiMessage.GENRE_CHOICE_2);
        String genre = MethodAddDelete.getString().toLowerCase();
        for (ComicBook cb : listCb) {
            if (cb.getGenre().toLowerCase().contains(genre))
                list.add(cb);
        }
        return list;
    }

    public static ComicBook selectComicByTitle(List<ComicBook> listCb) {

        System.out.println(UiMessage.ENTER_TITLE);
        String title = MethodAddDelete.getString().toLowerCase();

        ComicBook cb1 = null;
        for (ComicBook cb : listCb) {
            if (cb.getTitle().toLowerCase().equals(title)) {
                MethodOutput.printComic(cb);
                cb1 = cb;
            }
        }
        if(cb1==null){
            System.out.println(UiMessage.NOT_FOUND);
            MethodOutput.printList(listCb);
            selectComicByTitle(listCb);
        }
        return cb1;
    }
}
