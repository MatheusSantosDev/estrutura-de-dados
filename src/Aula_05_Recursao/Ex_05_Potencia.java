/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Recursao;

import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author anacris
 */
public class Ex_05_Potencia {
    public static void main(String[] args) {
        int a = leInteiroPositivo();
        int n = leInteiroPositivo();
        
        System.out.println(potencia(a,n));
        
    }

    private static int potencia(int a, int n) {
        if (n == 0)
            return 1;
        
        return a * potencia(a, n-1);
    }
}
