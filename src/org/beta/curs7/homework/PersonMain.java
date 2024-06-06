package org.beta.curs7.homework;

import org.beta.curs7.homework.model.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person myPerson = new Person("Mihai",22, false);
        Person secondPerson = new Person("George", 29, true);

        System.out.println(secondPerson.getName());
        System.out.println(myPerson);
    }
}
