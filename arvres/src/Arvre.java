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
            raizTmp.esquerdo = new No(info);

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
        int nivel = 1;

        if(info == raizTmp.info){
            return nivel;
        
        }else if(info > raizTmp.info){    
            if (raizTmp.direito == null){
                nivel = -1;
                return nivel;
            }else if(buscaNo(raizTmp.direito, info) != -1){
                return nivel + buscaNo(raizTmp.direito, info);
            }

        }else if(info < raizTmp.info){
            if(raizTmp.esquerdo == null){
                nivel = -1;
                return nivel;
            }else if(buscaNo(raizTmp.esquerdo, info) != -1){
                return nivel + buscaNo(raizTmp.esquerdo, info);
            }
        }

        return -1;
    }

    // Printa Nós
    public int printar(No raizTmp){
        int nivel = 1;
        System.out.println("No: " +raizTmp.info+ "Nivel: " +nivel);

        if(raizTmp.direito != null){
            return nivel + printar(raizTmp.direito);
        }else if(raizTmp.esquerdo != null){
        }else{

        }
        
    }


}
