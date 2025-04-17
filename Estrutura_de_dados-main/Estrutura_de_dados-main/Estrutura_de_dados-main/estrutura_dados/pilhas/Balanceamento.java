package pilhas;

public class Balanceamento {
    
    public static boolean validaBalanceamento(String texto){
        Pilha pilha = new Pilha(texto.length());
        
        for(int i=texto.length(); i>=0; i--){
            char simbolo = texto.charAt(i);
            switch(simbolo){
                case '(':
                   pilha.empilhar('(');
                   break;
                
                case '[':
                   pilha.empilhar('[');
                   break;

                case '{':
                   pilha.empilhar('{');
                   break;

                case ')':
                   pilha.empilhar(')');
                   break;

                case ']':
                   pilha.empilhar(']');
                   break;
                
                case '}':
                   pilha.empilhar('}');
                   break;
            }

            
        }

        return false;
    }
}
