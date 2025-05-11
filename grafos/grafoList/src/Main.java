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

        myGraph.addEdge(0, 1, "A");
        myGraph.addEdge(0, 5, "B");
        myGraph.addEdge(1, 0, "A");
        myGraph.addEdge(1, 5, "B");
        myGraph.addEdge(2, 3, "A");
        myGraph.addEdge(2, 4, "B");
        myGraph.addEdge(3, 2, "A");
        myGraph.addEdge(3, 4, "B");
        myGraph.addEdge(3, 5, "C");

        myGraph.print();
    }
}
