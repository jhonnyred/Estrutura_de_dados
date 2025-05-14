package src;
public class main {
    public static void main(String[] args){
        Map myMap = new Map();

        // adding crossings
        myMap.addCross(1, 0);
        myMap.addCross(2, 0);
        myMap.addCross(3, 0);
        myMap.addCross(4, 0);
        myMap.addCross(5, 0);

        // adding roads
        myMap.addRoad("Mascarenhas", 1.5, 1, 5);
        myMap.addRoad("Camelo", 9.0, 1, 4);
        myMap.addRoad("Molambique", 4.5, 3, 1);
        myMap.addRoad("fodase", 3.5, 3, 2);
        myMap.addRoad("Ambulantes", 3.6, 3, 5);
        myMap.addRoad("Camelo", 9.0, 4, 1);
        myMap.addRoad("Mercantes", 3.4, 5, 2);
        myMap.addRoad("Ambulantes", 3.6, 5, 3);

        // printing
        myMap.print();
    }
}
