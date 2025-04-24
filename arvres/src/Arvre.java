public class Arvre {
    No raiz;

    // CONSTRUTOR
    public Arvre(){
    }

    // Adicionar
    public void adicionar(int info){
        adicionar(this.raiz, info);
    }

    private void adicionar(No raizTmp, int info){
        if(raizTmp == null){
            this.raiz = new No(info);

        }else{
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
    }

    // Busca Nó 
    public int buscaNo(int info){
        return buscaNo(this.raiz, info);
    }

    private int buscaNo(No raizTmp, int info){
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

    // // Printa Nós
    public void preOrdem(){
        preOrdem(this.raiz);
    }

    private void preOrdem(No raizTmp){
        if(raiz != null){
            System.out.println(raizTmp.info);

            if(raizTmp.esquerdo != null){
                preOrdem(raizTmp.esquerdo);
            }

            if(raizTmp.direito != null){
                preOrdem(raizTmp.direito);
            }
        }
    }

    // Remover


}
