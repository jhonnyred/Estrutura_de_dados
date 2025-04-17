import java.util.ArrayList;


public class Numerica extends Tarefa{
    // ATRIBUTOS
    private ArrayList<Numerica> filaNumerica = new ArrayList<>();
    private int valor;

    // CONSTRUTOR
    public Numerica(){}

    public Numerica(String descricao, String data, int valor){
        super(descricao, data);
        if (valor <= 0){
            throw new IllegalArgumentException("Valor inválido: " + valor + ". O valor deve ser maior que zero.");
        }
        this.valor = valor;
    }

    // METODOS
    public void adicionar(Numerica n){
        filaNumerica.add(n);
    }

    public Tarefa remover(){
        if(!vazia()){
            int valorMenor = Integer.MAX_VALUE;
            Numerica remocao = null;
    
            for(Numerica t : filaNumerica){
                if(t.valor < valorMenor){
                    valorMenor = t.valor;
                    remocao = t;
                }
            }
    
            if(remocao != null){
                Tarefa t = filaNumerica.get(filaNumerica.indexOf(remocao));
                filaNumerica.remove(remocao);
                return t;
            }
    
            return null;
        }

        return null;
    }

    public boolean vazia(){
        if(filaNumerica.isEmpty()){
            return true;
        }
        return false;
    }

    public int tamanho(){
        return filaNumerica.size();
    }

    @Override
    public String paraString(){
        String strdata = data.format(formatador);
        return descricao +" "+ strdata +" Prioridade: "+ valor;
    }

    // GETTERS
    public ArrayList<Numerica> getListaNumerica(){
        return filaNumerica;
    }
}
