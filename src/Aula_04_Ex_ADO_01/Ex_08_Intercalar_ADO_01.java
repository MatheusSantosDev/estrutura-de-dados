/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Ex_ADO_01;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_04_Ex_ADO_01.Ex_06_exibeInterseccao.bubbleSort;
import static Aula_04_Ex_ADO_01.Ex_06_exibeInterseccao.exibeInters2Vetores;

/**
 *
 * @author anacris
 */
public class Ex_08_Intercalar_ADO_01 {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int[] A = leVetorAleatorio(n);
        bubbleSort(A);
        exibeVetor(A);
        
        int m = leInteiroPositivo();
        int[] B = leVetorAleatorio(m);
        bubbleSort(B);
        exibeVetor(B);
        
        int C[] = intercalar2Vetores(A,B);
        
        System.out.println("Os elementos da intercalação são: ");
        exibeVetor(C);
        
    }

    //O método de intercalar 2 vetores com O(n)
    public static int[] intercalar2Vetores(int[] A, int[] B) {
        int C[] = new int[A.length + B.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (k < C.length){
            if (i == A.length) {// cai do vetor A, tem sobras em B
                C[k] = B[j];
                j++;
                k++;
            } else if (j == B.length) {// cai do vetor B, tem sobras em A
                     C[k] = A[i];
                     i++;
                     k++;
                   } else if (A[i] < B[j]) {
                             C[k] = A[i];
                             i++;
                             k++;
                      } else {
                            C[k] = B[j];
                            j++;
                            k++;
                        }           
        }
        return C;
    }
}
