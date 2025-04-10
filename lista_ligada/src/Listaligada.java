public class Listaligada {
    No primeiroNo;
    No ultimoNo;
    int indice;
    int qtd;

    // metodo adicionar
    public void adicionar(String info){
        // Criar novo nó
        No aux = new No(info);

        // se a lista estiver vazia 
        // iremos apontar primeiroNo e ultimoNo
        // para o no auxiliar (novoNo)

        if (qtd==0){
            primeiroNo = aux;
            ultimoNo = aux;
            qtd++;
        }else{
            ultimoNo.proximo = aux;
            ultimoNo = aux;

            qtd++;
        }
    }

    // adicionar por index
    public void adicionar(String info, int indice){
        No aux = new No(info);
        
        if(indice == 0){
            aux.proximo = primeiroNo;
            primeiroNo = aux;
            qtd++;
        }else if(indice == qtd){
            adicionar(info);
        }else{
            aux.proximo = buscaNo(indice);
            buscaNo(indice-1).proximo = aux;
            qtd++;
        }
    }

    // metodo get
    public String get(int indice){
        return buscaNo(indice).info;
    }

    // buscar no
    public No buscaNo(int indice){
        No temp;
        if(indice<0 || indice>=qtd){
            throw new IndexOutOfBoundsException("Indice invalido");
        }


        temp = primeiroNo;
        
        for(int i=0; i<indice; i++){
            temp = temp.proximo;
        }

        return temp;
    }
}
