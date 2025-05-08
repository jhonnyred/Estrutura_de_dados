package grafoList.src;

public class Edge{
    // ATRIBUTE
    int info;
    Vertex origin;
    Vertex destiny;

    // CONSTRUCTOR
    public Edge(Vertex origin, Vertex destiny, int info){
        this.origin = origin;
        this.destiny = destiny;
        this.info = info;
    }
}
