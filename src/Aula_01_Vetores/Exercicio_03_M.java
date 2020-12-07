/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_01_Vetores;

/**
 *
 * @author Matheus
 */
public class Exercicio_03_M {

    public static int indiceMenor(int v[]) {
        int indice = 0;
        int menor = v[0];
        for (int i = 1; i < v.length; i++) {                
            if (menor > v[i]) {
                menor = v[i];
                indice = i;
            } 
        }        
        return indice;
    }
    
    public static void main(String[] args) {
         int[] v = {10,2,3,4,5,55,5,1,5,5,6,6,8,9};
        System.out.println("o menor elemento do vetor está no indice: "+indiceMenor(v));
    }
}
