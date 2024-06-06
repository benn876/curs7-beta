package org.beta.curs7.code.interface1;

public class Main {
    public static void main(String[] args) {
        KFC kfcOrder = new KFC(4);
        McDonalds mcDonaldsOrder = new McDonalds(6);
        System.out.println(kfcOrder.quantityNeededForDelivery());

        Company appleCompany = new Company("Apple", kfcOrder);
        Company facebookCompany = new Company("Facebook", mcDonaldsOrder);

        appleCompany.getFoodProvider().addMoreQuantity(5);
        facebookCompany.getFoodProvider().addMoreQuantity(1);

        System.out.println(kfcOrder.quantityNeededForDelivery());
        System.out.println(mcDonaldsOrder.quantityNeededForDelivery());

        System.out.println(appleCompany.getFoodProvider().getName());
    }
}
