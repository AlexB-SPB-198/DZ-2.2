package com.company;

public class SuperJet extends Plane {
    private int Speed;

    public SuperJet(int year, String brand, ColorEnum colorEnum, int speed) {
        super(year, brand, colorEnum);
        Speed = speed;
    }

    @Override
    public void print() {
        System.out.println("Brand: " + getBrand()+ " Year: "+ getYear() + " Color: "+ getColorEnum()+
                " Speed: " + Speed + " km/h");
    }
}
