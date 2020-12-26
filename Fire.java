package org.lab3;


public class Fire implements AbleToLight, AbleToGoOut {

    private final String name;

    public Fire(String name) {

        this.name = name;
    }



    public String getName() {

        return name;
    }

    public void LightUp() {

        System.out.println(name + " зажёгся в направлении " + Direction.Directions.FLOOR);
    }

    public void goOut() {
        class Glow {
            private final String name;
            public Glow(String name) {
                this.name = name;
            }
            public void fadeOut() {
                System.out.println(" В местности  " + Landscape.Water + " погас " + Glow.this.name + " солнечного света ");
            }
        }
        Glow glow = new Glow("отблеск");
        glow.fadeOut();
    }
}