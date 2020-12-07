/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_Desempenho;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author anacris
 */
public class Ex_06_TrocaMaiorMenor {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int[] v = leVetorAleatorio(n);
        exibeVetor(v);
        trocaMaiorMenor(v);
        exibeVetor(v);
    }

    public static void trocaMaiorMenor(int[] v) {
        int posMaior = 0;
        int posMenor = 0;
        
        for (int i=1; i < v.length; i++){
            if (v[i] > v[posMaior]){  
                posMaior = i;
            } else {
                if (v[i] < v[posMenor]){  
                    posMenor = i;
                }
            }        
        }
        //troca posição do Maior e do Menor
        troca(v, posMaior, posMenor);
    } 

    public static void troca(int[] v, int posMaior, int posMenor) {
        int aux = v[posMaior];
        v[posMaior] = v[posMenor];
        v[posMenor] = aux;
    }
     
}
