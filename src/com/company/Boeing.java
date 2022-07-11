package com.company;

public class Boeing extends Plane  {
private int flightRange;

    public Boeing(int year, String brand, ColorEnum colorEnum, int flightRange) {
        super(year, brand, colorEnum);
        this.flightRange = flightRange;
    }

    @Override
    public void print() {
        System.out.println("Brand: " + getBrand()+ " Year: "+ getYear() + " Color: "+ getColorEnum() +
                " Range: " + flightRange +" km");
    }
}
