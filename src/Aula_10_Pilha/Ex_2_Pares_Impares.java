/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_10_Pilha;

import java.util.Random;
import java.util.Stack;

/**
 *
 * @author anacris
 */
public class Ex_2_Pares_Impares {
    public static void main(String[] args) throws Exception {
        Pilha pares = new Pilha();
        Pilha impares = new Pilha();
        Random r = new Random();
        
        for(int i=0; i< 10; i++){
            int n = r.nextInt(100);
            if(n % 2 == 0)
                pares.push(n);
             else
                impares.push(n);
        }
        
        System.out.println("Pilha pares: ");
        while(!pares.vazia()){
            System.out.println(pares.pop());
        }
        
        System.out.println("Pilha ímpares: ");
        while(!impares.vazia()){
            System.out.println(impares.pop());
        }
        
    }
}
