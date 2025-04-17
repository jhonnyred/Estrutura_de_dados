package pilhas;
import java.util.ArrayList;

public class Testepilha {
    public static void main(String[] args){

        // TESTE empilhar 10 elementos e desempilhar
        Pilha pilhazinha = new Pilha(10);
        System.out.println("Empilhando: ");
        
        for (int i=10; i<20; i++){
            System.out.print(i + " | ");
            pilhazinha.empilhar(i);
        }
        System.out.println();

        //TESTE desempilhar 10 elementos
        System.out.println("Desempilhar: ");
        while(!pilhazinha.pilhaVazia()){
            System.out.print(pilhazinha.desempilhar() + " | ");
        }
        
    }
}
