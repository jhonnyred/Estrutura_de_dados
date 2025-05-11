package grafoList.src;

import java.util.ArrayList;

public class Graph{
    // ATRIBUTE
    private ArrayList<Vertex> vertexList = new ArrayList<Vertex>();

    // CONSTRUCTOR
    public Graph(){
    }

    // METHODS
    public void addVertex(int info){
        boolean check = true;
        for(Vertex element : this.vertexList){
            if(info == element.getInfo()){
                System.out.println("this vertex already exists");
                check = false;
                break;
            }
        }

        if(check){
            Vertex vertexTmp = new Vertex(info);
            vertexList.add(vertexTmp);
        }
    }

    public void addEdge(int origin, int destiny, String info){
        boolean check = false; 

        for(Vertex element : this.vertexList){
            if (element.getInfo() == origin){
                element.addEdge(this.vertexList, origin, destiny, info);
                check = true;
                break;
            }
        }

        if(!check){
            System.out.println("vertex not found");
        }
    }

    public void print(){
        for(Vertex vertex : this.vertexList){
            System.out.println(vertex.getInfo() + " : ");

            for(Edge edge : vertex.getEdgeList()){
                System.out.println("Edge:" +edge.getInfo()+ " origin:" +edge.getOrigin()+ " destiny:" +edge.getDestiny());
            }
        }
    }

    // GETTERS
    public ArrayList<Vertex> getVertexList(){ return this.vertexList; }

    // SETTERS
    public void setVertexList(ArrayList<Vertex> list){ this.vertexList = list; }
}
