package org.lab3;

import jdk.nashorn.internal.ir.FunctionNode;

public class Bulbs implements AbleToBright {

    public enum BulbsColor  {
        Blue("синие"), Red("красные");

        private String name;

        BulbsColor(String name) {

            this.name = name;
        }

        @Override
        public String toString() {

            return name;
        }
    }

    public void turnOn() {
        System.out.println("Вспыхнули " + BulbsColor.Blue + " лампочки");
        System.out.println("Вспыхнули " + BulbsColor.Red + " лампочки");
    }


    public void reflect() {
        System.out.println(BulbsColor.Blue + " и " + BulbsColor.Red + " лампочки" +  " отражались на местности " +  Landscape.Sea);
    }



}









