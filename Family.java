package org.lab3;

public class Family implements Direction {

    private String name;

    public Family(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void act() {
        System.out.println(Family.this.name + " испытывает чувства, различает цвета, слышит звуки и кружится ");
    }

    @Override
    public void changeDirection() throws BulbsException {
        if(this.name == null) {
            throw new FamilyException("Name is null!");
        }

        System.out.println(name + " посмотрело в направлении " + Directions.CEILING);

        if(this.name == "bulb") {
            throw new BulbsException("Error");
        }
    }





    class Mom {
        private final String name;

        public Mom(String name) {
            this.name = name;
        }
        public void toThink() {
            System.out.println(this.name + " подумала: 'это чтобы никто не свалился в " + Landscape.Sea + "'");
        }
        public void getTired () {

            System.out.println(this.name + " устала ");
        }
        public void goSleep () {

            System.out.println(this.name + " пошла спать ");
        }
    }


    public void showMom() {
        Mom mom = new Mom("Муми-мама");
        mom.getTired();
        mom.toThink();
        mom.goSleep();

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return name.equals(family.name);
    }

    @Override
    public int hashCode() {

        return name.hashCode();
    }
}
