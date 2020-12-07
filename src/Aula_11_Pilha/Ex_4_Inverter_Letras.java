/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_11_Pilha;

import Aula_10_Pilha.Pilha;
import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_4_Inverter_Letras {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um texto (final com .): ");
        String texto = entrada.nextLine();
        System.out.println("O texto com letras invertidas: ");
        System.out.println(inv_Letra2(texto));
    }
    public static String inv_Letra(String texto) throws Exception{
      String inv = "";
      Pilha p = new Pilha();
      
      for (int i=0; i < texto.length(); i++){
          if(texto.charAt(i) != ' ' && texto.charAt(i) != '.'){
                 p.push(texto.charAt(i));
          } else {
             while (!p.vazia()){
               inv = inv + p.pop();
             } 
             inv = inv + texto.charAt(i); //Insere o caracter de espaço ou ponto
          }
      }
      return inv;
    }
    
     public static String inv_Letra2(String texto) throws Exception{
      String vetorLinha[] = texto.split("\\b");
      exibeVetorString(vetorLinha);  
        Pilha pilha = new Pilha();
        
        for(int i=vetorLinha.length-1; i>=0; i--) {
            if(vetorLinha[i].matches("[a-zA-ZÀ-ú]+")) {
                for(int j=0;j<vetorLinha[i].length();j++) {
                    char caracter = vetorLinha[i].charAt(j);
                    pilha.push(caracter);
                }
            } else {
                pilha.push(vetorLinha[i]);
            }
        }
        
        String resposta = "";
        while(!pilha.vazia()) {
            resposta += pilha.pop();
            System.out.println(pilha.pop());
        } 
        return resposta;
    }
     public static void exibeVetorString(String[] v) {
        System.out.println();
        for (int i=0; i<v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
