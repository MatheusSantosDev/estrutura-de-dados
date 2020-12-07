/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_01_BuscaLinear.buscaLinear;
import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.inverter;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_02_Vetores.Ex_05_Insercao.exibeVetorTam;

/**
 *
 * @author anacris
 */
public class Ex_08a_Inters {
     public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int[] v1 = leVetorAleatorio(n1);
        exibeVetor(v1);
        
        int n2 = leInteiroPositivo();
        int[] v2 = leVetorAleatorio(n2);
        exibeVetor(v2);
        
        int vInter[] = new int[n1];
        
        int n3 = inters2Vetores(v1, v2, vInter);
        
        exibeVetorTam(vInter, n3);
    }

    public static int inters2Vetores(int[] v1, int[] v2, int[] vInter) {
       int k=0;
       
       //Percorrer o v1 e verifica se um elemento de v1 está no v2
       for (int i=0; i<v1.length; i++){
           if(buscaLinear(v2,v1[i])) { //Se estiver, copia para a inters
               vInter[k] = v1[i];
               k++;
           }
       }
       return k;
    }
}
