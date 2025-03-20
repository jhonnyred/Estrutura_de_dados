import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarefa {
    // ATRIBUTOS
    String descricao;
    LocalDate data;

    // CONTRUTOR
    public Tarefa(String descricao, String data){
        this.descricao = descricao;
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.data = LocalDate.parse(data, formatador);
    }
}
