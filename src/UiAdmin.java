import java.util.List;

public class UiAdmin {

    public static void manageList() {

        List<ComicBook> listCb = ReadFile.readBaseFromFile().getListComic();
        List<ComicBookSale> listCbs = ReadFile.readBaseSalesFromFile().getListComic();

        if (listCb.isEmpty()) {
            System.out.println(UiMessage.EMPTY_LIST);
        }

        System.out.println(UiMessage.START_MENU);
        int num = MethodAddDelete.getInteger();
        MethodAddDelete.scanner.nextLine();

        switch (num) {
            case 0:
                return;
            case 1:
                MethodOutput.printList(listCb);
                break;
            case 2:
                MethodAddDelete.addComic(listCb);
                break;
            case 3:
                MethodAddDelete.delete(listCb);
                break;
            case 4:
                MethodSearch.find(listCb);
                break;
            case 5:
                MethodEditing.edit(listCb);
                break;
            case 6:
                MethodSort.sort(listCb);
                break;
            case 7:
                MethodSale.sell(listCb, listCbs);
                break;
            case 8:
                MethodSellStatistic.viewStat(listCbs);
                break;
        }
        manageList();
    }
}