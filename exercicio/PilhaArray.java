public class PilhaArray {
    // ATRIBUTOS
    private int[] pilha;
    private int indice;
    
    // CONSTRUTOR
    public PilhaArray(int tamanho){
        pilha = new int[tamanho];
        indice=0;
    }
    
    //Métodos: Empilhar, Desempilhar, PilhaVazia, PilhaCheia
    public void empilhar(int valor){
        if(!pilhaCheia()){
            pilha[indice]=valor;
            indice++;
        }
    }

    public int desempilhar(){
        if(!pilhaVazia()){
            indice--;
            return pilha[indice];
        }
        return -1;
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
    
