# 🧱 Estrutura de Dados 

Esse é um repositório que utilizei para armazenar e versar os códigos em minhas aulas de Estrutura de Dados, nestes scripts estão alguns dos meus conhecimentos acerca de estrutura de dados (ferramentas, estudos, estruturações...). 

## ⚒️ Ferramentas
* ☕ Java
* 🆚 Visual Studio Code
* 🐧 WSL (Linux)


## Descrição
A seguir uma breve descrição de cada exercício (pasta), suas classes e seus respectivos métodos.
### pilhas
Basicamente a porta de entrada para estrutura de dados. Aqui existem conhecimentos básicos em pilha e um exercício extra de balanceamento usando os conhecimentos acerca de pilhas.
#### Balanceamento
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
#### Pilha
   * empilhar
   * desempilhar
   * pilhaVazia
   * pilhaCheia
#### Testepilha
(essa é a classe main na verdade, seu nome é devido a orientações do professor)
