import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tarefa {
    // ATRIBUTOS
    String descricao;
    LocalDate data;
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // CONTRUTORES
    public Tarefa(){}

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public Tarefa(String descricao, String data){
        this.descricao = descricao;
        this.data = LocalDate.parse(data, formatador);
    }

    // MÉTODOS
    public String paraString(){
        String strdata = data.format(formatador);
        return descricao +" "+ strdata;
    }

    // GETTERS
    public String getDescricao(){
        return this.descricao;
    }

    public LocalDate getData(){
        return this.data;
    }

    // SETTERS
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setData(String data){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.data = LocalDate.parse(data, formatador);
    }
}
