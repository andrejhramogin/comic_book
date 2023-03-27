import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Method {

    public static Scanner scanner = new Scanner(System.in);

    private static final ComicBook comicBook = new ComicBook();

    public static String getString() {
        return scanner.nextLine();
    }

    public static int getInteger() {
        int i;
        try {
            i = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(UiMessage.NOT_INTEGER);
            while (true) {
                scanner.next();
                if (scanner.hasNextInt()) {
                    i = scanner.nextInt();
                    break;
                }
                System.out.println(UiMessage.NOT_INTEGER);
            }
        }
        return i;
    }

    public static double getDouble() {
        double d;
        try {
            d = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println(UiMessage.NOT_NUMBER);
            while (true) {
                scanner.next();
                if (scanner.hasNextDouble()) {
                    d = scanner.nextDouble();
                    break;
                }
                System.out.println(UiMessage.NOT_NUMBER);
            }
        }
        return d;
    }

    private static boolean isSameTitle = false;

    public static void addComic(List<ComicBook> listCb) {

        scanner.nextLine();
        checkPresence(listCb);
        if (isSameTitle) return;

        System.out.println(UiMessage.AUTHOR);
        comicBook.setAuthor(getString());

        System.out.println(UiMessage.PUBLISHING_HOUSE);
        comicBook.setPublishingHouse(getString());

        System.out.println(UiMessage.GENRE_CHOICE);
        comicBook.setGenre(getString());

        System.out.println(UiMessage.IS_SEQUEL);
        comicBook.setContinuation(getString());

        System.out.println(UiMessage.QUANTITY);
        comicBook.setComicQuantity(getInteger());

        System.out.println(UiMessage.YEAR_OF_PUBLICATION);
        comicBook.setYear(getInteger());

        System.out.println(UiMessage.COST_PRICE);
        comicBook.setCostPrice(getDouble());

        System.out.println(UiMessage.RETAIL_PRICE);
        comicBook.setRetailPrice(getDouble());

        System.out.println(UiMessage.PAGES_NUMBER);
        comicBook.setPagesNumber(getInteger());

        comicBook.setNumberOfSales(UiMessage.ZERO);

        listCb.add(comicBook);
        WriteFile.writeToFile(listCb);
    }

    /**
     * Проверяет есть ли в списке комикс с таким названием, и, если есть, увеличивает его количество на
     * задаваемую величину. После чего записывает список в файл, меняет флаг и метод создания нового комискса
     * заканчивает работу.
     * Если комикса с таким названием еще нет, то записывает новое название и создание нового комикса продолжается.
     */
    public static void checkPresence(List<ComicBook> listCb) {
        System.out.println(UiMessage.TITLE);
        String title = getString();
        for (ComicBook cb : listCb) {
            if (title.equalsIgnoreCase(cb.getTitle())) {
                System.out.println(UiMessage.QUANTITY);
                cb.setComicQuantity(cb.getComicQuantity() + Method.getInteger());
                WriteFile.writeToFile(listCb);
                isSameTitle = true;
            } else comicBook.setTitle(title);
        }
    }

    /**
     * Удаляет комикс по названию.
     */
    public static void delete(List<ComicBook> listCb) {
        scanner.nextLine();
        System.out.println(UiMessage.ENTER_TITLE);
        String comicToDel = Method.getString();
        listCb.removeIf(cb -> cb.getTitle().equalsIgnoreCase(comicToDel));
        WriteFile.writeToFile(listCb);
    }
}
