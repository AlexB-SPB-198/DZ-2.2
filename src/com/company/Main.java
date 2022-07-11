package com.company;

public class Main {


    public static void main(String[] args) {
        Printable[] print = {createObject("1object"), createObject("2object"),
                createObject("3object")};
        for (Printable printable : print) {
            printable.print();

        }
    }
    public static Printable createObject(String classname) {
        switch (classname) {
            case "1object":
                Boeing boeing = new Boeing(2012, "Boeing", ColorEnum.WHITE,4000);
                return boeing;
            case "2object":
                AirBus airBus = new AirBus(2015, "AirBus", ColorEnum.YELLOW,180);
                return airBus;
            case "3object":
                SuperJet superJet = new SuperJet(2013, "SuperJet", ColorEnum.BLUE,950);
                return superJet;
        }
        return null;
    }


}





