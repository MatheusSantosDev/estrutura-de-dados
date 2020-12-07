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
public class Pilha_Vetor {
    private Object item[];
    private int topo;
    
    //Cria uma pilha vazia
    public Pilha_Vetor(int tamMax){
        this.item = new Object[tamMax];
        this.topo = 0;
    }
    //Verifica se a pilha está vazia
    public boolean vazia(){
        return this.topo == 0;
    }
    
    //Empilhar um elemento no topo
    public void push(Object x) throws Exception{
        if (this.topo == this.item.length){
            throw new Exception ("Erro: Pilha está cheia.");
        }
        this.item[topo]=x;
        this.topo++;
    }
    
    //Desempilhar um elemento no topo
    public Object pop() throws Exception{
        if (this.vazia()){
            throw new Exception ("Erro: Pilha está vazia.");
        }
        this.topo--;
        return this.item[topo];
    }
    
    //Tamanho da pilha
    public int size(){
        return this.topo;
    }
    
}
