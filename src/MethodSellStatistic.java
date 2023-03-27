import java.util.List;

public class MethodSellStatistic {

    public static void viewStat(List<ComicBookSale> listCbs){
        System.out.println("View sales - enter 1");


        int choice = MethodAddDelete.getInteger();
        switch (choice){
            case 1:
                MethodSort.sortBySalesData(listCbs);
                break;
        }
    }
}
