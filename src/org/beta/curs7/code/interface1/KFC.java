package org.beta.curs7.code.interface1;

public class KFC implements FoodProvider {
    private Integer quantityNeeded;

    public KFC(Integer quantityNeeded) {
        this.quantityNeeded = quantityNeeded;
    }

    @Override
    public String getName() {
        return "KFC";
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
    }
}
