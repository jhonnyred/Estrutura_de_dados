package grafoList.src;

public class Main {
    public static void main(String[] args){
        Graph myGraph = new Graph();

        myGraph.addVertex(0);
        myGraph.addVertex(0);
        myGraph.addVertex(1);
        myGraph.addVertex(2);
        myGraph.addVertex(3);
        myGraph.addVertex(4);
        myGraph.addVertex(5);


        myGraph.addEdge(0,0,5, 3);
    }
}
