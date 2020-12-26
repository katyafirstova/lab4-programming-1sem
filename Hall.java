package org.lab3;
import org.lab3.Fire;
import org.lab3.Location;


public class Hall {

    Fire fire = null;

    String name;

    public Fire getFire() {
        return fire;
    }

    public void setFire(Fire fire) {
        this.fire = fire;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hall(String name) {
        this.name = name;
    }

    public Hall(String name, Fire fire) {
        this.name = name;
        this.fire = fire;
    }

    public void showAction() {
        System.out.println(" Локация " + this.name + " расцветилась объектом " + fire.getName());
    }


}