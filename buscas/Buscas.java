
public class Buscas{

    // Linear
    public void linear(int[] vector, int value){
        int count = 0;

        for (int valueTmp : vector){
            count++;

            if(valueTmp == value){
                System.out.println("Value found \nIteractions: " + count);
                break;
            }
        }
    }

    // Binary
    public void binary(int[] vector, int value){
        int first = 0;
        int last = vector.length-1;

        while (true){
            if(value[first] == value){
                System.out.println("Value found");
                break;

            }else if(value[last] == value){
                System.out.println("Value found");
                break;

            }else{
                if(value > vector[(last-first)/2]){

                }
            }
        }
    }
}