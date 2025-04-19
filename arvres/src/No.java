public class No{
    int info;
    No esquerdo, direito;

    // CONSTRUTOR   
    public No(){}

    public No(int info){
        this.info = info;
    }

    public No(int info, No esquerdo, No direito ){
        this.info = info;
        this.esquerdo = esquerdo;
        this.direito = direito;
    }
}