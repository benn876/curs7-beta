package org.beta.curs7.homework.model;

public class Bottle {
    private Integer totalCapacity;
    private Integer availableLiquid;
    private Boolean opened = false;

    public Bottle(Integer totalCapacity, Integer availableLiquid) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
    }

    public Boolean spills() {
        return availableLiquid > totalCapacity;
    }

    public Integer getAvailableLiquid() {
        return availableLiquid;
    }

    public Integer getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public void openTheBottle() {
        if (this.opened) {
            System.out.println("Bottle is already opened");
        } else {
            opened = true;
            System.out.println("Bottle is opened");
        }
    }

    public void closeTheBottle() {
        if (this.opened) {
            opened = false;
            System.out.println("Bottle is closed");
        } else {
            System.out.println("Bottle is already closed");
        }
    }

    public void drink(Integer amountToDrink) {
        if (this.opened) {
            if (this.availableLiquid < amountToDrink) {
                System.out.println("Only " + this.availableLiquid + " was drunk");
                this.availableLiquid = 0;
            } else {
                this.availableLiquid = this.availableLiquid - amountToDrink;
                System.out.println("You have drunk " + amountToDrink);
                System.out.println("Remaining liquid is " + this.availableLiquid);
            }
        } else {
            System.out.println("Bottle is closed. Please open it then drink");
        }
    }

}
