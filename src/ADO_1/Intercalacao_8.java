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
public class Intercalacao_8 {

    public static void imprimeVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    //função que inicializa dois vetores com valores aleatórios e crescentes
    public static int[] criarVetor() {
        Scanner leitor = new Scanner(System.in);
        int tam = leitor.nextInt();
        int[] v = new int[tam];
        int escala = 1;//uma variavel para auxiliar na criação de numeros aleatorios crescentes.
        v[0] = (int) (Math.random() * 10);
        for (int i = 1; i < v.length; i++) {
            v[i] = (int) (Math.random() * escala);
            if (v[i] < v[i - 1]) {
                i--;
            }
            escala += 10;
        }
        return v;
    }

    //função que intercala dois vetores em um terceiro em ordem crescente
    public static int[] intercalacao(int a[], int b[]) {        
        int c[] = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }            
        }
        while (i < a.length) {
            c[k++] = a[i++];            
        }
        while (j < b.length) {
            c[k++] = b[j++];            
        }        
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Digite o tamanho do primeiro vetor: ");
        int[] a = criarVetor();
        imprimeVetor(a);

        System.out.println("Digite o tamanho do Segundo vetor: ");
        int[] b = criarVetor();
        imprimeVetor(b);

        int[] c = intercalacao(a, b);
        System.out.println("Vetor C intercalado: ");
        imprimeVetor(c);
    }

}
