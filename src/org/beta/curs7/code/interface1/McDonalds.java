package org.beta.curs7.code.interface1;

public class McDonalds implements FoodProvider {
    private Integer quantityNeeded;
    private Integer bonusPoints = 0;

    public McDonalds(Integer quantityNeeded) {
        this.quantityNeeded = quantityNeeded;
        bonusPoints += 3;
    }

    @Override
    public String getName() {
        return "McDonalds";
    }

    @Override
    public Integer numberOfEmployees() {
        return 0;
    }

    @Override
    public Integer quantityNeededForDelivery() {
        return quantityNeeded;
    }

    @Override
    public void addMoreQuantity(Integer extraQuantity) {
        this.quantityNeeded += extraQuantity;
        System.out.println("Thank you for your order. Because of your extra order you receive 4 more points");
        this.bonusPoints += 4;
    }
}
