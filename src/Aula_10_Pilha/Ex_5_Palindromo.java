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
public class Ex_5_Palindromo {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = entrada.nextLine();
        
        Pilha p = new Pilha();
        for (int i=0; i < palavra.length(); i++){
            p.push(palavra.charAt(i));
        }
        
        String p_inv = "";
        while (!p.vazia()){
           String x = (String) p.pop(); 
           p_inv = p_inv + x;
        }
        
        if(palavra.equals(p_inv)){
            System.out.printf("%s é palindromo.\n", palavra);
        } else {
            System.out.printf("%s NAO é palindromo.\n", palavra);
        }
        
    }
}
