import java.io.Serializable;

public class ComicBook implements Serializable {
    private static final long serialVersionUID = 1L;

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

    public ComicBook(String title, String author){
        this.title = title;
        this.author = author;
    }

    public ComicBook(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public ComicBook(String genre){
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
                this.genre = UiMessage.ACTION;
                break;
            case FANTASY:
                this.genre = UiMessage.FANTASY;
                break;
            case ROMANTIC:
                this.genre = UiMessage.ROMANTIC;
                break;
            case THRILLER:
                this.genre = UiMessage.THRILLER;
                break;
            case DETECTIVE:
                this.genre = UiMessage.DETECTIVE;
                break;
            case CHILDREN_STORY:
                this.genre = UiMessage.CHILDREN;
                break;
            case SCIENCE_FICTION:
                this.genre = UiMessage.SCIENCE_FICTION;
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
        if (continuation.equalsIgnoreCase(UiMessageEnum.Y.getStr())) {
            this.isContinuation = UiMessageEnum.YES.getStr();
        } else if (continuation.equalsIgnoreCase(UiMessageEnum.N.getStr())) {
            this.isContinuation = UiMessageEnum.NO.getStr();
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
/*
Title: Ironman; Author: Iron; Publishing house: h1; Pages number: 33; Genre: action; Year of publication: 2020; Cost price: 34.0; Retail price: 43.0; Continuation: Yes; Quantity: 21; Sales volume: 29
Title: Spiderman; Author: Spider; Publishing house: h2; Pages number: 55; Genre: action; Year of publication: 2022; Cost price: 45.0; Retail price: 54.0; Continuation: No; Quantity: 27; Sales volume: 23
Title: Star Wars; Author: Lookas; Publishing house: h3; Pages number: 44; Genre: fantasy; Year of publication: 2022; Cost price: 56.0; Retail price: 65.0; Continuation: Yes; Quantity: 16; Sales volume: 34
Title: Chippolino; Author: Radari; Publishing house: Italia; Pages number: 22; Genre: children`s story; Year of publication: 2010; Cost price: 23.0; Retail price: 33.0; Continuation: No; Quantity: 35; Sales volume: 15
Title: Sherlok; Author: Dojl; Publishing house: London; Pages number: 33; Genre: detective; Year of publication: 2015; Cost price: 45.0; Retail price: 54.0; Continuation: Yes; Quantity: 40; Sales volume: 10

 */