/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_M;

/**
 *
 * @author Matheus
 */
public class Pilha {

    private No topo;

    private int tam;

    public Pilha() {
        this.topo = null;
        this.tam = 0;
    }

    //verificar se está vazia;
    public boolean vazia() {
        return this.tam == 0;
    }

    //Empilhar um elemento no topo (inserção no inicio)
    public void push(Object x) {
        No novo = new No(x, topo);
        topo = novo;
        this.tam++;
    }

    //desempilhar um elemento do topo
    public Object pop() throws Exception {
        if (vazia()) {
            throw new Exception("Erro: pilha está cheia");
        }
        Object elemento = this.topo.getElemento();
        topo = topo.getProx();
        this.tam--;
        return elemento;
    }

    public int size() {
        return this.tam;
    }

    @Override
    public String toString() {
        return "Pilha{" + "topo=" + topo + ", tam=" + tam + '}';
    }
}
