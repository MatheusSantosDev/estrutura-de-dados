/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_M;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Ex_1_Parenteses_colchetes {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma sequencia de () e []");
        String seq = entrada.next();
        
        Pilha p = new Pilha();
        for (int i = 0; i < seq.length(); i++) {
            char character = seq.charAt(i);
            if(character == '(' || character == '['){
                p.push(character);
            }else{
                if(p.vazia()){
                    System.out.println("A Sequencia não esta bem formada");
                    return;
                }
                char charTopo = (char) p.pop();                
               
            }
        }
    }
}
