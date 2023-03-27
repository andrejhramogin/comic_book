import java.io.Serializable;

public class ComicBook implements Serializable {

    private String title;
    private String author;
    private String publishingHouse;
    private int pagesNumber;
    private String genre;
    private int year;
    private double costPrice;
    private double retailPrice;
    private String isContinuation;
    private int comicQuantity;
    private int numberOfSales;


    public ComicBook() {
    }

    public ComicBook(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public ComicBook(String title,
                     String author,
                     String publishingHouse,
                     int pagesNumber,
                     String genre,
                     int year,
                     double costPrice,
                     double retailPrice,
                     String isContinuation,
                     int comicQuantity,
                     int numberOfSales) {
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.pagesNumber = pagesNumber;
        this.genre = genre;
        this.year = year;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
        this.isContinuation = isContinuation;
        this.comicQuantity = comicQuantity;
        this.numberOfSales = numberOfSales;
    }

    ComicGenre comicGenre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {

        comicGenre = ComicGenre.getGenre(genre);
        switch (comicGenre) {
            case ACTION:
                this.genre = "action";
                break;
            case FANTASY:
                this.genre = "fantasy";
                break;
            case ROMANTIC:
                this.genre = "romantic";
                break;
            case THRILLER:
                this.genre = "thriller";
                break;
            case DETECTIVE:
                this.genre = "detective";
                break;
            case CHILDREN_STORY:
                this.genre = "children`s story";
                break;
            case SCIENCE_FICTION:
                this.genre = "science fiction";
                break;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getContinuation() {
        return isContinuation;
    }

    public void setContinuation(String continuation) {
        if (continuation.equalsIgnoreCase(UiMessage.Y)) {
            this.isContinuation = UiMessage.YES;
        } else if (continuation.equalsIgnoreCase(UiMessage.N)) {
            this.isContinuation = UiMessage.NO;
        } else {
            System.out.println(UiMessage.IS_SEQUEL);
            setContinuation(MethodAddDelete.getString());
        }
    }

    public int getComicQuantity() {
        return comicQuantity;
    }

    public void setComicQuantity(int comicQuantity) {
        this.comicQuantity = comicQuantity;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }
}
