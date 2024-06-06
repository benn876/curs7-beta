package org.beta.curs7.homework;

import org.beta.curs7.homework.model.Bottle;

public class BottleMain {
    public static void main(String[] args) {
        Bottle myBottle = new Bottle(100, 44);
        System.out.println(myBottle.spills());
        System.out.println(myBottle.getAvailableLiquid());
        System.out.println(myBottle.getEmptyCapacity());
        myBottle.openTheBottle();
        myBottle.drink(33);
        myBottle.closeTheBottle();
    }
}
