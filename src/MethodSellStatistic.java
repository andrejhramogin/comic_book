import java.util.List;

public class MethodSellStatistic {

    public static void viewStat(List<ComicBookSale> listCbs){
        System.out.println("View sales - enter 1\nView sales by genre - enter 2");

        int choice = MethodAddDelete.getInteger();
        switch (choice){
            case 1:
                MethodSort.sortBySalesData(listCbs);
                break;
            case 2:
                MethodSort.sortSalesByGenre(listCbs);
                break;
        }
    }
}
