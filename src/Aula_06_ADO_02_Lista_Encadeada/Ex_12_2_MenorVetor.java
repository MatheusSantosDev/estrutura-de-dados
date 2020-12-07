/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_ADO_02_Lista_Encadeada;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author anacris
 */
public class Ex_12_2_MenorVetor {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int[] v = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println(menorVetorR(v)); 
    }

    /*
    Se n = 1, v[0] é menor elemento
    Se n > 1, o menor será o mínimo entre v[n-1] e
    o restante do v[0..n-2]
    
    public static int menorVetorR(int[] v) {
       return menorVetorR(v, v.length);
    }
    
    public static int menorVetorR(int[] v, int i) {
        if (i == 1)
            return v[0];
        
        if (v[i-1] < menorVetorR(v,i-1))
            return v[i-1];
        else
            return menorVetorR(v,i-1);
    }
*/
    public static int menorVetorR(int[] v) {
       return menorVetorR(v,0);
    }
    
    public static int menorVetorR(int[] v, int i) {
        if (i == v.length-1)
            return v[i];
        
        if (v[i] < menorVetorR(v,i+1))
            return v[i];
        else
            return menorVetorR(v,i+1);
    }
}
