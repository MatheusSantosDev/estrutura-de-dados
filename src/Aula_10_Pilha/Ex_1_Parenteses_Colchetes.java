/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_10_Pilha;

import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_1_Parenteses_Colchetes {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sequencia de [] e(): ");
        String seq = entrada.nextLine();
        
        Pilha p = new Pilha();
        for (int i=0; i < seq.length(); i++){
            char caracter = seq.charAt(i);
            if (caracter == '(' || caracter == '['){
                p.push(caracter);
            }
            else {
                if (p.vazia()){
                    System.out.println("1. A sequencia NAO está bem formada.");
                    return;
                }
                char charTopo = (char) p.pop();
                
                //Analisando as incompatibilidades
                if(charTopo == '[' && caracter == ')'){
                    System.out.println("2. A sequencia NAO está bem formada.");
                    return;
                }
                if(charTopo == '(' && caracter == ']'){
                    System.out.println("3. A sequencia NAO está bem formada.");
                    return;
                }
            }
        }
        
        //Avaliar o estado da pilha
        if (!p.vazia())
            System.out.println("4. A sequencia NAO está bem formada.");
        else
            System.out.println("A sequencia está bem formada.");
        
    }
}
