public class main{
   public static void main(String[] args){
    Arvre minhaArvore = new Arvre();

    // ADICIONANDO NÓS
    minharArvora.adicionar(0);
    minhaArvore.adicionar(4);
    minhaArvore.adicionar(-2);
    minhaArvore.adicionar(-3);
    minhaArvore.adicionar(-1);
    minhaArvore.adicionar(7);
    minhaArvore.adicionar(5);
    minhaArvore.adicionar(3);
    minhaArvore.adicionar(2);
    minhaArvore.adicionar(8);
    minhaArvore.adicionar(6);

    // NIVEL
    System.out.println("\n\n\nCertos");
    System.out.println(" info: 0 numero de nivel: "+ minhaArvore.buscaNo(0));
    System.out.println(" info: 4 numero de nivel: "+ minhaArvore.buscaNo(4));
    System.out.println(" info: -2 numero de nivel: "+ minhaArvore.buscaNo(-2));
    System.out.println(" info: -3 numero de nivel: "+ minhaArvore.buscaNo(-3));
    System.out.println(" info: -1 numero de nivel: "+ minhaArvore.buscaNo(-1));
    System.out.println(" info: 7 numero de nivel: "+ minhaArvore.buscaNo(7));
    System.out.println(" info: 5 numero de nivel: "+ minhaArvore.buscaNo(5));
    System.out.println(" info: 3 numero de nivel: "+ minhaArvore.buscaNo(3));
    System.out.println(" info: 2 numero de nivel: "+ minhaArvore.buscaNo(2));
    System.out.println(" info: 8 numero de nivel: "+ minhaArvore.buscaNo(8));
    System.out.println(" info: 6 numero de nivel: "+ minhaArvore.buscaNo(6));
    System.out.println("\nErrados");
    System.out.println(" info: 12 numero de nivel: "+ minhaArvore.buscaNo(12));


    // 
    } 
}
