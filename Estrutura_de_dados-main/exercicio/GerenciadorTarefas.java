import java.util.ArrayList;

public class GerenciadorTarefas {
    // ATRIBUTOS
    Prioritaria prioritaria = new Prioritaria();
    Numerica numerica = new Numerica();
    Regular regular = new Regular();
    
    // CONSTRUTOR
    public GerenciadorTarefas(){}

    // MÉTODOS
    // ADICIONAR
    // Prioritaria
    public Tarefa addTaskPrioritaria(String descricao, String data){
        Tarefa tarefa = new Tarefa(descricao, data);
        prioritaria.adicionar(tarefa);
        return tarefa;
    } 

    // Numerica
    public Numerica addTaskComPrioridade(String descricao, String data, int valor){
        Numerica tarefa = new Numerica(descricao, data, valor);
        numerica.adicionar(tarefa);
        return tarefa;
    }

    // Regular
    public Tarefa addTaskRegular(String descricao, String data){
        Tarefa tarefa = new Tarefa(descricao, data);
        regular.adicionar(tarefa);
        return tarefa;
    }

    // PROCESSAR
    public Tarefa proximaTarefa(){
        if(!prioritaria.vazia()){
            return prioritaria.remover();

        }else if(!numerica.vazia()){
            return numerica.remover();

        }else if(!regular.vazia()){
            return regular.remover();
        }

        return null;
    }

    // PENDENTES
    public void tarefasPendentes(){
        ArrayList<Tarefa> lista = new ArrayList<>();
        ArrayList<Numerica> listaNum = new ArrayList<>(); 
        
        System.out.println("Tarefas Prioritarias: ");
        lista = prioritaria.getListaPrioritaria();
        if(!prioritaria.vazia()){
            for(Tarefa t : lista){
                System.out.println(t.paraString());
            }
        }else{
            System.out.println("Fila de prioridades vazia.");
        }

        System.out.println("\nTarefas Com Prioridade: ");
        listaNum = numerica.getListaNumerica();
        if(!numerica.vazia()){
            for(Tarefa t : listaNum){
                System.out.println(t.paraString());
            }
        }else{
            System.out.println("Fila com prioridade vazia.");
        }

        System.out.println("\nTarefas Regulares:");
        lista = regular.getListaRegular();
        if(!regular.vazia()){
            for(Tarefa t : lista){
                System.out.println(t.paraString());
            }
        }else{
            System.out.println("Fila regular vazia.");
        }

    }
}
