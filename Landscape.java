package org.lab3;


public enum Landscape  {
    Sea("море"),
    Water("вода");
    private String name;

    Landscape(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}