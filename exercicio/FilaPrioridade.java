import java.util.ArrayList;
import java.util.List;

public class FilaPrioridade {
    
    // ATRIBUTOS
    private List filaNormal = new ArrayList<Pessoa>();
    private List filaPrioridade = new ArrayList<Pessoa>();


    //Método para adicionar a fila.
    //Deverá adicionar maiores de 60 anos a fila de prioridade
    public void adicionar(Pessoa p){
        if (p.getIdade()>=60){
            filaPrioridade.add(p);
        }else{
            filaNormal.add(p);
        }
    }

    //Método para Remover da fila
    //Remove os itens da fila de prioridade primeiro
    public Pessoa remover(){
        if(!filaPrioridade.isEmpty()){
            return filaPrioridade.remove(0);
        }else if(!filaNormal.isEmpty()){
            return filaNormal.remove(0);
        }
        return null;
    }

    public int tamanho(){
        return 0;
    }
}