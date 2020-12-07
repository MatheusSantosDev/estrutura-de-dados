/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Ex_ADO_01;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_03_Desempenho.Ex_06_TrocaMaiorMenor.troca;

/**
 *
 * @author anacris
 */
public class Ex_09_Rearranjar_ADO_01 {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        //int[] A = leVetorAleatorio(n);
        //int A[] = {5,6,2,7,9,1};
        int A[] = {5,6,2,7,9,1,8,3,7};
        exibeVetor(A);
        
        rearranjarVetor(A);
        
        System.out.println("O vetor rearranjado ou particionado são: ");
        exibeVetor(A);
    }  

    public static void rearranjarVetor(int[] A) {
       int pivo = A[0];
       int i = 1;
       int j = A.length-1;
       
       while (i <= j){
           if (pivo >= A[i]){
               i++;
           } else if (pivo < A[j]){
                     j--;
                  } else {
                      troca(A, i, j);
                      i++;
                      j--;
                    }
       }
       //Trocar o pivo com o elemento da posição j
       troca(A, 0, j);
    }
}
