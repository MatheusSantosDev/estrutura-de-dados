/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_ADO_02_Lista_Encadeada;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_06_ADO_02_Lista_Encadeada.Ex_12_2_MenorVetor.menorVetorR;

/**
 *
 * @author anacris
 */
public class Ex_12_3_SomaVetor {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int[] v = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("A soma dos elementos do vetor = "+
                somaVetorR(v)); 
    }

    public static int somaVetorR(int[] v) {
        return somaVetorR(v,0);
    }
     public static int somaVetorR(int[] v, int i) {
         if (i == v.length-1)
             return v[i];
         
         return v[i] + somaVetorR(v,i+1);
     }
}
