import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WriteFile {

    //записывает List <ComicBook> в файл comic.bin

    public static void writeToFile(List<ComicBook> lcb, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(path)))) {
            Base baseList = new Base(lcb);
            oos.writeObject(baseList);
            oos.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeSalesToFile(List<ComicBookSale> lcb) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get( "comic2.bin")))) {
            BaseSales baseList = new BaseSales(lcb);
            oos.writeObject(baseList);
            oos.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}