/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author anacris
 */
public class Ex_05_Insercao {
    public static void main(String[] args) {
        int v[] = new int[30];
        int n = leInteiroPositivo(); //n <= 30
        leVetorAleatorioTam(v,n);
        exibeVetor(v);
        exibeVetorTam(v,n);
        
        int novoN = insercao(v,n,77,5); //inserir o elemento 77 na posição 5 do vetor
        
        exibeVetorTam(v,novoN);
        
    }
    public static void leVetorAleatorioTam (int v[], int n) {
       for (int i=0; i < n;i++){
           v[i]=(int)(Math.random()*50);
       }
    }
    
    public static void exibeVetorTam(int[] v, int n) {
        for (int i=0; i < n;i++){
            System.out.print(v[i]+ " ");
       }
       System.out.println("");
    }

    public static int insercao(int[] v, int n, int x, int pos) {
        for (int i = n; i > pos; i--){
            v[i] = v[i-1];
        }        
        //i = pos
        v[pos] = x;
           
        return n+1;
    }
}
