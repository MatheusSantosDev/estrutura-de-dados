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
public class Exercicio_02_M {
    
    

    public static int indiceMaior(int v[]) {
        int indice = 0;
        int maior = 0;
        for (int i = 1; i < v.length; i++) {            
            if (maior < v[i]) {
                maior = v[i];
                indice=i;
            } 
        }        
        return indice;
    }
    
    public static void main(String[] args) {
         int[] v = {-55,2,3,0,5,55,-55,5,5,5,6,7,8,99};
        System.out.println("o maior elemento do vetor está no indice: "+indiceMaior(v));
    }
}
