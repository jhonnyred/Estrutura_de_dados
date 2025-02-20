package pilhas;

public class Pilha{

    private int[] pilha;
    private int indice;

    public Pilha(int tamanho){
        pilha = new int[tamanho];
        indice = 0;
    }

    //EMPILHAR, DESEMPILHAR, PILHA CHEIA

    public void empilhar(int valor){
        if (!pilhaCheia()){
            pilha[indice] = valor;
            indice++;
        }
    }

    public int desempilhar(){
        if(!pilhaVazia()){
            indice--;
            return pilha[indice];
        }else{
            return -1;
        }
    }

    public boolean pilhaVazia(){
        if(indice == 0) return true;
        else return false;
    }
    
    public boolean pilhaCheia(){
        if(indice == pilha.length) return true;
        else return false;
    }
}

