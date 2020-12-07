/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO_1;

import java.util.Scanner;

/**
 *
 * @author Matheus Santos
 */
public class Rearranja_9 {

    public static void imprimeVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    //função que inicializa dois vetores com valores aleatórios e tamanho escolhido pelo usuario
    public static int[] criarVetor() {
        Scanner leitor = new Scanner(System.in);
        int tam = leitor.nextInt();
        int[] v = new int[tam];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 50);
        }
        return v;
    }

    //função que reoordena o vetor de forma que, todos os valores menores ao primeiro
    //elemento fiquem na esquerda e os maiores na direita.
    public static int[] rearranjar(int v[]) {        
        int i = 0, k = 0, troca = 0;
        int j = v.length - 1;
        while (k + i < v.length - 1) {
            if (v[k] < v[k + 1]) {
                troca = v[j];
                v[j] = v[k + 1];
                v[k + 1] = troca;
                j--;
                i++;
            } else {
                troca = v[k + 1];
                v[k + 1] = v[k];
                v[k] = troca;
                k++;
            }            
        }        
        return v;
    }

    public static void main(String[] args) {
        System.out.println("Digite o tamanho do vetor: ");
        int[] v = criarVetor();
        imprimeVetor(v);
        rearranjar(v);
        System.out.println("Vetor Rearranjado: ");
        imprimeVetor(v);
    }

}
