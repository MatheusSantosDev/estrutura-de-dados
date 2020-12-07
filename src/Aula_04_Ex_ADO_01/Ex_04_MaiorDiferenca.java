/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Ex_ADO_01;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author anacris
 */
public class Ex_04_MaiorDiferenca {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int[] v = leVetorAleatorio(n);
        exibeVetor(v);
    
        int dif[] = maiorDif(v);
        System.out.println("O par que dá a maior diferença é: ");
        exibeVetor(dif);
    }

    public static int[] maiorDif(int[] v) {
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
        int resp[] = {v[posMaior], v[posMenor]};
        return resp;
    }
}
