package org.beta.curs7.homework.model;

public class Person {
    private String name;
    private Integer age;
    private Boolean married;

    public Person(String name, Integer age, Boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public Boolean getMarried() {
        return this.married;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", married=" + married +
                '}';
    }
}
