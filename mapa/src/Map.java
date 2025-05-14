package src;
// package mapa;

import java.util.ArrayList;

public class Map {
    // ATRIBUTES
    private ArrayList<Crossing> crossList = new ArrayList<Crossing>();

    // CONSTRUCTOR
    public Map(){}

    // METHODS
    public void addCross(int number, int coordinate){
        crossList.add(new Crossing(number, coordinate));
    }

    public void addRoad(String name, double size, int origin, int destiny){
        for(Crossing cross : this.crossList){
            if(origin == cross.getNumber()){
                cross.addRoad(crossList, name, size, origin, destiny);
            }
        }
    }

    public void print(){
        for(Crossing cross : this.crossList){
            System.out.println("Cross: " + cross.getNumber());
            cross.printRoads();
        }
    }
    
    public ArrayList<Crossing> getCrossList() {
        return crossList;
    }

    public void setCrossList(ArrayList<Crossing> crossList) {
        this.crossList = crossList;
    }
}
