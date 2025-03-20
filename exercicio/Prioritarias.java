import java.util.ArrayList;

public class Prioritarias{
    // ATRIBUTOS
    private ArrayList prioritaria = new ArrayList<Tarefa>();
    private int index = 0;

    // METODOS
    // vazia
    public boolean vazia(){
        if(!prioritaria.isEmpty()){
            return false;
        }
        return true;
    }

    // adicionar
    public void adicionar(Tarefa t){
        prioritaria.add(t);
        index++;
    }
    
    // remover
    public void remover(){
        if(!vazia()){
            prioritaria.remove(index);
            index--;
        }
    }

    
}
