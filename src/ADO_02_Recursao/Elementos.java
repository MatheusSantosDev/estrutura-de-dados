/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO_02_Recursao;

import static Aula_01_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author Matheus Santos
 */
public class Elementos {

    public static void main(String[] args) {
        //int[] v = {1, 2, 5, 4, 7, 8, 7, 9, 10, 55, 20,}; // vetor alternativo para teste 
        int[] v = {10, 2, 5, 4, 1, 2, 0, 6};
        int n2 = leInteiroPositivo();//metodo importado da aula_01
        exibeVetor(v);//metodo importado da aula_01
        System.out.println(n2);
        System.out.println("o numero " + n2 + " esta no vetor? " + buscaLinearRecur(v, n2, 0));
        System.out.println("a soma dos elementos é: " + somaRecur(v, 0));
        System.out.println("o menor elemento do vetor é: " + buscaMenorRecur(v, 0));
        System.out.println("a media aritmetica do vetor é: " + mediaAritRecur(v, 0));
    }

    //método recursivo para procurar se o elemento está no vetor
    public static boolean buscaLinearRecur(int[] v, int n2, int ini) {

        if (ini >= v.length) {
            return false;
        }
        if (n2 == v[ini]) {
            return true;
        }
        return buscaLinearRecur(v, n2, ini + 1);
    }

    //método recursivo para achar o menor elemento do vetor
    public static int buscaMenorRecur(int[] v, int ini) {
        if (ini >= v.length - 1) {
            return v[ini];
        }
        if (v[ini] < buscaMenorRecur(v, ini + 1)) {
            return v[ini];
        } else {
            return buscaMenorRecur(v, ini + 1);
        }
    }

    //método recursivo para calcular a soma dos elementos do vetor
    public static int somaRecur(int[] v, int ini) {
        if (ini >= v.length) {
            return 0;
        }
        return v[ini] + somaRecur(v, ini + 1);
    }

    //método recursivo para calcular a media aritmetica do vetor
    public static double mediaAritRecur(int[] v, int ini) {
        if (ini > v.length - 1) {
            return 0;
        }
        if (ini > 0) {
            return v[ini] + mediaAritRecur(v, ini + 1);
        } else {
            return (v[ini] + mediaAritRecur(v, ini + 1)) / v.length;
        }
    }
}
