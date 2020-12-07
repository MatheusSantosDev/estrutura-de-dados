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
public class Ex_08_09_RestoDiv_QuocDiv {
    public static void main(String[] args) {
        int x = leInteiroPositivo();
        int y = leInteiroPositivo();
        
        System.out.println("Resto da divisão: "+ restoDiv(x,y));
        System.out.println("Quociente da divisão: "+ quocDiv(x,y));
        
    }

    private static int restoDiv(int x, int y) {
        if (x < y)
            return x;
        
        return restoDiv(x-y, y);
        
    }
    private static int quocDiv(int x, int y) {
        if (x < y)
            return 0;
        
        return 1 + quocDiv(x-y, y);
    }
}
