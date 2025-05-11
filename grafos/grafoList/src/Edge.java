package grafoList.src;

import java.util.ArrayList;

public class Edge{
    // ATRIBUTE
    private String info;
    private Vertex origin;
    private Vertex destiny;

    // CONSTRUCTOR
    public Edge(ArrayList<Vertex> graph, int origin, int destiny, String info){
        this.info = info;

        for(Vertex vertex : graph){
            if(vertex.getInfo() == origin){
                this.origin = vertex;
                break;
            }
        }

        for(Vertex vertex : graph){
            if(vertex.getInfo() == destiny){
                this.destiny = vertex;
                break;
            }
        }
    }

    public String getInfo(){
        return this.info;
    }

    public int getOrigin(){
        return this.origin.getInfo();
    }

    public int getDestiny() {
        return this.destiny.getInfo();
    }

    public void setInfo(String info){ 
        this.info = info;
    }
}
