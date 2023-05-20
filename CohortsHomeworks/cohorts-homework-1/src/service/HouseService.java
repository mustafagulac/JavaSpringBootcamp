package service;

import model.BaseHouse;
import model.House;
import model.SummerHouse;
import model.Villa;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class HouseService {
    BuildService buildService = new BuildService();

    List<BaseHouse> filteredHouseList = new ArrayList<>();

    //Metot returning the total prices of the houses
    public int totalPriceOfHouse(List<House> houseList){
        int totalPrice = 0;
        for(House house:houseList){
            totalPrice += house.getPrice(); // totalPrice = totalPrice + house.getPrice();
        }
        return totalPrice;
    }
    //Metot returning the total prices of the villas
    public int totalPriceOfVilla(List<Villa> villaList){
        int totalPrice = 0;
        for(Villa villa:villaList){
            totalPrice += villa.getPrice();
        }
        return totalPrice;
    }
    //Metot returning the total prices of the Summer Houses
    public int totalPriceOfSummerHouse(List<SummerHouse> summerHouseList){
        int totalPrice = 0;
        for(SummerHouse summerHouse:summerHouseList){
            totalPrice += summerHouse.getPrice();
        }
        return totalPrice;
    }
    //Metot returning the total price of all types of homes
    public int totalPriceOfAllHouseTypes(List<House> houseList, List<Villa> villaList, List<SummerHouse> summerHouseList){
        return totalPriceOfHouse(houseList) + totalPriceOfVilla(villaList) + totalPriceOfSummerHouse(summerHouseList);
    }
    //Metot returning the average square meter of houses
    public double averageSquareMeterOfHouse(List<House> houseList){
        double totalSquareMeter = 0;
        for(House house:houseList){
            totalSquareMeter += house.getSquareMeter();
        }
        return totalSquareMeter / houseList.size();
    }
    //Metot returning the average square meter of villas
    public double averageSquareMeterOfVilla(List<Villa> villaList){
        double totalSquareMeter = 0;
        for(Villa villa:villaList){
            totalSquareMeter += villa.getSquareMeter();
        }
        return totalSquareMeter / villaList.size();
    }
    //Metot returning the average square meter of the Summer Houses
    public double averageSquareMeterOfSummerHouse(List<SummerHouse> summerHouseList){
        double totalSquareMeter = 0;
        for(SummerHouse summerHouse:summerHouseList){
            totalSquareMeter += summerHouse.getSquareMeter();
        }
        return totalSquareMeter / summerHouseList.size();
    }
    //Metot returning the average square meter of all types of houses
    public double averageSquareMeterOfAllHouseTypes(List<House> houseList, List<Villa> villaList, List<SummerHouse> summerHouseList){
        double totalSquareMeter = 0;
        int allTypeHouseCount = houseList.size() + villaList.size() + summerHouseList.size();
        for(House house:houseList){
            totalSquareMeter += house.getSquareMeter();
        }
        for(Villa villa:villaList){
            totalSquareMeter += villa.getSquareMeter();
        }
        for(SummerHouse summerHouse:summerHouseList){
            totalSquareMeter += summerHouse.getSquareMeter();
        }
        return totalSquareMeter / allTypeHouseCount;
    }
    //A method that filters all types of houses according to the number of rooms and halls and returns
    public List<BaseHouse> getFilteredHouseList(int roomCount, int hallCount){
        for(House house: buildService.getHouseList()){
            if(house.getRoomCount() == roomCount && house.getHallCount() == hallCount){
                filteredHouseList.add(house);
            }
        }
        for(Villa villa: buildService.getVillaList()){
            if(villa.getRoomCount() == roomCount && villa.getHallCount() == hallCount){
                filteredHouseList.add(villa);
            }
        }
        for(SummerHouse summerHouse: buildService.getSummerHouseList()){
            if(summerHouse.getRoomCount() == roomCount && summerHouse.getHallCount() == hallCount){
                filteredHouseList.add(summerHouse);
            }
        }
        return filteredHouseList;
    }
}
