package org.beta.curs7.code.staticIntro;

import java.util.Random;

public class Factory {
    public static void main(String[] args) {
        BMW[] cars = new BMW[10];
        Random random = new Random();

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new BMW(random.nextInt(10), "BLACK");
        }

        for (BMW bmw : cars){
            System.out.println(bmw);
        }

        System.out.println(BMW.getCreatedCars());

        BMW extraBMW = new BMW(4,"WHITE");
        System.out.println("Created:" + BMW.getCreatedCars());
        System.out.println("Available:" + BMW.getAvailableCars());

        BMW.sellCar(1);
        System.out.println("Created:" + BMW.getCreatedCars());
        System.out.println("Available:" + BMW.getAvailableCars());

        BMW.sellCar(11);

        //write a function that replaces something with another thing and then it returns the string reversed
        System.out.println(StringUtils.replaceAndRevers(BMW.getName(), "W", "V"));
    }
}
