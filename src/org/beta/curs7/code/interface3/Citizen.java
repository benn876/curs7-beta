package org.beta.curs7.code.interface3;

public interface Citizen extends Person{
    String getOrigin();
    String getIdentifier();
    String getCountry();
    void setCountry(String country);
}
