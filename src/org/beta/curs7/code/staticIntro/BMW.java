package org.beta.curs7.code.staticIntro;

public class BMW {
    //class fields
    private static String name = "BMW";
    private static Integer createdCars = 0;
    private static Integer availableCars = 0;
    private static Integer soldCars = 0;

    //object fields
    private Integer numberOfSeats;
    private String color;

    public BMW(Integer numberOfSeats, String color) {
        this.numberOfSeats = numberOfSeats;
        this.color = color;
        createdCars++;
        availableCars++;
    }

    //class methods
    public static String getName() {
        return name;
    }

    public static Integer getCreatedCars() {
        return createdCars;
    }

    public static Integer getAvailableCars() {
        return availableCars;
    }

    public static void sellCar(Integer carsToSell) {
        if (carsToSell > availableCars) {
            System.out.println("There are not enough cars");
        } else {
            soldCars = soldCars + carsToSell;
            availableCars = availableCars - carsToSell;
        }
    }


    //object methods
    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "name=" + name + ", " +
                "numberOfSeats=" + numberOfSeats +
                ", color='" + color + '\'' +
                '}';
    }
}
