package com.company;

public class MachineData {
    /*Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)*/

    private String yearOfRelease;
    private String model;
    private String price;
    private String colour;

    public MachineData(String yearOfRelease, String model, String price, String colour) {
        this.yearOfRelease = yearOfRelease;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "MachineData" + "  " +"yearOfRelease='" + yearOfRelease + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", colour='" + colour + '\'';
    }
}
