import model.House;
import model.SummerHouse;
import model.Villa;
import service.BuildService;
import service.HouseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BuildService buildService = new BuildService();
        List<House> houseList = buildService.getHouseList();
        List<Villa> villaList = buildService.getVillaList();
        List<SummerHouse> summerHouseList = buildService.getSummerHouseList();

        HouseService houseService = new HouseService();

        System.out.println("Total Prices of Houses: " + houseService.totalPriceOfHouse(houseList));
        System.out.println("Total Prices of Villas: " + houseService.totalPriceOfVilla(villaList));
        System.out.println("Total Prices of Summer Houses: " + houseService.totalPriceOfSummerHouse(summerHouseList));
        System.out.println("Total Price of All Types Houses: " + houseService.totalPriceOfAllHouseTypes(houseList,villaList,summerHouseList));
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("Average Square Meter of Houses: " + houseService.averageSquareMeterOfHouse(houseList));
        System.out.println("Average Square Meter of Villas: " + houseService.averageSquareMeterOfVilla(villaList));
        System.out.println("Average Square Meter of Summer Houses: " + houseService.averageSquareMeterOfSummerHouse(summerHouseList));
        System.out.println("Average Square Meter of All Types Houses: " + houseService.averageSquareMeterOfAllHouseTypes(houseList,villaList,summerHouseList));
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("All Types of Houses by Count of Rooms and halls (For example 3 rooms 1 living room): " + houseService.getFilteredHouseList(3,1)); //Values can be changed according to the number of rooms and halls requested.


    }
}