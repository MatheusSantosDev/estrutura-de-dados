/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_01_BuscaLinear.buscaLinear;
import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_02_Vetores.Ex_05_Insercao.exibeVetorTam;

/**
 *
 * @author anacris
 */
public class Ex_08b_Uniao {
    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int[] v1 = leVetorAleatorio(n1);
        exibeVetor(v1);
        
        int n2 = leInteiroPositivo();
        int[] v2 = leVetorAleatorio(n2);
        exibeVetor(v2);
        
        int vUniao[] = new int[n1+n2];
        
        int n3 = uniao2Vetores(v1, v2, vUniao);
        
        exibeVetorTam(vUniao, n3);
    }

    public static int uniao2Vetores(int[] v1, int[] v2, int[] vUniao) {
       int k=0;
       
       //Copiar todos os elementos do v1 para VUniao
       for (int i=0; i<v1.length; i++) {
           vUniao[k] = v1[i];
           k++;
       }
       //Percorrer o v2 e verificar se um elemento NÃO está em v1
       for (int i=0; i<v2.length; i++){
           if(!buscaLinear(v1,v2[i])) { //Se não estiver, copia para a Uniao
               vUniao[k] = v2[i];
               k++;
           }
       }
       return k;
    }
}
