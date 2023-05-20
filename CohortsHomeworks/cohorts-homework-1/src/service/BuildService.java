package service;

import model.House;
import model.SummerHouse;
import model.Villa;

import java.util.ArrayList;
import java.util.List;

public class BuildService {
    private List<House> houseList;
    private List<Villa> villaList;
    private List<SummerHouse> summerHouseList;

    public BuildService() {
        houseList = new ArrayList<>();
        villaList = new ArrayList<>();
        summerHouseList = new ArrayList<>();

        //Creating 3 House objects
        House house1 = new House(1,585000,63,1,1);
        House house2 = new House(2,788000,115,2,1);
        House house3 = new House(3,3789999,170,3,1);

        //Creating 3 Villa objects
        Villa villa1 = new Villa(4,4090000,185,5,1);
        Villa villa2 = new Villa(5,13400000,383,7,1);
        Villa villa3 = new Villa(6,31000000,500,10,2);

        //Creating 3 Summer House objects
        SummerHouse summerHouse1 = new SummerHouse(7,2375000,205,3,1);
        SummerHouse summerHouse2 = new SummerHouse(8,2290000,210,3,1);
        SummerHouse summerHouse3 = new SummerHouse(9,2399000,195,4,1);

        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);

        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);

        summerHouseList.add(summerHouse1);
        summerHouseList.add(summerHouse2);
        summerHouseList.add(summerHouse3);


    }
    public List<House> getHouseList() {
        return houseList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }
}
