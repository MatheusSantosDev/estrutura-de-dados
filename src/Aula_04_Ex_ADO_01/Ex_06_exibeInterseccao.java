/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Ex_ADO_01;

import static Aula_01_Vetores.Ex_01_BuscaLinear.buscaLinear;
import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_03_Desempenho.Ex_06_TrocaMaiorMenor.troca;

/**
 *
 * @author anacris
 */
public class Ex_06_exibeInterseccao {
     public static void main(String[] args) {
        int n = leInteiroPositivo();
        int[] A = leVetorAleatorio(n);
        bubbleSort(A);
        exibeVetor(A);
        
        int[] B = leVetorAleatorio(n);
        bubbleSort(B);
        exibeVetor(B);
        
        System.out.println("Os elementos da intersecção são: ");
        exibeInters2Vetores(A,B);
        
    }

    //Método que exibe a intersecção com desempenho O(n)
    public static void exibeInters2Vetores(int[] A, int[] B) {
      int i = 0;
      int j = 0;
      
      while (i< A.length && j<B.length){
          if (A[i] == B[j]){
              System.out.print(A[i] + " ");
              i++;
              j++;
          } else if (A[i] < B[j]){
                    i++;
                 } else {
                    j++;
                 }
      }
       
    }

    //Método baseado em trocas e tem desempenho  O(nˆ2)
    public static void bubbleSort(int[] A) {
        for (int i=0; i < A.length - 1; i++) // (n-1) vezes
            for (int j=0; j < A.length - 1 - i; j++){
                if (A[j] > A[j+1]) {
                    troca (A, j, j+1);
                }
            }
    }
}
