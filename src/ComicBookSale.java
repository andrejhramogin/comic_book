import java.io.Serializable;
import java.time.LocalDate;

public class ComicBookSale extends ComicBook implements Serializable {

    private final LocalDate date;
    private int sale;


    public ComicBookSale(String title, String author, String genre, int sale, LocalDate date) {
        super(title, author, genre);
        this.sale = sale;
        this.date = date;
    }

    public static LocalDate setDate() {

        int year, month, dayOfTheMonth;
        System.out.println(UiMessage.ENTER_THE_DATE);
        System.out.println(UiMessage.ENTER_THE_YEAR);
        year = MethodAddDelete.getInteger();
        System.out.println(UiMessage.ENTER_THE_MONTH);
        month = MethodAddDelete.getInteger();
        System.out.println(UiMessage.ENTER_THE_DAY);
        dayOfTheMonth = MethodAddDelete.getInteger();
        return LocalDate.of(year, month, dayOfTheMonth);
    }

    public LocalDate getDate() {
        return date;
    }

    public int getSale() {
        return sale;
    }
}
