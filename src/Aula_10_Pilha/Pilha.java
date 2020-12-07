/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_10_Pilha;

/**
 *
 * @author anacris
 */
public class Pilha {
    private No topo;
    private int tam;
    
    //Criar a pilha vazia
    public Pilha(){
        this.topo = null;
        this.tam = 0;
    }
   
    //Verificar se a pilha está vazia
    public boolean vazia(){
        return this.tam == 0;
    }
    
    //Empilhar um elemento no topo (inserção no início)
    public void push(Object x){
        No novo = new No(x, topo);
        topo = novo;
        this.tam++;
    }
    //Desempilhar um elemento no topo (remoção no início)
    public Object pop() throws Exception{
       if (vazia()){
            throw new Exception ("Erro: pilha vazia");
       }
       Object elemento = this.topo.getElemento();
       topo = topo.getProx();
       this.tam--;
       return elemento;
    }
    
    //Tamanho da pilha em tempo constante
    public int size(){
        return this.tam;
    }

    @Override
    public String toString() {
        return "Pilha{" + "topo=" + topo + ", tam=" + tam + '}';
    }
    
}
