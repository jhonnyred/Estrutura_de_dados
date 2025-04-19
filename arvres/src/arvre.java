public class arvre {
    No raiz;

    // Busca um no filho que seja null
    public void adicionar(No raiz, int info){

        if(info < raiz.info){
            if(raiz.esquerdo == null){
                raiz.esquerdo = new No(info);
            }else{
                adicionar(raiz.esquerdo, info);
            }
            
        }

        if(raiz.direito == null){
            raiz.direito = new No(info);
        }else{
            adicionar(raiz.direito, info);
        }
    }
}
