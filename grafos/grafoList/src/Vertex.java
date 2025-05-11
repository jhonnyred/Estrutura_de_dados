package grafoList.src;

import java.util.ArrayList;

public class Vertex{
    // ATRIBUTES
    private ArrayList<Edge> edgeList = new ArrayList<Edge>();
    private int info;

    // CONSTRUCTOR
    public Vertex(int info){
        this.info = info;
    }

    // METHODS
    public void addEdge(ArrayList<Vertex> graph, int origin, int destiny, String info){
        edgeList.add(new Edge(graph, origin, destiny, info));
    }

    // GETTERS
    public int getInfo(){
        return this.info;
    }

    public ArrayList<Edge> getEdgeList(){ return this.edgeList; }

    public void setEdgeList(ArrayList<Edge> list){ this.edgeList = list; }
}
