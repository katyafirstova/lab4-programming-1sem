package org.lab3;


public interface Direction {
    enum Directions {

        FLOOR("пол"), CEILING("потолок");

        private String name;

        Directions(String name) {

            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    void changeDirection() throws BulbsException;
}