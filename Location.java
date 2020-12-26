package org.lab3;


import javax.swing.*;

abstract class Location extends org.lab3.Hall {

    protected String name;

    public Location(String name) {
        super(name);

        this.name = name;
    }


    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public abstract void showAction() ;

}


