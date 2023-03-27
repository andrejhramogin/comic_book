import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFile   {

    /** Считывает из файла и возвращает объект Base (List<ComicBook>)
     */
    public static Base readBaseFromFile(){
        Base bl = new Base();
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("comic.bin")))){

           bl = (Base) ois.readObject();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return bl;
    }

    public static BaseSales readBaseSalesFromFile(){
        BaseSales bl = new BaseSales();
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("comic2.bin")))){

            bl = (BaseSales) ois.readObject();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return bl;
    }

   //    public static List<ComicBook> readListFromFile(){
//        List<ComicBook> list = new ArrayList<>();
//        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("comic.bin")))){
//
//            Base bl = (Base) ois.readObject();
//            list = bl.getListComic();
//
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        return list;
//    }
}
