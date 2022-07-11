package com.company;

public class AirBus extends Plane {
    private int numberSeats;

    public AirBus(int year, String brand, ColorEnum colorEnum, int numberSeats) {
        super(year, brand, colorEnum);
        this.numberSeats = numberSeats;
    }


    @Override
    public void print() {
        System.out.println("Brand: " + getBrand()+ " Year: "+ getYear() + " Color: "+ getColorEnum() +
                " Seats: " + numberSeats);
    }
}
