/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_05_Insercao.exibeVetorTam;
import static Aula_02_Vetores.Ex_05_Insercao.insercao;
import static Aula_02_Vetores.Ex_05_Insercao.leVetorAleatorioTam;
import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_06_Remocao {
    public static void main(String[] args) {
        int v[] = new int[30];
        int n = leInteiroPositivo(); //n <= 30
        leVetorAleatorioTam(v,n);
        exibeVetor(v);
        exibeVetorTam(v,n);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que deseja remover: ");
        int x = sc.nextInt();
        
        int pos = buscaLinearTam (v, n, x);
        if (pos != -1){
             int novoN = remocao(v,n,pos); 
             exibeVetorTam(v,novoN);
        } else {
            System.out.printf("\nO elemento %d NAO está no vetor", x);
        }
        
    }
    public static int buscaLinearTam(int[] v, int n, int x) {
       for (int i=0; i< n;i++){
           if(v[i] == x) {
               return i; //Achou
           }
       }
       return -1; //Não achou
    }

    public static int remocao(int[] v, int n, int pos) {
       for (int i = pos; i < n; i++){
            v[i] = v[i+1];
        }        
        return n-1;
    }
    
}
