package com.company;

public class Car {
    /*Car деген класс тузунуз (Id, номер авто)*/
    private long ID ;
    private  int carNumber;


    public Car(long ID, int carNumber) {
        this.ID = ID;
        this.carNumber = carNumber;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car" + "ID=" + ID + ", carNumber=" + carNumber;
    }
}
