import java.util.ArrayList;

public class Prioritaria extends Tarefa{
    // ATRIBUTOS
    private ArrayList<Tarefa> filaPrioritaria = new ArrayList<>();

    // CONSTRUTORES
    public Prioritaria(){}

    public Prioritaria(String descricao, String data){
        super(descricao, data);
    }

    // METODOS
    // adicionar
    public void adicionar(Tarefa t){
        filaPrioritaria.add(t);
    }
    
    // remover
    public Tarefa remover(){
        if(!vazia()){
            Tarefa t = filaPrioritaria.get(filaPrioritaria.size()-1);
            filaPrioritaria.remove(filaPrioritaria.size()-1);
            return t;
        }
        return null;
    }

    // boolean vazia
    public boolean vazia(){
        if(filaPrioritaria.isEmpty()){
            return true;
        }
        return false;
    }

    // tamanho
    public int tamanho(){
        return filaPrioritaria.size();
    }

    // GETTERS
    public ArrayList<Tarefa> getListaPrioritaria(){
        return filaPrioritaria;
    }
}
