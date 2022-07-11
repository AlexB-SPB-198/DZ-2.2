package com.company;

public abstract class Plane implements Printable {
 private  int year;
 private  String brand;
 private ColorEnum colorEnum;

    public Plane(int year, String brand, ColorEnum colorEnum) {
        this.year = year;
        this.brand = brand;
        this.colorEnum = colorEnum;
    }
    public int getYear() {
        return year;
    }
    public String getBrand() {
        return brand;
    }
    public ColorEnum getColorEnum() {
        return colorEnum;
    }


}
