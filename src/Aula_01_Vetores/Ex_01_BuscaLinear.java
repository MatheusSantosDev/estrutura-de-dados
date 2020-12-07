/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_01_Vetores;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_01_Vetores.Ex_04_Inverter.leVetorAleatorio;
import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_01_BuscaLinear {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int[] v = leVetorAleatorio(n);
        exibeVetor(v);
        
        System.out.print("\nDigite o elemento que deseja buscar: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if(buscaLinear(v,x)){
            System.out.printf("\n%d está no vetor", x);
        } else {
            System.out.printf("\n%d NAO está no vetor", x);
        }
        
    }

    public static boolean buscaLinear(int[] v, int x) {
       for (int i=0; i<v.length;i++){
           if(v[i] == x) {
               return true; //Achou
           }
       }
       return false; //Não achou
    }
}
