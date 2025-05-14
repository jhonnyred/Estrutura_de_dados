package src;
// package mapa;

import java.util.ArrayList;

public class Crossing {
    // ATRIBUTES
    private ArrayList<Road> roadList = new ArrayList<Road>();
    private int number;
    private int coordinate;

    //CONSTRUCTOR
    public Crossing(int number, int coordinate){
        this.number = number;
        this.coordinate = coordinate;
    }

    // METHODS
    public void addRoad(ArrayList<Crossing> crossings, String name, double size, int origin, int destiny){
        roadList.add(new Road(crossings, name, size, origin, destiny));
    }

    public void printRoads(){
        for(Road road : this.roadList){
            System.out.println("   Road: " + road.getName());
        }
    }

    public int getCoordinate() {
        return coordinate;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Road> getRoadList() {
        return roadList;
    }

    public void setCoordinate(int coordinate) {
        this.coordinate = coordinate;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRoadList(ArrayList<Road> roadList) {
        this.roadList = roadList;
    }
}
