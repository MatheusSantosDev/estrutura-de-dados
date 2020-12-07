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
public class Ex_07_Primo {
    public static void main(String[] args) {

        int n = leInteiroPositivo();
        System.out.println(ehPrimoR(n));
    }
    
    public static boolean ehPrimo(int n){
        for (int i = 2; i < n; i++){
            if ( n % i == 0)
                return false;
        }
        return true;
    }
    /*
    public static boolean ehPrimoR(int n){
        return ehPrimoR(n,2);
    }

    public static boolean ehPrimoR(int n, int i){
        if (i == n)
           return true;
        
        if ( n % i == 0)
           return false;
        
        return ehPrimoR(n, i+1);
    }*/
    
     public static boolean ehPrimoR(int n){
        return ehPrimoR(n,n-1);
    }

    public static boolean ehPrimoR(int n, int i){
        if (i == 1)
           return true;
        
        if ( n % i == 0)
           return false;
        
        return ehPrimoR(n, i-1);
    }/*
    */
}
