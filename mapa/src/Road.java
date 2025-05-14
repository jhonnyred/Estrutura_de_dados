package src;
// package mapa;

import java.util.ArrayList;

public class Road {
    // ATRIBUTES
    private String name;
    private double size;
    private Crossing origin;
    private Crossing destiny;


    // CONSTRUCTOR
    public Road(ArrayList<Crossing> crossings, String name, double size, int origin, int destiny){
        this.name = name;
        this.size = size;
        for(Crossing cross : crossings){
            if(origin == cross.getNumber()){
                this.origin = cross;
            }
        }

        for(Crossing cross : crossings){
            if(destiny == cross.getNumber()){
                this.destiny = cross;
            }
        }
    }

    // METHODS
    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(float size) {
        this.size = size;
    }
}
