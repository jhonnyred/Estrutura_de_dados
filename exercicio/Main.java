public class Main{
    public static void main(String[] args){
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        // Adicionando Tarefas
        gerenciador.addTaskRegular("Enviar email para cliente", "22/03/2025");
        gerenciador.addTaskPrioritaria("Revisar contrato urgente", "22/03/2025");
        gerenciador.addTaskComPrioridade("Atualizar sistema de segurança", "22/03/2025", 8);
        gerenciador.addTaskComPrioridade("Ajustar orçamento do projeto", "22/03/2025", 3);
        gerenciador.addTaskRegular("Organizar reunião de equipe", "23/03/2025");
        gerenciador.addTaskPrioritaria("Comprar suprimentos para escritório", "23/03/2025");

        // Processando Tarefas
        gerenciador.proximaTarefa();
        gerenciador.proximaTarefa();
        gerenciador.proximaTarefa();

        // Tarefas Pendentes
        gerenciador.tarefasPendentes();
    }
}