import java.util.ArrayList;

public class Regular extends Tarefa{
    // ATRIBUTOS
    private ArrayList<Tarefa> filaRegular = new ArrayList<>();

    // CONSTRUTORES
    public Regular(){}

    public Regular(String descricao, String data){
        super(descricao, data);
    }
    // METODOS
    // adicionar
    public void adicionar(Tarefa t){
        filaRegular.add(t);
    }

    // remover
    public Tarefa remover(){
        if(!vazia()){
            Tarefa t = filaRegular.get(0);
            filaRegular.remove(0);
            return t;
        }

        return null;
    }

    // boolean vazia
    public boolean vazia(){
        if(filaRegular.isEmpty()){
            return true;
        }
        return false;
    }
    
    // tamanho
    public int tamanho(){
        return filaRegular.size();
    }

    // GETTERS
    public ArrayList<Tarefa> getListaRegular(){
        return filaRegular;
    }
}
