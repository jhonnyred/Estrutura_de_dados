public class Main {
    public static void main(String[] args){
        Listaligada minhaLista = new Listaligada();

        minhaLista.adicionar("A");
        minhaLista.adicionar("B");
        minhaLista.adicionar("C");

        // lista padrão
        for(int i=0; i<minhaLista.qtd; i++){
            System.out.println(minhaLista.get(i));
        }

        // lista com informação extra
        minhaLista.adicionar("Z", 2);

        for(int i=0; i<minhaLista.qtd; i++){
            System.out.println(minhaLista.get(i));
        }

       // System.out.println(minhaLista.get(2));
    }
}
