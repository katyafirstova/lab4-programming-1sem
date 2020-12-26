package org.lab3;

public abstract class Show  {

    public static void main(String [] args) {

        StartShowMessage startShowMessage = new StartShowMessage() {
            public void go() {
                System.out.println("Show go on");
            }
        };

       try {
           startShowMessage.go();
           Fire fire = new Fire("огонь");
           Hall hall = new Hall("зал", fire);
           Family family = new Family("Семейство");
           Bulbs bulbs = new Bulbs();
           Person person = new Person("он");



           person.think(family, person);
           family.act();
           fire.goOut();
           hall.showAction();
           family.changeDirection();
           bulbs.turnOn();
           bulbs.reflect();
           fire.LightUp();
           family.showMom();


       } catch (BulbsException e ) {
           System.out.println(e.getMessage());
       }


       }

}
