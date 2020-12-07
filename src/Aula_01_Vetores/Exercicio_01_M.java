/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_01_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author Matheus
 */
public class Exercicio_01_M {
    
    public static int quantidadeVezes(int[] v, int x){
        int contador = 0;
        for (int i = 0; i < v.length; i++) {
            if(x == v[i]){
                contador++;
            }
        }
        return contador;
    }
    
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int[] v = {1,2,3,4,5,5,5,5,5,5,6,7,8,9};
        exibeVetor(v);        
        System.out.println("o numero: ("+n+") aparece "+quantidadeVezes(v,n)+" vezes no vetor:");        
    }
}
