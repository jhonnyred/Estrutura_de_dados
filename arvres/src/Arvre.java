public class Arvre {
    No raiz = new No();

    // CONSTRUTOR
    public Arvre(int info){
        this.raiz.info = info;
    }

    // Busca um no filho que seja null
    public void adicionar(int info){
        adicionar(this.raiz, info);
    }

    public void adicionar(No raizTmp, int info){

        if(info == raizTmp.info){
            System.out.println(info + " ja é a raiz desta arvore");

        }else if(info < raizTmp.info){
            if(raizTmp.esquerdo == null){
                raizTmp.esquerdo = new No(info);
            }else{
                adicionar(raizTmp.esquerdo, info);
            }
            
        }else {
            if(raizTmp.direito == null){
                raizTmp.direito = new No(info);
            }else{
                adicionar(raizTmp.direito, info);
            }
        }
    }

    // Busca Nó 
    public int buscaNo(int info){
        return buscaNo(this.raiz, info);
    }

    public int buscaNo(No raizTmp, int info){
        int profundidade = 1;

        if(info == raizTmp.info){
            return profundidade;
        
        }else if(info > raizTmp.info){    
            if (raizTmp.direito == null){
                profundidade = -1;
                return profundidade;
            }else if(buscaNo(raizTmp.direito, info) != -1){
                return profundidade + buscaNo(raizTmp.direito, info);
            }

        }else if(info < raizTmp.info){
            if(raizTmp.esquerdo == null){
                profundidade = -1;
                return profundidade;
            }else if(buscaNo(raizTmp.esquerdo, info) != -1){
                return profundidade + buscaNo(raizTmp.esquerdo, info);
            }
        }

        return -1;
    }
}
