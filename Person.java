package org.lab3;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void think(Family fam, Person person) {
        System.out.println( person.name  + " думал, что " + fam.getName() + " ничуть не похоже на него ");
    }


}



