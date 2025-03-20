import java.util.List;
import java.util.ArrayList;

public class Regulares{
    // ATRIBUTOS
    private List filaRegular = new ArrayList<Tarefa>();

    // METODOS
    // adicionar
    public void adicionar(Tarefa t){
        filaRegular.add(t);
    }

    // remover
    public void remover(Tarefa t){
        filaRegular.remove(t);
    }

    // boolean vazia
    public boolean vazia(){
        if(!filaRegular.isEmpty()){
            return true;
        }
        return false;
    }
    
    // tamanho
    public int tamanho(){
        return filaRegular.size();
    }
}
