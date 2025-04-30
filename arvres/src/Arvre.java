import java.util.Scanner;

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
        int nivel = 0;

        if(info == raizTmp.info){
            return nivel;
        
        }else if(info > raizTmp.info){    
            if (raizTmp.direito == null){
                nivel = -1;
                return nivel;
            }else if(buscaNo(raizTmp.direito, info) != -1){
                nivel++;
                return nivel + buscaNo(raizTmp.direito, info);
            }

        }else if(info < raizTmp.info){
            if(raizTmp.esquerdo == null){
                nivel = -1;
                return nivel;
            }else if(buscaNo(raizTmp.esquerdo, info) != -1){
                nivel++; 
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

    public void emOrdem(){
        emOrdem(this.raiz);
    }

    private void emOrdem(No raizTmp){
        if(raiz != null){
            emOrdem(raizTmp.esquerdo);
            System.out.println(raizTmp.info);
            emOrdem(raizTmp.direito);
        }
    }

    public void posOrdem(){
        posOrdem(this.raiz);
    }

    private void posOrdem(No raizTmp){
        if(raiz != null){
            posOrdem(raizTmp.direito);
            System.out.println(raizTmp.info);
            posOrdem(raizTmp.esquerdo);
        }
    }

    // Remover
    public String remover(int info){
        return remover(this.raiz, info, 0);
    }

    private String remover(No raizTmp, int info, int nivel){
        Scanner input = new Scanner(System.in);
        int nivelTmp = 0;

        if(info == raizTmp.info && (nivelTmp + nivel) == 0){
            System.out.println("Tem certeza que quer deletar o no raiz? (Y/N)");
            String resposta = input.nextLine();

            if(resposta.toUpperCase().equals("Y")){
                this.raiz = null;
            }else{
                System.out.println("Insira um novo valor a ser removido: ");
                int novaInfo = input.nextInt();
                input.close();
                return remover(novaInfo);
            }

            
        }else if(info > raizTmp.info){
            if(raizTmp.direito == null){
                System.out.println("Valor nao encontrado");
            }else if(info == raizTmp.direito.info){
                raizTmp.direito = null;
                input.close();
                return "No " +info+ " removido";
            }else{
                nivelTmp++;
                remover(raizTmp.direito, info, nivelTmp);
            }


        }else if(info < raizTmp.info){
            if(raizTmp.esquerdo == null){
                System.out.println("Valor nao encontrado");
            }else if(info == raizTmp.esquerdo.info){
                raizTmp.esquerdo = null;
                input.close();
                return "No " +info+ " removido";
            }else{
                nivelTmp++;
                remover(raizTmp.esquerdo, info, nivelTmp);
            }
        }

        input.close();
        return "null";
    }

}
