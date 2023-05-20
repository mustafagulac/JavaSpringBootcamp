package model;

public class BaseHouse {
    private int id;
    private int price;
    private double squareMeter;
    private int roomCount;
    private int hallCount;

    public BaseHouse(int id, int price, double squareMeter, int roomCount, int hallCount) {
        this.id = id;
        this.price = price;
        this.squareMeter = squareMeter;
        this.roomCount = roomCount;
        this.hallCount = hallCount;
    }

    public BaseHouse() {
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getHallCount() {
        return hallCount;
    }

    @Override
    public String toString() {
        return "\nHouse{" +
                "id=" + id +
                ", price=" + price +
                ", squareMeter=" + squareMeter +
                ", roomCount=" + roomCount +
                ", hallCount=" + hallCount +
                '}';
    }
}
