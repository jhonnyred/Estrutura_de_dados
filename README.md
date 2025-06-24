# 🧱 Estrutura de Dados 
(Data Strcuture)

This repository was used to store and version the code from my Data Structures classes. These scripts contain some of my knowledge about data structures (tools, studies, implementations...) and some personal considerations about those learnings (most part is coded in portuguese, so most of the methods and classes are written in portuguese). 

## ⚒️ Tools
* ☕ Java
* 🆚 Visual Studio Code
* 🐧 WSL (Linux)


## Description
Below is some considerations and some briefs descriptions of each 
### 📁exercise (folder)
#### its classes 
   * and respective methods.


### arvres
My studies on binary trees and some challenges proposed by the professor. This was the second best part of this semester, knowing HOW to build and WHY, binaries trees was a very fun topic to learn as well, really enjoyed writing those classes and making them to work.  
#### 📁 Arvre
   * adicionar
   * buscaNo
   * preOrdem
   * emOrdem
   * posOrdem
   * remover
####No
     (only constructor)
####Main

### 📁 buscas
A quick demostration on searchs methods.
#### Buscas
   * Linear
   * Binary

### 📁 exercicio
In this exercises we used our knowledge on stacks and queue, the main class in this folder is GerenciadorTarefas (TaskManager) where we had to build up a TaskManager from scratch using 3 types of stacks and queues. I remember being very challenging at first, but as soon I got the logic it was very easy and funny to write those scripts.  
("vazia" = empty; "adicionar" = add; "remover" = remove; "tamanho" = size)
#### GerenciadorTarefas
   * addTaskPrioritaria
   * addTaskComPrioridade
   * addTaskRegular
   * proximaTarefa
   * tarefasPendentes
#### Tarefa (super class)
   * paraString
   * getDescricao
   * getData
   * setDescricao
   * setData
#### Numerica
   * adicionar
   * remover
   * vazia
   * tamanho
   * paraString
   * getListaNumerica
#### Prioritaria
   * adicionar
   * remover
   * vazia
   * tamanho
   * getListaPrioritaria
#### Regular
   * adicionar
   * remover
   * vazia
   * tamanho
   * getListaRegular
#### Main

### 📁 grafos
Here are some studies about graph, for me the best part of this semester, i learned a lot about graphs, its functions and how it works. It was really exciting and building those scripts gave me so much joy. 
#### 📁 grafoAMG
Graph using Matrix representation.
#### Grafoamg
  * add
#### 📁 grafoList
Stardard graph concept.
#### Graph
  * addVertex
  * addEdge
  * print
  * getVertexList
  * setVertexList
#### Edge
  * getInfo
  * getOrigin
  * getDestiny
  * setInfo
#### Vertex
  * addEdge
  * getInfo
  * getEdgeList
  * setEdgeList
#### Main

### 📁 jogo_memoria
The idea behind this exercise was basically making a Genius game, but, for some reason, this GUI only works on Eclipse, so i couldn't deliver this code (used VS code). But code is about failing until you succeed, maybe one day I get it done. 
#### MemoriaGUI
#### Main

### 📁 lista_ligada
Some exercises about linked list. At first kinda difficult to get the node class and its functionally, but very awesome to learn as well.
#### Listaligada
   * adicionar
   * get (it should be getIndice)
   * buscaNo
#### No
   * (only constructor)
#### Main

### 📁 pilhas
 Basically the entry point to data structures. Here you’ll find basic knowledge about stacks and an extra balancing exercise using stack concepts.
#### Balanceamento
   * validaBalanceamento
#### Pilha
   * empilhar
   * desempilhar
   * pilhaVazia
   * pilhaCheia
#### Testepilha
(actually, this is the main class, its name follows the professor’s guidelines)
