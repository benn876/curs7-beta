package org.beta.curs7.code.interface3;

public class Romanian implements Citizen {
    private String cnp;
    private String country;
    private String name;
    private Double height;
    private Integer age;
    private Double weight;
    private Boolean married;

    public Romanian(String cnp, String country, String name, Double height, Integer age, Double weight, Boolean married) {
        this.cnp = cnp;
        this.country = country;
        this.name = name;
        this.height = height;
        this.age = age;
        this.weight = weight;
        this.married = married;
    }

    @Override
    public String getOrigin() {
        return "ROMANIA";
    }

    @Override
    public String getIdentifier() {
        return cnp;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getHeight() {
        return height;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public Boolean isMarried() {
        return married;
    }

    @Override
    public Double getWeight() {
        return weight;
    }
}
