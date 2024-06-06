package org.beta.curs7.code.interface1;

public interface FoodProvider {
    String getName();

    Integer numberOfEmployees();
    Integer quantityNeededForDelivery();
    void addMoreQuantity(Integer extraQuantity);
}
