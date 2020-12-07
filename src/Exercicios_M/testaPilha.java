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
public class testaPilha {
    public static void main(String[] args) throws Exception {
        Pilha pilha1 = new Pilha();
        pilha1.push(1);
        pilha1.push(4);
        pilha1.push(7);
        pilha1.push(3);
        
        System.out.println("Pilha pares");
        while(!pilha1.vazia()){
            System.out.println(pilha1.pop());
        }
    }
}
