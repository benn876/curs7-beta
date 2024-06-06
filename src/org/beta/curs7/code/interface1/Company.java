package org.beta.curs7.code.interface1;

public class Company {
    private String name;
    private FoodProvider foodProvider;

    public Company(String name, FoodProvider foodProvider) {
        this.name = name;
        this.foodProvider = foodProvider;
    }

    public String getName() {
        return name;
    }

    public FoodProvider getFoodProvider() {
        return foodProvider;
    }
}
