/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_M;

import java.util.Random;

/**
 *
 * @author Matheus
 */
public class Ex_2_Pares_Impares {
    public static void main(String[] args) throws Exception {
        Pilha pares = new Pilha();
        Pilha impares = new Pilha();
        Random r = new Random();
        
        for (int i = 0; i < 10; i++) {
            int n = r.nextInt(100);
            if(n%2==0)
                pares.push(n);
            else
                impares.push(n);
        }
        
        System.out.println("Pilha pares");
        while(!pares.vazia()){
            System.out.println(pares.pop());
        }
        System.out.println("Pilha impares");
        while(!impares.vazia()){
            System.out.println(impares.pop());
        }
    }
}
