package src;
// package mapa;

import java.util.ArrayList;

public class Map {
    // ATRIBUTES
    boolean[][] matrix = new boolean[1][1];
    private ArrayList<Crossing> crossList = new ArrayList<Crossing>();

    // CONSTRUCTOR
    public Map(){}

    // METHODS
    public void addCross(int number, int xaxis, int yaxis){
        crossList.add(new Crossing(number, xaxis, yaxis));

        if(this.matrix[0].length < xaxis && this.matrix[1].length < yaxis){
            boolean[][] matrixTmp = new boolean[xaxis][yaxis];
            this.matrix = transcription(matrixTmp, this.matrix);

        }else if(this.matrix[0].length < xaxis){
            boolean[][] matrixTmp = new boolean[xaxis][this.matrix[1].length];
            this.matrix = transcription(matrixTmp, this.matrix);

        }else if(this.matrix[1].length < yaxis){
            boolean[][] matrixTmp = new boolean[this.matrix[0].length][yaxis];
            this.matrix = transcription(matrixTmp, this.matrix);

        }else{

        }
    }

    private boolean[][] transcription(boolean[][] tmp, boolean[][] old){
        for(int i=0; i<old.length; i++){
            for(int j=0; j<old[0].length; j++){
                tmp[i][j] = old[i][j];
            }
        }

        return tmp;
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
