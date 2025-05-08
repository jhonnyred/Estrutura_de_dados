package grafoList.src;

import java.util.ArrayList;

public class Graph {
    // ATRIBUTE
    private ArrayList<Vertex> vertexList = new ArrayList<Vertex>();

    // CONSTRUCTOR
    public Graph(){
    }

    // METHODS
    public void addVertex(int info){
        for(Vertex element : this.vertexList){
            if(info == element.info){
                System.out.println("this vertex already exists");
                break;
    
            }else{
                Vertex vertexTmp = new Vertex(info);
                vertexList.add(vertexTmp);
                break;
            }
        }
        
    }

    public void addEdge(Vertex vertex, Vertex origin, Vertex destiny, int info){
        boolean check = false;
        int index = -1;

        for(Vertex element : this.vertexList){
            if (element == vertex){
                check = true;
                index = vertexList.indexOf(element);
                break;
            }
        }


        if(check){
            Vertex vertexTmp = vertexList.get(index);
            vertexTmp.addEdge(origin, destiny, info); 
        }else{
            System.out.println("vertex not found");
        }
    }
}
