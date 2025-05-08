package grafoList.src;

import java.util.ArrayList;

public class Vertex{
    // ATRIBUTES
    ArrayList<Edge> edgeList = new ArrayList<Edge>();
    int info;

    // CONSTRUCTOR
    public Vertex(int info){
        this.info = info;
    }

    // METHODS
    public void addEdge(Vertex origin, Vertex destiny, int info){
        Edge edgeTemp = new Edge(origin, destiny, info);

        edgeList.add(edgeTemp);
    }

    public void addEdge(Vertex destiny, int info){
        Edge edgeTemp = new Edge(destiny, info);

        edgeList.add(edgeTemp);
    }
}
