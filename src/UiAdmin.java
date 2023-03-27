import java.util.List;
import java.util.Scanner;

public class Ui {

    public void listManagement() {

        List<ComicBook> listCb = ReadFile.readListFromFile();

        if (listCb.isEmpty()) {
            System.out.println("List is empty.");
        }

        System.out.println(
                "\nView the list - enter 1" +
                "\nAdd comic - enter 2" +
                "\nDelete comic book by title - enter 3" +
                "\nFind comic book (by title or author or genre) - enter 4" +
                "\nClose the program - enter 0.");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Method method = new Method();
        switch (num) {
            case 0:
                return;
            case 1:
                method.printList(listCb);
                break;
            case 2:
                method.addComic(listCb);
                break;
            case 3:
                method.delete(listCb);
                break;
            case 4:
                method.find(listCb);
                break;

        }
        listManagement();
    }
}